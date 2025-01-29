class FrontMiddleBackQueue {
 private LinkedList<Integer>queue;
    private int size;
    public FrontMiddleBackQueue() {
        queue = new LinkedList<Integer>();
        size = 0;
    }
    
    public void pushFront(int val) {
      queue.addFirst(val);
      size++;
    }
    
    public void pushMiddle(int val) {
        int middleIndex = size/2;
        queue.add(middleIndex,val);
        size++;
    }
    
    public void pushBack(int val) {
        queue.add(val);
        size++;
    }
    
    public int popFront() {
       if (size==0) {
            return -1;
        }
        size--;
        return queue.pollFirst();
    }
    
    public int popMiddle() {
         if (size==0) {
            return -1;
        }
       int Mid = (size-1)/2;
       int midelement = queue.remove(Mid);
        size--;
        return midelement;
    }
    
    public int popBack() {
         if (size==0) {
            return -1;
        }
        size--;
        return queue.pollLast();
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */