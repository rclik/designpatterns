package com.rcelik.creational.factorymethod.computer;

public final class Server extends Computer {
    protected Server(String ram, String cpu, String hdd) {
        super(ComputerType.SERVER, ram, cpu, hdd);
    }

    @Override
    public String getHdd() {
        return hdd;
    }

    @Override
    public String getRam() {
        return ram;
    }

    @Override
    public String getCpu() {
        return cpu;
    }
}
