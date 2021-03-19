package com.uniyaz.uı.tools;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

public class VeSaveButton extends Button
{
    public VeSaveButton()
    {
        setIcon(FontAwesome.SAVE);
        addStyleName(ValoTheme.BUTTON_PRIMARY);
    }
}
