package com.rcelik.creational.abstractfactory;

import com.rcelik.creational.abstractfactory.osgui.Button;
import com.rcelik.creational.abstractfactory.osgui.CheckBox;
import com.rcelik.creational.abstractfactory.osgui.GuiFactory;
import com.rcelik.creational.abstractfactory.osgui.mac.MacGuiFactory;
import com.rcelik.creational.abstractfactory.osgui.windows.WindowsGuiFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Abstract Factory Design Pattern
 * <p>
 * Solves the problem of creating entire product families by not to specify their concrete classes.
 * <p>
 * It is used when there are more than one product families, means more than one factory classes for each family.
 * Each factory classes are responsible for creating products of its family.
 * <p>
 * Provides an interface to create all distinct class objects but real object is created on their factory classes.
 * <p>
 * Client calls instance creator method to create products instead of using new keyword.
 */

public class AbstractFactoryTest {


    /**
     * First example is checkbox and button creator for both windows and mac operator system.
     * In this example there are  Windows product family and Mac Product Family.
     * Each family has Button and CheckBox, which are products.
     * <p>
     * First of all an interface is required. Its responsibility is defining methods that creates each products.
     * For example createButton and createCheckBox. We call it GuiFactory.
     * <p>
     * Then there should be two concrete class which implements that interface. These classes are WindowsGuiFactory and MacGuiFactory,
     * each of them creates their button and checkBox.
     * <ul>
     *     <li>MacGuiFactory implements GuiFactory interface</li>
     *     <li>WindowsFactory implements GuiFactory interface</li>
     * </ul>
     *
     * Make product classes (Button and CheckBox) are public and interface or abstract class (not concrete) since it is better to provide an interface api.
     * Make product families factory class public these classes are responsible for instantiating products of their kinds. (WindowsGuiFactory and MacGuiFactory)
     */
    @Test
    public final void createButton_forWindows_buttonIsCreatedForWindows() {
        GuiFactory windows = new WindowsGuiFactory();
        Button windowsButton = windows.createButton();

        Assert.assertNotNull(windowsButton);

        String result = windowsButton.click();

        Assert.assertTrue(result.contains("Windows"));
        Assert.assertTrue(result.contains("clicked"));

    }

    @Test
    public final void createButton_foMac_buttonIsCreatedForMac() {
        GuiFactory mac = new MacGuiFactory();
        Button macButton = mac.createButton();

        Assert.assertNotNull(macButton);

        String result = macButton.click();

        Assert.assertTrue(result.contains("Mac"));
        Assert.assertTrue(result.contains("clicked"));
    }

    @Test
    public final void createCheckBox_forWindows_checkBoxIsCreatedForWindows() {
        GuiFactory windows = new WindowsGuiFactory();
        CheckBox windowsCheckBox = windows.createCheckBox();

        Assert.assertNotNull(windowsCheckBox);

        String result = windowsCheckBox.point();

        Assert.assertTrue(result.contains("Windows"));
        Assert.assertTrue(result.contains("pointed"));

    }

    @Test
    public final void createCheckBox_foMac_checkBoxIsCreatedForMac() {
        GuiFactory mac = new MacGuiFactory();
        CheckBox macCheckBox = mac.createCheckBox();

        Assert.assertNotNull(macCheckBox);

        String result = macCheckBox.point();

        Assert.assertTrue(result.contains("Mac"));
        Assert.assertTrue(result.contains("pointed"));
    }


}
