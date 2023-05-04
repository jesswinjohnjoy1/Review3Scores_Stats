package com.example.demo.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.ssModel;

@Repository
public interface ssRepo extends JpaRepository<ssModel,Integer>
{

	ssModel findByuname(String uname);
	
}