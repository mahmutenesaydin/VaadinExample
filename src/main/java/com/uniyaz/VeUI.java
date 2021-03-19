package com.uniyaz;

import com.uniyaz.uı.components.ContentLayout;
import com.uniyaz.uı.components.MainLayout;
import com.uniyaz.uı.components.SidebarLayout;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

@Theme("mytheme")
@Widgetset("com.uniyaz.MyAppWidgetset")
public class VeUI extends UI
{
    private SidebarLayout sidebarLayout;
    private ContentLayout contentLayout;

    @Override
    protected void init(VaadinRequest vaadinRequest)
    {
        MainLayout mainLayout = new MainLayout();
        setContent(mainLayout);
    }

    public SidebarLayout getSidebarLayout() {
        return sidebarLayout;
    }

    public void setSidebarLayout(SidebarLayout sidebarLayout) {
        this.sidebarLayout = sidebarLayout;
    }

    public ContentLayout getContentLayout() {
        return contentLayout;
    }

    public void setContentLayout(ContentLayout contentLayout) {
        this.contentLayout = contentLayout;
    }
}
