package models;

public class Card {
	
	private int value;
	private int type;
	// check the card was played or not
	private boolean isPlay;
	
	//the value of cards
	public static final int VALUE_J = 11;
	public static final int VALUE_Q = 12;
	public static final int VALUE_K = 13;
	public static final int VALUE_A = 14;
	public static final int VALUE_2 = 15;
	
	//the suits of card
	public static final int TYPE_SPADES = 0;
	public static final int TYPE_CLUBS = 1;
	public static final int TYPE_DIAMONDS = 2;
	public static final int TYPE_HEARTS = 3;

	public Card() {
		
	}

	public Card(int value, int type, boolean isPlay) {
		this.value = value;
		this.type = type;
		this.isPlay = isPlay;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public boolean isPlay() {
		return isPlay;
	}

	public void setPlay(boolean isPlay) {
		this.isPlay = isPlay;
	}



	// display cards
	@Override
	public String toString() {
		String result = "";
		
		switch(value) {
		case 11:
			result += "J";
			break;
		
		case 12:
			result += "Q";
			break;
			
		case 13:
			result += "K";
			break;
			
		case 14:
			result += "A";
			break;
			
		case 15:
			result += "2";
			break;
	   // if value = 3 >> result = 3
		default:
			result += value;	
		}
		
		switch(type) {
		case 0:
			result += "S";
			break;
		case 1:
			result += "C";
			break;
		case 2:
			result += "D";
			break;
		case 3:
			result += "H";
			break;
		}
		return result;
	}
	
}
