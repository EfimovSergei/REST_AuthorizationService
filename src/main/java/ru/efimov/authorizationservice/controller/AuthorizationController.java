package ru.efimov.authorizationservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.efimov.authorizationservice.service.Authorities;
import ru.efimov.authorizationservice.service.AuthorizationService;

import java.util.List;

@AllArgsConstructor
@RestController
public class AuthorizationController {
    private AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }
}