package com.evotor.test.task.aleksandr.tests;

import com.evotor.test.task.aleksandr.utils.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Корректное отображение добавленного товара в корзину")
public class AddProductToCartTest extends BaseTest {

    @Feature("Проверка добавления товара в корзину при нажатии на иконку 'Корзина'")
    @DisplayName("Проверка добавления товара в корзину при нажатии на иконку 'Корзина'")
    @Test
    public void checkProductToCartFromIcon() {
        productPage.addProductAndGoToCartFromIcon();
        cartPage.checkProductInCart();
    }

    @Feature("Проверка добавления товара в корзину при нажатии на кнопку 'В КОРЗИНЕ'")
    @DisplayName("Проверка добавления товара в корзину при нажатии на кнопку 'В КОРЗИНЕ'")
    @Test
    public void addProductToCartFromButton() {
        productPage.addProductAndGoToCartFromButton();
        cartPage.checkProductInCart();
    }
}
