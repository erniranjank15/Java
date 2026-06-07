import java.util.Scanner;


class sum{
  public int a;

  public void firstop(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first operator: ");
    a = sc.nextInt();

  }

}

class add extends sum{
  public int b;

  public void seconop(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter second operator: ");
    b = sc.nextInt();

  }

}


class result extends add{

    public void result(){
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
}

















public class multilevel{

public static void main(String[] args){

result r = new result();
r.firstop();
r.seconop();
r.result();



}

}