package co.udea.converter;

public class Converter {

	String roman_numbers = "IVXLCDM";
	int [] decimal_numbers = {1, 5, 10, 50, 100, 500, 1000};
	public Converter() {
		
	}
	
	public int fromRomanToDecimal(String roman_num) {
		int result = 0;
		int length = roman_num.length();
		
		if(length == 1) {
			result = decimal_numbers[roman_numbers.indexOf(roman_num)];
		} else {
			int i, j, k;
			for(i = 0; i < length; i++){
				if(i < (length - 1)){
					char c1 = roman_num.charAt(i);
					char c2 = roman_num.charAt(i+1);
					j = decimal_numbers[roman_numbers.indexOf(c1)];
					k = decimal_numbers[roman_numbers.indexOf(c2)];
					if(j >= k){
						result += j;
					} else {
						result -= j;
					}
				} else {
					char c3 = roman_num.charAt(i);
					j = decimal_numbers[roman_numbers.indexOf(c3)];
					result += j;
				}
			}
		}
		
		return result;
	}
}
