class Correct_Evendigit
{

	public static void main(String args[])
	{
		int arr[]={12,345,2,6,7896,45,32};

		System.out.println(findNum(arr));
	}
	
	
	static int findNum(int arr[])
	{
		int count=0;
		for(int n:arr)
		{
			if(even(n))
				count++;
		}
		return count;
	}
	
	
	static boolean even(int n)
	{
		int numberofDigits=digitCount(n);
			if(numberofDigits%2==0)
			return true;
		
		return false;
		//return numberofDigits%2==0;
	}
	static int digitCount(int n)
	{
		int count=0;
			while(n>0)
			{
				count++;
				n=n/10;
			}
			return count;
	}
}