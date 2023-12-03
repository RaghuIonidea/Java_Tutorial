package design_patterns.abstarctfactory;

public class SamsungFactory extends AbstarctFactory{
    @Override
    public Mobile getMobile() {
        return new Samsung();
    }
}
