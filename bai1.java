import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		a = sc.nextInt();
        System.out.println("nhap b: ");
        b = sc.nextInt();

        int tong = a + b;
		System.out.println(a+" + "+b+" = "+tong);
		
		int hieu = a - b;
		System.out.println(a+" - "+b+" = "+hieu);
		
		int nhan = a * b;
		System.out.println(a+" * "+b+" = "+nhan);
		
		float thuong = (float)a / b;
		System.out.println(a+" / "+b+" = "+thuong);
		
		int soDu = a % b;
		System.out.println(a+" % "+b+" = "+soDu);

		if(a == b) {
			System.out.println(" bang nhau: ");
		}else if(a>b){
			System.out.println("a lon hon b: ");
		}else{
            System.out.println("a nho hon b: ");
        }
	}
}
