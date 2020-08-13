import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class Bai6tuan2 {
    public static void main(String[] args){
        int n,i;

Integer sum=0;
        System.out.println("moi ban nhap vao so phan tu cua mang :");
        Scanner in= new Scanner(System.in);
        n= in.nextInt();
        Integer a[] = new Integer[n];
        System.out.println("moi ban nhap vao cac phan tu cho mang:");
        for(i=0;i<n;i++){
            a[i]=in.nextInt();
            sum+=a[i];
        }
        float y= (float) sum/n;

        System.out.println("Sap xep mang theo thu tu tang dan :");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Sap xep mang theo thu tu giam dan :");
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
        System.out.printf("Tong va gia tri trung binh cua mang lan luot la: %d va %f",sum,y);

    }
}
