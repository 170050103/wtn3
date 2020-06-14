package pack;

public class prb19 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int digit,rev=0;
		int temp;
		temp=a;
		while(a>0) {
			digit=a%10;
			rev=rev*10+digit;
			a=a/10;
		}
		if(rev==temp) {
			System.out.println(+temp+" is a palindrome");
		}
		else {
			System.out.println(+temp+" is not a palindrome");
		}
			
	}

}
