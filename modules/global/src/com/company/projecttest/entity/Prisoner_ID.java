package com.company.projecttest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|id")
@Table(name = "PROJECTTEST_PRISONER_ID")
@Entity(name = "projecttest$Prisoner_ID")
public class Prisoner_ID extends StandardEntity {
    private static final long serialVersionUID = -3957619193314888341L;

    @NotNull
    @Column(name = "PRISONER_ID", nullable = false)
    protected Integer prisonerID;

    public void setPrisonerID(Integer prisonerID) {
        this.prisonerID = prisonerID;
    }

    public Integer getPrisonerID() {
        return prisonerID;
    }


}