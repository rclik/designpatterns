package com.rcelik.creational.abstractfactory.osgui.mac;

import com.rcelik.creational.abstractfactory.osgui.Button;
import com.rcelik.creational.abstractfactory.osgui.CheckBox;
import com.rcelik.creational.abstractfactory.osgui.GuiFactory;

public class MacGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
