package creational_factory_pattern;

public class DomesticPlan extends Plan{
    @Override
    public double getRate() {
        planRate=3.5;
        return planRate;
    }
}
