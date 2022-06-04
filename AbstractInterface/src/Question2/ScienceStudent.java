package Question2;

public  class ScienceStudent extends Student{

	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks; 
	
	public ScienceStudent(String name, String address, int phisicsMarks, int chemistryMarks, int mathsMarks) {
		super(name, address);
		this.phisicsMarks = phisicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

    public double getPercentage() {
    	double aver=this.phisicsMarks+this.mathsMarks+this.chemistryMarks;
    	double   ave=(aver/300)*100;
		return ave;
	}
}
