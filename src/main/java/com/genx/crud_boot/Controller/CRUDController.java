package com.genx.crud_boot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.genx.crud_boot.Model.test;
import com.genx.crud_boot.Service.CRUDService;

@RestController
public class CRUDController {
	@Autowired
	CRUDService crudService;

	// Create
	@PostMapping("/insert")
	public test saveCrud(@RequestBody test val) {
		System.out.println(val.toString());
		return crudService.insert(val);
	}
	
	// Read
	@GetMapping("/show")
	public List<test> showVal(){
		return crudService.show();
	}
	
	// Update
	@PutMapping("/update")
	public test updateVal(@RequestBody test val) {
		return crudService.update(val);
	}
	
	// Delete
	@DeleteMapping("/delete/{id}")
	public String deleteVal(@PathVariable("id") Long id) {
		return crudService.delete(id);
	}
}
