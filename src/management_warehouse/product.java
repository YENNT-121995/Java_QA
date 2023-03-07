package management_warehouse;

import java.util.Date;

public abstract class product {
	protected int id_Product;
	protected String name_Product;
	protected int quantity_Product;
	protected double order_Product;
	protected int remaing_quantity;
	protected double VAT_Amount;
	abstract void inventory_quantity();
	abstract double set_tax();
	void displays_infor() {
		System.out.println(" Thông tin product gồm:"+id_Product+ name_Product+quantity_Product+order_Product);
	}


	

}
