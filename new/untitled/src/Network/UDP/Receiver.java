package Network.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
    public static void main(String[] args) {
        try{
            DatagramSocket ds = new DatagramSocket(12345);
            byte[] buff=new byte[1024];
            DatagramPacket dp=new DatagramPacket(buff,1024);
            ds.receive(dp);
            String s = new String(dp.getData(),0,dp.getLength());
            System.out.println(s);
            ds.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}