import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n-- > 0) {
            int size = scanner.nextInt();
            if(size == 2){
                System.out.println("11");
            }
            if(size == 1){
                System.out.println('1');
            }
            if(size == 0){
                System.out.println();
            }
            StringBuilder sb = new StringBuilder();
            int curMin = scanner.nextInt();
            int curMax = curMin;
            boolean oneSorted = true;
            sb.append('1');
            for(int j = 1; j < size; j++){
                int next = scanner.nextInt();
                if(next >= curMax && oneSorted){
                    curMax = next;
                    sb.append('1');
                }
                else if(next <= curMin && oneSorted){
                    oneSorted = false;
                    sb.append('1');
                    curMax = curMin;
                    curMin = next;
                }
                else if(oneSorted){
                    sb.append('0');
                }
                else{
                    if(next >= curMin && next <= curMax){
                        sb.append('1');
                        curMin = next;
                    }
                    else{
                        sb.append('0');
                    }
                }
            }
            System.out.println(sb);

        }
        scanner.close();

    }
}
