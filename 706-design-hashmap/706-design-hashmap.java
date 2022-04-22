class MyHashMap {

    public List<Integer> ls;
    public int[] arr=new int[1000001];
    public MyHashMap() {
       // ls=new ArrayList<Integer>(10);
        Arrays.fill(arr,-1);
    }
   
    public void put(int key, int value) {
        System.out.println("key "+ key + "value "+ value);
        //ls.add(key,value);
        arr[key]=value;
    }
    
    public int get(int key) {
      //  int temp=(ls.get(key) >= 0) ? ls.get(key) : -1;
        int temp=(arr[key] >= 0) ? arr[key] : -1;
        return temp;
    }
    
    public void remove(int key) {
       // ls.remove(key);
        arr[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */