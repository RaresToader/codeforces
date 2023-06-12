import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-- > 0){
            int x = scanner.nextInt();
            if (x <= 4) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
        }

    }
}
