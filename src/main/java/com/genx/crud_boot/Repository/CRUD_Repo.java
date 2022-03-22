package com.genx.crud_boot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.genx.crud_boot.Model.test;

@Repository
public interface CRUD_Repo extends JpaRepository<test, Long>{
	List<test> findAll();

}
