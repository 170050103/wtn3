package pack;

public class prb17 {
	public static void main(String[] args) {
		int a,rev=0,temp;
		a=Integer.parseInt(args[0]);
		while(a>0) {
			temp=a%10;
			rev = rev*10+temp;
			a=a/10;
		}
		System.out.println(rev);
	}

}
