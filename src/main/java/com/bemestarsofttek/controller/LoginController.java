package com.bemestarsofttek.controller;



import com.bemestarsofttek.config.security.JWTTokenService;
import com.bemestarsofttek.dto.TokenDTO;
import com.bemestarsofttek.entities.LoginForm;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




import lombok.AllArgsConstructor;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/usuarios/autenticar")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class LoginController {

    private final AuthenticationManager authManager;
    private final JWTTokenService tokenService;

    @PostMapping
    public ResponseEntity<Object> autenticar(@RequestBody @Valid LoginForm form){

        UsernamePasswordAuthenticationToken log = form.converter();

        try {

            String email = form.getEmail();
            final Authentication authentication = authManager.authenticate(log);
            String token = tokenService.gerarToken(authentication);

            return ResponseEntity.ok().body(new TokenDTO(token, email,  "Bearer "));


        }catch(AuthenticationException e) {
            return ResponseEntity.notFound().build();
        }
    }

}
