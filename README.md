# spring-and-hibernate

uses spring to create an hibernate orm for city state and country.
and deploy it as a web application who's output is the list of countires that are stored in the database

A Maven build is used to get all the .jar files for both spring and hibernate
The Hibernate session factory is created using bean injection using the spring framework
the mappings are also done by using beans. The application-config.xml present under resources file
cointians all  the details of the beans and their configuration.It cnsists of a bean to configure 
the database, a bean to configure session factory for hibernate and The final load bean id is assigned
to the Application class taking the session factory as reference.

The basic sutructure if the project contains of 3 pojo classes viz country state and city
which are mapped to hiberntae using annotations. These classes are packaged into com.lumiplan.entity
mapping details are provided in the application-config.xml . The Applicaion class is packaged into 
com.lumiplan.dao it initializes the session factory and loads data from the database. it contains
two methods, one to load countries and the other to load state with their respective state id and
countries. The package com.lumiplan.controller contains two classes, a Main for offline execution 
which calls the the load bean and initialzes the application class and invokes the displayState()
method

A servlet is provided to run it as a web application. The project has to built using a maven build
and has to be deployed on a server. Only tomcat7 plugin has been provided in the project.
Once tomcat7 starts running and browser is opened the localhost:<port-number>/<project-name>
will display the welcome page provided in the webapps forlder in src. A a href tag has been provided to
the servlet which displays the list of countries


