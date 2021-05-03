package Odev4GunGameProject;

import Concrete.CampaingManager;
import Concrete.CustomerManager;
import Concrete.GameSaleManager;
import Concrete.UserValidationManager;
import Entities.Campaing;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		
		Customer customer1 = new Customer(1,"Timur","Bahri",1111111,1991);
		Customer customer2 =  new Customer (2,"Engin","Demiroğ",222222,1985);
		
		CustomerManager customerManager = new CustomerManager(new UserValidationManager());
		customerManager.add(customer1);
		customerManager.add(customer2);
		
		Campaing campaing1 =new Campaing(1, "Kursa Özel", "%18 indirim");
		Campaing campaing2=new Campaing(1, "Kursa Özel", "%20 indirim");
		
		CampaingManager campaingManager=new CampaingManager();
		campaingManager.update(campaing1);
		campaingManager.add(campaing1);
		System.out.println("---------------------------------------------------------------------------");
		
		
		GameSaleManager gameSaleManager=new GameSaleManager();
		gameSaleManager.gameSale(customer1, campaing1);
		gameSaleManager.gameSale(customer2, campaing2);
		System.out.println("---------------------------------------------------------------------------");
	}
	

}
