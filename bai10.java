import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        char kitu= 'm';
        int dem=0;
        do{
            System.out.println("nhap vao chuoi: ");
            chuoi = sc.nextLine();
        }while(chuoi.length()>80);
        for(int i=0;i<chuoi.length();i++){
            if(chuoi.charAt(i)==kitu){
                dem++;
            }
        }
        System.out.println("so lan xuat hien ki tu: "+dem);

    }
}
