package RMII.calculotor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Myclient {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        try{
            Calcultor cal=(Calcultor)Naming.lookup("rmi://localhost:54321/cal");
            System.out.println(cal.add(5,4));
            System.out.println(cal.sub(5,4));
            System.out.println(cal.mul(5,4));
            System.out.println(cal.div(5,4));
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}