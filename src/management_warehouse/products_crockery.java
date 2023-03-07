package management_warehouse;

import java.util.Date;

public class products_crockery extends product{
	private String owner_product;
	private Date warehouse_date;

	@Override
	void inventory_quantity() {
		// TODO Auto-generated method stub
	}

	@Override
	double set_tax() {
		// TODO Auto-generated method stub
		return (order_Product*0.1);
	}

}
