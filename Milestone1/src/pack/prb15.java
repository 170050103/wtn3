package pack;

public class prb15 {
	public static void main(String[] args) {
		int a,temp;
		int sum=0;
		a=Integer.parseInt(args[0]);
		 while (a > 0)
		    {
		        temp = a % 10;
		        sum  = sum + temp;
		        a /= 10;
	}
		 System.out.println("the sum of the digitd are:"+sum);

}
}