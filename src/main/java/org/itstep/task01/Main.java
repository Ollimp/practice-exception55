package org.itstep.task01;

public class Main {
    public static void main(String[] args) throws FullListException, EmptyListException {
        List list = new List(3);
        list.add(1);
        list.add(2);
        list.add(3);
        try {
            list.add(4);
        } catch (FullListException e){
            System.out.println(e.getMessage());
        }

        list.removeLast();
        list.removeLast();
        list.removeLast();
        try {
            list.removeLast();
        } catch (EmptyListException e){
            System.out.println(e.getMessage());
        }
    }
}
