package ru.vasyukov.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Точка запуска тестов кукумбера, и опции кукумбера
 * @author Васюков А.Ю.  GitHub  https://github.com/and3081/Cucumber_SberAST_b
 * @version 1.0
 * Описание тест-кейса:
 * 1. сайт https://www.sberbank-ast.ru госзакупки
 * 2. проверить title
 * 3. запрос "Страхование"
 * 4. вывести инфо о первых 10 заказах удовлетворяющих условиям:
 *    цена > 600 тыс. руб,
 *    тип Госзакупки по 44-ФЗ.
 *    Проверять только первые 120 результатов в списке.
 * 5. проверить количество фактической выборки
 * 6. В инфо выводить: название, цену, номер (в консоль, в Step аллюра),
 *    Json-attachment в аллюр.
 *
 * Настраиваемые листенеры в проперти:
 *       - какие типы методов скринить: драйвер, элементы, все варианты или отключить
 *       - какие выборочно по названиям методы скринить
 *       - какие скрины вокруг методов делать: перед, после, оба
 *       - при скрининге элементов:     всё окно, только элемент или оба скрина сразу
 *
 *       В аллюре скрины подписаны- перед и после какого метода, аргументы и возврат метода
 *
 *       - выбор браузера в проперти для прогона тестов:  Chrome, Edge
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/ru/vasyukov/Features",
        glue = {"ru.vasyukov.StepDefinitions", "ru.vasyukov.Hooks"}
)
public class RunnerTest {}
