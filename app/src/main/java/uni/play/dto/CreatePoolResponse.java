package uni.play.dto;

public class CreatePoolResponse {
    private String transactionHash;

    public CreatePoolResponse(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    public String getTransactionHash() {
        return transactionHash;
    }

    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }
}
