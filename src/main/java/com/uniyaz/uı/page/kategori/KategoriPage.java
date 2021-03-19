package com.uniyaz.uı.page.kategori;

import com.uniyaz.VeUI;
import com.uniyaz.core.dao.KategoriDao;
import com.uniyaz.core.domain.Kategori;
import com.uniyaz.core.service.KategoriService;
import com.uniyaz.uı.components.ContentLayout;
import com.uniyaz.uı.components.MainLayout;
import com.uniyaz.uı.components.SidebarLayout;
import com.uniyaz.uı.tools.VeSaveButton;
import com.vaadin.data.Item;
import com.vaadin.ui.*;

import java.sql.Connection;
import java.util.List;


public class KategoriPage extends VerticalLayout {
    private TextField txtId;
    private TextField txtKategori;
    private VeSaveButton btnSave;
    private Kategori kategori;
    private FormLayout mainLayout;
    private ContentLayout contentLayout;
    private VeUI veUI;
    private SidebarLayout sidebarLayout;

    public KategoriPage() {
        VeUI veUI = (VeUI) UI.getCurrent();
        this.contentLayout = veUI.getContentLayout();
        this.sidebarLayout = veUI.getSidebarLayout();

        buildKategoriLayout();
    }

    private void buildKategoriLayout() {
        txtId = new TextField("Id");
        addComponent(txtId);

        txtKategori = new TextField("Kategori Adı");
        addComponent(txtKategori);

        btnSave = new VeSaveButton();
        btnSave.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                kategori = new Kategori();
                kategori.setAd(txtKategori.getValue());

                KategoriService kategoriService = new KategoriService();
                kategoriService.addKategori(kategori);

                Button contentButton = new Button();
                contentButton.setCaption(txtKategori.getValue());
                contentButton.setSizeUndefined();
                veUI.getSidebarLayout().addComponent(contentButton);
            }
        });
        addComponent(btnSave);
    }

//            deleteButton.setData(itemId);
//            deleteButton.addClickListener(new Button.ClickListener() {
//                @Override
//                public void buttonClick(Button.ClickEvent clickEvent) {
//                    Kategori kategori = new Kategori();
//                    KategoriDao kategoriDao = new KategoriDao();
//
//                    Integer id = (Integer) clickEvent.getButton().getData();
//                    kategoriDao.deleteKategori(kategori.getId());
//                    Notification.show(id.intValue() + "Kayıt silindi");
//
//                    kategori = new Kategori(txtKategori.getValue());
//                    KategoriService kategoriService = new KategoriService();
//                    kategoriService.deleteKategori(Integer.parseInt(txtId.getValue()));
//                }
//            });
//        }




//                                    Category category1 = new Category();
//                                    CategoryDao categoryDao1 = new CategoryDao();
//
//                                    Integer id = (Integer) event.getButton().getData();
//                                    categoryDao1.deleteCategory(category1.getId());
//                                    Notification.show(id.intValue() + "KAYIT SİLİNDİ");
//
////                            Category category1 = new Category(txtId.getValue());
////                            CategoryService categoryService = new CategoryService();
////                            categoryService.deleteKategori(Integer.parseInt(txtId.getValue()));
//
//                                }
//                            });
//                            //contentLayout.removeAllComponents();
//                            contentLayout.addComponents(deleteButton);
//                            row1.getItemProperty("").setValue(contentLayout);
//                            addComponent(table);
//                        };
//                    }

    }

