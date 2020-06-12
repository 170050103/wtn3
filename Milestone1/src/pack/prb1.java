package pack;

public class prb1 {
	    public static void main(String[] args) {
			int num;
			num=Integer.parseInt(args[0]);
			if(num>0)
			{
				System.out.println("Positive");
			}
			else if(num<0)
			{
				System.out.println("Negative");
			}
			else
			{
				System.out.println("Zero");
			}
		}

}
