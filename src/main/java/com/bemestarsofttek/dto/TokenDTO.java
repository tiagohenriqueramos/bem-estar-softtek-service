package com.bemestarsofttek.dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TokenDTO {


    private String token;
    private String email;
    private String tipo;

    public TokenDTO(String token, String email, String tipo) {
        this.token = token;
        this.email = email;
        this.tipo = tipo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
