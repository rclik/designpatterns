package com.rcelik.creational.factorymethod.computer;

public abstract class Computer {

    protected String ram, cpu, hdd;
    protected ComputerType type;

    protected Computer(ComputerType type, String ram, String cpu, String hdd) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.type = type;
    }

    public abstract String getHdd();

    public abstract String getRam();

    public abstract String getCpu();

    public ComputerType getType() {
        return type;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[RAM: " + getRam() + ", HDD: " + getHdd() + ", CPU: " + getCpu() + "]";
    }
}
