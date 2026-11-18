package com.medassi.democours.demo;

import java.util.List;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UtilisateurService implements UserDetailsService {
    
    private UtilisateurRepository utilisateurRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String pseudo) throws UsernameNotFoundException {
        List<Utilisateur> utilisateurs = utilisateurRepository.findByPseudo(pseudo);
        if (!utilisateurs.isEmpty()) {
            return utilisateurs.get(0);
        } else {
            throw new UsernameNotFoundException("Pseudo inconnu");
        }

    }

}
