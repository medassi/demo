package com.medassi.democours.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository 
    extends JpaRepository<Service, Long> {
    
}
