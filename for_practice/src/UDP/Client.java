package UDP;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            String str="welcome a";
            InetAddress address = InetAddress.getByName("127.0.0.1");
            DatagramPacket dp=new DatagramPacket(str.getBytes(), str.length(), address, 1234);
            ds.send(dp);
            ds.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }
}
