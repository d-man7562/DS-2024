package accidentpack;

import java.util.Comparator;
/**
 * @author Adam Taddia and Domenic Mancuso
 */
public class SortByStartTime implements Comparator<Report>{
	
	/**
	 * @author Adam Taddia
	 * @version 2/26/2024
	 */
	public int compare(Report r1, Report r2) {
		
			return r1.getStartTime().compareTo(r2.getStartTime());
			}

}
