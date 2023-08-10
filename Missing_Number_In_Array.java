package Array_Intiger;

public class Missing_Number_In_Array 
{

	public static void main(String[] args) 
	{
		//GivenNoIs=1245    sum of all elements are 1+2+4+5=12
		//HowToFindMissingNo take 1+2+3+4+5=15

		int a[]= {1,2,4,5};
		int sum=0,sum2=0;

		for (int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("SumOfTheGivenArray :"+sum);

		for(int j=0;j<=5;j++)
		{
			sum2=sum2+j;

		}

		System.out.println("Sum2 :"+sum2);
		
		//NowIamGoingToFindMissingNumber
		
		int No=sum2-sum;
		System.out.println("The Missing Number in Array is  :"+No);
	}

}
