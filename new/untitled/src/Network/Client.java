package Network;

import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost", 1234);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
