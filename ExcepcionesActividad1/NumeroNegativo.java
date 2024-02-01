
public class NumeroNegativo extends Exception
{
	private int numP;

	public NumeroNegativo(int numP) 
	{
		super();
		this.numP = numP;
	}

	@Override
	public String toString()
	{
		return "NumeroNegativo [numP=" + numP + "]";
	}
	
	
}
