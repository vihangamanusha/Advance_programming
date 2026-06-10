package RMII.with_serilizble;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StudentService extends Remote {

    newStudent getnewStudent(String stu_id) throws RemoteException;
}
