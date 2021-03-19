package com.uniyaz;

import com.uniyaz.VeUI;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/*", name = "VeUIServlet", asyncSupported = true)
@VaadinServletConfiguration(ui = VeUI.class, productionMode = false)
public class VeUIServlet extends VaadinServlet {
}
