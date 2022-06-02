import java.util.Scanner;

public class checkIfEven {
    public static void main(String[] args) {
        int n;
        int x;
        boolean isEven = true;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            if (x%2 != 0){
                isEven = false;
            }
        }
        if (isEven == false){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

        sc.close();
    }
}
