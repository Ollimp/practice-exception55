package org.itstep.task03;

import org.itstep.task02.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TriangleTest {
    @Test
    public void createTriangleTest(){
        assertThrows(CreateTriangleException.class, () -> {
            new Triangle(3, 2, 1);
        });
    }
}
