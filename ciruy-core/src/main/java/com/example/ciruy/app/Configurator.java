package com.example.ciruy.app;

import java.util.HashMap;

/**
 * Created by xushiyun on 2018/2/10.
 * Project Name: CampusHelper
 * Package Name: com.example.ciruy.app
 * File Name:    Configurator
 * Description: Todo
 */

public class Configurator {
    private static final HashMap<String, Object> CIRUY_CONFIGS = new HashMap<>();

    private Configurator() {
        CIRUY_CONFIGS.put(ConfigType.CONFIG_READY.name(), false);
    }

    public static Configurator getInstance() {
        return Holder.INSTANCE;
    }

    final HashMap<String, Object> getCiruyConfigs() {
        return CIRUY_CONFIGS;
    }

    private static class Holder{
        private static final Configurator INSTANCE = new Configurator();
    }

    public final void configure() {
        CIRUY_CONFIGS.put(ConfigType.CONFIG_READY.name(), true);
    }

    public final Configurator withApiHost(String host) {
        CIRUY_CONFIGS.put(ConfigType.API_HOST.name(), host);
        return this;
    }

    private void checkConfiguration() {
        final boolean isReady = (boolean) CIRUY_CONFIGS.get(ConfigType.CONFIG_READY.name());
        if(!isReady) {
            throw new RuntimeException("Configuration is not ready, call configure");
        }
    }

    @SuppressWarnings("unchecked")
    final <T> T getConfiguration(Enum<ConfigType> key) {
        checkConfiguration();
        return (T) CIRUY_CONFIGS.get(key.name());
    }
}
