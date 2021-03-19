package com.uniyaz.uı.tools;

import com.uniyaz.core.dao.KategoriDao;
import com.uniyaz.core.domain.Kategori;
import com.vaadin.ui.ComboBox;

import java.util.List;

public class KategoriComboBox extends ComboBox
{
    private KategoriDao kategoriDao;

    public KategoriComboBox()
    {
        this.kategoriDao = new KategoriDao();
        this.setDescription("Kategori Seçiniz");
        fillComboBox();
    }

    private void fillComboBox()
    {
        this.removeAllItems();
        List<Kategori> kategoriList = kategoriDao.listKategori();
        for (Kategori kategori : kategoriList)
        {
            this.addItem(kategori);
            setItemCaption(kategori,kategori.getAd());
        }
    }
}
