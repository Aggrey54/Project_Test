package com.company.projecttest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|cellNumber")
@Table(name = "PROJECTTEST_CELLS")
@Entity(name = "projecttest$Cells")
public class Cells extends StandardEntity {
    private static final long serialVersionUID = 4073021870283944450L;

    @NotNull
    @Column(name = "CELL_NUMBER", nullable = false)
    protected String cellNumber;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "cell")
    protected List<Prisoner> prisoners;

    @NotNull
    @Column(name = "CELL_BLOCK", nullable = false)
    protected String cellBlock;

    @NotNull
    @Column(name = "CELL_CAPACITY", nullable = false)
    protected Integer cellCapacity;


    public void setPrisoners(List<Prisoner> prisoners) {
        this.prisoners = prisoners;
    }

    public List<Prisoner> getPrisoners() {
        return prisoners;
    }


    public void setCellBlock(String cellBlock) {
        this.cellBlock = cellBlock;
    }

    public String getCellBlock() {
        return cellBlock;
    }


    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellCapacity(Integer cellCapacity) {
        this.cellCapacity = cellCapacity;
    }

    public Integer getCellCapacity() {
        return cellCapacity;
    }


}