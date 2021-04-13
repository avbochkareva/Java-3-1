import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите стоимость билета: ");
        long num = in.nextInt();
            if (num >= 20)
            {
                num = num / 20;
                System.out.printf("Вам начислено: " + num + " мили(-ей)");
            }
            else
                System.out.println("Вам начислено 0 милей");
    }
}
