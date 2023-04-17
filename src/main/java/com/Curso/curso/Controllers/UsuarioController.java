package com.Curso.curso.Controllers;

import com.Curso.curso.Models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Daniel");
        usuario.setId(id);
        usuario.setApellido("Ojeda");
        usuario.setEmail("theremixamx@gmail.com");
        usuario.setTelefono("3764630242");
        usuario.setPassword("123");
        return usuario;
    }

    @RequestMapping(value = "")
    public Usuario editarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Daniel");
        usuario.setApellido("Ojeda");
        usuario.setEmail("theremixamx@gmail.com");
        usuario.setTelefono("3764630242");
        usuario.setPassword("123");
        return usuario;
    }

    @RequestMapping(value = "")
    public Usuario eliminarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Daniel");
        usuario.setApellido("Ojeda");
        usuario.setEmail("theremixamx@gmail.com");
        usuario.setTelefono("3764630242");
        usuario.setPassword("123");
        return usuario;
    }

    @RequestMapping(value = "")
    public Usuario buscarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Daniel");
        usuario.setApellido("Ojeda");
        usuario.setEmail("theremixamx@gmail.com");
        usuario.setTelefono("3764630242");
        usuario.setPassword("123");
        return usuario;
    }
}
