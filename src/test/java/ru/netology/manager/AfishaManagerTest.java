package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AfishaManagerTest {
    AfishaManager manager = new AfishaManager(10);

    @Test
    void shouldAdd() {
        AfishaItem afishaItem = new AfishaItem(1, "Фильм1", "http://testtest1.ru", "comedy");
        AfishaItem afishaItem1 = new AfishaItem(2, "Фильм2", "http://testtest2.ru", "drama");
        AfishaItem afishaItem2 = new AfishaItem(5, "Фильм3", "http://testtest33.ru", "horrors");

        manager.add(afishaItem);
        manager.add(afishaItem1);
        manager.add(afishaItem2);

        AfishaItem[] actual = manager.getLastItems();
        AfishaItem[] expected = new AfishaItem[]{afishaItem2, afishaItem1, afishaItem};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shoulAfishaEmpty() {

        AfishaItem[] actual = manager.getLastItems();
        AfishaItem[] expected = new AfishaItem[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAddMoreThanTen() {
        AfishaItem afishaItem = new AfishaItem(1, "Фильм1", "http://test1.ru", "comedy");
        AfishaItem afishaItem1 = new AfishaItem(2, "Фильм2", "http://test2.ru", "drama");
        AfishaItem afishaItem2 = new AfishaItem(5, "Фильм5", "http://test5.ru", "horrors");
        AfishaItem afishaItem3 = new AfishaItem(3, "Фильм3", "http://test3.ru", "horrors");
        AfishaItem afishaItem4 = new AfishaItem(4, "Фильм4", "http://test4.ru", "drama");
        AfishaItem afishaItem5 = new AfishaItem(7, "Фильм7", "http://test7.ru", "comedy");
        AfishaItem afishaItem6 = new AfishaItem(6, "Фильм6", "http://test6.ru", "comedy");
        AfishaItem afishaItem7 = new AfishaItem(8, "Фильм8", "http://test8.ru", "drama");
        AfishaItem afishaItem8 = new AfishaItem(10, "Фильм10", "http://test10.ru", "drama");
        AfishaItem afishaItem9 = new AfishaItem(9, "Фильм9", "http://test9.ru", "horrors");
        AfishaItem afishaItem10 = new AfishaItem(11, "Фильм11", "http://test11.ru", "drama");
        AfishaItem afishaItem11 = new AfishaItem(12, "Фильм12", "http://test12.ru", "drama");

        manager.add(afishaItem);
        manager.add(afishaItem1);
        manager.add(afishaItem2);
        manager.add(afishaItem3);
        manager.add(afishaItem4);
        manager.add(afishaItem5);
        manager.add(afishaItem6);
        manager.add(afishaItem7);
        manager.add(afishaItem8);
        manager.add(afishaItem9);
        manager.add(afishaItem10);
        manager.add(afishaItem11);

        AfishaItem[] actual = manager.getLastItems();
        AfishaItem[] expected = new AfishaItem[]{afishaItem11, afishaItem10, afishaItem9, afishaItem8, afishaItem7, afishaItem6, afishaItem5, afishaItem4, afishaItem3, afishaItem2};

        assertArrayEquals(expected, actual);
    }
}