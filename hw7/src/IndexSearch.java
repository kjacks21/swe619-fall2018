import java.util.List;

public class IndexSearch {

	private  static List<String> list;
	public IndexSearch(List<String> l) {
		list=l;
	}
	public void add(String x) {
		list.add(x);
	}
	public static <E> int search (Indexer<E> c, E x){
		 // EFFECTS: If c is null throws NullPointerException, else if
        // c is not searchable, throws ClassCastException, else
        // if x is in c returns an index where x can be found,
        // else throws NotFoundException
		if(c==null)
			throw new NullPointerException("c is null");
		else if (!c.searchable(list))
			throw new ClassCastException("c cannot b searched");
		
		int idx =c.indexOf(list,x);
		if(idx==-1)
			throw new IllegalArgumentException(x+" is not found");
		return idx;
	}
}
