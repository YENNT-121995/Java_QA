package management_warehouse;

import java.util.Date;

public class product_electric extends product {
	private int time_warranty;
	private double wattage;


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
