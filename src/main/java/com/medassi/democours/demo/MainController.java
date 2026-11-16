package com.medassi.democours.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MainController {
    private EquipementRepository equipementRepository;
    private ServiceRepository serviceRepository;

    public MainController(EquipementRepository equipementRepository,ServiceRepository serviceRepository) {
        this.equipementRepository = equipementRepository;
        this.serviceRepository = serviceRepository; 
    }

    @GetMapping("/services")
    public String getServices(Model model) {
        List<Service> services = serviceRepository.findAll();
        model.addAttribute("services", services);
        return "services" ;
    }
    
    @GetMapping("/equipements")
    public String getEquipements(Model model) {
        List<Equipement> equipements = equipementRepository.findAll();
        model.addAttribute("equipements", equipements);
        return "equipements" ;
    }
    

  
    
    
    
}