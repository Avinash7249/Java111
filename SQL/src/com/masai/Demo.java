//package com.masai;
//
//public class Demo {
//	
//	
//    Basic SQL II
//
//1. Count the number of students of each department.
//ans:
//SELECT BRANCH,COUNT(*) FROM STUDENT GROUP BY BRANCH;
//
//select branch , count(branch) from student group by branch;
//
//
//
//
//2. Count the number of students of each department where the department name starts with ‘E’.
//ans: select branch , count(branch) from student  where branch like 'e%';
//SELECT NAME,BRANCH,COUNT(BRANCH) FROM STUDENT WHERE BRANCH LIKE 'E%' GROUP BY NAME,BRANCH;
//
//3. Add a field called MARKS to the table STUDENT which can hold a number upto 8 digit length.
//ans:ALTER TABLE STUDENT ADD(MARKS int(8));
//
//
//
//4. Modify the field :”NAME” of the table STUDENT to hold a maximum of 25 character.
//ans:ALTER TABLE STUDENT change name sname VARCHAR(25);
//ALTER TABLE STUDENT MODIFY NAME VARCHAR(25);
//
//5. Delete all rows from the table STUDENT where branch is ETC.
//ans:DELETE FROM STUDENT WHERE BRANCH='ETC';
//
//
//6. Rename the table STUDENT to STUDINFORMATION.
//ans:
//
//ALTER TABLE STUDENT RENAME TO STUDINFORMATION;
//
//
//7. Delete all the data part from the table STUDENT.
//ans;DELETE FROM  STUDINFORMATION;
//
//
//8. Destroy the table STUDENT.
//ans:DROP TABLE STUDINFORMATION;
//
//        Basic SQL I
//
//
//
//1. Create the following table according to the following information
//
//** create table DEPOSIT (ACTNO VARCHAR(25),CNAME VARCHAR (20),BNAME VARCHAR(20),AMOUNT int,ADATE DATE);
//
//**create table BRANCH (BNAME VARCHAR(20),CITY  VARCHAR (20));
//
//**create table CUSTOMER (CNAME VARCHAR(20),CITY  VARCHAR (20));
//
//**create table BORROW  (LOANNO VARCHAR(5), CNAME VARCHAR(20),BNAME VARCHAR(20),AMOUNT int);
//
//
//2. Describe the tables which are already created.
//ans:
//desc borrow;
//desc CUSTOMER;
//desc DEPOSIT;
//desc BRANCH;
//
//3. Insert the data as for the following
//ans:
//
//insert into DEPOSIT values 
//(100, 'ANIL', 'VRCE', 1000, '1995-03-01'),
//(101 ,'SUNIL', 'AJNI', 5000, '1996-01-04'),
//(102, 'MEHUL', 'KAROLBAGH', 3500, '1995-11-17'),
//(104, 'MADHURI', 'CHANDI', 1200, '1995-12-17'),
//(105, 'PRAMOD', 'M.G.ROAD', 3000, '1996-03-27'),
//(106, 'SANDIP', 'ANDHERI', 2000, '1996-03-31'),
//(107 ,'SHIVANI', 'VIRAR', 1000, '1995-09-05'),
//(108, 'KRANTI', 'NEHRU PLACE', 5000, '1995-07-02'),
//(109, 'MINU', 'POWAI', 7000, '1995-08-10' );
//
//insert into BORROW values 
//(201, 'ANIL', 'VRCE', 1000),
//(206, 'MEHUL', 'AJNI', 5000),
//(210,'amit', 'karolbagh',4550),
//(311, 'SUNIL', 'DHARAMPETH', 3000),
//(321, 'MADHURI', 'ANDHERI', 2000),
//(375, 'PRAMOD', 'VIRAR', 8000.00),
//(217, 'hetal','karolbagh',4900 ),
//(481, 'KRANTI' ,'NEHRU PLACE', 3000),
//(209, 'manek', 'VRCE', 8000);
//
//insert into CUSTOMER values
//('ANIL', 'CALCUTTA'),
//('SUNIL' ,'DELHI'),
//('MEHUL' ,'BARODA'),
//('MANDAR', 'PATNA'),
//('MADHURI' ,'NAGPUR'),
//('PRAMOD' ,'NAGPUR'),
//('SANDIP', 'SURAT'),
//('SHIVANI' ,'BOMBAY'),
//('KRANTI' ,'BOMBAY'),
//('NAREN' ,'BOMBAY');
//
//4.Retrieve all the records from the table BORROW where amount in between
//2000 and 3000
//ans:select * from borrow where amount between 2000 and 3000;
//
//
//
//5. Retrieve the details from the table DEPOSIT
//ans:select * from deposit;
//
//6. Retrieve the customer name, account no of DEPOSIT
//ans:select CNAME, ACTNO from deposit ;
//
//
//
//7. Retrieve the name of the customer living in NAGPUR.
//ans:SELECT CNAME FROM CUSTOMER  WHERE CITY='NAGPUR';
//
//8. Retrieve the name of the customers who opened account after 17-NOV-95.
//ans:
//SELECT CNAME FROM DEPOSIT WHERE ADATE>'17-NOV-95';
//
//
//9. Retrieve the account number and amount of the customer having account opened between
//01-12-95 and 01-06.96.
//SELECT CNAME,ACTNO,AMOUNT FROM DEPOSIT WHERE ADATE BETWEEN '1995-12-01' AND '1996-06-01';
//
//
//10. Retrieve all the records from the table DEPOSIT where CNAME begins
//with C.
//SELECT * FROM DEPOSIT WHERE CNAME LIKE 'C%';
//
//
//
//11. Retrieve all the records from the table BORROW where 2nd character of
//CNAME is U.
//SELECT * FROM BORROW WHERE CNAME LIKE '_U%;
//
//12. Retrieve all the records from the table DEPOSIT where branch name is
//CHANDNI or MGROAD.
//SELECT * FROM DEPOSIT  WHERE BNAME IN('CHANDNI' , 'MGROAD');
//
//13. Retrieve all the records from the table DEPOSIT where branch name is not
//CHANDNI or MGROAD.
//SELECT * FROM DEPOSIT WHERE NOT(BNAME IN('CHANDNI' ,'MGROAD'));
//
//
//
//14. Retrieve all the records from DEPOSIT where amount > 1000 and arrange the customer name in
//ascending order.
//SELECT * FROM DEPOSIT WHERE AMOUNT>1000 ORDER BY CNAME ASC;
//
//15. Retrieve all the records from DEPOSIT where amount > 1000 and arrange the customer name in
//descending order.
//SELECT * FROM DEPOSIT_1929302 WHERE AMOUNT>1000 ORDER BY CNAME DESC:
//
//16. Retrieve customer details from BORROW table where the third character of
//the customer name is either ‘A’ or ‘D’.
//SELECT * FROM BORROW  WHERE CNAME LIKE ' A%' OR CNAME LIKE ' D%';
//
//
//17. Retrieve all the records from the table BORROW where amount is not
//between 2000 and 8000.
//SELECT * FROM BORROW_1929302 WHERE NOT(AMOUNT BETWEEN 2000 AND8000);
//
//18. Find out the unique records from the table DEPOSIT
//SELECT DISTINCT ACTNO,CNAME,BNAME,AMOUNT,ADATE FROM DEPOSIT;
//
//
//
//19. Update the amount of all depositors in deposit table by giving them 10% interest (i.e.
//amount=amount * 0.1) where branch is VRCE.
//
//UPDATE DEPOSIT SET AMOUNT=AMOUNT*0.1 WHERE BNAME='VRCE';
//
//20. Update the amount of all depositors in deposit table by giving them 10% interest where
//branch is VRCE and customer name ANIL.
//
//UPDATE DEPOSIT SET AMOUNT=AMOUNT*0.1 WHERE BNAME='VRCE' AND CNAME='ANIL';
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
