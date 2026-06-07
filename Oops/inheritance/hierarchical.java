
class grandfather{

public int land;


grandfather(int land){
    this.land = land;

}


    public void getland(){

        System.out.println("Grandfather has " + land + " acres of land");

    }
}



class father extends grandfather{

    public int money;

    father(int land, int money){
        super(land);
        this.money = money;
    }

    public void getmoney(){
        System.out.println("Father has " + money + " dollars");
    }
}



class son extends father{

    public int car;

    son(int land, int money, int car){
        super(land, money);
        this.car = car;
    }

    public void getcar(){
        System.out.println("Son has " + car + " cars" + " and " + money + " dollars" + " and " + land + " acres of land" );
    }
}















public class hierarchical {


public static void main(String[] args){

grandfather gf = new grandfather(100);
father f = new father(50, 100000);
son s = new son(20, 50000, 2);

s.getland();
s.getmoney();
s.getcar();


}

}