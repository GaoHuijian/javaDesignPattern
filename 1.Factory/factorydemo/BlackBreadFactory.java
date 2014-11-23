package factorydemo;

public class BlackBreadFactory implements IFactory
{
	@Override
	public BreadMaker CreateBread()
	{

		return new BlackBread();
	}
}