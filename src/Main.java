import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите стоимость билета: ");
        long price_ticket = in.nextInt();
        long bonus = 0;
        bonus = price_ticket / 20;
        System.out.printf("Вам начислено: " + bonus + " мили(-ей)");
    }
}
