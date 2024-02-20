package accidentPack;

import java.util.Comparator;

public class SortByStartTime implements Comparator<Report>{
	
	public int compare(Report r1, Report r2) {
		return (r1.getStartTimeAsSeconds() - r2.getStartTimeAsSeconds());
	}

}
