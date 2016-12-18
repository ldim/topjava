package ru.javawebinar.topjava.model;

/**
 * Created by dimas on 03.12.16.
 */
public class BaseEntity {
    protected Integer id;

    public BaseEntity() {
    }

    protected BaseEntity(Integer id) {
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public boolean isNew() {
        return (this.id == null);
    }
}
