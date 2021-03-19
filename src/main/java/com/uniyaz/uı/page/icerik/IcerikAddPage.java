package com.uniyaz.uı.page.icerik;

import com.uniyaz.VeUI;
import com.uniyaz.core.domain.Icerik;
import com.uniyaz.core.service.IcerikService;
import com.uniyaz.uı.components.ContentLayout;
import com.uniyaz.uı.components.SidebarLayout;
import com.uniyaz.uı.tools.KategoriComboBox;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.fieldgroup.PropertyId;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.*;
import jdk.nashorn.internal.objects.annotations.Property;

public class IcerikAddPage extends FormLayout
{
    @PropertyId("id")
    TextField idField;

    @PropertyId("baslik")
    TextField baslikField;

    @PropertyId("detay")
    TextField detayField;

    @PropertyId("yazar")
    TextField yazarField;

    @PropertyId("id_kategori")
    KategoriComboBox kategoriField;

    Button btnAdd;
    SidebarLayout sidebarLayout;
    ContentLayout contentLayout;

    BeanItem<Icerik> icerikBeanItem;
    FieldGroup binder;

    public IcerikAddPage(Icerik icerik)
    {
        VeUI veUI = (VeUI) UI.getCurrent();
        this.contentLayout = veUI.getContentLayout();

        buildIcerikAddPage();

        icerikBeanItem = new BeanItem<Icerik>(icerik);
        binder = new FieldGroup(icerikBeanItem);
        binder.buildAndBindMemberFields(this);
    }

    private void buildIcerikAddPage()
    {
        idField = new TextField();
        idField.setCaption("ID");
        idField.setNullRepresentation("");
        addComponent(idField);

        baslikField = new TextField();
        baslikField.setCaption("Başlık");
        baslikField.setNullRepresentation("");
        addComponent(baslikField);

        detayField = new TextField();
        detayField.setCaption("Detay");
        detayField.setNullRepresentation("");
        addComponent(detayField);

        yazarField = new TextField();
        yazarField.setCaption("Yazar");
        yazarField.setNullRepresentation("");
        addComponent(yazarField);

        kategoriField = new KategoriComboBox();
        kategoriField.setCaption("Kategori");
        addComponent(kategoriField);

        btnAdd = new Button("Kaydet");
        btnAdd.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                try {
                    binder.commit();
                    Icerik icerik = icerikBeanItem.getBean();


                    IcerikService icerikService = new IcerikService();
                    icerikService.addIcerik(icerik);
                } catch (FieldGroup.CommitException e) {
                    e.printStackTrace();
                }
            }
        });
        addComponent(btnAdd);
    }
}
