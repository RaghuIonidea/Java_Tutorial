package design_patterns.abstarctfactory;

public class IphoneFactory extends AbstarctFactory{
    @Override
    public Mobile getMobile() {
        return new Apple();
    }
}
