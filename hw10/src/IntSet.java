import java.util.*;

public class IntSet implements Cloneable {
    private List<Integer> els;

    @Override public boolean equals(Object obj) {
        if (!(obj.getClass()==this.getClass()))
            return false;
        IntSet s = (IntSet) obj;
        return els.equals(s.els);
    }


    @Override public int hashCode() {
        int result = 0;
        for (Integer i : els) {
//            result += i.hashCode();  // from class
            result += 31 * result + i.hashCode();  // bloch
        }
        return result;
    }

    public IntSet () { els = new ArrayList<Integer>(); }

    private IntSet (List<Integer> list) { els = list; }

    // previous implementation
//    @Override public IntSet clone() {
//        return new IntSet (new ArrayList<Integer>(els));
//    }


    // our implementation
	@Override public IntSet clone() {
	   try {
		 IntSet s = (IntSet) super.clone();
		 s.els.addAll(els);
		 return s;
	   }catch(CloneNotSupportedException e) {
		   throw new IllegalStateException();
	   }
   }

}