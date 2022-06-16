package com.Improvement.freshtry.Organisations.service;


import com.Improvement.freshtry.Organisations.Entity.Organisation;
import com.Improvement.freshtry.Organisations.dao.OrganisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class OrganisationService {


    @Autowired
     OrganisationRepository organisationRepository;



    public Organisation getOrganisationByName(String name){
        return organisationRepository.findById(name).orElse(null);
    }

    public List<Organisation> getOrganisations(){

            List<Organisation> list = new ArrayList<>();
            organisationRepository.findAll().forEach(organisatn -> list.add(organisatn));
            return list;
    }



}
