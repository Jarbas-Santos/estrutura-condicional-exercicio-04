import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalTime;

        int start = sc.nextInt();
        int finish = sc.nextInt();

        if (start < finish) {
            totalTime = finish - start;
        }
        else {
            totalTime = 24 - start + finish;
        }

        System.out.println("O JOGO DUROU " + totalTime + " HORA(S)");
        
        sc.close();
    }
}