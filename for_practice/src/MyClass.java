import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyClass {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip=InetAddress.getByName("facebook.com");
        System.out.println(ip);
    }
}
