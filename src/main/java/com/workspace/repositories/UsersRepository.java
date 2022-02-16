package com.workspace.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.workspace.Entity.Users;

@Repository
public interface UsersRepository extends JpaRepository <Users, Long> {

	@Query("select * from Users where name = value")
	public Users findByName(@Param("value") String value);

}
