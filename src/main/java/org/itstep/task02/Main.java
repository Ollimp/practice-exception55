package org.itstep.task02;

public class Main {
    public static void main(String[] args) {
        try {
            Main.getPositiveLessHundredNumber(101);
        } catch (GreatHundredException | NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
    public static boolean getPositiveLessHundredNumber(int number) throws NegativeNumberException, GreatHundredException {
        if (number < 0)
            throw new NegativeNumberException("Number is negative!");
        if (number > 100)
            throw new GreatHundredException("Number is too big!");
        return true;
    }
}
