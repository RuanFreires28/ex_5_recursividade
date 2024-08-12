package controller;

public class Controller 
{	
	public Controller() 
	{
		super();
	}
	
	public double SomaFracao (double n)
	{
		
		// CONDIÇÃO DE PARADA.
		if (n == 1) 
		{ 
			return 1;
		}
		
		else 
		{	
			return (1/n) + SomaFracao(n-1);
		}
	}
}