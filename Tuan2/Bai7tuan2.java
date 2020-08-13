import java.util.Scanner;

public class Bai7tuan2 {
    public static void main(String[] args) {
        int m,n,i,j;
        System.out.println("Nhap vao lan luot so hang,cot cua ma tran can tao :");
        Scanner in= new Scanner(System.in);
        n= in.nextInt();
        m= in.nextInt();
        int a[][]=  new int[n][m];
        int b[][]=  new int[n][m];
        System.out.println("Nhap vao phan tu cho ma tran a,b: ");
        for(i=0;i<n;i++) {
            for (j = 0; j <m; j++) {
                System.out.printf("nhap vao phan tu hang %d cot %d cho ma tran a: ", (i+1), (j+1));
                a[i][j]=in.nextInt();
                System.out.printf("nhap vao phan tu hang %d cot %d cho ma tran b: ", (i+1), (j+1));
                b[i][j]=in.nextInt();
            }
        }
        System.out.println("Ma tran da nhap la: ");
        for(i=0;i<n;i++) {
            for (j = 0; j < m; j++) {
                System.out.print(a[i][j]+"\t");

            }
            System.out.println();
    }
        System.out.println("Ma tran da nhap la: ");
        for(i=0;i<n;i++) {
            for (j = 0; j <m; j++) {
                System.out.print(b[i][j]+"\t");

            }
            System.out.println();
        }
        }
}
