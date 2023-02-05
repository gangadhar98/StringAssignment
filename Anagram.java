import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "SILENT";
		String s2 = "Listen";
		
		//To convert Strings into Lower case as java is case sensitive
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
	  
	  //To convert String into Array
      char c1[] = s1.toCharArray();
      char c2[] = s2.toCharArray();
	   
      if(c1.length != c2.length)
       {
	   System.out.println("The strings "+ s1 + " and "+ s2 +" are not anagrams" );
	   System.exit(0);
	   } 
      
      //To arrange aplhabets in order
      Arrays.sort(c1);
      Arrays.sort(c2);
      
      for(int i=0; i<c1.length; i++)
      {
    	  if(c1[i] != c2[i])
    	  {
    		  System.out.println("The strings "+ s1 + " and "+ s2 +" are not anagrams");
    		  System.exit(0);
    	  }	  
      }   
      System.out.println("The strings "+ s1 + " and "+ s2 +" are anagrams");
	}
}
