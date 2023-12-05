package corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String,String> function =(name)-> " welcome "+name;
        System.out.println(function.apply("raghu"));

        //default method andThen()
        Function<String,String> function1 = name -> " welcome "+name;
        Function<String,String> function2 = wish ->   wish + " You are Good Developer ";
        System.out.println(function1.andThen(function2).apply("Raghu"));

        Function<String,String> function3 = name -> name;
        Function<String,Integer> function4 = wish -> wish.length()*2;
        System.out.println(function3.andThen(function4).apply("Raghu"));

        //default method compose()
        Function<String,String> function5= wish-> wish.substring(0,6);
        function5 = function5.compose(firstname->firstname.concat("Raghu"));
        function5 = function5.compose(lastname-> lastname.concat("Ramudu"));
        System.out.println(function5.apply("B."));

        //static method Function.identity(), it is same as lambda x-> x;
        //convert list to map using identity()
        List<String> list=Arrays.asList("raghu","ramudu","Jaya","RaghuRam","priyanshi");
        list.stream().collect(Collectors.toMap(name->name.length(),Function.identity()));
                        //OR
        Map<Integer,String> map = list.stream().collect(Collectors.toMap(name->name.length(),name->name));


        System.out.println(map.values());

    }
}
