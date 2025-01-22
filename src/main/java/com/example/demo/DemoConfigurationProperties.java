package com.example.demo;

import org.springframework.boot.autoconfigure.jms.artemis.ArtemisProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("spring")
public class DemoConfigurationProperties {
    @NestedConfigurationProperty
    private ArtemisProperties artemis = new ArtemisProperties();

    public ArtemisProperties getArtemis() {
        return artemis;
    }

    public void setArtemis(ArtemisProperties artemis) {
        this.artemis = artemis;
    }
}
