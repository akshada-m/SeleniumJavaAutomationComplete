package Array;

public class example8_intArray_multidimentional
{
public static void main(String[] args) 

//10 20 30
//40 50 60


{
	//declaration
	int ar[][]=new int[2][3];
	
	//initialization
	ar[0][0]=10;
	ar[0][1]=20;
	ar[0][2]=30;
	ar[1][0]=40;
	ar[1][1]=50;
	ar[1][2]=60;
	
	//usage
	System.out.println("print single info in array: "+ar[0][2]);
	
	System.out.println("---------print all info from int array---------------");
	
	for(int i=0;i<=1;i++)
	{
		for(int j=0;j<=2;j++)
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
	
	
}
}
