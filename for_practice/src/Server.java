import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();
            DataInputStream din=new DataInputStream(s.getInputStream());
            String str=din.readUTF();
            System.out.println(str);
            din.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
