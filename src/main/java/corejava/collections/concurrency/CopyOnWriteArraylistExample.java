package corejava.collections.concurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArraylistExample {
    public static void main(String[] args) {
        List<Integer> list=new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
     System.out.println("List before iterating "+list);
     Iterator<Integer> itr = list.iterator();
     while (itr.hasNext()){
         if(itr.next()==4){
             list.add(7);
         }
     }
        System.out.println("List After iterating "+list);


        List<Integer> arrlist=new ArrayList<>();
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(5);
        arrlist.add(6);
        System.out.println("List before iterating "+arrlist);
        Iterator<Integer> it = arrlist.iterator();
        while (it.hasNext()){
            if(it.next()==4){
                arrlist.add(7);
            }
        }
        System.out.println("List After iterating "+arrlist);

    }
}
