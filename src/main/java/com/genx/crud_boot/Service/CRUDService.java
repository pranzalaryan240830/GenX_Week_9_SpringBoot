package com.genx.crud_boot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genx.crud_boot.Model.test;
import com.genx.crud_boot.Repository.CRUD_Repo;

@Service
public class CRUDService {
	@Autowired
	CRUD_Repo crudRepo;

	public test insert(test val) {
		return crudRepo.save(val);
	}
	
	public List<test> show() {
		return crudRepo.findAll();
	}
}
