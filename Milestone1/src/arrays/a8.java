package arrays;

public class a8 {
	public static void main(String args[])
	{
		int[] array= {1,6,7,9,4};
		int sum=0;
		int six=-1;
		int seven=-1;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==6)
				six=i;
			if(array[i]==7)
				seven=i;
		}
		if(seven==-1)
			six=-1;
		for(int i=0;i<array.length;i++)
		{
			if(six!=-1&&i>=six&&i<=seven)
				continue;
			sum+=array[i];
		}
		System.out.println(sum);
	}


}
