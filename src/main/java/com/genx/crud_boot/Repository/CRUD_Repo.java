package com.genx.crud_boot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.genx.crud_boot.Model.test;

@Repository
public interface CRUD_Repo extends JpaRepository<test, Long>{

}
