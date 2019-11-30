# Sports-Hub
Full Stack Website Similar to StubHub developed using Java, Servlets, HTML/CSS

______________________________________________________________________________

Sports Hub User Document:
______________________________________________________________________________

1.	How many total lines of code written (Java and Javascript source code) ?
	
	Total lines of code written:
		1.) Java       : 10820
		2.) JavaScript : 486

------------------------------------------------------------------------------------------------------------------------------------------------

2.)What assignment features implemented in the project?
	a.) Servlet Based Web Application
	b.) Usage of plain text file to fetch data
	C.) Implementation of CRUD operations in SQL database
	d.) Implementation of NoSQL database (MongoDB)      
	e.) Trending & Data Analytics feature
	f.) All new code added for MySQL shall be placed in a class called MySQLDataStoreUtilities.java
	g.) All new code added for MongoDB shall be placed in a class called MongoDBDataStoreUtilities.java
	h.) Generation of transaction reports
	j.) Search Auto-Completion feature
	k.) Data Exploration feature
	l.) Implementation of Python and Twitter API
	m.) Recommendation feature(Latest News)
	n.) Implentation of JS, JQuery, JSP, Java, Python, SQL, NoSQL, Tomcat, BootStrap, AJAX, HTML, CSS, Servlets
 	o.) Carousel feature

------------------------------------------------------------------------------------------------------------------------------------------------	

3.)Instructions on how to deploy and run this project:

	1. Start tomcat server
	2. Copy "SportsHub" folder to the tomcat webapps folder.
	3. Start the MySQL database with database name as sportshub. The username is root and password is admin to connect to the MySQL DB.
	4. Start the MongoDB server with mongo.exe and mongod.exe with database name as complaint and collection name as complaintStored.
	5. In order to start the application open the browser and type http://localhost/EWA_Project or http://localhost/EWA_Project/Home.

----------------------------------------------------------------------------------------------------------------------------------------------------
Note:

To compile Java files, use this command:
javac *.java

If in case it doesn't work then, use the following cmd:

javac -cp "C:/apache-tomcat-7.0.34/lib/mongo-java-driver-3.2.2.jar;C:\apache-tomcat-7.0.34\lib\servlet-api.jar;C:\apache-tomcat-7.0.34\lib\mysql-connector-java-5.1.23-bin.jar;C:\apache-tomcat-7.0.34\lib\gson-2.6.2.jar;" *.java
------------------------------------------------------------------------------------------------------------------------------------------------------
Role Information
______________________________________________________________________________
There are two ROLES:
a. Customer
b. Store Manager
______________________________________________________________________________

a.) Customer:

For testing purposes you can give as:
User Name: user
Password:  user

Customer can,

1.> Buy tickets 
2.> View and Canacel order
3.> Write and View Review
4.> Search for different events 
5.> Buy tickets for different cities
6.> Log out 

_________________________________________________________________________________

b.) Manager:
__________________________________________________________________________________
User Name: admin
Password:  admin


Manager can,

1.> Create New customer 
2.> Create New Event
3.> Update a Event 
4.> Delete a Event 
5.> Can access sales report
6.> Can view data analytics reports
7.> Can modify customer orders
8.> Log out
