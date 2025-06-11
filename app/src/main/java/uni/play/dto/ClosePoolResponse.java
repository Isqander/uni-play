package uni.play.dto;

public class ClosePoolResponse {
    private String transactionHash;

    public ClosePoolResponse(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    public String getTransactionHash() {
        return transactionHash;
    }

    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }
}
