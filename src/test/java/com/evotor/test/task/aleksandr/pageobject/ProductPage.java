package com.evotor.test.task.aleksandr.pageobject;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class ProductPage {
    // Elements
    private SelenideElement
            btnOfAddToCart = $x("//button/div[@class='evo-button']"),
            iconOfCart = $x("//evo-icon[@shape='cart']"),
            btnOfCart = $x("//button[contains(@class, 'plan-item-controls__basket-button ng-star-inserted')]");
    // Actions
    @Step("Добавить товар в корзину и перейти в корзину через иконку 'Корзина'")
    public ProductPage addProductAndGoToCartFromIcon() {
        btnOfAddToCart.click();
        iconOfCart.click();

        return this;
    }

    @Step("Добавить товар в корзину и перейти в корзину через кнопку 'В КОРЗИНЕ'")
    public ProductPage addProductAndGoToCartFromButton() {
        btnOfAddToCart.click();
        btnOfCart.click();

        return this;
    }
}
