package com.medassi.democours.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;

@Configuration 
public class WebSecurityConfig {

    public DaoAuthenticationProvider authenticationProvider(UtilisateurRepository utilisateurRepository) {
        return new DaoAuthenticationProvider(new UtilisateurService(utilisateurRepository));
    }
    

}
