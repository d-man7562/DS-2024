package accidentpack;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


/**
 * @author Adam Taddia
 * Report - Constructor for Report
 */
public class Report implements Comparable<Report>{
	//DECEMBER 21 = winter start MARCH 21 = winter end
	private String ID;
	private int severity;
	
	private LocalDateTime startTime; //year,month,day
	private LocalDateTime endTime; //year,month,day
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
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
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
	/**
	 * @author Adam Taddia
	 * @param r2
	 * @return
	 */
		/**
	 * @author Adam Taddia
	 */
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
	 * @author Adam Taddia
	 * @param ID
	 * @param Severity
	 * @param StartDate
	 * @param EndDate
	 * @param StartTime
	 * @param EndTime
	 * @param Street
	 * @param City
	 * @param County
	 * @param State
	 * @param Temperature
	 * @param Humidity
	 * @param Visibility
	 * @param Weather
	 * @param AtCrossing
	 * @param IsDay
	 */
	public Report(String ID,int Severity, LocalDateTime StartTime, LocalDateTime EndTime, String Street,
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
		
		
	}
}