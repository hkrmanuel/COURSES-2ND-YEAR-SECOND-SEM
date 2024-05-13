import java.util.ArrayList;
import java.util.Iterator;

public class Lab_1{
    public static void main(String args[]){

        //Non -Generic ArrayList
        ArrayList mixedlist = new ArrayList();

        mixedlist.add("Java");
        mixedlist.add(123);
        mixedlist.add(45.67);
        mixedlist.add(true);


        //Generic ArrayList
        
        ArrayList <Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);


        /* Accessing and Displaying Elements
        *  Non -Generic ArrayList
        */
        
        for ( int i = 0; i < mixedlist.size(); i++){
            System.out.println(mixedlist.get(i));

        }

        /* Accessing and Displaying Elements
        *  Generic ArrayList
        */

        for ( int i = 0; i < numberList.size(); i++){
            System.out.println(numberList.get(i));
        }

        //Manipulating Elements

        mixedlist.remove("Java");
        numberList.add(2, 777);

        //Iterating Over Elements

        for ( int number: numberList){
            System.out.println(number);
        }

        System.out.println();

        Iterator itr = mixedlist.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }







    }

}