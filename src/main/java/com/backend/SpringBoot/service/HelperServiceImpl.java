package com.backend.SpringBoot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.SpringBoot.model.Helper;
import com.backend.SpringBoot.repository.HelperRepository;

@Service
public class HelperServiceImpl implements HelperService {

	@Autowired
	private HelperRepository helperRepository;
	
	@Override
	public List<Helper> getAllHelpers() {
		return helperRepository.findAll();
	}

	@Override
	public Helper getHelperById(int id) {
		return helperRepository.findById(id).get();
	}

	@Override
	public void deleteHelper(int id) {
		Helper helper = helperRepository.findById(id).get();
		if (helper != null) {
			helperRepository.delete(helper);
		}
	}

	@Override
	public Helper updateHelper(int id, Helper newhelper) {
		Helper oldhelper = helperRepository.findById(id).get();
		if (oldhelper != null) {
			newhelper.setHelperID(id);
			helperRepository.save(newhelper);
		}
		return newhelper;
	}

	@Override
	public Helper createHelper(Helper helper) {
		return helperRepository.save(helper);
	}

}
