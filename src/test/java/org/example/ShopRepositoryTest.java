package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopRepositoryTest {
    @Test

    public void removeWorkWithExistingElement() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(07, "Хлеб", 65);
        Product product2 = new Product(12, "Колбаса", 760);
        Product product3 = new Product(17, "Кофе", 1250);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        repo.remove(12);

        Product[] actual = repo.findAll();
        Product[] expected = {product1, product3};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test

    public void throwingExceptionRemoveNonElement() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(07, "Хлеб", 65);
        Product product2 = new Product(12, "Колбаса", 760);
        Product product3 = new Product(17, "Кофе", 1250);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        Assertions.assertThrows(NotFoundException.class, () -> repo.remove(20));
    }
}