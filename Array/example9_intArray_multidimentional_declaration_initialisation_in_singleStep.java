package Array;

public class example9_intArray_multidimentional_declaration_initialisation_in_singleStep
{
public static void main(String[] args)
{// 10 20 30
//  40 50 60
	      //declaration and initialization
	int ar[][]={{10,20,30},{40,50,60}};
	
	System.out.println("---------print single info from array--------");
	System.out.println(ar[1][1]);
	
	System.out.println("--------------print all info from array----------------");
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
