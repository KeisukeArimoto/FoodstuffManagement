package com.workspace.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workspace.Entity.Users;

@Repository
public interface UsersRepository extends JpaRepository <Users, Long> {

}
