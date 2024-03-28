//package com.example.demo_cache.config;
//
//import org.ehcache.event.CacheEvent;
//import org.ehcache.event.CacheEventListener;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//public class CacheEventLogger implements CacheEventListener<Object, Object> {
//    private final Logger log = LoggerFactory.getLogger(CacheEventLogger.class);
//
//
//    @Override
//    public void onEvent(CacheEvent<?, ?> cacheEvent) {
//        log.info("message from CacheEventLogger: {} {} {}", cacheEvent.getKey(), cacheEvent.getOldValue(), cacheEvent.getNewValue());
//    }
//}