class MyCircularDeque {
    private int[] deque;
    private int size, capacity, front, rear;
     public MyCircularDeque(int k) {
        capacity = k;
        deque = new int[k];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        front = (front - 1 + capacity) % capacity;
        deque[front] = value;
        if (size == 0) rear = front;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % capacity; // Move rear forward
        deque[rear] = value;
        if (size == 0) front = rear; // Special case for first insert
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        if (size == 1) { // Special case for last remaining element
            front = 0;
            rear = -1;
        } else {
            front = (front + 1) % capacity; // Move front forward
        }
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        if (size == 1) { // Special case for last remaining element
            front = 0;
            rear = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity; // Move rear backward
        }
        size--;
        return true;
    }

    public int getFront() {
        return isEmpty() ? -1 : deque[front];
    }

    public int getRear() {
        return isEmpty() ? -1 : deque[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
