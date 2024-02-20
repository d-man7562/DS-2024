package accidentPack;

import java.io.FileNotFoundException;

public class Execution {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayListOfReports a = new ArrayListOfReports(args[0], args[1], args[2]);
		for (int i = 0; i < a.reportsList.size(); i++) {
			a.reportsList.get(i).print();
		}
	}

}
