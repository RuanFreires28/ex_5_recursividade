package view;

import controller.Controller;

public class Main 
{
	public static void main(String[] args) 
	{		
		Controller c = new Controller();
		int n = 3;
		
		double sf = c.SomaFracao(n);
		System.out.println(sf);
			
	}	
}