package creational_factory_pattern;

public class InstitutionalPlan extends Plan {
    @Override
    public double getRate() {
        planRate = 5.5;
        return planRate;
    }
}
