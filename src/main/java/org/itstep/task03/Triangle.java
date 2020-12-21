package org.itstep.task03;

public class Triangle {
    private final int aLength;
    private final int bLength;
    private final int cLength;

    public Triangle(int aLength, int bLength, int cLength) throws CreateTriangleException {
        if (aLength + bLength <= cLength || aLength + cLength <= bLength || bLength + cLength <= aLength)
            throw new CreateTriangleException("Cannot create triangle!");
        this.aLength = aLength;
        this.bLength = bLength;
        this.cLength = cLength;
    }
}
