package t3;
import java.util.Calendar;
import java.util.Scanner;
public class mydates {

      public int ngay;
      public int thang;
      public int nam;
	  public String chuoi;

      
      
	public mydates() {
		Calendar now= Calendar.getInstance();
		System.out.println("showinfo:");
		System.out.println("date\t:"+now.get(Calendar.DAY_OF_MONTH));
		System.out.println("month\t:"+(now.get(Calendar.MONTH)+1));
		System.out.println("year\t:"+now.get(Calendar.YEAR));
	}
	
	public mydates(int date, int month, int year) {
		this.ngay = date;
		this.thang = month;
		this.nam = year;
	}
	public mydates(String info) {
		this.chuoi=info;
		System.out.println("Info:\t"+this.chuoi);
	}
	public int date;
	public int month;
	public int year;
	public String xau;



	public void mydates() {
		Calendar now= Calendar.getInstance();
		System.out.println("showinfo:");
		System.out.println("date\t:"+now.get(Calendar.DAY_OF_MONTH));
		System.out.println("month\t:"+(now.get(Calendar.MONTH)+1));
		System.out.println("year\t:"+now.get(Calendar.YEAR));
	}

	public void mydates(int date, int month, int year) {
		this.ngay = date;
		this.thang = month;
		this.nam = year;
	}
	public void mydates(String info) {
		this.chuoi=info;
		System.out.println("Info:\t"+this.chuoi);
	}

	public int getDate1() {
		return this.ngay;
	}
	public void setDate1(int date) {
		this.ngay = date;
	}
	public int getMonth1() {
		return this.thang;
	}
	public void setMonth1(int month) {
		this.thang = month;
	}
	public int getYear1() {
		return this.nam;
	}
	public void setYear1(int year) {
		this.nam = year;
	}
	public void showinfo1(){
		System.out.println("showinfo:");
		System.out.println("date\t:" + this.getDate1());
		System.out.println("month\t:" + this.getMonth1());
		System.out.println("year\t:" + this.getYear1());

	}
	public void accept1() {
		String a;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Nhap vao thong tin theo dang sau: Ngay...thang...nam:");
		a=scanner.nextLine();
		System.out.println("showinfo:");
		System.out.println("date\t:"+a.substring(5,7));
		System.out.println("month\t:"+a.substring(14,16));
		System.out.println("year\t:"+a.substring(21,25));
	}


	public void print1() {
		Calendar now= Calendar.getInstance();
		System.out.println("Ngay hien tai la:");
		System.out.println("date\t:"+now.get(Calendar.DAY_OF_MONTH));
		System.out.println("month\t:"+(now.get(Calendar.MONTH)+1));
		System.out.println("year\t:"+now.get(Calendar.YEAR));
	}


	public int getDate() {
		return this.ngay;
	}
	public void setDate(int date) {
		this.ngay = date;
	}
	public int getMonth() {
		return this.thang;
	}
	public void setMonth(int month) {
		this.thang = month;
	}
	public int getYear() {
		return this.nam;
	}
	public void setYear(int year) {
		this.nam = year;
	}
    public void showinfo(){
    	System.out.println("showinfo:");
    	System.out.println("date\t:" + this.getDate1());
    	System.out.println("month\t:" + this.getMonth1());
    	System.out.println("year\t:" + this.getYear1());
    	
    }
    public void accept() {
    	String a;
    	Scanner scanner= new Scanner(System.in);
    	System.out.println("nhập vào thông tin theo dạng sau ngày...tháng...năm...:");
    	a=scanner.nextLine();
    	System.out.println("showinfo:");
        System.out.println("date\t:"+a.substring(5,7));
        System.out.println("month\t:"+a.substring(14,16));
        System.out.println("year\t:"+a.substring(21,25));
    	}
   
    
	public void print() {
		Calendar now= Calendar.getInstance();
		System.out.println("Ngay hien tai la:");
		System.out.println("date\t:"+now.get(Calendar.DAY_OF_MONTH));
		System.out.println("month\t:"+(now.get(Calendar.MONTH)+1));
		System.out.println("year\t:"+now.get(Calendar.YEAR));
	}

}