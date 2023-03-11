import java.util.Scanner;

public class bai5 {

    public static void main(String[] args) {
    int n;
    int S=0;
    Scanner sc = new Scanner(System.in);
    do{
        System.out.println("nhap so nguyen bat ki: ");
        n = sc.nextInt();
        S+=n;
    }while(S<100);
    System.out.println("tong cac so nguyen vua nhap la: "+S);
    }
}
