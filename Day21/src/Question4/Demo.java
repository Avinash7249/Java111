package Question4;

public class Demo {

	//Explain wait(), notify(),notifyAll() how they are used for inter thread communication.
	
	//To call wait() or notify() method on any object we must have that particular object lock 
	//otherwise we will get a runtime exception called IllegalMonitorStateException.
	//Once a thread calls wait() method on any object, first it releases the lock immediately of 
	//that particular object and then it enters into the waiting state immediately.
	//Once a thread calls notify() method on any object it also releases the lock of that object but
	//not immediately.Wait and notify or notifyAll method belongs from Object class because "a thread"
	//can call these methods on any java object.
	//we must use this method inside synchronized area only.


}
