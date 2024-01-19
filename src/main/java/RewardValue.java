public class RewardValue {
    private double cashValue;
    private int milesValue;

    // constructors
    public RewardValue(double cashValue) { // convert cash to miles
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }

    public RewardValue(int milesValue){ // convert miles to cash
        this.milesValue = milesValue;
        this.cashValue = (int) (milesValue / 0.0035);
    }

    // methods
    public double getCashValue(){
        return cashValue;
    }
    public double getMilesValue(){
        return milesValue;
    }

}
