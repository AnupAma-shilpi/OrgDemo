package com.Improvement.freshtry.Organisations.controller;


import com.Improvement.freshtry.Organisations.Entity.Organisation;
import com.Improvement.freshtry.Organisations.service.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrganisationController {

    @Autowired
    private OrganisationService organisationService;


    @GetMapping("/organisation/{name}")
    private Organisation getOrganisationByName(@PathVariable String name){
        return organisationService.getOrganisationByName(name);

    }

    @GetMapping("/organisations")
    private List<Organisation> getAllOrganisations(){
        return organisationService.getOrganisations();
    }

}
