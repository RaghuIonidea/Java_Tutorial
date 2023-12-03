package design_patterns.abstarctfactory;

public class AbstarctClient {
    public static void main(String[] args) {
        FactoryProducer factoryProducer=new FactoryProducer();
        AbstarctFactory abstarctFactory = factoryProducer.getFactory("sony");
        abstarctFactory.getMobile().mobileName();
    }
}
