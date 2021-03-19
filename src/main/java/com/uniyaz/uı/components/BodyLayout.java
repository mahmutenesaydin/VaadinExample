package com.uniyaz.uı.components;

import com.uniyaz.VeUI;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class BodyLayout extends HorizontalSplitPanel
{
    private ContentLayout contentLayout;
    private SidebarLayout sidebarLayout;

    public BodyLayout()
    {
        setSizeFull();
        setSplitPosition(15F);

        buildBodyLayout();
    }

    private void buildBodyLayout()
    {
        VeUI veUI = (VeUI) UI.getCurrent();

        contentLayout = new ContentLayout();
        setSecondComponent(contentLayout);
        veUI.setContentLayout(contentLayout);

        sidebarLayout = new SidebarLayout(contentLayout);
        setFirstComponent(sidebarLayout);
        veUI.setSidebarLayout(sidebarLayout);

    }
}
