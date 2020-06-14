package pack;
public class prb7 {
	public static void main(String[] args) {
		String str=args[0];
		char ch=str.charAt(0); 
		if(Character.isLowerCase(ch))
		{
		System.out.println(ch+" ->"+Character.toUpperCase(ch));
		}
		else
		{
		System.out.println(ch+" ->"+Character.toLowerCase(ch));
		}
		}
		}