package EJER4;


public class NumeroNegativoException extends Exception
{
	private int numP;

	public NumeroNegativoException(int numP) 
	{
		super();
		this.numP = numP;
	}

	@Override
	public String toString()
	{
		return "Numero Negativo [numP=" + numP + "]";
	}
	
	
}
