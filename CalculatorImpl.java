package implementacao6;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator
{
	public CalculatorImpl() throws java.rmi.RemoteException
	{
		super();
	}

	@Override
	public long soma(long a, long b) throws java.rmi.RemoteException
	{
			return a + b;
	
	}

	@Override
	public long subtracao(long a, long b) throws java.rmi.RemoteException
	{
			return a - b;
	}
}
