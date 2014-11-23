package factorydemo;
public class FactoryDemo
{
	public static void main(String[] args)
	{
		BreadMaker breadMaker;
		System.out.println("面包店开业啦");
		
		System.out.println("要黑面包");
		IFactory breadFactory = new BlackBreadFactory();
		breadMaker = breadFactory.CreateBread();
		breadMaker.GetBread();
		
		System.out.println("要白面包");	
		breadFactory = new WhiteBreadFactory();
		breadMaker = breadFactory.CreateBread();
		breadMaker.GetBread();

	}
}