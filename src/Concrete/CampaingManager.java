package Concrete;

import Abstract.CampaingService;
import Entities.Campaing;

public class CampaingManager implements CampaingService {

	@Override
	public void add(Campaing campaing) {
		System.out.println("Kampanya eklendi");
		
	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println("Kampanya silindi");
		
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println("Kampanya güncellendi");
		
	}
	

}
