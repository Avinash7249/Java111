package com.Question1;

public class Demo {
	
//	a) @Service:this is Stereotype annotations ,in this class contains the main business logic.
	
//	b) @component: this is Stereotype annotations and it is base/super annotation of the remaining 
//     @Repository ,@Controller and @Service annotations.
	
//	c) @Autowired: this is Auto-wiring annotations and it it is used in this way
	   //@Autowired (on variable(ref type) or setter or on constructor of a bean.
       //@Autowired(Required = false) for null
	
//	d) @Component Scan:In this feature spring container enters into a package (base package) and it will search for that
	//package and all its sub-packages for a class, which is annotated with stereotype annotation, and pick
	//those classes, create those object and register those objects as a "spring bean" with them(container).
	//<context:component-scan base-package="com.masai" />
	
//	e) @Bean:@Bean annotation has the same role as the <bean/> element.
	// Classes annotated with @Configuration allow to define inter-bean dependencies by
	//simply calling other @Bean methods in the same class.
	
//	f) @value:This annotation is used to inject simple values type variables.
	//e.g:@Value("100") int roll=100;

}
