package com.example.application.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.application.Bussines.ItelephoneService;
import com.example.application.Entities.Telephone;


@RestController
@RequestMapping("/api")
public class TelephoneController {
	
	private ItelephoneService telephoneservice;
	
	@Autowired
	public TelephoneController(ItelephoneService telephoneservice) {
		this.telephoneservice = telephoneservice;
	}
	
	@GetMapping("/telephone")
	public List<Telephone> get(){
		return telephoneservice.getAll();
	}
	@PostMapping("/add")
	public void add(@RequestBody Telephone telephone) {
		telephoneservice.add(telephone);
			
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Telephone telephone) {
		telephoneservice.update(telephone);
			
	}
	@PostMapping("/delete")
	public void delete(@RequestBody Telephone telephone) {
		telephoneservice.delete(telephone);
			
	}
	
	@GetMapping("/cities/{id}")
	public Telephone getByid(@PathVariable int id){
		return telephoneservice.getByid(id);
	}
		
	
	

	
}
