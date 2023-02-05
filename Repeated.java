import java.util.Arrays;

public class Repeated {

	public static void main(String[] args) {
		
		String s1 = "beautiful beach";
		s1 = s1.toLowerCase();
			char c1[] = s1.toCharArray();
			  for (int i = 0; i <= s1.length(); i++) {
			         for (int j = i + 1; j <s1.length(); j++) {
			            if (c1[i] == c1[j]) {
			               System.out.print(c1[j] + " ");
			               break;
			            }
			         }
			      }	  
		}
	}
