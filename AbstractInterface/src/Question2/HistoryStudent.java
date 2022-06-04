package Question2;

public class HistoryStudent extends Student{
	
	int historyMarks;
	int civicsMarks;
	
	
	public HistoryStudent(String name, String address, int historyMarks, int civicsMarks) {
		super(name, address);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

    @Override
	public double getPercentage() {
    	double aver=this.civicsMarks+this.historyMarks;
		double  ave=(aver/200)*100;
		return ave;
	}
}
