package com.uniyaz.core.service;

import com.uniyaz.core.dao.KategoriDao;
import com.uniyaz.core.domain.Kategori;
import com.uniyaz.uı.components.SidebarLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;


public class KategoriService
{
    KategoriDao kategoriDao = new KategoriDao();
    private SidebarLayout sidebarLayout;

    public void addKategori(Kategori kategori)
    {
        kategoriDao.addKategori(kategori);
    }

    public void deleteKategori(Kategori kategori)
    {
        kategoriDao.deleteKategori(kategori);
    }
}
