package com.company.projecttest.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Nextofkinrelationship implements EnumClass<String> {

    Father("father"),
    Mother("mother"),
    Son("son"),
    Daughter("daughter"),
    Uncle("uncle"),
    Auntie("auntie"),
    Grandmother("grandmother"),
    Grandfather("grandfather"),
    Nephew("nephew"),
    Neice("neice");

    private String id;

    Nextofkinrelationship(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Nextofkinrelationship fromId(String id) {
        for (Nextofkinrelationship at : Nextofkinrelationship.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}