package hust.soict.hedspi.lab02;

public class Bai5tuan2 {
  public static void main(String[] args){
        int a,b;
        System.out.println("Moi ban nhap vao lan luot thang va nam :");
        Scanner in=new Scanner(System.in);
        a= in.nextInt();
        b= in.nextInt();
boolean i=false;
        if((a>12)|(b==0)) {
            System.out.printf("Sai cu phap moi ban nhap lai thang va nam :\n");
            a = in.nextInt();
            b = in.nextInt();

        }
        if(((a!=2)&&(a>=8)&&(a%2==0))|((a != 2) && (a <= 7) && (a % 2 == 1))) {

            System.out.printf("So ngay cua thang %d la 31 ngay\n", a);

i=true;
        }
            if ((a == 2) && (b % 4) == 0) {


                System.out.printf("So ngay cua thang 2 la 29 ngay:\n");
i=true;
            }
            if ((a == 2) && (b % 4) != 0) {

                System.out.printf("so ngay cua thang 2 la 28 ngay:\n");
i=true;
            }



if(i=false)
                System.out.printf("So ngay cua thang %d la 30 ngay:",a);


    }

}
