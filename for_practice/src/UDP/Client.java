package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            String str="welcome a";
            InetAddress address = InetAddress.getByName("127.0.0.1");
            DatagramPacket dp=new DatagramPacket(str.getBytes(), str.length(), address, 1234);

            ds.send(dp);
            ds.close();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
        }
}
