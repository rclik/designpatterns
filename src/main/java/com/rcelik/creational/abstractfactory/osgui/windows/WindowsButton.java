package com.rcelik.creational.abstractfactory.osgui.windows;

import com.rcelik.creational.abstractfactory.osgui.Button;

class WindowsButton implements Button {
    @Override
    public String click() {
        return "Windows button is clicked!!!";
    }
}
