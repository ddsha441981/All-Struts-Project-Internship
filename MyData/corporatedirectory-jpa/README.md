corporatedirectory-jpa
======================

This example replaces the in-memory data structure of the Employee Service example with a database using JPA.

Prerequisites
=============
1. Connection credentials to Oracle Cloud Database Service  
2. Oracle.com SSO user id/password for access to the public Oracle Maven Repository required by the build

Setup Database
--------------

You will need to create an `employee` user with password `employee` in your DBCS PDB.  This user will need rights to create and drop schema.  Once the user is created the application will take care of table creation and population.


Encrypt Oracle.com SSO credentials
----------------------------------

This example uses the public Oracle Maven Repository which requires users to accept the terms and conditions and to authenticate when accessed.

To register and accept terms and conditions go to http://www.oracle.com/webapps/maven/register/license.html

Once you have done so you must configure local Maven to use your SSO credentials to access the repository. (See http://docs.oracle.com/cloud/latest/devcs_common/CSDCS/GUID-2C6E3DAA-E148-4D21-8507-3ECFB99E15C2.htm#CSDCS-GUID-E20C1FB7-FB70-41D9-A664-20387754647B). 

Building the Application Locally
--------------------------------

To build the application run `mvn clean package`. 
The output is a zip file in the target folder that is ready to deploy to ACCS.

Setup the Application Environment
---------------------------------

Application environment needs to be configured prior to deployment.
You will specify environment variable in Eclipse UI when adding project to ACCS in Cloud View.
(Eclipse will populate the values stored in application.properties, if the file is found in project. ) 

The application requires following environment variables (see EmployeeService.java) to log in:

    DBAAS_DEFAULT_CONNECT_DESCRIPTOR
    DBAAS_USER_NAME
    DBAAS_USER_PASSWORD

If the application failed to connect to database at runtime, please go to the ACCS service console 
and review the service binding to your DBCS instance. 

Note: You can test the application locally by running the application locally and defining the required environment variables in the Eclipse Launch Configuration dialog.  
(Eclipse will populate the values stored in application.properties, if the file is found in project. ) 

