package RMI.RMI_01.RMI_CALCULATOR;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class MyServer {
    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(1099);
            Calculator cal=new CalculatorRemote();
            Naming.rebind("rmi://localhost:1099/cal", cal);
            System.out.println("Server ready");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
