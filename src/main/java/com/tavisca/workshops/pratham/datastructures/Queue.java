package com.tavisca.workshops.pratham.datastructures;

public class Queue<T> {
    public static final int defaultCapacity = 8;
    private int capacity;
    protected int front, rear, size, len;
    T[] queue;

    public Queue(int capacity) {
        size = capacity;
        len = 0;
        queue = (T[]) new Object[size];
        front = -1;
        rear = -1;
        this.capacity = capacity;
    }

    public Queue() {
        this(defaultCapacity);
    }


    public int capacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return front == 0 && rear == size - 1;
    }


    public void add(T v) {
        if (isEmpty()) {
            front = 0;
            rear = 0;
            queue[rear] = v;
        } else if (isFull()) {
            throw new IndexOutOfBoundsException("Overflow");
        } else {

            queue[++rear] = v;
        }
        len++;
    }

    public T remove() {
        if (isEmpty())
            throw new RuntimeException("Underflow Exception");
        else {
            len--;
            T item = queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            }
            else
                front++;
            return item;
        }

    }
}
