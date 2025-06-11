package uni.play.dto;

public class CreatePoolRequest {
    private String token0;
    private String token1;
    private int fee;
    private String amount0;
    private String amount1;
    private int tickLower;
    private int tickUpper;

    // getters and setters
    public String getToken0() { return token0; }
    public void setToken0(String token0) { this.token0 = token0; }
    public String getToken1() { return token1; }
    public void setToken1(String token1) { this.token1 = token1; }
    public int getFee() { return fee; }
    public void setFee(int fee) { this.fee = fee; }
    public String getAmount0() { return amount0; }
    public void setAmount0(String amount0) { this.amount0 = amount0; }
    public String getAmount1() { return amount1; }
    public void setAmount1(String amount1) { this.amount1 = amount1; }
    public int getTickLower() { return tickLower; }
    public void setTickLower(int tickLower) { this.tickLower = tickLower; }
    public int getTickUpper() { return tickUpper; }
    public void setTickUpper(int tickUpper) { this.tickUpper = tickUpper; }
}
