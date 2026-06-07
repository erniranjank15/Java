import java.util.Scanner;


class shape{

  public void shape(){
    System.out.println("I am a shape");
  }

}

class circle extends shape{

  public void area(int r){
    System.out.println("area of circle is: " + (3.14 * r * r));
  }

}

















public class singleinheritance{

public static void main(String[] args){

// System.out.print("Hello");


circle c = new circle();
c.shape();
c.area(5);



}

}