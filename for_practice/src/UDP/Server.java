package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) {
        try {
            DatagramSocket ds=new DatagramSocket(3000);
            byte[] buf=new byte[1024];
            DatagramPacket dp=new DatagramPacket(buf, 1024);
            ds.receive(dp);
            String str=new String(dp.getData(),0,dp.getLength());
            System.out.println(str);
            ds.close();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
