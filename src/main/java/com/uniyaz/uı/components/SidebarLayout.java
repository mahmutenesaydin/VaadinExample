package com.uniyaz.uı.components;

import com.uniyaz.core.dao.KategoriDao;
import com.uniyaz.core.domain.Kategori;
import com.uniyaz.core.service.KategoriService;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class SidebarLayout extends VerticalLayout
{
    private ContentLayout contentLayout;
    public SidebarLayout()
    {

    }

    public SidebarLayout(ContentLayout contentLayout)
    {
        this.contentLayout = contentLayout;

        buildSidebarLayout();
        contentLayout.setWidth(100,Unit.PERCENTAGE);
    }

    private void buildSidebarLayout()
    {
//        Label label = new Label("Sidebarrrr");
//        addComponent(label);
        kategoriListBTN();
//        KategoriService kategoriService = new KategoriService();
//        kategoriService.kategoriListBTN();
    }

    public void kategoriListBTN()
    {
        KategoriDao kategoriDao = new KategoriDao();
        for (Kategori kategori : kategoriDao.listKategori())
        {
            Button button = new Button();
            button.setCaption(String.valueOf(kategori.getId()));
            button.setCaption(kategori.getAd());
            addComponent(button);

            button.addClickListener(new Button.ClickListener() {
                @Override
                public void buttonClick(Button.ClickEvent clickEvent) {

                }
            });
            addComponent(button);
        }
    }
}
