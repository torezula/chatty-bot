import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int natNum = scanner.nextInt();

        int nextEven = natNum + 2 - natNum % 2;

        System.out.println(nextEven);
    }
}