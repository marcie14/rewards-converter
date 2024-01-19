public class RewardValue {
    private final double cashValue;
    public static final double CONVERSION_RATE = 0.0035;

    // constructors
    public RewardValue(double cashValue) { // convert cash to miles
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){ // convert miles to cash
        this.cashValue = convertToCash(milesValue);
    }

    // methods
    private static int convertToMiles(double cashValue){
        return (int) (cashValue / CONVERSION_RATE);
    }

    private static double convertToCash(int milesValue){
        return milesValue * CONVERSION_RATE;
    }

    public double getCashValue(){
        return cashValue;
    }

    public int getMilesValue(){
        return convertToMiles(this.cashValue);
    }
}
