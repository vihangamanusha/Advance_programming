import java.net.InetAddress;
import java.net.UnknownHostException;

public class ex {
    public static void main(String[] args) {

        try {
            InetAddress ip = InetAddress.getByName("youtube.com");
            System.out.println(ip);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

    }
}
