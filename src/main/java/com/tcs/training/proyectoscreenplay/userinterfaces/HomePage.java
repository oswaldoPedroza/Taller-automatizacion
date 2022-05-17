package com.tcs.training.proyectoscreenplay.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
public class HomePage {
    public static final Target MENU = Target.the("menu").locatedBy("//div[@class='icon icon-hamburger']");
    public static final Target HOGAR = Target.the("hogar").locatedBy("//span[contains(text(),'Hogar')]");
    public static final Target COLCHONES_BASE_CAMAS_ALMOHADAS = Target.the("colchones_base_camas_almohadas").locatedBy("//a[contains(text(),'Colchones, Base Camas y Almohadas')]");
    public static final Target CARRITO = Target.the("carrito").locatedBy("//a[@class='profile-cart']");
}
