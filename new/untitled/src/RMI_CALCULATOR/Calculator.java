package RMI_CALCULATOR;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    public int add(int a, int b) throws RemoteException;

    public int substract(int a,int b) throws RemoteException;

    public int multiply(int a,int b) throws RemoteException;

    public int division(int a,int b) throws RemoteException;

}
