package uni.play.service;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.DefaultGasProvider;
import org.web3j.protocol.core.methods.response.TransactionReceipt;

import uni.play.dto.OpenPositionRequest;
import uni.play.dto.ClosePositionRequest;

@Service
public class UniswapService {

    @Value("${ethereum.rpc.url}")
    private String rpcUrl;

    @Value("${ethereum.privateKey}")
    private String privateKey; // TODO replace with secure storage

    public String openPosition(OpenPositionRequest request) {
        Web3j web3j = Web3j.build(new HttpService(rpcUrl));
        Credentials credentials = Credentials.create(privateKey);
        UniswapV3Pool pool = UniswapV3Pool.load(request.getPoolAddress(), web3j, credentials, new DefaultGasProvider());
        try {
            TransactionReceipt receipt = pool.mint(
                request.getRecipient(),
                BigInteger.valueOf(request.getTickLower()),
                BigInteger.valueOf(request.getTickUpper()),
                new BigInteger(request.getAmount()),
                new byte[]{}
            ).send();
            return receipt.getTransactionHash();
        } catch (Exception e) {
            throw new RuntimeException("Failed to open position", e);
        }
    }

    public String closePosition(ClosePositionRequest request) {
        Web3j web3j = Web3j.build(new HttpService(rpcUrl));
        Credentials credentials = Credentials.create(privateKey);
        UniswapV3Pool pool = UniswapV3Pool.load(request.getPoolAddress(), web3j, credentials, new DefaultGasProvider());
        try {
            TransactionReceipt receipt = pool.burn(
                BigInteger.valueOf(request.getTickLower()),
                BigInteger.valueOf(request.getTickUpper()),
                new BigInteger(request.getAmount())
            ).send();
            return receipt.getTransactionHash();
        } catch (Exception e) {
            throw new RuntimeException("Failed to close position", e);
        }
    }
}
