package com.company.projecttest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|propertyname")
@Table(name = "PROJECTTEST_PRISONERPROPERTY")
@Entity(name = "projecttest$Prisonerproperty")
public class Prisonerproperty extends StandardEntity {
    private static final long serialVersionUID = -8199967854032697017L;

    @NotNull
    @Column(name = "PROPERTYNAME", nullable = false)
    protected String propertyname;

    @Column(name = "SERIALNUMBER", unique = true)
    protected String serialnumber;

    public void setPropertyname(String propertyname) {
        this.propertyname = propertyname;
    }

    public String getPropertyname() {
        return propertyname;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getSerialnumber() {
        return serialnumber;
    }


}