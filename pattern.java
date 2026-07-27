//pattern 1
import java.util.Scanner;
public class pattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of rows");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=4; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }sc.close();

    }
    
}
