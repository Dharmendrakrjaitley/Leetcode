// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    
   public List<Integer> ls=new ArrayList<Integer>();
    int len=0;
    int i=0;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        
        while(iterator.hasNext())
        {
            ls.add(iterator.next());
        }
	   
        len=ls.size();
        System.out.println(len);
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return ls.get(i);
     
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        return ls.get(i++);
	   // return 0;
	}
	
	@Override
	public boolean hasNext() {
        if(i>=len)
	     return false;
        return true;
	}
}