package pack;

public class prb14 {

	public static void main(String[] args) {
		int a,c=0;
		a=Integer.parseInt(args[0]);
		for(int i=1;i<=a;i++){
			if(a%i==0)
			c++;
			}
		if(a==0) {
			System.out.println("0 is neither prime nor composite");
		}
		else if(a==1) {
			System.out.println("1 is neither prime nor composite");
		}
		else if(c==2 && a>=2) {
			System.out.println("it is a prime number");
		}
		else{
			System.out.println("it is not a prime number");
		}

	}

}
