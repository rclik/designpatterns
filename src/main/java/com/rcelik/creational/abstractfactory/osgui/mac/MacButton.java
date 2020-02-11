package com.rcelik.creational.abstractfactory.osgui.mac;

import com.rcelik.creational.abstractfactory.osgui.Button;

class MacButton implements Button {
    @Override
    public String click() {
        return "Mac button is clicked!!!";
    }
}
