package com.rcelik.creational.singleton;

import org.junit.Assert;
import org.junit.Test;

public final class SingletonWithHelperTest {

    @Test
    public final void getInstance_twoInstanceRequested_objectsAreSame(){

        SingletonWithHelper instance1 = SingletonWithHelper.getInstance();
        SingletonWithHelper instance2 = SingletonWithHelper.getInstance();

        Assert.assertEquals(instance1, instance2);
    }
}
