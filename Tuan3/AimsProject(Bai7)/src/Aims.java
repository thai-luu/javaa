
public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc dvd1= new DigitalVideoDisc("the lion king","animation","Tran Quang",100,200);
		DigitalVideoDisc dvd2= new DigitalVideoDisc("the panther king","animation","Tran Quang 2",50,150);
		DigitalVideoDisc dvd3= new DigitalVideoDisc("the tiger king","animation","Tran Quang 3",60,160);
		
		OrderProduct order1= new OrderProduct();
		OrderProduct order2= new OrderProduct();
		
		//them vao cac san pham
		order1.addDisc(dvd1,1);
		order2.addDisc(dvd3, 5);
		//loai bo bot san pham 
		order2.removeDisc(dvd3, 2);
		
		//tao hoa don
		Order hoadon = new Order();
		hoadon.addOrderProduct(order1);
		hoadon.addOrderProduct(order2);
		
		System.out.println("Tong so tien la:");
		System.out.println(hoadon.getTotalCost());
		
	    
		
	}
}
	