import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concerete.NeroCustomerManager;
import Concerete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1, "Musa", "Hızır", 1994, 53288656226L);
		customerManager.save(customer);
		
	}

}
