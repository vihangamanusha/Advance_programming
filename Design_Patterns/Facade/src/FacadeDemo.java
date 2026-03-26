import java.util.Scanner;

public class FacadeDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the regno: ");
        String regno=in.nextLine();

        MyEasyRegistration myreg=new MyEasyRegistration(regno);
        System.out.println(myreg.getregno());

    }
}
