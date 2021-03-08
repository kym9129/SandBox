package stock.model.vo;

public class Stock {
	
	private int no;
	private String product;
	private int quantity;
	
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Stock(int no, String product, int quantity) {
		super();
		this.no = no;
		this.product = product;
		this.quantity = quantity;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Stock [no=" + no + ", product=" + product + ", quantity=" + quantity + "]";
	}
	
	

}
