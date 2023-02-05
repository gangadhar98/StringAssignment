import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String original = "Gangadhar";
	        char[] chars = original.toCharArray();
	        Arrays.sort(chars);
	        String sorted = new String(chars);
	        System.out.println(sorted);

	}
}
