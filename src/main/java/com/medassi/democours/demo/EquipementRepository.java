package com.medassi.democours.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipementRepository 
    extends JpaRepository<Equipement, Long> {
    
}
