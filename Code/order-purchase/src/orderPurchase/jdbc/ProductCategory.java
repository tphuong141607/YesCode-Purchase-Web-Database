package orderPurchase.jdbc;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ProductCategory {

	private int id;
	private String categoryName;
	
	public ProductCategory() {}
	
	public ProductCategory(int id, String categoryName) {
		this.id = id;
		this.categoryName = categoryName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "Product Category [id = " + id 
				+ ", categoryName = " + categoryName + "]";
	}

}
