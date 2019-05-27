package com.company.projecttest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "PROJECTTEST_PRISONER")
@Entity(name = "projecttest$Prisoner")
public class Prisoner extends StandardEntity {
    private static final long serialVersionUID = 69729532941154616L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "ID_NUMBER", nullable = false, unique = true)
    protected Integer idNumber;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_OF_BIRTH", nullable = false)
    protected Date dateOfBirth;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }


}