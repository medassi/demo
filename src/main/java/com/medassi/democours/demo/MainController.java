package com.medassi.democours.demo;

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

    @GetMapping("/service")
    public String getServices(Model model) {
        Service service = serviceRepository.findAll().get(0);
        model.addAttribute("service", service);
        return "service" ;
    }
    

  
    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("ordinateur", equipementRepository.findAll().get(0)); 
        return "ordinateur";
    }
    
    
}