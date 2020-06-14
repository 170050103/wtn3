package pack;

public class prb5 {
	public static void main(String[] args) {
		String str=args[0];
		char ch = str.charAt(0);
		if((ch>='a' && ch<='z' || ch>='A' && ch<='Z')) {
			System.out.println("alphabhet");
		}
		else if(ch>='0' &&  ch<='9') {
			System.out.println("digit");
		}
		else
			System.out.println("Special Character");
	
	}
}
