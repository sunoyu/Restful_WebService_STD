package com.reststudy.suno.restfulwebservices.jpa;

import com.reststudy.suno.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {  // user , id


}
