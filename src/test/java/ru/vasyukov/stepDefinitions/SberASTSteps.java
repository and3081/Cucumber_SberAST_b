package ru.vasyukov.stepDefinitions;

import pages.BasePage;
import pages.PageSberAstMain;
import io.cucumber.java.ru.Затем;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

/**
 * Класс определений для кукумбера
 */
public class SberASTSteps {
    /**
     * Page Object-ы страниц
     */
    private static PageSberAstMain pageSberAstMain;

    @Когда("Открываем Сбер-АСТ")
    public void openSberAst () {
        pageSberAstMain = BasePage.openFirstPageSberAst(1);
    }

    @Тогда("Проверяем title страницы Сбер-АСТ")
    public void checkSberAstTitle () {
        pageSberAstMain.checkSberAstTitle(2);
    }

    @Когда("Вводим значение в поле поиска: {string}")
    public void inputSearchField (String search) {
        pageSberAstMain.inputSearchField(3, search);
    }

    @Затем("Собираем найденные позиции по условиям: {double}, {string}, {string}, {int}, {int}")
    public void collectAllPageResults (double price, String currency, String law,
                                       int maxCountView, int countChoice) {
        pageSberAstMain.collectAllPageResults(4, price, currency, law, maxCountView, countChoice);
    }

    @Тогда("Проверяем ожидаемое количество выборки: {int}")
    public void assertResults (int countChoice) {
        pageSberAstMain.assertResults(5, countChoice);
    }

    @И("Формируем отчеты в консоль и Аллюр")
    public void reportResults () {
        pageSberAstMain.reportResults(6);
    }
}
