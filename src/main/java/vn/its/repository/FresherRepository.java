package vn.its.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.its.model.Fresher;

public interface FresherRepository extends JpaRepository<Fresher, Integer>{
	
	Fresher findByUsernameAndPassword(String username, String password);

//	public boolean authenticate(Fresher fresher) {
//		if (fresher.getUsername().equals(fresher.getPassword())) {
//			return false;
//		} else {
//			return true;
//		}
//	}
//
//	public boolean register(Fresher fresher) {
//		if (fresher.getUsername().equals(fresher.getPassword())) {
//			return false;
//		} else {
//			return true;
//		}
//	}
	
}
