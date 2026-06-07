
// Run time polymorphism

 class shape{

    public void draw(){
        System.out.println("Drawing a shape");
    }
}



 class circle extends shape{

    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }
}


    class rectangle extends shape{
    
        @Override
        public void draw(){
            System.out.println("Drawing a rectangle");
        }
    }












public class main {

    public static void main(String[] args) {
        circle c = new circle();
        dodraw(c);

        rectangle r = new rectangle();
        dodraw(r);
    }


    public static void dodraw(shape s) {

        s.draw();   //Polymorphic call
    }
}