package Network.TCP_02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(12345);

            Socket s = ss.accept();

            DataInputStream dis =
                    new DataInputStream(s.getInputStream());

            DataOutputStream dos =
                    new DataOutputStream(s.getOutputStream());

            // Read client message
            String msg = dis.readUTF();
            System.out.println("Client: " + msg);

            // Reply to client
            dos.writeUTF("Hello client");
            dos.flush();

            dis.close();
            dos.close();
            s.close();
            ss.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}