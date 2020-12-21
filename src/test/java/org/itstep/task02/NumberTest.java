package org.itstep.task02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberTest {
    @Test
    public void getPositiveLessHundredNumberTest() throws NegativeNumberException, GreatHundredException {
        assertTrue(Main.getPositiveLessHundredNumber(56));
        assertThrows(NegativeNumberException.class, () -> {
            Main.getPositiveLessHundredNumber(-1);
        });
        assertThrows(GreatHundredException.class, () -> {
            Main.getPositiveLessHundredNumber(101);
        });
    }
}
