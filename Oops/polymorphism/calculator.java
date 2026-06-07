
// Operator overloading userdefine not support in java but method overloading is support in java
// its done implesitly by compiler


public class calculator {
    

// method overloading

    int add(int a, int b){
        return a + b;
    }


    int add(int a, int b, int c){
        return a + b + c;
    }



    double add(int a, int b, int c, double d){
        return a + b + c + d;
    }



  
public static void main(String[] args) {
 
    calculator c = new calculator();
System.out.println(c.add(10, 20));
System.out.println(c.add(10, 20, 30));
System.out.println(c.add(10, 20, 30, 40.5));    
    
}


}



