package com.Improvement.freshtry.Organisations.dao;

import com.Improvement.freshtry.Organisations.Entity.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganisationRepository extends JpaRepository<Organisation,String> {

}
