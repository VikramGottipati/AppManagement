package com.vikram.appmanagement;

import java.time.LocalDate;

import com.vikram.appmanagement.entity.AppDetails;
import com.vikram.appmanagement.repository.AppRepository;

public class App {
	
	public static void main(String[] args) {
		
		AppDetails appDetails = new AppDetails();

		appDetails.setServiceName("WhatsApp");
		appDetails.setUrl("https://web.whatsapp.com/");
		appDetails.setStatus("Active");
		appDetails.setCreatedDate(LocalDate.now());
		appDetails.setCreatedBy("Vikram");
		appDetails.setModifiedDate(LocalDate.now());
		appDetails.setModifiedBy("vicky");

		AppRepository repository = new AppRepository();
//		repository.save(appDetails);
		
//		AppDetails details = repository.findById(1);
//		System.out.println(details);

	}
}
