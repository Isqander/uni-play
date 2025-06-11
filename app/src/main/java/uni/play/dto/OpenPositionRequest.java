package uni.play.dto;

public class OpenPositionRequest {
    private String poolAddress;
    private String recipient;
    private int tickLower;
    private int tickUpper;
    private String amount;

    public String getPoolAddress() { return poolAddress; }
    public void setPoolAddress(String poolAddress) { this.poolAddress = poolAddress; }

    public String getRecipient() { return recipient; }
    public void setRecipient(String recipient) { this.recipient = recipient; }

    public int getTickLower() { return tickLower; }
    public void setTickLower(int tickLower) { this.tickLower = tickLower; }

    public int getTickUpper() { return tickUpper; }
    public void setTickUpper(int tickUpper) { this.tickUpper = tickUpper; }

    public String getAmount() { return amount; }
    public void setAmount(String amount) { this.amount = amount; }
}
