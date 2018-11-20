import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class InstrumentedMap<K,V> extends ForwardingMap<K,V>{
	   private int addCount = 0;	

	   public InstrumentedMap(Map<K,V> s){ super(s); }
	   @Override public V put(K k, V v){ addCount++; return super.put(k,v); }
	   public int getAddCount(){ return addCount; }
	}

 class ForwardingMap<K,V> implements Map<K,V> {
	   private final Map<K,V> s;

	   public ForwardingMap(Map<K,V> s) { this.s = s; }
	   public V put(K k, V v)           { return s.put(k,v); }
	   public V remove(Object k)        { return s.remove(k);}
	   public boolean equals(Object o)  { return s.equals(o);}
	   public int hashCode()            { return s.hashCode();}
	   public String  toString()        { return s.toString();}
	  
	   public void clear()              {s.clear();}
	   public boolean isEmpty()         {return s.isEmpty();}
	   public int size()                {return s.size();}

	   public void putAll(Map<? extends K,? extends V> m) 
	   	                               { s.putAll(m);}
	   public boolean containsKey(Object key)        {return s.containsKey(key);}
	   public boolean containsValue(Object value)    {return s.containsValue(value);}
	   public V get(Object key)                      {return s.get(key);}
	   public Set<K> keySet()                        {return s.keySet();}
	   public Collection<V> values()                 {return s.values();}
	   public Set<Entry<K, V>> entrySet()            {return s.entrySet();}
}