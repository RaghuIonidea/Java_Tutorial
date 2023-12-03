package corejava.collections.concurrency;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
/*
* while one Thread iterating ConcurrentHashMap if any other Thread perform any update operations on ConcurrentHashMap Object then we won't get ConcurrentModificationException
* Because of Segemnt lock
* */
    public static void main(String[] args) {
        Map<String,String> myMap = new ConcurrentHashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        System.out.println("ConcurrentHashMap before iterator: "+myMap);
        Iterator<String> itr = myMap.keySet().iterator();
        while (itr.hasNext()){
             String key = itr.next();
             if(key.equals("4"))
                myMap.put(4+"new","new4");

        }
        System.out.println("ConcurrentHashMap After iterator: "+myMap);

        Map<String,String> map = new HashMap<String,String>();
        map.put("1", "1");
        map.put("2", "1");
        map.put("3", "1");
        map.put("4", "1");
        map.put("5", "1");
        map.put("6", "1");
        System.out.println("HashMap before iterator: "+map);
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()){
            String key = it.next();
            if(key.equals("4")) {
                //map.put(4+"new","new4");
                /*if we uncomment the above line then we will get ConcurrentModificationException*/
            }
        }
        System.out.println("HashMap After iterator: "+map);
    }
}
