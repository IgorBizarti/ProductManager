package ru.netology.ProductMeneger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductRepositoryTest {

    @Test
    public void TestSearchByProduct() {
        ProductRepository repository = new ProductRepository();


        Book book1 = new Book(1, "Hot air balloon trip", 200, " Jules Verne");
        Book book2 = new Book(2, "2000 Leagues Under the Sea", 300, "Jules Verne");
        Book book3 = new Book(3, "Robinson Crusoe", 400, "D. Defoe");

        Smartphone smartphone1 = new Smartphone(11, "Honor", 3000, "Honor Co");
        Smartphone smartphone2 = new Smartphone(12, "Samsung", 400, "Samsung Co");
        Smartphone smartphone3 = new Smartphone(13, "IPhone", 500, "Apple Co");
        Smartphone smartphone4 = new Smartphone(16, "Honor", 2000, "Honor Co");

        repository.add(book1);
        repository.add(book2);
        repository.add(book3);

        repository.add(smartphone1);
        repository.add(smartphone2);
        repository.add(smartphone3);
        repository.add(smartphone4);

        Product[] actual = repository.findAll();
        Product[] expected = {book1, book2, book3, smartphone1, smartphone2, smartphone3, smartphone4};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void removeById() {
        ProductRepository repository = new ProductRepository();


        Book book1 = new Book(1, "Hot air balloon trip", 200, " Jules Verne");
        Book book2 = new Book(2, "2000 Leagues Under the Sea", 300, "Jules Verne");
        Book book3 = new Book(3, "Robinson Crusoe", 400, "D. Defoe");

        Smartphone smartphone1 = new Smartphone(11, "Honor", 3000, "Honor Co");
        Smartphone smartphone2 = new Smartphone(12, "Samsung", 400, "Samsung Co");
        Smartphone smartphone3 = new Smartphone(13, "IPhone", 500, "Apple Co");
        Smartphone smartphone4 = new Smartphone(16, "Honor", 2000, "Honor Co");

        repository.add(book1);
        repository.add(book2);
        repository.add(book3);

        repository.add(smartphone1);
        repository.add(smartphone2);
        repository.add(smartphone3);
        repository.add(smartphone4);

        repository.RemoveById(11);

        Product[] actual = repository.findAll();
        Product[] expected = {book1, book2, book3, smartphone2, smartphone3, smartphone4};

        Assertions.assertArrayEquals(expected, actual);

    }

}