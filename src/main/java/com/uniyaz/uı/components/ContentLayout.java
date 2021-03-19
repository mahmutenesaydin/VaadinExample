package com.uniyaz.uı.components;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class ContentLayout extends VerticalLayout {
    private ContentLayout contentLayout;

    public ContentLayout() {
        // setSizeFull();
        buildContentLayout();
    }

    private void buildContentLayout() {
        Label label = new Label("Contentttt");
        addComponent(label);
    }

    public ContentLayout getContentLayout() {
        return contentLayout;
    }

    public void setContentLayout(ContentLayout contentLayout) {
        this.contentLayout = contentLayout;
    }

    public void setContentLayout(Component component) {
        removeAllComponents();
        addComponent(component);
    }

    public void addComponent(Component component) {
        super.addComponent(component);
        setComponentAlignment(component, Alignment.MIDDLE_CENTER);
    }
}

