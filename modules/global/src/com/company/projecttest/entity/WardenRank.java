package com.company.projecttest.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum WardenRank implements EnumClass<String> {

    Inspector("inspector"),
    Constable("constable"),
    Corporal("corporal"),
    Superintendent("superintendent");

    private String id;

    WardenRank(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static WardenRank fromId(String id) {
        for (WardenRank at : WardenRank.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}