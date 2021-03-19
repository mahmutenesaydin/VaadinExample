package com.uniyaz.uı.tools;

import com.uniyaz.VeUI;
import com.uniyaz.core.domain.Icerik;
import com.uniyaz.uı.components.ContentLayout;
import com.uniyaz.uı.components.SidebarLayout;
import com.uniyaz.uı.page.icerik.IcerikAddPage;
import com.uniyaz.uı.page.icerik.IcerikListPage;
import com.uniyaz.uı.page.kategori.KategoriListPage;
import com.uniyaz.uı.page.kategori.KategoriPage;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.UI;

public class VeMenuBar extends MenuBar {
    private ContentLayout contentLayout;
    private SidebarLayout sidebarLayout;

    public VeMenuBar() {
        setSizeFull();
//
//        VeUI veUI = (VeUI) UI.getCurrent();
//        contentLayout = veUI.getContentLayout();

        buildKategoriMenuItem();
        buildIcerikMenuItem();
    }

    private void buildKategoriMenuItem() {
        MenuItem kategoriMenuItem = addItem("Kategori", null);
        kategoriMenuItem.addItem("Kategori Ekle", FontAwesome.PLUS, new Command() {
            @Override
            public void menuSelected(MenuItem menuItem) {
                final VeUI veUI = (VeUI) UI.getCurrent();
                contentLayout = veUI.getContentLayout();
                contentLayout.removeAllComponents();

                KategoriPage kategoriPage = new KategoriPage();
                contentLayout.setContentLayout(kategoriPage);
            }
        });

        kategoriMenuItem.addItem("Kategori Listele", FontAwesome.LIST, new Command() {
            @Override
            public void menuSelected(MenuItem menuItem) {
                final VeUI veUI = (VeUI) UI.getCurrent();
                contentLayout = veUI.getContentLayout();
                contentLayout.removeAllComponents();

                KategoriListPage kategoriListPage = new KategoriListPage();
                contentLayout.setContentLayout(kategoriListPage);
            }
        });
    }

    private void buildIcerikMenuItem() {
        MenuItem icerikMenuItem = addItem("İçerik", FontAwesome.NAVICON, null);
        icerikMenuItem.addItem("İçerik Ekle", FontAwesome.PLUS, new Command() {
            @Override
            public void menuSelected(MenuItem menuItem) {
                final VeUI veUI = (VeUI) UI.getCurrent();
                contentLayout = veUI.getContentLayout();
                contentLayout.removeAllComponents();

                IcerikAddPage icerikAddPage = new IcerikAddPage(new Icerik());
                contentLayout.setContentLayout(icerikAddPage);
            }
        });

        icerikMenuItem.addItem("İçerik Listele", FontAwesome.LIST, new Command() {
            @Override
            public void menuSelected(MenuItem menuItem) {
                final VeUI veUI = (VeUI) UI.getCurrent();
                ContentLayout contentLayout = veUI.getContentLayout();
                contentLayout.removeAllComponents();

                IcerikListPage icerikList = new IcerikListPage();
                contentLayout.setContentLayout(icerikList);
            }
        });
    }
}

