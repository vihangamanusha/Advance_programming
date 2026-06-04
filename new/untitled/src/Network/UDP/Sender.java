package Network.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender{
    public static void main(String[] args) {
        try{
            DatagramSocket ds = new DatagramSocket();
            String msg = "Hello World";
            InetAddress ip = InetAddress.getByName("127.0.0.1");
            DatagramPacket dp=new DatagramPacket(msg.getBytes(),msg.length(),ip,12345);
            ds.send(dp);
            ds.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}