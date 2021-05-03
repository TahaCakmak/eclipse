package Concerete;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		
		System.out.println("Saved to database :" + customer.getFirstName());
		
	}

}
