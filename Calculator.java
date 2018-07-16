package implementacao6;

public interface Calculator extends java.rmi.Remote
{
	public long soma(long a, long b)
	throws java.rmi.RemoteException;
	
	public long subtracao(long a, long b)
	throws java.rmi.RemoteException;
}

