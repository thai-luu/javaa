
import java.io.*; 
public class Order{
	private int totalCost=0;
	
	//them san pham vao hoa don
	public void addOrderProduct(OrderProduct order){
		this.totalCost+=order.getProductCost()*order.getQtyOrder();
	}
	
	//getter and setter method
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	
}