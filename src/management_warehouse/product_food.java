package management_warehouse;

import java.util.Date;

public class  product_food extends product{
	private Date product_date;
	private Date expire_date;
	private String service_Provider;
	
	@Override
	void inventory_quantity() {
		// TODO Auto-generated method stub
		
	}
	@Override
	double set_tax() {
		// TODO Auto-generated method stub
		return (order_Product*0.05);
	}


}
