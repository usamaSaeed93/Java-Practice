package com.springBoot.security.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationCotroller {
    @PostMapping("/register")
    public ResponseEntity<AuthenticatonResponse> register(
            @RequestBody RegisterRequest request
    ) {
        return null;
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticatonResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ) {
        return null;
    }

}
