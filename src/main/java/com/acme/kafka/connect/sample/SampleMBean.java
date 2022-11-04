/*
 * SampleMBean.java - MBean interface describing the management operations and
 * attributes for the MBean. In this case there are two operations,
 * "sayHello" and "add", and two attributes, "Name" and "CacheSize".
 */

package com.acme.kafka.connect.sample;

public interface SampleMBean {
    void sayHello();
    int add(int x, int y);
    String getName();
    // a read-write attribute called CacheSize of type int
    int getCacheSize();
    void setCacheSize(int size);
}
