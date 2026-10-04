package com.example;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisConnectionException;

public class RedisDemo {
    public static void main(String[] args) {
        // Connection details
        String host = "3.110.215.100";
        int port = 10000;
        // String password = "your_password"; // Commented out as no auth is set

        try (Jedis jedis = new Jedis(host, port)) {
            // No authentication call since password is commented out
            System.out.println("Connected to Redis: " + jedis.ping());

            // Insert records (key-value pairs)
            jedis.set("user:1", "Rahul");
            jedis.set("user:2", "Suyog");
            jedis.set("user:3", "Eljo");
            jedis.set("user:4", "Piyush");
            System.out.println("Inserted 3 user records");

            // Fetch records
            System.out.println("Fetching records:");
            System.out.println("user:1 -> " + jedis.get("user:1"));
            System.out.println("user:2 -> " + jedis.get("user:2"));
            System.out.println("user:3 -> " + jedis.get("user:3"));
            System.out.println("user:4 -> " + jedis.get("user:4"));

            // Use a different database (e.g., index 1)
//            jedis.select(1);
            jedis.set("test:key", "TestValue");
            System.out.println("Fetched from DB 0: test:key -> " + jedis.get("test:key"));
        } catch (JedisConnectionException e) {
            System.err.println("Failed to connect to Redis: " + e.getMessage());
        }
    }
}