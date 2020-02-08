package com.rcelik.creational.singleton;

import org.junit.Assert;
import org.junit.Test;

public final class LazyLoadingSingletonTest {

    @Test
    public final void getInstance_secondTimesCalled_objectsAreSame(){
        // lazy loading singleton is good but not thread safe,
        // to make it thread-safe, use best version, instantiating singleton with helper class
        LazyLoadingSingleton instance1 = LazyLoadingSingleton.getInstance();
        LazyLoadingSingleton instance2 = LazyLoadingSingleton.getInstance();

        Assert.assertEquals(instance1, instance2);
    }
}
