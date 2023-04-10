package com.evotor.test.task.aleksandr.config;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;

import static com.evotor.test.task.aleksandr.config.ConfigSingle.config;

public class WebDriverProvider  {

    public static Configuration createDriver() {
        Configuration configuration = new Configuration();
        switch (config.getBrowser()) {
            case CHROME: {
                WebDriverManager.chromedriver().setup();
                configuration.browser = "chrome";
                configuration.browserSize = "1920x1080";
                break;
            }
            default: {
                throw new RuntimeException("No such driver");
            }
        }
        return configuration;
    }
}
