package _03_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Smurf Handy=new Smurf("Handy");
System.out.println(Handy.getName());
Handy.eat();
Smurf Papa=new Smurf("Papa");
System.out.println(Papa.getName());
System.out.println(Papa.getHatColor());
System.out.println(Papa.isGirlOrBoy());
Smurf Smurfette=new Smurf("Smurfette");
System.out.println(Smurfette.getName());
System.out.println(Smurfette.getHatColor());
System.out.println(Smurfette.isGirlOrBoy());
	}

}
