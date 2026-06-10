package RMI.RMI_01.RMI_CALCULATOR;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorRemote extends UnicastRemoteObject implements Calculator {
    public CalculatorRemote() throws RemoteException{
        super();
    }

    @Override
    public int add(int a, int b){
        return a+b;
    }

    @Override
    public int substract(int a,int b){
        return a-b;
    }

    @Override
    public int multiply(int a, int b){
        return a*b;
    }

    @Override
    public int division(int a, int b) throws RemoteException {
        if (b == 0) {
            System.out.println("Server: division by zero blocked");
            return 0;
        }
        return a / b;
    }
}
