
public class NumeroPositivo extends Exception
{
	private int numP;

	public NumeroPositivo(int numP) 
	{
		super();
		this.numP = numP;
	}

	@Override
	public String toString()
	{
		return "NumeroPositivo [numP=" + numP + "]";
	}
	
}
