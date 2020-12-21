package org.itstep.task03;

public class Main {
    public static void main(String[] args) {
        try{
            Triangle triangle = new Triangle(3, 2 , 1);
        } catch (CreateTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}
