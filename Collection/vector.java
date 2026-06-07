import java.util.Vector;
import java.util.Collections;
import java.util.Iterator;

// package Collection Frameworks;

public class vector {    
    public static void main(String[] args) {
        Vector<Integer>list = new Vector<>();


        System.out.println(list);

        // add
        list.add(10);
        list.add(20);
        System.out.println(list);
        list.add(30);
        list.add(40);
        System.out.println(list);


        // remove
        // list.remove(1);
        // System.out.println(list);



        // addall

        Vector<Integer>list2 = new Vector<>();

        list2.add(101);
        list2.add(102);

        System.out.println(list2);

        list2.addAll(list);

        System.out.println(list2);


        // remove all

        list2.removeAll(list);
        System.out.println(list2);

        // size
        System.out.println(list.size());
        System.out.println(list2.size());

        // clear
        System.out.println("list 2: " + list2);
        list2.clear();
        System.out.println(list2.size());



     // iterator for traverse list
     Iterator<Integer>it = list.iterator();

     while(it.hasNext()){
        System.out.println("Elements: " + it.next());
          }



    // get
   
   Vector<Integer>list3 = new Vector<>();

   list3.add(100);
   list3.add(400);
   list3.add(300);
   list3.add(10);
   list3.add(5);

   System.out.println(list3);
//    System.out.println(list3.get(1));
  
   
//    //set
//    list3.set(1,500);
//    System.out.println(list3);


//    toarray

//  Object[] o = list3.toArray();

//  for (Object n:o) {
//     System.out.println(n);
//  }


//contains
// System.out.println(list3.contains(100));


// Sort
System.out.println("before: " + list3);
Collections.sort(list3);
System.out.println("after ascending: " + list3);
Collections.sort(list3, Collections.reverseOrder());
System.out.println("after descending: " + list3);



// clone
// Vector<Integer>list4 = (Vector<Integer>)list3.clone();
// System.out.println("list 4: " + list4);



//ensurecapacity
// list4.ensureCapacity(100);
// System.out.println("" + list4);



// isempty
// System.out.println(list4.isEmpty());



// indexof
// System.out.println(list4.indexOf(300));

        }  


 }

