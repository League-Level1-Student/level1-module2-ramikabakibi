
public class MasterOfMethods {

	
//1  
		boolean isInAGoodMood(String parentName) {
			return true;
		}
		
		int askForMoney(int amount) {
			amount=20;
			return amount;
		}
		void methods1() {
			if(isInAGoodMood("Mom")) {
				int money=askForMoney(20);
			}
		}
		
//2

		void methods3() {
			Friend ella=new Friend();
			Friend jimmy=new Friend();
			Friend pedro=new Friend();
			
			if(ella.getFavoriteIceCream().equalsIgnoreCase("Rocky Road")) {
				
			}
			if(jimmy.getFavoriteIceCream().equalsIgnoreCase("Rocky Road")) {
				
			}
			if(pedro.getFavoriteIceCream().equalsIgnoreCase("Rocky Road")) {
				
			}

		}
		void methods4() {
			MagicPower power=new MagicPower();
		power.castSpell("Abracadabra");
		}
		void methods5() {
			MathTest test=new MathTest();
			test.getAnswer("math", 1);
			test.getAnswer("math", 2);
			//so on until question 10
		}
		}
