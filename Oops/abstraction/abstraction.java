package abstraction;

// Interface
// We cannot create object of abstract class
// old way

// abstract class Bird{

//     abstract void fly();

//     abstract void eat();
// }



// // Implementation
// class Sparrow extends Bird{

//     @Override
//     void fly() {
//         System.out.println("Sparrow flying");
//     }


//     @Override
//     void eat(){
//         System.out.println("Sparrow eating");
//     }
// }





// class Crow extends Bird{

//     @Override
//     void fly() {
//         System.out.println("Crow flying");
//     }


//     @Override
//     void eat(){
//         System.out.println("Crow eating vegalepan");
//     }
// }


// public class abstraction {


//     public static void dobirdstuff(Bird b) {
//         // calling function through interface
//     b.fly();
//     b.eat();
//    }


//    public static void main(String[] args){
//     dobirdstuff(new Sparrow());
//     dobirdstuff(new Crow());
// }

// }




// with Interface keyword Modern way

// Interface

 interface Bird{
 
    void fly();

    void eat();
    
 } 


// Implementation
 class Sparrow implements Bird{

    @Override
    public void fly(){

      System.out.println("Sparrow flying");
    }


    @Override
   public void eat(){
      System.out.println("Sparrow eating");
   }
}



 class Crow implements Bird{

    @Override
    public void fly(){

      System.out.println("Crow flying");
    }


    @Override
   public void eat(){
      System.out.println("Crow eating");
   }
}



public class abstraction {


    public static void dobirdstuff(Bird b) {
        // calling function through interface
    b.fly();
    b.eat();
   }


   public static void main(String[] args){
    dobirdstuff(new Sparrow());
    dobirdstuff(new Crow());
}

}