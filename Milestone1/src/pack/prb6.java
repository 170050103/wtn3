package pack;

public class prb6 {
	public static void main(String[] args) {
		String gender;
		int age;
		
	    gender=new String(args[0]);
		age=Integer.parseInt(args[1]);
		if((gender.equals("Female")) && (age>=1 && age<=58))
		{
		System.out.println("percentage=8.2%");
		}
		else if((gender.equals("Female")) && (age>=59 && age<=100)) {
			System.out.println("percentage=9.2%");
		}
		else if((gender.equals("Male")) && (age>=1 && age<=58)) {
			System.out.println("percentage=9.4%");
		}
		else if((gender.equals("Male")) && (age>=59 && age<=100)){
			System.out.println("percentage=10.4%");
			
		}
		
		}

}
