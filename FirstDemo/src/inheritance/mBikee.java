package inheritance;
//hierarchical method
class mBike{
	int speed=200;
	void display() {
		System.out.println("this is a mt bike"+speed);
	}
}
class mt15 extends mBike{
	void speedOfmt15() {
		speed=speed+120;
		System.out.println(speed);
	}
}
class Yamahanewmt15 extends mBike{
	void speedofnewmt15() {
		System.out.println(speed+200);
	}
}


public class mBikee {
public static void main(String[] args) {
	mt15 mt15=new mt15();
	mt15.display();
	mt15.speedOfmt15();
	
	Yamahanewmt15 newmt15=new Yamahanewmt15();
	newmt15.speedofnewmt15();
	
	
	
}}

