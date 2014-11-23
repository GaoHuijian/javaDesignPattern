package factorydemo;
public class WhiteBreadFactory implements IFactory
{
	@Override
	public BreadMaker CreateBread()
	{

		return new WhiteBread();
	}
}