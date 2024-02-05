package EJER4;


public class NumeroPositivoException extends Exception
{
	private int numN;

	public NumeroPositivoException(int numN1) 
	{
		super();
		this.numN = numN;
	}

	@Override
	public String toString()
	{
		return "Numero Positivo [numN=" + numN + "]";
	}
	
}
