package accidentPack;

import java.util.Comparator;

public class SortByStartTime implements Comparator<Report>{
	
	public int compare(Report r1, Report r2) {
		if (r1.getStartDate().isEqual(r2.getStartDate())) {
			return r1.getStartTime().compareTo(r2.getStartTime());
		} else {
			return r1.getStartDate().compareTo(r2.getStartDate());
		}
		
	}

}
