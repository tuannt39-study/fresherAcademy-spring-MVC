package vn.its.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.its.model.Fresher;
import vn.its.repository.FresherRepository;

@Service
public class RegisterService {
	@Autowired
	private FresherRepository fresherRepository;

	public boolean register(Fresher fresher) {
		return fresherRepository.register(fresher);
	}
}
