package org.itstep.task05;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Runner runner1 = new Runner();
        Runner runner2 = new Runner();
        Runner runner3 = new Runner();
        try {
            try {
                runner1.halt();
            } catch (RuntimeException e) {
                System.out.println("halt");
            }
            try {
                runner2.halt();
            } catch (RuntimeException e) {
                System.out.println("halt");
            }
            try {
                runner3.halt();
            } catch (RuntimeException e) {
                System.out.println("halt");
            }
        } catch (IOException e){
            System.out.println("IO Exception!");
        }
    }
}
