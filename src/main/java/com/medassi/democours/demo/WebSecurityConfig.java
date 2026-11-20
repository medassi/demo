package com.medassi.democours.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration 
public class WebSecurityConfig {

    @Bean 
    public DaoAuthenticationProvider authenticationProvider(UtilisateurRepository utilisateurRepository) {
        UtilisateurService utilisateurService = new UtilisateurService(utilisateurRepository);
        DaoAuthenticationProvider dop = new DaoAuthenticationProvider(utilisateurService);
        dop.setPasswordEncoder(new BCryptPasswordEncoder(BCryptPasswordEncoder.BCryptVersion.$2A, 12));
        return dop;
    }
    @Bean 
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((authz) -> authz
                .requestMatchers("/equipements").hasRole("ADMIN")
                .requestMatchers("/services").hasAnyRole("ADMIN", "STANDARD")
                .requestMatchers("/login").permitAll()
                .requestMatchers("/").permitAll()
                .anyRequest().authenticated()
            )
            .logout((logout) -> logout.permitAll());
            
        return http.build();
    }   
    



}
