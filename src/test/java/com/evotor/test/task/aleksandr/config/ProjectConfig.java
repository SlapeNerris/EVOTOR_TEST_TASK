package com.evotor.test.task.aleksandr.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:default.properties"})
public interface ProjectConfig extends Config {

    @Key("base.uri")
    @DefaultValue("https://market.evotor.ru")
    String getBaseUriProperties();

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();
}
