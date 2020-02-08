package com.rcelik.creational.factorymethod;

import com.rcelik.creational.factorymethod.computer.Computer;
import com.rcelik.creational.factorymethod.computer.ComputerFactory;
import com.rcelik.creational.factorymethod.computer.ComputerType;
import org.junit.Assert;
import org.junit.Test;

/**
 * Factory Method Design Pattern
 * <p>
 * It is used to provide a class that is responsible for creating objects for client.
 * Client does not need to know or do  anything about object creation, it only call method with parameters
 * and the factory class returns the related object.
 * <p>
 * After client calls the factory method, then it returns an object with super type but concrete class object.
 * So object creation is done in factory class.
 * <p>
 * By doing so, if you want to create a single object, you can return it on every call of the method which is
 * fine for object re-use. (Effective Java - object creation)
 * <p>
 * Best Practice
 * Make concrete class not visible to outer world since abstraction. Make only public to abstract class or interface for object
 * so that interface-based api is developed.
 * <p>
 * <p>
 * It is called virtual constructor.
 * <p>
 * Advantages:
 * - Provides an abstract class instance rather than concrete one. So provides Dependency Inversion principle for OOP.
 * - Provides an class to create class instances so that hiding object creation
 * <p>
 * - And also it disallows initialization of the classes from client code Thus our code can be less coupled from outer world.
 * - Easier to extend
 * - More robust
 * - Less coupled
 */
public final class ComputerFactoryTest {


    @Test
    public final void getComputer_createPc_objectTypeIsPc() {
        Computer pc = ComputerFactory.getInstance().getComputer(ComputerType.PC, "256GB", "8GB", "2.4GHz");

        Assert.assertNotNull(pc);
        Assert.assertEquals(pc.getType(), ComputerType.PC);
    }

    @Test
    public final void getComputer_createServer_objectsTypeIsServer() {
        Computer server = ComputerFactory.getInstance().getComputer(ComputerType.SERVER, "2TB", "32GB", "4.0GHz");

        Assert.assertNotNull(server);
        Assert.assertEquals(server.getType(), ComputerType.SERVER);
    }
}
