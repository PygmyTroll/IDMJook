#README
##Instructions
*Step 0* : install a MySQL database server.
In my case I chose [MAMP](http://www.mamp.info/en/).

*Step 1* : load the file  ``` database.sql ``` into MAMP.
Go to ```phpMyAdmin``` and ```import```, select the database and it's done.

*Step 2* : import the project in your favorite IDE
Eclipse: Import -> Maven ->  Existing Maven Prjoect

*Step 3* : Check your configuration in MAMP
a) MySQL port : Preferences -> Port
b) You have to change the variables for the connection to the database. In MAMP you can see these variables in the start page.
After that you have to change the variables in ```App.java```file.

```Java
       Connection co = null;
       //@TODO : change here
       String user = "root";
       //@TODO : change here
       String pwd ="root";
       //@TODO : change the port
       String url ="jdbc:mysql://localhost:8889/BASE_IDM";
```

*Step 4*:  Run the project.


> Written with [StackEdit](https://stackedit.io/).
