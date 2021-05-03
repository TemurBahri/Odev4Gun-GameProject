package Concrete;

import Entities.Campaing;
import Entities.Customer;

public class GameSaleManager  {
	
public void gameSale(Customer customer , Campaing campaing) {
		
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " isimli kullanıcı " + campaing.getCampaingName() + " Kampanya ile bu oyunu satın aldı.");
	}

}
