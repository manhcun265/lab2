import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen n: ");
        n = sc.nextInt();

        if(n%2==0){
            System.out.println("la so chan: ");
        }else{
            System.out.println("la so le: ");
        }
    }
}

