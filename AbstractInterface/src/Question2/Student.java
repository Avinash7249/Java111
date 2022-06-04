package Question2;

abstract public  class Student {
	
	String name;
	String address;
		
		public abstract double  getPercentage() ;

		public Student(String name, String address) {
			super();
			this.name = name;
			this.address = address;
		}

		
}
