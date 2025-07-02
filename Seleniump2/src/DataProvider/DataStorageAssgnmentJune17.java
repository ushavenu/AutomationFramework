package DataProvider;

import org.testng.annotations.DataProvider;

public class DataStorageAssgnmentJune17 {
	@DataProvider
	
	public String[][] datasender()
	{
		String[][] data= {{"vandana","Pujar","vandana@gmail.com","vandana@123","vandana@123"},
							{"sunil","samay","sunil@gmail.com","sunil@123","sunil@123"},
							{"aashrita","samay","aashrita@gmail.com","aashrita@123","aashrita@123"},
							{"virat","viratrcb","virat@gmail.com","viratrcb@123","viratrcb@123"}};
		return data;
		
	}
	
	@DataProvider	
	public String[][] RegisterData()
	{
		String[][] data= {{"vandana","Pujar","vandana@gmail.com","vandana@123","vandana@123"},
						  {"sunil","samay","sunil@gmail.com","sunil@123","sunil@123"},
						  {"aashrita","samay","aashrita@gmail.com","aashrita@123","aashrita@123"},
						  {"virat","viratrcb","virat@gmail.com","viratrcb@123","viratrcb@123"}};
		return data;
	}

}
