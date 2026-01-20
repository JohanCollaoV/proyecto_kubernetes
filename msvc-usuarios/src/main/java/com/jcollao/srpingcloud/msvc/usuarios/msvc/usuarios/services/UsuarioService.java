package com.jcollao.srpingcloud.msvc.usuarios.msvc.usuarios.services;

import com.jcollao.srpingcloud.msvc.usuarios.msvc.usuarios.models.entity.Usuario;
import com.jcollao.srpingcloud.msvc.usuarios.msvc.usuarios.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<Usuario> listar();
    Optional<Usuario> porId(Long id);
    Usuario guardar(Usuario usuario);
    void eliminar(Long id);

}
