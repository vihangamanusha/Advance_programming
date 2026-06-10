package RMII.with_serilizble;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;

public class StudentServiceRemote extends UnicastRemoteObject implements StudentService {

    public StudentServiceRemote() throws RemoteException {
        super();
    }

    @Override
    public newStudent getnewStudent(String stu_id) throws RemoteException {
        try{
            Connection con=DriverManager.getConnection(
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
                return new newStudent(
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