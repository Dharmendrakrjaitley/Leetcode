class MyHashSet {
    public List<Integer> ls;

    public MyHashSet() {
        ls=new ArrayList<Integer>();
    }
    
    public void add(int key) {
        if(!ls.contains(key))
            ls.add(key);
    }
    
    public void remove(int key) {
        if(ls.contains(key))
            ls.remove(new Integer(key));
    }
    
    public boolean contains(int key) {
        return ls.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */