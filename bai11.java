import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Nhap vao so nguyen cua mang: ");
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Phan tu thu "+(i+1)+" trong mang la: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Mang ban dau la: ");
        for(int i=0;i<n;i++){
            System.out.print("\t"+a[i]);
        }
        int m;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if(a[i]>a[j]){
              m=a[i];
              a[i]=a[j];
              a[j]=m;
            }
            
        }}
        System.err.print("\nMang da sap xep la: ");
        for(int i=0;i<n;i++){
            System.out.print("\t"+a[i]);
        }

    }
}

