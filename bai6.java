import java.util.Scanner;

public class bai6 {
 
    public static void main(String[] args) {
        int i,n;
        long giaithua = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            giaithua*=i;
        }
        System.out.println("ket qua: "+giaithua);

    }
}