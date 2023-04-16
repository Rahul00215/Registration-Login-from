package com.rahul.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rahul.Model.StudentMod;

@Repository
public interface StudentRepo extends CrudRepository<StudentMod, Long>{


	 Optional<StudentMod>  findByusername(String name);

	Optional<StudentMod> findBypassword(int password);
}
