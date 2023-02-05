import java.util.Scanner;

public class SpecialCharacters {

	public static void main(String[] args) {
		
		 int alphabet = 0, digit=0,symbol=0;
	        System.out.println("Java program to count Alphabet, Digit, Symbols ");
	        Scanner sc = new Scanner (System.in);
	        System.out.println ("Please enter a String");
	        String str = sc.nextLine(); 
	        StringBuilder tempStr = new StringBuilder(str);
	        for(int i = 0; i < str.length(); i++){
	            if( (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {        
	                    alphabet++;
	                }else if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
	                digit++;
	                }else{
	                symbol++;
	            }
	        }
	        System.out.println ("alphabet = "+alphabet+" Digit = "+ digit+" Symbol = "+symbol);

	}

}
