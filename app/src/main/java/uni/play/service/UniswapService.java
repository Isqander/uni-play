package uni.play.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import uni.play.dto.CreatePoolRequest;

@Service
public class UniswapService {

    @Value("${ethereum.rpc.url}")
    private String rpcUrl;

    @Value("${ethereum.privateKey}")
    private String privateKey;

    public String createPool(CreatePoolRequest request) {
        // TODO: connect to Web3j and use Uniswap contracts to create a pool
        // This is a placeholder returning dummy tx hash
        return "0xtx_create_pool";
    }

    public String closePool(String poolAddress) {
        // TODO: interact with Uniswap to remove liquidity and close pool
        return "0xtx_close_pool";
    }
}
