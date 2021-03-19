package com.uniyaz.core.domain;

public class Kategori extends BaseEntity
{
    private Integer id;
    private String ad;

    public Kategori() {
    }

    public Kategori(String ad) {
        this.ad = ad;
    }

    public Kategori(int id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public String toString() {
        return ad;
    }
}
