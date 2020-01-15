package com.example.transfer.entity;

import javax.persistence.*;

@Table(name = "t_user")
public class User {
    @Column(name = "Id")
    private Long id;

    private String name;

    private String text;

    @Column(name = "superId")
    private Long superid;

    /**
     * @return Id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    /**
     * @return superId
     */
    public Long getSuperid() {
        return superid;
    }

    /**
     * @param superid
     */
    public void setSuperid(Long superid) {
        this.superid = superid;
    }
}