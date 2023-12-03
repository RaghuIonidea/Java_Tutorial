package design_patterns.factory;

public class FcatoryPattern {
    public Father getChild(String str) {
        switch (str){
            case "child1":
                return new Child1();
            case "child2":
                return new Child2();
            case "child3":
                return new Child3();
            default:
                return null;
        }
    }
}
