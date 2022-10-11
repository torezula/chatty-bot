import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();   //name of candidate
        String exp = scanner.nextLine();    //years of experience
        String csn = scanner.nextLine();    //cuisine preference

        System.out.println("The form for " + name + " is completed. We will contact you if we need " +
                "a chef who cooks " + csn + " dishes and has " + exp + " years of experience.");


    }
}