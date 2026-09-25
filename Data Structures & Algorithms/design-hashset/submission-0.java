class MyHashSet {
    private HashMap<Integer, Integer> map;
    private int length;

    public MyHashSet() {
        map = new HashMap<>();
        length = 0;
    }
    
    public void add(int key) {
        map.put(key, length++);
    }
    
    public void remove(int key) {
        map.remove(key);
        length--;
    }
    
    public boolean contains(int key) {
        return (map.containsKey(key));
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */