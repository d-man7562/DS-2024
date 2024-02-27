package accidentpack;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

import accidentPack.Report;

import java.text.ParseException;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
*QueueOfReports - Creates an ArrayDeque that allocates reports of the same day and then "processes" 
*them by subtracting an abstract amount of time from the Counters variable and then removing specified reports from
*the arrayDeque
*@author Domenic Mancuso
*@version 2/23/2024
*/
public class QueueOfReports {

			 int Counters = 24*60*5;
	private Queue<Report> reportArrayDeque;
	private ArrayList<Report> arrayList;
	/**
	*QueueOfReports constructor
 	*@param arrayList of reports
  	*creates an arrayDeque to process reports from arrayList
	*/
	public QueueOfReports(ArrayList<Report>arrayList) {
		this.arrayList = arrayList;
		reportArrayDeque = new ArrayDeque<Report>();
		}
	


void addtoQueueOfReports(ArrayList<Report>reportsList) throws ParseException {
	Queue<Report>q = new ArrayDeque<Report>();
}}