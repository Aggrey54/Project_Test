package com.company.projecttest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "PROJECTTEST_WARDEN")
@Entity(name = "projecttest$Warden")
public class Warden extends StandardEntity {
    private static final long serialVersionUID = 8649493697945095157L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "RANK_", nullable = false)
    protected String rank;

    @NotNull
    @Column(name = "SERVICE_NUMBER", nullable = false)
    protected String serviceNumber;

    public void setRank(WardenRank rank) {
        this.rank = rank == null ? null : rank.getId();
    }

    public WardenRank getRank() {
        return rank == null ? null : WardenRank.fromId(rank);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setServiceNumber(String serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public String getServiceNumber() {
        return serviceNumber;
    }


}