package creational_factory_pattern;

public abstract class Plan {
    protected double planRate;
    public abstract double getRate();
    public double calculateBill(int units){
        double totalBill=units*getRate();
        return totalBill;
    }
}