package com.reststudy.suno.restfulwebservices.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class userResource {
    private UserDaoService service;  // 오토와이어드 필요 없이 아래 ⬇️⬇️ 생성자에 주입해주면 된다.

    public userResource(UserDaoService service) {
        this.service = service;
    }

    @GetMapping(path = "/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    @GetMapping(path = "users/{id}")
    public User retrieveUser(@PathVariable int id) {
        return service.findOne(id);
    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        User savedUser = service.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }



}
