package design_patterns.abstarctfactory;

public class SonyFcatory extends AbstarctFactory{
    @Override
    public Mobile getMobile() {
        return new Sony();
    }
}
