package com.medassi.democours.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface UtilisateurRepository 
    extends JpaRepository<Utilisateur, String> {
            
   List<Utilisateur> findByPseudo(String pseudo);
    
}
