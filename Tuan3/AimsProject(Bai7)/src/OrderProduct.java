
import java.io.*; 

public class OrderProduct {
	
	private int qtyOrder; //so luong san pham
	private float productCost; //gia tien
	private String productName; //ten sp
	
	
	// getter and setter method
	public int getQtyOrder() {
		return qtyOrder;
	}
	public void setQtyOrder(int qtyOrder) {
		this.qtyOrder = qtyOrder;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getProductCost() {
		return productCost;
	}
	public void setProductCost(float productCost) {
		this.productCost = productCost;
	}
	
	//them san pham
	public void addDisc(DigitalVideoDisc dvd1, int quantity) {
		// TODO Auto-generated method stub
		this.qtyOrder=quantity;
		this.productCost=dvd1.getCost();
		this.productName=dvd1.getTitle();
	}
	
	//loai bo bot san pham
	public int removeDisc(DigitalVideoDisc disc,int quantity) {
		if(!(disc.getTitle() == this.productName))
			return -2;
		if(this.qtyOrder<quantity) {
			return -1;
		}
		return this.qtyOrder-=quantity;
	}
	
	
}