package accidentPack;

public class Report implements Comparable<Report>{
	//DECEMBER 21 = winter start MARCH 21 = winter end
	private String ID;
	private int severity;
	private int startTime[] = new int[6]; //year,month,day,hour,minute,second
	private int endTime[] = new int[6]; //year,month,day,hour,minute,second
	private int startTimeAsSeconds = 0;//seconds passed the beginning of 2021, because that's the earliest date
	private int endTimeAsSeconds = 0;
	private String street;
	private String city;
	private String county;
	private String state;
	private double temperature;	//fahrenheit
	private double humidity;	//as %
	private double visibility;	//miles
	private String weather;
	private boolean atCrossing;	//true = yes, at a crossing; false = no, not at crossing
	private boolean isDay;	//true = Day, false = Night
	
	public String getID() {
		return ID;
	}
	
	//these are all just setter and getter methods. None of the setters are used so far.
	public void setID(String iD) {
		ID = iD;
	}
	public int getSeverity() {
		return severity;
	}
	public void setSeverity(int severity) {
		this.severity = severity;
	}
	public int[] getStartTime() {
		return startTime;
	}
	public void setStartTime(int[] startTime) {
		this.startTime = startTime;
	}
	public int[] getEndTime() {
		return endTime;
	}
	public void setEndTime(int[] endTime) {
		this.endTime = endTime;
	}
	public int getStartTimeAsSeconds() {
		return startTimeAsSeconds;
	}
	public void setStartTimeAsSeconds(int time) {
		this.startTimeAsSeconds = time;
	}
	public int getEndTimeAsSeconds() {
		return endTimeAsSeconds;
	}
	public void setEndTimeAsSeconds(int time) {
		this.endTimeAsSeconds = time;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public double getVisibility() {
		return visibility;
	}
	public void setVisibility(double visibility) {
		this.visibility = visibility;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public boolean isAtCrossing() {
		return atCrossing;
	}
	public void setAtCrossing(boolean atCrossing) {
		this.atCrossing = atCrossing;
	}
	public boolean isDay() {
		return isDay;
	}
	public void setDay(boolean isDay) {
		this.isDay = isDay;
	}
	
	public int compareStartTimes(Report r2) {
		if (this.getStartTimeAsSeconds() < r2.getStartTimeAsSeconds()) {
			return -1;
		} else if (this.getStartTimeAsSeconds() > r2.getStartTimeAsSeconds()) {
			return 1;
		} else {
			return 0;
		}
		
	}
	
	public int compareTo(Report r2) {
		if (this.getVisibility() < r2.getVisibility()) {
			return -1;
		} else if (this.getVisibility() > r2.getVisibility()) {
			return 1;
		} else {
			return 0;
		}
		
	}
	/**
	 * prints out all of the variables of a report. Order of 1
	 */
	public void print() {
		System.out.print(this.ID + ", ");
		System.out.print(this.severity + ", ");
		System.out.print(this.startTime[0] + "-" + this.startTime[1] + "-" + this.startTime[2] + " " + this.startTime[3] + ":" + this.startTime[4] + ":" + this.startTime[5] + ", ");
		System.out.print(this.endTime[0] + "-" + this.endTime[1] + "-" + this.endTime[2] + " " + this.endTime[3] + ":" + this.endTime[4] + ":" + this.endTime[5] + ", ");
		System.out.print(this.street + ", ");
		System.out.print(this.city + ", ");
		System.out.print(this.county + ", ");
		System.out.print(this.state + ", ");
		System.out.print(this.temperature + ", ");
		System.out.print(this.humidity + ", ");
		System.out.print(this.visibility + ", ");
		System.out.print(this.weather + ", ");
		System.out.print(this.atCrossing + ", ");
		System.out.println(this.isDay);
	}
	
	public Report(String ID, int Severity, int[] StartTime, int[] EndTime, String Street,
			String City, String County, String State, double Temperature, double Humidity, double Visibility,
			String Weather, boolean AtCrossing, boolean IsDay) {
		this.ID = ID;
		this.severity = Severity;
		this.startTime = StartTime;
		this.endTime = EndTime;
		this.street = Street;
		this.city = City;
		this.county = County;
		this.state = State;
		this.temperature = Temperature;
		this.humidity = Humidity;
		this.visibility = Visibility;
		this.weather = Weather;
		this.atCrossing = AtCrossing;
		this.isDay = IsDay;
		
		/**
		 * This whole scheme is REALLY ineffecient and messy but it's all I could
		 * think of to get the lambda expression for comparing time to work. I can just compare the
		 * years, months, days, hours, minutes, or seconds, I had to compare them all
		 */
		this.startTimeAsSeconds += ((startTime[0]-2021)*365*24*60*60);//adds a number of seconds for the year
		switch (startTime[1]) {//adds seconds for the mo
			case 1:
				startTimeAsSeconds += 0;
				break;
			case 2:
				startTimeAsSeconds += (31*24*60*60);//In february, add all of january's days
				break;	
			case 3:
				startTimeAsSeconds += ((31 + 28)*24*60*60);//in march, add all of february and january's days
				break;
			case 4:
				startTimeAsSeconds += ((31 + 28 + 31)*24*60*60);//in april, add all of march's, february's, and january's days, etc
				break;
			case 5:
				startTimeAsSeconds += ((31 + 28 + 31 + 30)*24*60*60);
				break;
			case 6:
				startTimeAsSeconds += ((31 + 28 + 31 + 30 + 31)*24*60*60);
				break;
			case 7:
				startTimeAsSeconds += ((31 + 28 + 31 + 30 + 31 + 30)*24*60*60);
				break;
			case 8:
				startTimeAsSeconds += ((31 + 28 + 31 + 30 + 31 + 30 + 31)*24*60*60);
				break;
			case 9:
				startTimeAsSeconds += ((31 + 28 + 31 + 30 + 31 + 30 + 31 + 31)*24*60*60);
				break;
			case 10:
				startTimeAsSeconds += ((31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30)*24*60*60);
				break;
			case 11:
				startTimeAsSeconds += ((31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31)*24*60*60);
				break;
			case 12:
				startTimeAsSeconds += ((31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30)*24*60*60);
				break;
	
		}
		startTimeAsSeconds += (startTime[2] - 1) * 24 * 60 * 60;//adds seconds for the days
		startTimeAsSeconds += startTime[3] * 60 * 60;
		startTimeAsSeconds += startTime[4] * 60;
		startTimeAsSeconds += startTime[5];
		
		this.endTimeAsSeconds += ((endTime[0] - 2021)*365*24*60*60);//adds a number of seconds for the year
		switch (endTime[1]) {
			case 1,3,5,7,8,10,12:
				endTimeAsSeconds += (31*24*60*60);
				break;
			case 4,6,9,11:
				endTimeAsSeconds += (30*24*60*60);
				break;
			case 2:
				endTimeAsSeconds += (28*24*60*60);
				break;	
		}
		
		endTimeAsSeconds += endTime[2] * 24 * 60 * 60;
		endTimeAsSeconds += endTime[3] * 60 * 60;
		endTimeAsSeconds += endTime[4] * 60;
		endTimeAsSeconds += endTime[5];
	}
}