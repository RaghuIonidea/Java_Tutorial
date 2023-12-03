package design_patterns.abstarctfactory;

public class FactoryProducer {

    public AbstarctFactory getFactory(String name){
        switch (name){
            case"sony":
                return new SonyFcatory();
            case"samsung":
                return new SamsungFactory();
            case"apple":
                return new IphoneFactory();
            default:
                return null;
        }
    }
}
