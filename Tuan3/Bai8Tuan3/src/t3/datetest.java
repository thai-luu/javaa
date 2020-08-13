package t3;

import java.util.Scanner;

public class datetest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	mydates testa1=new mydates();//a1
	
	mydates testa2=new mydates(27,3,2020);//a2
	testa2.showinfo();//a2
	
	mydates testa3=new mydates("ngày 27 tháng 3 năm 2020");//a3
	
	testa1.setDate(12);//b
	testa1.setMonth(12);//b
	testa1.setYear(2019);//b
	testa1.showinfo();//b
	
	testa1.accept();//c
	
	testa1.print();//d
	

}
}
