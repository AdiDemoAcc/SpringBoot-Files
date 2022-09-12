package com.backend.SpringBoot.service;

import java.util.List;

import com.backend.SpringBoot.model.Helper;

public interface HelperService {
	
	public List<Helper> getAllHelpers();
	
	public Helper getHelperById(int id);
	
	public void deleteHelper(int id);
	
	public Helper updateHelper(int id, Helper helper);
	
	public Helper createHelper(Helper helper);
	
}
