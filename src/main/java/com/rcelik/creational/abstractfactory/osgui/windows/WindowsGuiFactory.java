package com.rcelik.creational.abstractfactory.osgui.windows;

import com.rcelik.creational.abstractfactory.osgui.Button;
import com.rcelik.creational.abstractfactory.osgui.CheckBox;
import com.rcelik.creational.abstractfactory.osgui.GuiFactory;

public class WindowsGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
