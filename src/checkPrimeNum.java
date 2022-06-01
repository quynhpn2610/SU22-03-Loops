import java.util.Scanner;

public class checkPrimeNum {
    public static void main(String[] args) {
         boolean flag = true;

         int n;
         Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         if (n==1){
             flag = false;
         }
         for (int i = 2; i <= n-1; i++) {
            if (n%i==0){
                flag = false;
                break;
            }
         }
         if(flag == false){
             System.out.println("NO");
         }
         else{
             System.out.println("YES");
         }
         sc.close();
    }


}
