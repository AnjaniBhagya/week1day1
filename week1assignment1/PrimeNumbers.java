package week1assignment1;

public class PrimeNumbers {

	public static void main(String[] args) {
		int input =17;
		int l=input/2;
		boolean flag= true;
	
		for (int i = 2; i < l; i++)
		{
			int rem = input%i;
			if(rem == 0)
			{
				flag = false;
				break;
			}
			else
			{
				flag = true;
			}	
			
			
		}
		if(flag == true)
		{
			System.out.println("Number "+input+" is prime");
		}
		else 
		{
			System.out.println("Number "+input+" is not prime");
		}		

	}

}
