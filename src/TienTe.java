import java.util.Scanner;

public class TienTe {
    public static void main(String[] args) {
        double rate = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào số tiền USD");
        usd = sc.nextDouble();
        double vnd = usd * rate;
        System.out.print("Số tiền VND sau khi quy đổi là: " + vnd);

    }
}
