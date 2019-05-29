package com.company.projecttest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import javax.persistence.Lob;

@NamePattern("%s|propertyname")
@Table(name = "PROJECTTEST_PRISONERPROPERTY")
@Entity(name = "projecttest$Prisonerproperty")
public class Prisonerproperty extends StandardEntity {
    private static final long serialVersionUID = -8199967854032697017L;

    @NotNull
    @Column(name = "PROPERTYNAME", nullable = false)
    protected String propertyname;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    @Column(name = "SERIALNUMBER", unique = true)
    protected String serialnumber;



    @OnDelete(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRISONER_ID")
    protected Prisoner prisoner;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    public void setPrisoner(Prisoner prisoner) {
        this.prisoner = prisoner;
    }

    public Prisoner getPrisoner() {
        return prisoner;
    }


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