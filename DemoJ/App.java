package DemoJ;

public class App extends Parent
{
	
	public App(int index)
	{
		index=index;
	}
	
public static void main(String args[])
{
	App myApp=new App(10);
	System.out.println(myApp.index);
}
}
