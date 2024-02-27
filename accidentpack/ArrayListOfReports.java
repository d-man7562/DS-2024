package accidentpack;
import java.io.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class ArrayListOfReports {
	public  static ArrayList<Report> reportsList = new ArrayList<Report>();
	public static ArrayList<Report> reportsList2 = new ArrayList<Report>();
	public static Queue<Report> reportsQueue = new ArrayDeque<Report>();
	/**
	 * @author Adam Taddia
	 * @param reports
	 * @param line
	 */
	private static void createReport(ArrayList<Report> reports, String line) {//a method for creating a report
		String[] items= line.split(",");
		String ID = items[0];
		int Severity = Integer.parseInt(items[1]);	
		LocalDateTime StartTime = dateTimeConvert(items[2]);
		LocalDateTime EndTime = dateTimeConvert(items[3]);		
		String Street = items[4];
		String City = items[5];
		String County = items[6];
		String State = items[7];
		double Temperature = Double.parseDouble(items[8]);
		double Humidity = Double.parseDouble(items[9]);
		double Visibility = Double.parseDouble(items[10]);
		String Weather = items[11];
		boolean AtCrossing = items[12].substring(0,1).equals("F")?true: false;
		boolean IsDay = items[13].substring(0,1).equals("N")?false:true;
		Report r = new Report(ID, Severity,StartTime, EndTime, Street, City, County, State, Temperature, Humidity, Visibility, Weather, AtCrossing, IsDay);
		reports.add(r);	}
	
	/**
	 * @author Domenic Mancuso
	 * @param filePath
	 * @return
	 * @throws IOException
	 * @throws ParseException
	 */
	public static ArrayList<Report> ReadCSVFile(String filePath) throws IOException, ParseException
	{		

		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String line = null;
		reader.readLine();
		while((line=reader.readLine())!=null) {
			createReport(reportsList,line);
		}	
		reader.close();
		Collections.sort(reportsList, new SortByStartTime());
		return reportsList;
			}	 
	
	
	/**
	 * @author Adam Taddia and Domenic Mancuso
	 * @param filePath
	 * @param County
	 * @param State
	 * @throws IOException
	 * @throws ParseException
	 */
	public ArrayListOfReports(String filePath, String County,String State) throws IOException, ParseException {
		try {
		reportsList = ReadCSVFile(filePath);
		
		}catch(Exception e) {
			System.out.println("error with readcsv file method " + e.getMessage());
		}
		try {
		 stateAndCounty(reportsList, County, State);
		}catch(Exception e) {
		System.out.println("error with stateandcounty method " + e.getMessage());
	}
		

	}
	
	/**
	 * @author Domenic Mancuso
	 * @param reportsLis
	 * @param County
	 * @param State
	 */
	public void  stateAndCounty(ArrayList<Report> reportsLis, String County, String State) {

		
		for (Report report: reportsLis) {
			
			if (report.getState().equals(County)&& report.getCounty().equals(State)) {
				ByTime(report);

			}
		}
//		return reportsQueue;
	}
	/**
	 * @author Domenic Mancuso
	 * @param report
	 */
public void ByTime(Report report) {
	if (reportsList.size()!=0){
	LocalDateTime first = report.getStartTime();
	Iterator<Report> i = reportsList.iterator();
	
	for (Report r : reportsList) {
		r = i.next();
		while (i.hasNext()) {
	if ((r.getStartTime()).isEqual(first)) {
	try {	reportsQueue.offer(r);
	reportsList.remove(r);
	}
	catch (Exception e) {
		System.out.println("error with ByTime" + e.getMessage());
	}
	processQueue(reportsQueue);
	}
	else {
	first =first.plusDays(1);
	}}}}
	else{
		System.out.println("reportsList2 size: " + reportsList2.size());}
	}

	
	/**
	 * @author Domenic Mancuso
	 */
	public void processQueue(Queue<Report> q) {
		int Counters = 0;
		Iterator<Report> i = q.iterator();
		while (i.hasNext())
		{
			Counters+= ((Report) i).getSeverity()*60;
				i.remove();
		}
		System.out.println(Counters);	
		}
	static DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	static DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	static DateTimeFormatter datetimeformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	/**
	 * @author Domenic Mancuso
	 * @param reportsList
	 * @return
	 * @throws ParseException
	 */
			 public QueueOfReports addtoQueueOfReports(ArrayList<Report>reportsList) throws ParseException {
			Queue<Report>q = new ArrayDeque<Report>();
			System.out.println("Total Reports:" + reportsList.size());
	
				
			//for first entry
			LocalDateTime first = reportsList.get(0).getStartTime();
			Iterator<Report> i = reportsList.iterator();
			for (Report r : reportsList) {
				while (i.hasNext()) {
			if ((r.getStartTime())==(first)) {
				q.offer(r);
			reportsList.remove(r);
			} else {
			processQueue(q);
		first.plusDays(1);
					
			}
			}
			System.out.println("array list is empty!");
		}
	return null;}

/**
 * @author Domenic Mancuso
 * @param dateTimeString
 * @return
 */
			 public static LocalDateTime dateTimeConvert(String dateTimeString) {
				 LocalDateTime localDateTime;
				 try {
					 localDateTime = LocalDateTime.parse(dateTimeString,datetimeformatter);
					 
				 }catch(Exception e) {
					 System.out.println("error parsing date-time String: " + e.getMessage());
					 localDateTime = null;
				 }
				 return localDateTime;
			 }
						
					


						

	
	/**
	 * @author Adam Taddia
	*finds amount of Reports
 	*@param scn Scanner
	*@return reportCount
	*@author Adam Taddia
	*/
	public static int findReportCount(Scanner scn){//passes the scanner as a parameter to get the number of reports
		long startTime = System.nanoTime();
		int reportCount = -1;//starts at -1 to account for first line
		
		while(scn.hasNextLine()) {
			scn.nextLine();
			reportCount += 1;
		}
		
		long endTime = System.nanoTime();
		System.out.println((endTime - startTime) + " nanoseconds to run findReportCount");
		return reportCount;
	}
	

	
}
