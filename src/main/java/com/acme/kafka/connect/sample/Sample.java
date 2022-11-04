/*
 * Sample.java - MBean implementation for the Sample MBean. This class must
 * implement all the Java methods declared in the SampleMBean interface,
 * with the appropriate behavior for each one.
 */

package com.acme.kafka.connect.sample;

import javax.management.*;

public class Sample implements SampleMBean {
    public void sayHello() {
        System.out.println("hello, world");
        }
        public int add(int x, int y) {
        return x + y;
        }
        public String getName() {
        return this.name;
        }
        public int getCacheSize() {
        return this.cacheSize;
        }
        /* Setter for the CacheSize attribute. To avoid problems with
           stale values in multithreaded situations, it is a good idea
           for setters to be synchronized. */
        public synchronized void setCacheSize(int size) {
        int oldSize = this.cacheSize;
        this.cacheSize = size;
        System.out.println("Cache size now " + this.cacheSize);
        }
        private final String name = "Reginald";
        private int cacheSize = DEFAULT_CACHE_SIZE;
        private static final int DEFAULT_CACHE_SIZE = 200;
        private long sequenceNumber = 1;
}
