package _07_tea_party;

public class TeaParty{
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String welcome="";
        if(isWoman&&isKnighted) {
        	welcome=("Hello Lady "+ name);
        	
        }
        else if(isWoman) {
        	welcome=("Hello Ms. "+ name);
        }
        else if(!isWoman&& isKnighted) {
        	welcome=("Hello Sir "+ name);
        }
        else if(!isWoman) {
        	welcome=("Hello Mr. "+ name);
        }
        return welcome;
    }
}


