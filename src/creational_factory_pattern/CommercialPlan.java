package creational_factory_pattern;

public class CommercialPlan extends Plan{

    @Override
    public double getRate() {
        planRate=7.5;
        return planRate;
    }
}
