package Ejercicio2;

/**
 *
 * @author Ximena Lopez
 */
public class FunData {
    private String fundCode;
    private double currentPrice; 
    private double dailyVariation; 
    
    public FunData(String fundCode, double currentPrice, double dailyVariation) {
        this.fundCode = fundCode;
        this.currentPrice = currentPrice;
        this.dailyVariation = dailyVariation;
    }

    public String getFundCode() {
        return fundCode;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getDailyVariation() {
        return dailyVariation;
    }
}
