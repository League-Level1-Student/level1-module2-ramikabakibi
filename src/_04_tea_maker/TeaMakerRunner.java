package _04_tea_maker;

public class TeaMakerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TeaMaker maker=new TeaMaker();
TeaBag bag=new TeaBag("Joaquin");
Kettle kettle=new Kettle();
Cup cup=new Cup();
kettle.boil();
cup.makeTea(bag, kettle.getWater());
	}

}
