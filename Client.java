package implementacao6;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.concurrent.SynchronousQueue;

public class Client 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			Calculator c = (Calculator)
							
			Naming.lookup("rmi://localhost/CalculatorService");
			
			System.out.println(c.subtracao(4, 3));
			System.out.println(c.soma(4, 5));
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println();
			System.out.println("Exc. genérica!");
			System.out.println(e);
		}
	}
}
