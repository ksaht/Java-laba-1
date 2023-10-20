package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {
    //Проверка на добавление элемента в конец пустого списка

    @Test
     void testPushBackInEmptyList() {
        List<Integer> list = new List<>();
        list.pushBack(6);

        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
        assertEquals(6, list.GetItem(0));
    }

    //Проверка на добавление элемента в конец заполненного списка
    @Test
    void testPushBackInFilledList() {
        List<Integer> list = new List<>();
        list.pushBack(6);
        list.pushBack(5);

        assertFalse(list.isEmpty());
        assertEquals(2, list.size());
        assertEquals(5, list.GetItem(1));
    }

    //Проверка на добавление элемента в начало пустого списка
    @Test
    void testPushFrontInEmptyList() {
        List<Integer> list = new List<>();
        list.pushFront(6);

        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
        assertEquals(6, list.GetItem(0));
    }

    //Проверка на добавление элемента в начало заполненного списка
    @Test
    void testPushFrontInFilledList() {
        List<Integer> list = new List<>();
        list.pushFront(6);
        list.pushFront(5);

        assertFalse(list.isEmpty());
        assertEquals(2, list.size());
        assertEquals(5, list.GetItem(0));
    }

    //Проверка на получение элемента из заполненного списка
    @Test
    void testGetItemFromFilledList() {
        List<Integer> list = new List<>();
        list.pushBack(7);
        list.pushBack(6);
        list.pushBack(5);

        assertEquals(6, list.GetItem(1));
    }

    //Проверка на удаление первого элемента списка
    @Test
    void testRemoveFirstElementFromList() {
        List<Integer> list = new List<>();
        list.pushBack(7);
        list.pushBack(5);
        list.pushBack(6);
        int size = list.size();
        list.remove(0);

        assertEquals(5, list.GetItem(0));
        assertEquals(size - 1, list.size());
    }

    //Проверка на удаление внутреннего элемента списка
    @Test
    void testRemoveInnerElementFromList() {
        List<Integer> list = new List<>();
        list.pushBack(7);
        list.pushBack(5);
        list.pushBack(6);
        int size = list.size();
        list.remove(1);

        assertEquals(6, list.GetItem(1));
        assertEquals(size - 1, list.size());
    }

    //Проверка на удаление последнего элемента списка
    @Test
    void testRemoveLastElementFromList() {
        List<Integer> list = new List<>();
        list.pushBack(6);
        list.pushBack(5);
        list.pushBack(7);

        int size = list.size();
        list.remove(2);

        assertEquals(5, list.GetItem(list.size() - 1));
        assertEquals(size - 1, list.size());
    }

    //Проверка пустого списка на пустоту
    @Test
    void testIsEmptyWithEmptyList() {
        List<Integer> list = new List<>();

        assertTrue(list.isEmpty());
    }

    //Проверка заполненного списка на пустоту
    @Test
    void testIsEmptyWithFilledList() {
        List<Integer> list = new List<>();
        list.pushBack(5);

        assertFalse(list.isEmpty());
    }

    //Проверка на получение корректного размера пустого списка
    @Test
    void testSizeFromEmptyList() {
        List<Integer> list = new List<>();

        assertEquals(0, list.size());
    }

    //Проверка на получение корректного размера непустого списка
    @Test
    void testSizeFromFilledList() {
        List<Integer> list = new List<>();
        list.pushBack(5);
        list.pushBack(7);

        assertEquals(2, list.size());
    }

    //Проверка вывода списка с пустым списком
    @Test
    void testToStringWithEmptyList() {
        List<Integer> list = new List<>();

        assertEquals(" ", list.toString());
    }

    //Проверка вывода списка с непустым списком
    @Test
    void testToStringWithFilledList() {
        List<Integer> list = new List<>();
        list.pushBack(6);
        list.pushBack(7);
        list.pushBack(8);

        assertEquals(" 6 7 8 ", list.toString());
    }

    //Проверка очищения пустого списка
    @Test
    void testClearWithEmptyList() {
        List<Integer> list = new List<>();
        int size = list.size();
        list.clear();

        assertEquals(size, list.size());
    }

    //Проверка очищения списка
    @Test
    void testClearWithFilledList() {
        List<Integer> list = new List<>();
        list.pushBack(8);
        list.pushBack(9);
        int size = list.size();
        list.clear();

        assertEquals(size - 2, list.size());
    }
}