package com.example.application.Bussines;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.application.DataAcces.ITelephoneDal;
import com.example.application.Entities.Telephone;

@Service
public class Manager implements ItelephoneService {
	
	
	private ITelephoneDal telephoneDal;
	@Autowired
	public Manager(ITelephoneDal telephoneDal) {
		this.telephoneDal = telephoneDal;
	}

	@Override
	@Transactional
	public List<Telephone> getAll() {
		// TODO Auto-generated method stub
		return this.telephoneDal.getAll();
	}

	@Override
	@Transactional
	public void add(Telephone telephone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void update(Telephone telephone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void delete(Telephone telephone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public Telephone getByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
