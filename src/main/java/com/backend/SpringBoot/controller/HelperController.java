package com.backend.SpringBoot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.backend.SpringBoot.model.Helper;
import com.backend.SpringBoot.service.HelperService;

@CrossOrigin
@RestController
@RequestMapping("/helper")
public class HelperController {
	
	@Autowired
	private HelperService helperService;
	
	@PostMapping("/create")
	public ResponseEntity<Helper> createHelper(@RequestBody Helper helper)
	{
		return new ResponseEntity<Helper>(helperService.createHelper(helper) , HttpStatus.CREATED);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Helper>> getAllHelpers()
	{
		return new ResponseEntity<List<Helper>>(helperService.getAllHelpers(),HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Helper> getHelperByID(@PathVariable int id)
	{
		return new ResponseEntity<Helper>(helperService.getHelperById(id),HttpStatus.OK);
	}
	
	@PostMapping("/delete/{id}")
	public ResponseEntity<String> deleteHelperById(@PathVariable int id)
	{
		helperService.deleteHelper(id);
		return new ResponseEntity<String>("Helper Record Deleted",HttpStatus.OK);
	}
	
	@PostMapping("/update/{id}")
	public ResponseEntity<Helper> updateHelper(@PathVariable int id,@RequestBody Helper helper)
	{
		return new ResponseEntity<Helper>(helperService.updateHelper(id, helper),HttpStatus.OK);
	}
}
