package RMII.newnew;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NewStudent extends Remote {
    Student getStudent(String stu_id) throws RemoteException;
}
