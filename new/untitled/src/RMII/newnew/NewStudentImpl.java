package RMII.newnew;

import com.mysql.cj.protocol.Resultset;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;

public class NewStudentImpl extends UnicastRemoteObject implements NewStudent {
    public NewStudentImpl()throws RemoteException{
        super();
    }

    @Override
    public Student getStudent(String stu_id)throws RemoteException {
        try{

            Connection con= DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/newstudent",
                    "root",
                    "801@Vihanga"

            );

            PreparedStatement ps=con.prepareStatement(
                    "select *from basicdata where stu_id=?"
            );

            ps.setString(1, stu_id);

            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                return new Student(
                        rs.getString("stu_id"),
                        rs.getString("stu_name"),
                        rs.getString("stu_address")
                );
            }

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
