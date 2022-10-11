import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tens = scanner.nextInt();

        int div = tens / 10;

        System.out.println(div);
    }
}