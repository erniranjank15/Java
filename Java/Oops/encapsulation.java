
// Encapsulation

class Student{

   private int age;
   private String name;
   private String gf;


    Student(){
        System.out.println("Default Student Constructor called");
    }


    Student(int age, String name, String gf){
        System.out.println("Parameterized Student Constructor called");
        this.age = age;
        this.name = name;
        this.gf = gf;
    }



    Student(Student s){
        System.out.println("Copy Student Constructor called");
        this.age = s.age;
        this.name = s.name;
        this.gf = s.gf;

     }


    //  Methods and Behaviour

    public String getname(){
        return this.name;
    }


  


   public void setage(int a){
       this.age = a;
    
   }


   public int getage(){
    return this.age;
   }
   

   public String getgf(){
    return this.gf;
   }



    public void study(){
        System.out.println(name + " is studying");
     }

     public void sleeping(){
        System.out.println(name + " is sleeping");
     }

     private void gfchatting(){
        System.out.println(name + " is chatting with gf");
     }
    
}



public class encapsulation {

    public static void main(String[] args) {
    //     Student s1 = new Student(1, "John", "Tina");
    //     s1.study();
    //     s1.sleeping();
    // //    s1.gfchatting();  // Error: gfchatting() has private access in Student

    //     System.out.println("Student 2 ID: " + s1.id);
    //     System.out.println("Student 2 Name: " + s1.name);
    //     // System.out.println("Student 2 Name: " + s1.gf);


        // Student s2 = new Student(s1); // Using copy constructor








    // Encapsulation implmentation

    Student n = new Student();
    Student s = new Student(20, "John", "Tina");
    Student t = new Student(s);
    System.out.println(s.getage());
    System.out.println(s.getname());
    s.setage(25);
    System.out.println(s.getage());
    System.out.println(s.getgf());
    // System.out.print(s.gfchatting());




    
    }
}