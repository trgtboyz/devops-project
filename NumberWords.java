package devops.numbers;

public class NumberWords {

	public String toWords( int number ) {
		String result = "" ;
		String hundreds = "";
		String tens = "";
		String ones = "";
		if(number<=0 || number>=1000) {
			return "Number out of range";
		} else {
			if(String.valueOf(number).length() == 3) {
				int temp = number/100;
				number = number % 100;
				hundreds = OnesWord(temp);
				hundreds+=" hundred";
				if(number > 0) {
					hundreds+=" and ";
				}
			}
			if(number > 10 && number <20) {
				tens = ElevenWord(number);
			} else {
				int temp = number/10;
				number = number % 10;
				tens = TensWord(temp);
				if(number > 0) {
					tens += " ";
				}
			}
			if(number>0) {
				ones = OnesWord(number);
			}
		}
		result = hundreds+tens+ones;
		return result.trim() ;
	}
	
	public String OnesWord(int number) {
		String result = "";
		switch(number) {
		case 1:
			result = "One";
			break;
		case 2:
			result = "Two";
			break;
		case 3:
			result = "Three";
			break;
		case 4:
			result = "Four";
			break;
		case 5:
			result = "Five";
			break;
		case 6:
			result = "Six";
			break;
		case 7:
			result = "Seven";
			break;
		case 8:
			result = "Eight";
			break;
		case 9:
			result = "Nine";
			break;
		}
		return result.trim();
	}
	public String ElevenWord(int number) {
		String result = "";
		switch(number) {
		case 11:
			result = "Eleven";
			break;
		case 12:
			result = "Twelve";
			break;
		case 13:
			result = "Thirteen";
			break;
		case 14:
			result = "Fourteen";
			break;
		case 15:
			result = "Fifteen";
			break;
		case 16:
			result = "Sixteen";
			break;
		case 17:
			result = "Seventeen";
			break;
		case 18:
			result = "Eighteen";
			break;
		case 19:
			result = "Nineteen";
			break;
		}
		return result.trim();
	}
	public String TensWord(int number) {
		String result = "";
		switch(number) {
		case 1:
			result = "Ten";
			break;
		case 2:
			result = "Twenty";
			break;
		case 3:
			result = "Thirty";
			break;
		case 4:
			result = "Forty";
			break;
		case 5:
			result = "Fifty";
			break;
		case 6:
			result = "Sixty";
			break;
		case 7:
			result = "Seventy";
			break;
		case 8:
			result = "Eighty";
			break;
		case 9:
			result = "Ninety";
			break;
		}
		return result.trim();
	}

}
