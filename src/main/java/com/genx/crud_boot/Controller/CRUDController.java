package com.genx.crud_boot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genx.crud_boot.Model.test;
import com.genx.crud_boot.Service.CRUDService;

@RestController
public class CRUDController {
	@Autowired
	CRUDService crudService;

	@RequestMapping("/create")
	@PostMapping
	public test saveCrud(@RequestBody test val) {
		return crudService.insert(val);
	}
	
	@RequestMapping("/show")
	@GetMapping
	public List<test> showVal(){
		return crudService.show();
	}
}
