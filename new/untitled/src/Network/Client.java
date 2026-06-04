package Network;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client{
    public static void main(String[] args) throws Exception{
        try{
            Socket s=new Socket("localhost",1234);
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello World");
            dos.flush();
            dos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}