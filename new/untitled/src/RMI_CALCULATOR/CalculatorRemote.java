package RMI_CALCULATOR;

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
    public int division(int a, int b){
        if(b==0){
            return 0;
        }else {
            return a/b;
        }
    }
}
