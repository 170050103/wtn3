package pack;

public class prb12 {
	public static void main(String[] args) {
		int a,c=0;
		a=Integer.parseInt(args[0]);
		for(int i=1;i<=a;i++){
			if(a%i==0)
			c++;
			}
		if(c==2) {
			System.out.println("it is a prime number");
		}
		else{
			System.out.println("it is not a prime number");
		}
	}

}
