package Concrete;

import Abstract.UserValidationService;
import Entities.Customer;

public class UserValidationManager implements UserValidationService {

	@Override
	public boolean checkIfPerson(Customer customer) {
		if (customer.getFirstName().length() >4 && customer.getLastName().length() >2 && customer.getBirthYear() <1990 && customer.getNationalityId()<4) {
			System.out.println("Kimlik dogruland─▒.");
			return true;
		} else {
			System.out.println("Kimlik dogrulanamad─▒.");
		}
			return false;
		}
		
	

}
