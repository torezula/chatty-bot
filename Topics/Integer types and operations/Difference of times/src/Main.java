import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneE = scanner.nextInt();    //first moment
        int twoE = scanner.nextInt();
        int threeE = scanner.nextInt();

        int oneA = scanner.nextInt();    //second moment
        int twoA = scanner.nextInt();
        int threeA = scanner.nextInt();

        int secs = ((oneA * 3600) + (twoA * 60) + threeA) - ((oneE * 3600) + (twoE * 60) + threeE);

        System.out.println(secs);
    }
}