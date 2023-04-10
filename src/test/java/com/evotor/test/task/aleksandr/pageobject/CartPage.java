package com.evotor.test.task.aleksandr.pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class CartPage {
    // Elements
    private SelenideElement
            productInCart = $x("//a[@class='basket-item__title']"),
            btnOfCreateOrder = $x("//span[contains(text(), 'Сформировать заказ')]"),
            btnOfDeleteProduct = $x("//div[contains(@class, 'basket-item__delete')]");

    // Actions
    @Step("Проверка отображения продукта в корзине")
    public CartPage checkProductInCart() {
        productInCart.shouldHave(text("Маркировка"));
        btnOfCreateOrder.shouldHave(visible);

        return this;
    }

    @Step("Удалить товар из корзины")
    public CartPage deleteProductFromCart() {
        btnOfDeleteProduct.click();

        return this;
    }
}