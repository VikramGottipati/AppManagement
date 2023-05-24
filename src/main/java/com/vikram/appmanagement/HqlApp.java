package com.vikram.appmanagement;

import java.util.List;

import com.vikram.appmanagement.entity.AppDetails;
import com.vikram.appmanagement.repository.HqlRepository;

public class HqlApp {
	public static void main(String[] args) {
		
		HqlRepository repository=new HqlRepository();
		/*
		 * List<AppDetails> list = repository.findAll(); list.forEach(each->{
		 * System.out.println(each); });
		 */
		
		List<AppDetails> name = repository.findByName("WhatsApp");
		name.forEach(each->{
			System.out.println(each);
		});
		
	}
}
