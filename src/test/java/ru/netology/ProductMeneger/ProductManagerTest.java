package ru.netology.ProductMeneger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductManagerTest {
    @Test
    public void SearchBySingleProduct() {
        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);

        Book book1 = new Book(1, "Hot air balloon trip", 200, " Jules Verne");
        Book book2 = new Book(2, "2000 Leagues Under the Sea", 300, "Jules Verne");
        Book book3 = new Book(3, "Robinson Crusoe", 400, "D. Defoe");

        Smartphone smartphone1 = new Smartphone(11, "Honor", 3000, "Honor Co");
        Smartphone smartphone2 = new Smartphone(12, "Samsung", 400, "Samsung Co");
        Smartphone smartphone3 = new Smartphone(13, "IPhone", 500, "Apple Co");
        Smartphone smartphone4 = new Smartphone(16, "Honor", 2000, "Honor Co");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);

        Product[] actual = manager.searchBy("Hot air");
        Product[] expected = {book1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void SearchByTwoProducts() {
        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);

        Book book1 = new Book(1, "Hot air balloon trip", 200, " Jules Verne");
        Book book2 = new Book(2, "2000 Leagues Under the Sea", 300, "Jules Verne");
        Book book3 = new Book(3, "Robinson Crusoe", 400, "D. Defoe");

        Smartphone smartphone1 = new Smartphone(11, "Honor H 20", 3000, "Honor Co");
        Smartphone smartphone2 = new Smartphone(12, "Samsung", 400, "Samsung Co");
        Smartphone smartphone3 = new Smartphone(13, "IPhone", 500, "Apple Co");
        Smartphone smartphone4 = new Smartphone(16, "Honor J10", 2000, "Honor Co");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);

        Product[] actual = manager.searchBy("Honor");
        Product[] expected = {smartphone1, smartphone4};

        Assertions.assertArrayEquals(expected, actual);
    }


}
