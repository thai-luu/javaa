package hust.soict.hedspi.lab02;

public class Bai4tuan2 {
 public static void main(String[] args){
        int i,j,a,n;
        a= -1;
        System.out.println("Moi ban nhap vao chieu dai canh day tam giac:");
        Scanner b2= new Scanner(System.in);
        n= b2.nextInt();
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.printf(" ");

            }
           for (j=1;j<=i;j++){
               System.out.printf("* ");

           }
            System.out.println();
        }

    }

}
