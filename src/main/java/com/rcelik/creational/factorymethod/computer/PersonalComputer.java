package com.rcelik.creational.factorymethod.computer;

public final class PersonalComputer extends  Computer{

    protected PersonalComputer(String ram, String cpu, String hdd) {
        super(ComputerType.PC, ram, cpu, hdd);
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
