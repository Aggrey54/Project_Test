package com.company.projecttest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "PROJECTTEST_NEXTOF_KIN")
@Entity(name = "projecttest$NextofKin")
public class NextofKin extends StandardEntity {
    private static final long serialVersionUID = -1151088720226647948L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "ID_NUMBER", nullable = false)
    protected Integer idNumber;

    @NotNull
    @Column(name = "RELATIONSHIP", nullable = false)
    protected String relationship;

    @Column(name = "PHONE_NUMBER")
    protected Integer phoneNumber;

    @NotNull
    @Lob
    @Column(name = "PHYSICAL_ADDRESS", nullable = false)
    protected String physicalAddress;

    public void setRelationship(Nextofkinrelationship relationship) {
        this.relationship = relationship == null ? null : relationship.getId();
    }

    public Nextofkinrelationship getRelationship() {
        return relationship == null ? null : Nextofkinrelationship.fromId(relationship);
    }


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

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }


}