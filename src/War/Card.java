package War;

public class Card {

	int value;
	String name;
	
	//Getters and setters
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//return a "realistic" description of the card
	
	public String describe() {
		if(this.value<12 && this.value>2) {
			String description1 = (this.value + " of " + this.name);
			return description1;
		}else if (this.value == 2) {
			String d2 = ("Ace of " + this.name);
			return d2;
		}else if (this.value == 12) {
			String d3 = ("Jack of " + this.name);
			return d3;
		}else if (this.value == 13) {
			String d4 = ("Queen of " + this.name);
			return d4;
		}else {
			String d5 = ("King of " + this.name);
			return d5;
		}
	}
	
	
}
