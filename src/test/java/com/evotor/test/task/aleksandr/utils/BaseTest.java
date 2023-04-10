package com.evotor.test.task.aleksandr.utils;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.evotor.test.task.aleksandr.config.WebDriverProvider;
import com.evotor.test.task.aleksandr.pageobject.CartPage;
import com.evotor.test.task.aleksandr.pageobject.ProductPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

import static com.evotor.test.task.aleksandr.config.ConfigSingle.config;
import static com.evotor.test.task.aleksandr.config.EndPoints.MARKING_PRODUCT_PAGE;

@DisplayName("Конфигурация тестов")
public class BaseTest extends WebDriverProvider {

    protected ProductPage productPage = new ProductPage();
    protected CartPage cartPage = new CartPage();

    @DisplayName("Конфигурация перед классом тестов")
    @BeforeAll
    public static void beforeClass() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        createDriver();
        Selenide.open(config.getBaseUriProperties() + MARKING_PRODUCT_PAGE);
    }

    @DisplayName("Конфигурация после теста")
    @AfterEach
    public void afterTest(){
        cartPage.deleteProductFromCart();
        Selenide.open(config.getBaseUriProperties() + MARKING_PRODUCT_PAGE);
    }
}
