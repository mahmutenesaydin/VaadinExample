package com.uniyaz.core.domain;

public class Icerik extends BaseEntity
{
    private Integer id;
    private String baslik;
    private String detay;
    private String yazar;
    private Integer id_kategori;

    public Icerik()
    {

    }

    public Icerik(Integer id, String baslik, String detay, String yazar, Integer id_kategori) {
        this.id = id;
        this.baslik = baslik;
        this.detay = detay;
        this.yazar = yazar;
        this.id_kategori = id_kategori;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getDetay() {
        return detay;
    }

    public void setDetay(String detay) {
        this.detay = detay;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public Integer getId_kategori() {
        return id_kategori;
    }

    public void setId_kategori(Integer id_kategori) {
        this.id_kategori = id_kategori;
    }

    @Override
    public Integer getId() {
        return id;
    }
}
