import java.util.Scanner;

public class FacadeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the registration no :");
        String regno=sc.nextLine();

        MyEasyRegistration myreg=new MyEasyRegistration(regno);
        System.out.println(myreg.getregno());
    }
}
