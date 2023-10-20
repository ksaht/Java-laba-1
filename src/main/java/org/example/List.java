package org.example;
/**
 * Класс List односвязный список
 * @param <T> тип данных
 */
public class List <T> {
    /**
     * Node - узлы
     */
    private static class Node <T> {
        private final T data;
        private Node<T> next;

        /**
         * Конструктор с данными
         * @param data данные
         */
        private Node(T data) {
            this.data = data;
            next = null;
        }

        /**
         * @return возвращает строку узла
         */
        @Override
        public String toString() {
            return data.toString();
        }
    }

    private Node<T> head;
    private Node<T> newNode;
    private int size;

    /**
     * Конструктор по умолчанию
     */
    public List() {
        head = null;
        size = 0;
    }

    /**
     * Вывод всех элементов списка
     * @return возвращает строку
     */
    @Override
    public String toString() {
        String str = " ";
        Node<T> currentNode = head;
        while (currentNode != null) {
            str += currentNode.toString() + " ";
            currentNode = currentNode.next;
        }
        return str;
    }

    /**
     * Добавление элемента в конец списка
     * @param data данные
     */
    public void pushBack(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node<>(data);
        }
        ++size;
    }

    /**
     * Добавление элемента в начало списка
     * @param data данные
     */
    public void pushFront(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            newNode = new Node<>(data);
            newNode.next= head;
            head = newNode;
        }
        ++size;
    }

    /**
     * Получение элемента, хранящегося по индексу
     * @param i индекс
     * @return элемент
     */
    public T GetItem(int i) {
        Node<T> currentNode = head;
        int j = 0;
        while (j != i) {
            currentNode = currentNode.next;
            ++j;
        }
        return currentNode.data;
    }

    /**
     * Удаление элемента, хранящегося по индексу
     * @param i индекс
     */
    public void remove(int i) {
        Node<T> currentNode = head;
        Node<T> previousNode = null;
        int j = 0;
        while (j != i) {
            previousNode = currentNode;
            currentNode = currentNode.next;
            ++j;
        }
        if (previousNode == null) {
            head = currentNode.next;
        } else {
            previousNode.next = currentNode.next;
            currentNode.next = null;
        }
        --size;
    }

    /**
     * Очищение списка
     */
    public void clear() {
        head = null;
        size = 0;
    }

    /**
     * Проверка на пустоту
     * @return булевое значение
     */
    public boolean isEmpty() {
        return (head == null);
    }

    /**
     * Получение размера списка
     * @return число
     */
    public int size() {
        return size;
    }
}