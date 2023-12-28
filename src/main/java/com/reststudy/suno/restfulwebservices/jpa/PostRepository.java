package com.reststudy.suno.restfulwebservices.jpa;

import com.reststudy.suno.restfulwebservices.user.Post;
import com.reststudy.suno.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {  // Post  , id


}
