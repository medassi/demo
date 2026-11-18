package com.medassi.democours.demo;

import java.util.ArrayList;
import java.util.Collection;

import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table
public class Utilisateur implements UserDetails {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID)
    private String id;
    private String nom;
    @Column(unique = true)
    private String pseudo;
    private String commentaire;
    private String motDePasseHash;
    private String role;

    public String getCommentaire() {
        return commentaire;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPseudo() {
        return pseudo;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        GrantedAuthority gta = new SimpleGrantedAuthority(role);
        ArrayList<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        grantedAuthorities.add(gta);
        return grantedAuthorities;
    }

    @Override
    public @Nullable String getPassword() {
        return motDePasseHash;
    }

    @Override
    public String getUsername() {
       return pseudo ;

    }
    
}
