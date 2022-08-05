
public class Demo {
	
	//Q1. Explain MVC architecture?
	//MVC architecture in this M=model
	//v=view, c=Controller
	//Spring Boot, rest api development will work based on Spring MVC architecture.
    //if we develop a webapplication according to the mvc architecture manually, we need to develop
	//Servlet class,jsp file and all the flow control logic manually.
    //Spring f/w provides Spring-web-mvc module to simplify the manual mvc application development.
    //in which , Spring mvc module provides a predefined Servlet class with predefined flow control 
	//logic , ie. DispatcherServlet class.


	//Q2. What is the difference between SOAP and Rest API's?
	//SOAP stands for Simple Object Access Protocol and REST stands for REpresentational State Transfer.
	//SOAP is a protocol, whereas REST is an architectural style
    //SOAP uses only XML for exchanging information in its message format whereas REST is not restricted
	//to XML and its the choice of implementer which Media-Type to use like XML, JSON, Plain-text.
	//Moreover, REST can use SOAP protocol but SOAP cannot use REST.
	
	
	
	
	
	//Q3. What are servlets ? What is the role of request Dispatcher Servlet.
	//The RequestDispatcher is an Interface that comes under package javax.servlet. 
	//Using this interface we get an object in servlet after receiving the request. Using the
	//RequestDispatcher object we send a request to other resources which include (servlet, HTML 
	//file, or JSP file). A RequestDispatcher object can be used to forward a request to the resource 
	//or to include the resource in a response. The resource can be dynamic or static.


}
