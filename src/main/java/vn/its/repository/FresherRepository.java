package vn.its.repository;

import org.springframework.stereotype.Repository;

import vn.its.model.Fresher;

@Repository
public class FresherRepository {

	public boolean authenticate(Fresher fresher) {
		if (fresher.getUsername().equals(fresher.getPassword())) {
			return true;
		} else {
			return false;
		}
	}
}
