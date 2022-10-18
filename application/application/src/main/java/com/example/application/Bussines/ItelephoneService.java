package com.example.application.Bussines;

import java.util.List;

import com.example.application.Entities.Telephone;

public interface ItelephoneService {
	
	List<Telephone> getAll();
	void add(Telephone telephone);
	void update(Telephone telephone);
	void delete(Telephone telephone);
	Telephone getByid(int id);
}
