package edu.sjsu.cmpe273.CRDTClient;

/**
 * Cache Service Interface
 * 
 */
public interface CacheServiceInterface {
    public String get(long key);

    public void put(long key, String value);
}
