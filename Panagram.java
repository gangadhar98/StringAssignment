
public class Panagram {

	public static void main(String[] args) {
		
		String s1 = "Pack my box with five dozen liquor jugs";
		System.out.println(ispanagram(s1.toLowerCase()));
		
		
	}

	private static boolean ispanagram(String s1) {
		// TODO Auto-generated method stub
        int size = 26;
		
		if(s1.length()<size)
		{
			return false;
		}
		else
		{
			for(char ch = 'a'; ch<='z'; ch++) {
				if(s1.indexOf(ch)<0)
				{
					return false;
				}
			}
		}
		return true;
	}

}
