package RMII.calculotor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorRemote extends UnicastRemoteObject implements Calcultor{
    public CalculatorRemote() throws RemoteException{
        super();
    }

    @Override
    public double add(double a,double b)throws RemoteException{
        return a+b;
    }

    @Override
    public double sub(double a,double b)throws RemoteException{
        return a-b;
    }

    @Override
    public double mul(double a,double b)throws RemoteException{
        return a*b;
    }

    @Override
    public double div(double a,double b)throws RemoteException{
        if (b == 0) {
            throw new RemoteException();
        }
        return a/b;
    }
}