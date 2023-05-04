package com.example.demo.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ssModel;
import com.example.demo.Repository.ssMappingRepo;
import com.example.demo.Repository.ssRepo;

@Service
public class ssService {
	@Autowired
	ssRepo ss_repo;
	@Autowired
	ssMappingRepo ss_Mapping;
	public String addSS(ssModel ss_model)
	{
		ss_repo.save(ss_model);
		return "Added!";
	}
	public List<ssModel> getSS()
	{
		return ss_repo.findAll();
	}
	public Optional<ssModel> getSSById(int id)
	{
		return ss_repo.findById(id);
	}
	public String updateSS(ssModel ss_model)
	{
		ss_repo.save(ss_model);
		return "Updated!";
	}
	public String deleteByRequestParamId(int sign_no)
	{
		ss_repo.deleteById(sign_no);
		return "Deleted!";
	}
	public String checkLogin(String uname, String pwd){
		ssModel user = ss_repo.findByuname(uname);
		if(user == null) {
			return "no user found";
		}
		else {
			if(user.getPwd().equals(pwd)) {
				return"Login Succesfull";
			}
			else 
			{
				return "Login Failed";
			}
		}
	}
	public ssModel addUser(ssModel game) {
		return ss_repo.save(game);
	}
	public List<ssModel> getUser(){
		return ss_repo.findAll();
	}
	//sorting
	public List<ssModel>sort(String field)
	{
		return ss_repo.findAll(Sort.by(Sort.Direction.ASC, field));
	}
	//pagination
	public List<ssModel>paging( int offset,int pagesize)
	{
		Page<ssModel> page=ss_repo.findAll(PageRequest.of(offset,  pagesize));
		return page.getContent();
	}
}
