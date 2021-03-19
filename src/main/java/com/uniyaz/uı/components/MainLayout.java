package com.uniyaz.uı.components;

import com.vaadin.ui.VerticalLayout;

public class MainLayout extends VerticalLayout
{
    public MainLayout()
    {
        setSizeFull();
        buildMainLayout();
    }

    private void buildMainLayout()
    {
        HeaderLayout headerLayout = new HeaderLayout();
        addComponent(headerLayout);

        BodyLayout bodyLayout = new BodyLayout();
        addComponent(bodyLayout);

        FooterLayout footerLayout = new FooterLayout();
        addComponent(footerLayout);

        setExpandRatio(headerLayout, 1F);
        setExpandRatio(bodyLayout, 8.5f);
        setExpandRatio(footerLayout,0.5F);
    }
}
