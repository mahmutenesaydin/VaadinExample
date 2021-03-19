package com.uniyaz.uı.components;

import com.uniyaz.uı.tools.VeMenuBar;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

public class HeaderLayout extends HorizontalLayout
{
    public HeaderLayout()
    {
        setSizeFull();
        buildLayout();
    }

    private void buildLayout()
    {
//        Label label = new Label("Hoşgeldinizzz :)))");
//        label.setSizeUndefined();
//        addComponent(label);

//        setComponentAlignment(label, Alignment.MIDDLE_CENTER);

        VeMenuBar menuBar = new VeMenuBar();
        addComponent(menuBar);
    }
}
