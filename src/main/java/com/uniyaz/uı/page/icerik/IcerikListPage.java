package com.uniyaz.uı.page.icerik;

import com.uniyaz.core.domain.Icerik;
import com.uniyaz.core.service.IcerikService;
import com.vaadin.data.Item;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.shared.ui.MultiSelectMode;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

import java.util.List;

public class IcerikListPage extends VerticalLayout
{
    Table table;
    IndexedContainer indexedContainer;

    public IcerikListPage()
    {
        buildTableIndexContainer();
        buildTable();
        fillTable();

        addComponent(table);
    }

    private void buildTableIndexContainer()
    {
        indexedContainer = new IndexedContainer();

        indexedContainer.addContainerProperty("id", Integer.class, null );
        indexedContainer.addContainerProperty("baslik", String.class, null);
        indexedContainer.addContainerProperty("detay", String.class, null);
        indexedContainer.addContainerProperty("yazar", String.class, null);
        indexedContainer.addContainerProperty("id_kategori", Integer.class,null);
    }

    private void buildTable()
    {
        table = new Table();
        table.setContainerDataSource(indexedContainer);

        table.setWidth("100%");
        table.setSelectable(true);
        table.setMultiSelectMode(MultiSelectMode.SIMPLE);
        table.setMultiSelect(false);

        table.setColumnHeaders("ID", "Başlık", "Detay", "Yazar", "Kategori");
    }

    private void fillTable()
    {
        indexedContainer.removeAllItems();
        IcerikService icerikService = new IcerikService();
        List<Icerik> icerikList = icerikService.icerikList();

        for (Icerik icerik : icerikList) {
            Item item = indexedContainer.addItem(icerik);
            fillColumns(icerik,item);
        }
    }

    private void fillColumns(Icerik icerik, Item item)
    {
        item.getItemProperty("id").setValue(icerik.getId());
        item.getItemProperty("baslik").setValue(icerik.getBaslik());
        item.getItemProperty("detay").setValue(icerik.getDetay());
        item.getItemProperty("yazar").setValue(icerik.getYazar());
        item.getItemProperty("id_kategori").setValue(icerik.getId_kategori());
    }
}
