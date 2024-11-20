package com.thomazangelo.workshopmongo.resources;

import com.thomazangelo.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        User maria = new User();
        List<User> users = new ArrayList<>();
        users.addAll(List.of(
                new User("1", "teresa", "email"),
                new User("2", "thomaz", "email")
        ));
        return ResponseEntity.ok().body(users);
    }
}
