package Question3;

public class OLA {

	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		if(numberOfPassenger<=3) {
		return new HatchBack();
		}else {
			
			return new Sedan();
		}
	}

	public int calculateBill(Car car) {
		HatchBack hatch=new HatchBack();
		Sedan se=new Sedan();
		//int total;
		//if(car instanceof HatchBack) {
		int Totalfare= hatch.getNumberOfKms()*hatch.getFarePerKm();
		int total=Totalfare*hatch.getNumberOfPassenger();
		
		return total;
//		}else if(car instanceof Sedan){
//			int Totalfare= se.getNumberOfKms()*se.getFarePerKm();
//			 int total=Totalfare*se.getNumberOfPassenger();
//			 return total;
//		}
		//return  total;
}
}
