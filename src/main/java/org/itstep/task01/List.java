package org.itstep.task01;

public class List {
    private Object[] obj;
    private int size = -1;
    private int cur = -1;

    public List(int size) {
        cur = 0;
        this.size = size;
        obj = new Object[size];
    }
   
    public Object get(int idx) {
        return obj[idx];
    }

    public void add(Object item) throws FullListException {
        if (cur == size)
            throw new FullListException("List is full!");
        obj[cur++] = item;
    }

    public void removeLast() throws EmptyListException {
        if (cur == 0)
            throw new EmptyListException("List is empty!");
        obj[--cur] = null;
    }
}
