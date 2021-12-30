package week1assignment1;

public class MgissingElementArray {

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,8};
		boolean flag=false;
		int temp=0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			while(arr[i]!=(i+1))
			{
				flag = true;
				temp=i+1;
				break;
			}
			if(flag==true) 
			{
				break;
			}

		}
		if(flag==true) 
		{
			System.out.println("The Missing Element is: "+temp);
		}
		else
		{
			System.out.println("No Element is missing in the Array");
		}
		}

}
