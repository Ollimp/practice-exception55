package org.itstep.task01;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ListTest {
    @Test
    public void testList() throws FullListException, EmptyListException {
        List list = new List(3);
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(2, list.get(1));
    }
}
