package factorydemo;
public class FactoryDemo
{
	public static void main(String[] args)
	{
		BreadMaker breadMaker;
		System.out.println("����꿪ҵ��");
		
		System.out.println("Ҫ�����");
		IFactory breadFactory = new BlackBreadFactory();
		breadMaker = breadFactory.CreateBread();
		breadMaker.GetBread();
		
		System.out.println("Ҫ�����");	
		breadFactory = new WhiteBreadFactory();
		breadMaker = breadFactory.CreateBread();
		breadMaker.GetBread();

	}
}