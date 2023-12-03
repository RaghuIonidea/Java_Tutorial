package corejava.langpackage;

public class StringImmutableExamples {
    public static void main(String[] args) {
        String immutableObject = new String("Raghu");
        System.out.println("immutableObject   "+immutableObject);
        immutableObject.concat("Ramudu");
        System.out.println("immutableObject after concating Ramudu is:   "+immutableObject);
        immutableObject=immutableObject+"Ramudu";
        System.out.println("immutableObject after reassign: "+immutableObject);
    }
}
