package org.tests;


import org.example.Cat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest
{
    @Test
    public void test_get_cat()
    {
        Cat testCat = new Cat("jeff", "Meow", 9);
        assertEquals(9, testCat.getAge());
    }
    @Test
    public void getName()
    {
        Cat testCat1 = new Cat("harry", "m e  o  w ", 5);
        assertEquals(" ", testCat1.getName());
    }
}

