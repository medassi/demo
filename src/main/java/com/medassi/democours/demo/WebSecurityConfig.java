package com.medassi.democours.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

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
                .requestMatchers("/equipements").hasAuthority("ADMIN")
                .requestMatchers("/services").hasAnyAuthority("STANDARD", "ADMIN")
                .requestMatchers("/login", "/").permitAll()
                .requestMatchers("/h2-console/**").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(withDefaults())
            .logout(withDefaults())
            .headers(headers -> headers
                .frameOptions(frame -> frame.sameOrigin())
            )
            .csrf(csrf -> csrf
                .ignoringRequestMatchers("/h2-console/**")
            ) ;
        return http.build();
    }   
    



}
