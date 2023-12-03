package design_patterns.factory;

public class Client {
    public static void main(String[] args) {
        FcatoryPattern fcatoryPattern = new FcatoryPattern();
        Father father = fcatoryPattern.getChild("child1");
        System.out.println(father);
    }
}
