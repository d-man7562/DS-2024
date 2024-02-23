package accidentPack;
import accidentPack.Report;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;

public class QueueOfReports {
	//we already have time sorted google how to sort by dya
	//remove from araylist and then add to queue
	//then remove everything from queue and do it agian,
	//check and 
	//index 0, index length-1
	// for loop from first date to last date
	//add to queue method and process queue method

			 int Counters = 24*60*5;
	private Queue<Report> reportArrayDeque;
	private ArrayList<Report> arrayList;
	public QueueOfReports(ArrayList<Report>arrayList) {
		this.arrayList = arrayList;
		reportArrayDeque = new ArrayDeque<Report>();
		}
	
void addtoQueueOfReports(ArrayList<Report>reportsList) throws ParseException {
	Queue<Report>q = new ArrayDeque<Report>();
	
		
		long timeAsSeconds = 86400;
		for (Report r : reportsList) {
			Iterator<Report> i = reportsList.iterator();
			while (i.hasNext()) {
				if (r.getStartTimeAsSeconds()<timeAsSeconds) {
					q.offer(r);
					reportsList.remove(r);
				} else {
					processQueue(q);
	timeAsSeconds+=(86400);
	
				}
				}
			System.out.println("array list is empty!");
		}}


		
		
		
		void processQueue(Queue<Report> q) {
			
		for (Report r : q) {
			if (Counters<=0) {
				break;
			}
		if (r.getSeverity()==1) {
			q.remove(r);
			Counters-=60;
		}
		
		if (r.getSeverity()==2) {
			q.remove(r);
			Counters-=120;
		}
		if (r.getSeverity()==3) {
			q.remove(r);
			Counters-=180;
		}
		if (r.getSeverity()==4) {
			q.remove(r);
			Counters-=240;
		}
		if (r.getSeverity()==5) {
			q.remove(r);
			Counters-=300;
		}
		
		}
		System.out.println("Counters = 0!");
		}
	
			

	

	public void ArrayDeque() {
		
	}
	public static Report addtoQueue() {
		return null;
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}


	public void clear() {
		// TODO Auto-generated method stub
		
	}


	public boolean add(Report e) {
		// TODO Auto-generated method stub
		return false;
	}

}
