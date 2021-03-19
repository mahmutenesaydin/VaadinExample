package com.uniyaz.uı.components;

import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class FooterLayout extends VerticalLayout
{
    public FooterLayout()
    {
        setSizeFull();
        buildFooterLayout();
    }

    private void buildFooterLayout()
    {
        Label label = new Label();

        label.setContentMode(ContentMode.HTML);
        label.setValue(FontAwesome.COPYRIGHT.getHtml() + "mhmtens13");
        label.setSizeUndefined();
        addComponent(label);
        setComponentAlignment(label, Alignment.MIDDLE_CENTER);
    }


}
