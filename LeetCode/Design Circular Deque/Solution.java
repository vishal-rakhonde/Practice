class MyCircularDeque {
    int deque[];
    int start, end, k;
    public MyCircularDeque(int k) {
        deque = new int[k];
        Arrays.fill(deque, -1);
        start = 0;
        end = 0;
        this.k = k; 
    }
    
    public boolean insertFront(int value) {
        int s = start - 1;
        if(s == -1) s = k - 1;
        if(deque[s] != -1) return false;
        start = s;
        deque[start] = value;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(deque[end] != -1) return false;
        deque[end] = value;
        end++;
        if(end == k) end = 0;
        return true;
    }
    
    public boolean deleteFront() {
        if(deque[start] == -1) return false;
        deque[start] = -1;
        start++;
        if(start == k) start = 0;
        return true;
    }
    
    public boolean deleteLast() {
        int e = end - 1;
        if(e == -1) e = k - 1;
        if(deque[e] == -1) return false;
        deque[e] = -1;
        end = e;
        return true;
        
    }
    
    public int getFront() {
        return deque[start];
    }
    
    public int getRear() {
        int e = end - 1;
        if(e == -1) e = k - 1;
        return deque[e]; 
    }
    
    public boolean isEmpty() {
        return deque[start] == -1;
    }
    
    public boolean isFull() {
        boolean inserted = insertFront(10);
        if(inserted) {
            deleteFront();
            return false;
        }
        return true;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */