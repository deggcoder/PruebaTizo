/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tizo.challenge.service;

import com.tizo.challenge.model.Acceso;
import com.tizo.challenge.model.Cuenta;
import com.tizo.challenge.repo.ICuentaRepo;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")
public class UsuarioService implements UserDetailsService {

    @Autowired
    private ICuentaRepo userRepo;
    
    @Override
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Cuenta cuenta = userRepo.findByUsername(username);
        
        if(cuenta == null) throw new UsernameNotFoundException(username);
        
        var rol = new ArrayList<GrantedAuthority>();
        
        for (Acceso acceso : cuenta.getAcceso()) {
            rol.add(new SimpleGrantedAuthority(acceso.getRol()));
        }
        
        return new User(cuenta.getUsername(), cuenta.getClave(), rol);
    }
    
}
