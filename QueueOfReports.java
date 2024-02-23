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
public class QueueOfReports implements Collection<Report>{
	//we already have time sorted google how to sort by dya
	//remove from araylist and then add to queue
	//then remove everything from queue and do it agian,
	//check and 
	//index 0, index length-1
	// for loop from first date to last date
	//add to queue method and process queue method

			 final int Counters = 24*60*5;
	private LinkedList<Report> reportsLink;
	public QueueOfReports(LinkedList<Report> reportsList, LinkedList<Report> reportsLink) {
		this.reportsLink = reportsLink;
	}
void addtoQueueOfReports(ArrayList<Report>reportsList) throws ParseException {
	Queue<Report>q = new LinkedList<Report>();
	
		SimpleDateFormat date = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String firstDay = ("2022-01-01 00:00:00");
		long timeAsSeconds = 86400;
		for (Report r : reportsList) {
			Iterator<Report> i = reportsList.iterator();
			while (i.hasNext()) {
				if (r.getStartTimeAsSeconds()<timeAsSeconds) {
				Report s = i.next();
							{
					q.offer(r);
					reportsList.remove(r);
				}
							else {
					processQueue(q);
	timeAsSeconds+=(86400);
	
				}}}}}



//			int parsedDate = int.parseInt(c);
//assuming that getStartTime is a String
//if (DateFormat.parse(s.getStartTime()).before(c.getTime()))
			
//					c.add(Calendar.DATE, 1);
//Calendar c = Calendar.getInstance();
//c.setTime(date.parse(firstDay));		
/**		
			if (DateFormat.parse(r.getStartTime()) < c.getTime()) {
				q.offer(r);
				reportsList.remove(r);
			}
			else {
				processQueue(q);
				c.add(Calendar.DATE, 1);
			}}}
*/

		
		//chatGPT created this method with iterator but it did not solve my problemSSSSSSSSSSS
		

		
		
		
		void processQueue(Queue<Report> q) {
		for (Report r : q) {
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
		}}}
		
	/**
	 * 
	 * if reports.startTimeAsSeconds<31*24*60*60{
	 * q.add(reports)
	 * }
	 * 
	 */
	
	
	
	

	public void ArrayDeque() {
		
	}
	public static Report addtoQueue() {
		return null;
		
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

}}
