package Question3;

public class OLA {

	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		if(numberOfPassenger<=3) {
			HatchBack hback=new HatchBack();
			hback.setNumberOfKms(numberOfKMs);
			hback.setNumberOfPassenger(numberOfPassenger);
		return hback;
		}else {
			Sedan sedan=new Sedan();
			sedan.setNumberOfKms(numberOfKMs);
			sedan.setNumberOfPassenger(numberOfPassenger);
			
			return sedan;
		}
	}

	public int calculateBill(Car car) {
		if(car instanceof HatchBack) {
			HatchBack myhatch= (HatchBack)car;
	    int Totalfare= myhatch.getNumberOfKms()*myhatch.farePerKm;
		return Totalfare;
		}else {
		Sedan se=(Sedan)car;
		int Totalfare= se.getNumberOfKms()*se.farePerKm;
			 return Totalfare;
		}
		
}
}
