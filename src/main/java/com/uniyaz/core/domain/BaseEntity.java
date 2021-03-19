package com.uniyaz.core.domain;

public abstract class BaseEntity
{
    public abstract Integer getId();

    @Override
    public int hashCode() {
        if (getId() == null) return -1;
        return getId().intValue();
    }

    @Override
    public boolean equals(Object o) {
        BaseEntity baseEntity = (BaseEntity) o;
        if (baseEntity == null || baseEntity.getId() == null) return false;
        return baseEntity.getId().equals(getId());
    }
}
