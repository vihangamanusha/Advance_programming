package Network.TCP_02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 12345);

            DataOutputStream dos =
                    new DataOutputStream(s.getOutputStream());

            DataInputStream dis =
                    new DataInputStream(s.getInputStream());

            dos.writeUTF("hello server");
            dos.flush();

            String str = dis.readUTF();
            System.out.println("Server: " + str);

            dos.close();
            dis.close();
            s.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}