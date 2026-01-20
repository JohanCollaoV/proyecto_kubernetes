package com.jcollao.srpingcloud.msvc.usuarios.msvc.usuarios.controller;

import com.jcollao.srpingcloud.msvc.usuarios.msvc.usuarios.models.entity.Usuario;
import com.jcollao.srpingcloud.msvc.usuarios.msvc.usuarios.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping("/")
    public List<Usuario> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> detalle (@PathVariable (name = "id")Long id){
        Optional<Usuario> usuarioOptional = service.porId(id);
        if (usuarioOptional.isPresent()){
            return ResponseEntity.ok().body(usuarioOptional.get());
        }
        return ResponseEntity.notFound().build();
    }


}
