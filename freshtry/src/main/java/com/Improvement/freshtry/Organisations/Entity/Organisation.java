package com.Improvement.freshtry.Organisations.Entity;


import javax.persistence.*;


@Entity
@Table(name = "ORGANISATION")
public class Organisation {


     Integer org_id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     String org_name;

    public int getOrg_id() {
        return org_id;
    }

    public void setOrg_id(int org_id) {
        this.org_id = org_id;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }
}
