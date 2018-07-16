package implementacao6;

import java.rmi.Naming;

public class CalculatorServer 
{
	public CalculatorServer()
	{
		try 
		{
			java.rmi.registry.LocateRegistry.createRegistry(1099);
			Calculator c = new CalculatorImpl();
			
			Naming.rebind("rmi://localhost:1099/CalculatorService", c);
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Trouble " + e);
		}
	}
	
	public static void main(String args[])
	{
		new CalculatorServer();
	}
}
