import java.util.Scanner;

public class checkIfIncreasing {
    public static void main (String[] args){
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int prev = -1;
        while(true){
            int cur = sc.nextInt();
            if (cur == 0){
                break;
            }
            if (cur < prev){
                flag = false;
            }
            prev = cur;
        }
        if(!flag){
            System.out.print("NO");
        }
        else{
            System.out.print("YES");
        }
    }
}
