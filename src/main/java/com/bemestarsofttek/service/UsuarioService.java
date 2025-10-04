package com.bemestarsofttek.service;

import com.bemestarsofttek.entities.Usuario;

import java.util.List;



public interface UsuarioService {

    Usuario autenticar(String email, String senha);

    Usuario salvarUsuario(Usuario usuario);

    void validarEmail(String email);

    void validarNome(String nome);

    List<Usuario> listarUsuarios();

    Usuario encontrarPorId(Long id);

    void deletarUsuarioPorId(Long id);

}