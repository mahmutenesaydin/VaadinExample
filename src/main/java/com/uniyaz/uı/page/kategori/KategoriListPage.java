package com.uniyaz.uı.page.kategori;

import com.uniyaz.VeUI;
import com.uniyaz.core.dao.KategoriDao;
import com.uniyaz.core.domain.Kategori;
import com.uniyaz.uı.components.ContentLayout;
import com.vaadin.data.Item;
import com.vaadin.ui.Button;
import com.vaadin.ui.Table;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import java.util.List;

public class KategoriListPage extends VerticalLayout
{
    private ContentLayout contentLayout;

    public KategoriListPage()
    {
//        VeUI veUI = (VeUI) UI.getCurrent();
//        this.contentLayout = veUI.getContentLayout();
        setSizeFull();
        buildKategoriList();
    }

    public void buildKategoriList() {
        Table table = new Table("Kategori Listesi");
        table.addContainerProperty("id", Integer.class, null);
        table.addContainerProperty("ad", String.class, null);
        table.addContainerProperty("SIL", Button.class, null);
        table.addContainerProperty("GUNCELLE", Button.class, null);
        table.addContainerProperty("", ContentLayout.class, null);

        KategoriDao kategoriDao = new KategoriDao();
        List<Kategori> kategoriList = kategoriDao.listKategori();

        for (Kategori kategori : kategoriList) {
            Integer itemId = new Integer(kategori.getId());
            Object newItemId = table.addItem();

            Item row = table.getItem(newItemId);
            row.getItemProperty("id").setValue(kategori.getId());
            row.getItemProperty("ad").setValue(kategori.getAd());

            Button deleteButton = new Button("Sil");
//            addComponent(deleteButton);
        }
        addComponent(table);
    }
}
