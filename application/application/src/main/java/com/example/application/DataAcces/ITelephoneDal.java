package com.example.application.DataAcces;

import java.util.List;

import com.example.application.Entities.Telephone;

public interface ITelephoneDal {
	
	
	List<Telephone> getAll();
	void add(Telephone telephone);
	void update(Telephone telephone);
	void delete(Telephone telephone);
	Telephone getByid(int id);


}
