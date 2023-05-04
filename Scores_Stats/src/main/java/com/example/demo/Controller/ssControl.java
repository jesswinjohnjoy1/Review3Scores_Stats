package com.example.demo.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;


import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.example.demo.Model.ssModel;
import com.example.demo.Service.ssService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.*;


@RestController

public class ssControl{
	@Autowired
	ssService ss_service;

	@Operation(summary = "Creates a new data")
	@ApiResponses(value = {@ApiResponse(responseCode = "201", description = " Created Successfully!"), @ApiResponse(responseCode = "400", description = "Employee is Invalid"), @ApiResponse(responseCode = "401", description = "Invalid Credentials")})
	@ResponseStatus(HttpStatus.CREATED)
	
	@PostMapping(value = "/post", produces = "application/json", consumes = "application/json")
	public String create(@RequestBody ssModel ss_model)
	{
		return ss_service.addSS(ss_model);
	}
	@Operation(summary = "Creates a new data")
	@ApiResponses(value = {@ApiResponse(responseCode = "201", description = " Created Successfully!"), @ApiResponse(responseCode = "400", description = "Employee is Invalid"), @ApiResponse(responseCode = "401", description = "Invalid Credentials")})
	@ResponseStatus(HttpStatus.CREATED)
	
	@GetMapping(value = "/get", produces = "application/json", consumes = "application/json")
	public List<ssModel> read()
	{
		return ss_service.getSS();
	}
	@Operation(summary = "Creates a new data")
	@ApiResponses(value = {@ApiResponse(responseCode = "201", description = "Created Successfully!"), @ApiResponse(responseCode = "400", description = "Employee is Invalid"), @ApiResponse(responseCode = "401", description = "Invalid Credentials")})
	@ResponseStatus(HttpStatus.CREATED)
	
	@GetMapping(value = "/{sign_no}", produces = "application/json", consumes = "application/json")
	public Optional<ssModel> readById(@PathVariable int sign_no)
	{
		return ss_service.getSSById(sign_no);
	}
	@Operation(summary = "Creates a new data")
	@ApiResponses(value = {@ApiResponse(responseCode = "201", description = " Created Successfully!"), @ApiResponse(responseCode = "400", description = "Employee is Invalid"), @ApiResponse(responseCode = "401", description = "Invalid Credentials")})
	@ResponseStatus(HttpStatus.CREATED)
	
	@PutMapping(value = "/update_ss")
	public String update(@RequestBody ssModel ss_model) 
	{
		return ss_service.updateSS(ss_model);
	}
	@Operation(summary = "Creates a new data")
	@ApiResponses(value = {@ApiResponse(responseCode = "201", description = "Created Successfully!"), @ApiResponse(responseCode = "400", description = "Employee is Invalid"), @ApiResponse(responseCode = "401", description = "Invalid Credentials")})
	@ResponseStatus(HttpStatus.CREATED)
	
	@DeleteMapping(value = "/delete")
	public String delete(@RequestParam ("num") int sign_no)
	{
		return ss_service.deleteByRequestParamId(sign_no);
	}
	//sorting
	@PostMapping("/login")
	public String login(@RequestBody Map<String, String> loginData) {
		String uname = loginData.get("uname");
		String pwd = loginData.get("pwd");
		String result = ss_service.checkLogin(uname, pwd);
		return result;
	}
	@PostMapping("/adduser")
	  public ssModel AddUser(@RequestBody ssModel model) {
		return ss_service.addUser(model);
	}
    @GetMapping("/getuser")
    public List<ssModel>listAll(){
	return ss_service.getUser();
    }
    //sorting
    @GetMapping("/sort/{field}")
    public List<ssModel>sorting(@PathVariable String field)
    {
   	 return ss_service.sort(field);
    }
    //pagination
    @GetMapping("/sort/{offset}/{pagesize}")
    public List<ssModel>paging(@PathVariable int offset,@PathVariable int pagesize)
    {
   	 return ss_service.paging(offset, pagesize);
    }
}