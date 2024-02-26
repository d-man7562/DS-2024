package accidentPack;

import java.time.LocalDate;
import java.time.LocalTime;

public class Report implements Comparable<Report>{
	//DECEMBER 21 = winter start MARCH 21 = winter end
	private String ID;
	private int severity;
	
	private LocalTime startTime; //year,month,day
	private LocalTime endTime; //year,month,day
	
	private LocalDate startDate; //hour,minute,second
	private LocalDate endDate; //hour,minute,second
	
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
	
	
	
	
	
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	
	
	
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndTime(LocalDate endDate) {
		this.endDate = endDate;
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
	
	public Report(String ID, int Severity, LocalDate StartDate, LocalDate EndDate, LocalTime StartTime, LocalTime EndTime, String Street,
			String City, String County, String State, double Temperature, double Humidity, double Visibility,
			String Weather, boolean AtCrossing, boolean IsDay) {
		this.ID = ID;
		this.severity = Severity;
		this.startDate = StartDate;
		this.endDate = EndDate;
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
		
		
	}
}