package com.rcelik.creational.abstractfactory.osgui.windows;

import com.rcelik.creational.abstractfactory.osgui.CheckBox;

class WindowsCheckBox implements CheckBox {
    @Override
    public String point() {
         return "Windows checkbox is pointed!!!";
    }
}
