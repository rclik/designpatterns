package com.rcelik.creational.factorymethod.computer;

public final class ComputerFactory {

    private ComputerFactory() {
    }

    private static final class SingletonHolder {
        private static final ComputerFactory INSTANCE = new ComputerFactory();
    }

    public static ComputerFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public Computer getComputer(ComputerType type, String hdd, String ram, String cpu) {

        switch (type) {
            case PC:
                return new PersonalComputer(ram, cpu, hdd);
            case SERVER:
                return new Server(ram, cpu, hdd);
            default:
                return null;
        }

    }

}
