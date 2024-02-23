package accidentPack;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.ArrayList;
public class QueueOfReports implements Collection<Report>{
	//we already have time sorted google how to sort by dya
	//remove from araylist and then add to queue
	//then remove everything from queue and do it agian,
	//check and 
	//index 0, index length-1
	// for loop from first date to last date
	//add to queue method and process queue method
	
public QueueOfReports(ArrayList<Report>reportsList) {
	@SuppressWarnings("rawtypes")
	Queue<Report>q = new LinkedList<Report>();
	
	
	
	
	
	int count = 0;
	for (Report r: reportsList) {
		q.add(r);
	}
	for (Report r: q ) { 
		q.remove(r);
	count++;
	}
	return count;
}
	public void ArrayDeque() {
		
	}
	public static Report addtoQueue() {
		
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean add(Report e) {
		// TODO Auto-generated method stub
		return false;
	}

}
