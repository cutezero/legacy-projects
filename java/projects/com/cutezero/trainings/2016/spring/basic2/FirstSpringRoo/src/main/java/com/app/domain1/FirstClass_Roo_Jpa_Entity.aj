// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.app.domain1;

import com.app.domain1.FirstClass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect FirstClass_Roo_Jpa_Entity {
    
    declare @type: FirstClass: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long FirstClass.id;
    
    @Version
    @Column(name = "version")
    private Integer FirstClass.version;
    
    public Long FirstClass.getId() {
        return this.id;
    }
    
    public void FirstClass.setId(Long id) {
        this.id = id;
    }
    
    public Integer FirstClass.getVersion() {
        return this.version;
    }
    
    public void FirstClass.setVersion(Integer version) {
        this.version = version;
    }
    
}