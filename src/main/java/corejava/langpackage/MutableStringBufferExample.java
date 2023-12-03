package corejava.langpackage;

public class MutableStringBufferExample {

    public static void main(String[] args) {
        final StringBuffer sb =new StringBuffer("Raghu");
         sb.append("Ramudu");
         //Adding final to reff varibles will not get immutability, but reassignment is not possible
        System.out.println("Adding final "+sb);
        //if i remove comment in below line it shows compile time error
       // sb =new StringBuffer("Raghu");
    }
}
