package Concrete;

import Abstract.CustomerService;
import Abstract.UserValidationService;
import Entities.Customer;

public class CustomerManager implements CustomerService {
	
	UserValidationService userValidationService;
	
	public CustomerManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}
	
	@Override
	public void add(Customer customer) {
		if (userValidationService.checkIfPerson(customer)==true) {
			System.out.println("Kullanıcı eklendi : " + customer.getFirstName() + " " + customer.getLastName());
		} else {
			System.out.println("Kullanıcı eklendi : " + customer.getFirstName() + " " + customer.getLastName());
		}
		
	}

	@Override
	public void update(Customer customer) {
		if (userValidationService.checkIfPerson(customer)==true) {
			System.out.println("Kullanıcı Güncellendi : " + customer.getFirstName() + " " + customer.getLastName());
		} else {
			System.out.println("Kullanıcı Güncellenemedi : " + customer.getFirstName() + " " + customer.getLastName());
		}
		
	}

	@Override
	public void delete(Customer customer) {
		if (userValidationService.checkIfPerson(customer)==true) {
			System.out.println("Kullanıcı silindi : " + customer.getFirstName() + " " + customer.getLastName());
		} else {
			System.out.println("Kullanıcı silinemedi : " + customer.getFirstName() + " " + customer.getLastName());
		}
		
	}
	

}
