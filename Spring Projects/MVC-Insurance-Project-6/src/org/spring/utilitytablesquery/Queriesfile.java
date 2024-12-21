package org.spring.utilitytablesquery;
/**
 * @author Deendayal
 * @since
 * @version 1.1.2
 */

/**
* Queriesfile is a class
* org.spring.utilitytablesquery is package name  
* all varriables are static 
*/
public class Queriesfile {
	
	/*
	 * ****************************************************************************************************************************
	 * 									Admin Login Data Table
	 * 
	 * ***************************************************************************************************************************
	 */	
	
	/**
	 *  admin123 table Name of Database
	 *  Create new admin123 Table
	 *  createtableofAdmin create new table and it is using in AdminDao class creating table
	 */
	public static String createtableofAdmin = "create table admin123"
			+ "("
			+ "adminId number(9)primary key,"
			+ "username varchar2(50),"
			+ "password varchar2(50)"
			+ ")";
	
	/**
	 *  Admin Insert Data
	 *  savecontentOfAdmin Varriable used to store data in database
	 *  admin123 table Name of Database
	 */
	public static String savecontentOfAdmin ="insert into admin123 values(adminseq.nextval,?,?)";
	
	/**
	 *  admin123 table Name of Database
	 *  Admin view Own Profile
	 *  Here viewAdminOwnProfile varriable to use view Own Profile
	 * @parm  viewAdminOwnProfile used in AdminDao Class
	 */
	public static String viewAdminOwnProfile ="select * from admin123 where adminId=?";

	/**
	 *  admin123 table Name of Database
	 *  Login of Admin using Their UserName and Password
	 *  Here loginAdminUsingLogin varriable to use view all of the agent by admin
	 * @parm  loginAdminUsingLogin used in AdminDao Class
	 */
	public static String loginAdminUsingLogin ="select username,password,adminId from admin123 where username=? and password=?";
	/*
	 * ****************************************************************************************************************************
	 * 									Policy Details by Admin
	 * 
	 * ****************************************************************************************************************************
	 */	
	
	/**
	 *  policy111 table Name of Database
	 *  Create new policy Table
	 *  createpolicytable create new table and it is using in AdminDao class creating table
	 */
	public static String createpolicytable = "create table policy111"
			+ "("
			+ "policyId number(5) primary key,"
			+ "policyName varchar(50),"
			+ "typeofcoverage varchar(50),"
			+ "durations varchar(50)"
			+ ")";
	
	/**
	 *  Admin Insert Data Of New Policy
	 *  savepolicy Varriable used to store data in database of Policy
	 *  policy111 table Name of Database
	 */
	public static String savepolicy = "insert into policy111 values(?,?,?,?)";
	
	/**
	 *  policy111 table Name of Database
	 *  view all Policies
	 * Admin can view of the policy Details after login
	 *  Here viewpolicy varriable to use view all of the policy by admin
	 * @parm  viewpolicy used in AdminDao Class
	 */
	
	public static String viewpolicy = "select * from policy111";
	
	/**
	 *  clientspolicy table Name of Database
	 *  view all Policies added By Agents Of 
	 * Admin can view of the policy Details after login
	 *  Here allpolicyByAdminDeleteView varriable to use view all of the policy by admin
	 * @parm  allpolicyByAdminDeleteView used in AdminDao Class
	 */
	
	public static String allpolicyByAdminDeleteView = "select * from clientspolicy";
	
	/*
	 * ****************************************************************************************************************************
	 * 									Agent Details by Admin
	 * 
	 * ***************************************************************************************************************************
	 */	
	
	/**
	 *  agentregister table Name of Database
	 *  Create new Agent Table
	 *  createagenttable create new table and it is using in AdminDao class creating table
	 */
	public static String createagenttable ="create table agentregister"
			+ "("
			+ "agentId number(5) primary key,"
			+ "agentName varchar(50),"
			+ "agentemail varchar(100),"
			+ "agentpassword varchar(50),"
			+ "agentcfpassword varchar(50),"
			+ "agentaddress varchar(255),"
			+ "agentgender varchar(50),"
			+ "agentpanNo varchar(10),"
			+ "agentdob varchar(50),"
			+ "agentmobNo varchar(15),"
			+ "agentstate varchar(50),"
			+ "agentpostcode number(10),"
			+ "agentcountry varchar(50)"
			+ ")";
	
	/**
	 *  agentregister table Name of Database
	 *  Admin Insert Data Of New Agent
	 *  Varriable used to store data in database of Agent
	  */
	public static String saveagentindatabase = "insert into agentregister values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	/**
	 *  agentregister table Name of Database
	 *  view all Agent
	 * Admin can view of the Agent Details after login
	 *  Here viewallagent varriable to use view all of the agent by admin
	 * @parm  viewallagent used in AdminDao Class
	 */
	public static String viewallagent ="select * from agentregister";
	
	/**
	 *  agentregister table Name of Database
	 *  view Particular Agent Using By Id
	 * Agent can view Their Profile
	 *  Here viewAgentProfileOwnLid varriable to use view Thier own profile
	 * @parm  viewAgentProfileOwnLid used in AdminDao Class
	 */
	public static String viewAgentProfileOwnLid ="select * from agentregister where agentId=?";
	
/*
 * ****************************************************************************************************************************
 * 									Client Details by Admin
 * 
 * ****************************************************************************************************************************
 */	
	/**
	 *  clientregister table Name of Database
	 *  Admin view All Clients Addred By Agent
	 *  Here viewallofPolicyHoderClient varriable to use view clients details
	 * @parm  viewallofPolicyHoderClient used in AdminDao Class
	 */
	public static String viewallofPolicyHoderClient ="select * from clientregister";
	
	/**
	 *  clientregister table Name of Database
	 *  Admin can select Clients Added By Agent
	 *  Here clientInformationselectByAdmin varriable to use delete clients details
	 * @parm  clientInformationselectByAdmin used in AdminDao Class
	 */
	public static String clientInformationselectByAdmin ="select * from clientregister where clientId=?";
	
	/**
	 *  clientregister table Name of Database
	 *  Admin can update Clients Added By Agent
	 *  Here updateclientsdetails varriable to use delete clients details
	 * @parm  updateclientsdetails used in AdminDao Class
	 */
	public static String updateclientsdetails ="update clientregister set clientName=?,clientemail=?,clientpassword=?,clientcfpassword=?,clientaddress=?,clientgender=?,clientpanNo=?,clientdob=?,clientmobNo=?,clientstate=?,clientpostcode=?,clientoccuption=?,clientincome=?,clientcountry=? where clientId=?";
	
	/**
	 *  clientregister table Name of Database
	 *  Admin can delete Clients Added By Agent
	 *  Here deleteClientByAdminUsingId varriable to use delete clients details
	 * @parm  deleteClientByAdminUsingId used in AdminDao Class
	 */
	public static String deleteClientByAdminUsingId ="delete from clientregister where clientId=?";

	
/*
 * ****************************************************************************************************************************
 * 									Insurance Details by Admin
 * 
 * ****************************************************************************************************************************
*/	
	/**
	 *  vehicles table Name of Database
	 *  Admin can view all of clients insurance
	 *  Here insurancerud varriable to use view Thier own profile
	 * @parm  insurancerud used in InsuranceviewByAdminDao Class
	 */
	public static String insurancerud = "select * from vehicles";
	
/*
 * ****************************************************************************************************************************
 * 									Client Details by Agent
 * 
 * ****************************************************************************************************************************
 */	
	
	/**
	 *  agentregister table Name of Database
	 *  Edit Particular Agent Using By Id
	 * Agent can edit Their Profile
	 *  Here agentdetailsByAgentEdit varriable to use view Thier own profile
	 * @parm  agentdetailsByAgentEdit used in AgentDao Class
	 */
	public static String agentdetailsByAgentEdit ="select * from agentregister where agentId=?";
	
	/**
	 *  agentregister table Name of Database
	 *  Edit Particular Agent Using By Id
	 * Agent can edit Their Profile
	 *  Here agenteditAftersubmitingdata varriable to use view Thier own profile
	 * @parm  agenteditAftersubmitingdata used in AgentDao Class
	 */
	public static String agenteditAftersubmitingdata ="update agentregister set agentName=?,agentemail=?,agentpassword=?,agentcfpassword=?,agentaddress=?,agentgender=?,agentpanNo=?,agentdob=?,agentmobNo=?,agentstate=?,agentpostcode=?,agentcountry=? where agentId=?";
	
	
	/**
	 *  agentregister table Name of Database
	 *  Login all Agent using Their UserName and Password
	 *  Here viewallagent varriable to use view all of the agent by admin
	 * @parm  viewallagent used in AdminDao Class
	 */
	public static String loginOfAgent = "select agentName,agentpassword,agentId from agentregister where agentName=? and agentpassword=?";
	
	
	
	/**
	 *  clientregister table Name of Database
	 *  Create New Table using newclienttable varriable
	 *  (loginOfAgent) varriable used to in AgentDao class
	 */
	public static String newclienttable ="create table clientregister"
			+ "("
			+ "clientId number(5) primary key,"
			+ "clientName varchar(50),"
			+ "clientemail varchar(100),"
			+ "clientpassword varchar(50),"
			+ "clientcfpassword varchar(50),"
			+ "clientaddress varchar(255),"
			+ "clientgender varchar(50),"
			+ "clientpanNo varchar(10),"
			+ "clientdob varchar(50),"
			+ "clientmobNo varchar(15),"
			+ "clientstate varchar(50),"
			+ "clientpostcode varchar(10),"
			+ "clientoccuption varchar(50),"
			+ "clientincome varchar(50),"
			+ "clientcountry varchar(50),"
			+ "agentId number(9),"
			+ "FOREIGN KEY (agentId) REFERENCES agentregister(agentId)"
			+ ")";
	

	/**
	 *  clientregister table Name of Database
	 *  clientsave is a static varriable
	 *  clientsave is used to save data in database
	 *  (clientsave) varriable used to in AgentDao class
	 *  clientseq.nextval used a sequence to Auto Genrate primary key in database
	 */
	public static String clientsave = "insert into clientregister values(clientseq.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	/**
	 *  clientregister table Name of Database
	 *  view all Agent
	 * Admin can view of the Agent Details after login
	 *  Here viewallagent varriable to use view all of the agent by admin
	 * @parm  viewallagent used in AdminDao Class
	 */
	public static String viewclientById = "select * from clientregister where agentId=?";

	/**
	 *  clientspolicy table Name of Database
	 * Agent can create new policy of client
	 *  Here createNewPolicyTableOfClientsInfo varriable
	 * @parm  createNewPolicyTableOfClientsInfo used in AgentDao Class
	 */
	public static String createNewPolicyTableOfClientsInfo = "create table clientspolicy"
			+ "("
			+ "policyNo number(9) primary key,"
			+ "policyDate varchar(50),"
			+ "policymaturityDate varchar(50),"
			+ "policysumInsured varchar(20),"
			+ "policypremiumAmount varchar(20),"
			+ "policycommission varchar(20),"
			+ "paymentmethod varchar(20),"
			+ "policyId number(9),"
			+ "FOREIGN KEY (policyId) REFERENCES policy111(policyId),"
			+ "agentId number(9),"
			+ "FOREIGN KEY (agentId) REFERENCES agentregister(agentId),"
			+ "clientId number(9),"
			+ "FOREIGN KEY (clientId) REFERENCES clientregister(clientId)"
			+ ")";

			
			

	/**
	 *  Admin Insert Data
	 *  savecontentOfAdmin Varriable used to store data in database
	 *  policy111 table Name of Database
	 */
	public static String allpolicydetailsAddedByAdmin ="select * from  policy111";
			
	/**
	 *  Agent Insert Data
	 *  clientsavePolicyByAgentallInfo Varriable used to store data in database
	 *  clientspolicy table Name of Database
	 */
	public static String clientsavePolicyByAgentallInfo ="insert into clientspolicy values(policyseq.nextval,?,?,?,?,?,?,?,?,?)";
	
	/**
	 *  Agent can view  Data of added by Him 
	 *  mypolicyaddedByMe Varriable used to store data in database
	 *  clientspolicy table Name of Database
	 */
	public static String mypolicyaddedByMe ="select * from  clientspolicy where agentId=?";
	
	/**
	 *  Admin can view and edit  Data of added by Agent of CLients Policy 
	 *  retrivepolicycontents Varriable used to store data in database
	 *  clientspolicy table Name of Database
	 */
	public static String retrivepolicycontents ="select * from  clientspolicy where policyNo=?";
	
	
	/**
	 *  clientspolicy table Name of Database
	 *  Edit Particular Policy of Clients Using By Id
	 * Admin can edit clients policys 
	 *  Here updateclientsPolicyByAdmin123 varriable 
	 * updateclientsPolicyByAdmin123 used in AgentDao Class
	 */
	public static String updateclientsPolicyByAdmin123 ="update clientspolicy set policyDate=?,policymaturityDate=?,policysumInsured=?,policypremiumAmount=?,policycommission=?,paymentmethod=? where policyNo=?";
	
	/**
	 *  vehicles table Name of Database
	 *  Here vehicletable varriable 
	 *  vehicletable used in VehicleInsuranceDao Class
	 */
	public static String vehicletable ="create table vehicles"
			+ "("
			+ "vehicleId number(9) primary key,"
			+ "fromdate varchar(50),"
			+ "todate varchar(50),"
			+ "dateofregister varchar(50),"
			+ "manufacturedate varchar(50),"
			+ "registerno varchar(50),"
			+ "usedfuel varchar(50),"
			+ "engineNo varchar(50),"
			+ "cublic varchar(50),"
			+ "chassisNo varchar(30),"
			+ "make varchar(20),"
			+ "model varchar(20),"
			+ "idv varchar(25),"
			+ "thirdparty varchar(50),"
			+ "servicetax varchar(20),"
			+ "total varchar(20),"
			+ "paymentMethod varchar(50),"
			+ "agentId number(9),"
			+ "FOREIGN KEY (agentId) REFERENCES agentregister(agentId),"
			+ "clientId number(9),"
			+ "FOREIGN KEY (clientId) REFERENCES clientregister(clientId)"
			+ ")";
	
	/**
	 * Using Joins
	 * Data select two tables clientsregister and agentregister 
	 * vehicles table Name of Database
	 * Here viewclientsAgentsdata varriable 
	 * viewclientsAgentsdata used in VehicleInsuranceDao Dao Class
	 */
	public static String viewclientsAgentsdata = "select c.clientId,c.clientname,a.agentid,a.agentname,a.agentemail,a.agentmobno from clientregister c inner join agentregister a on (c.agentid=a.agentid) and(c.clientId=?)";
	
	/**
	 * Using Joins
	 * Data select two tables clientsregister and agentregister 
	 * vehicles table Name of Database
	 * Here saveContentsVehiclesData varriable 
	 * saveContentsVehiclesData used in VehicleInsuranceDao Dao Class
	 */
	public static String saveContentsVehiclesData = "insert into vehicles values(seqvehicle.nextVal,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	/**
	 * Using Joins
	 * Data select two tables clientsregister and agentregister 
	 * vehicles table Name of Database
	 * Here recordSelectedFromDatabase varriable 
	 * recordSelectedFromDatabase used in VehicleInsuranceDao Dao Class
	 */
	public static String recordSelectedFromDatabase = "select * from vehicles where agentId=?";
/*
*****************************************************************************************************************************
* 									Client Login and Profiles Related Activities
* 
*****************************************************************************************************************************
*/	
	/**
	 * clientregister table Name of Database
	 * Login of Client using Their UserName and Password
	 * Here loginOfclient varriable to use view own Profile  of the Client
	 * loginOfclient used in AdminDao Class
	 */
	public static String loginOfclient ="select clientName,clientpassword,clientId from clientregister where clientName=? and clientpassword=?";

	/**
	 *  clientregister table Name of Database
	 *  Login of Client using This class select all data from Database
	 *  Here clientLoginInformationSelected varriable to use view own Profile  of the Client
	 * @parm  clientLoginInformationSelected used in AdminDao Class
	 */
	public static String clientLoginInformationSelected ="select * from clientregister where clientId=?";

	
/*
*****************************************************************************************************************************
* 									Customers Policy Enquiry Related Activities
* 
*****************************************************************************************************************************
*/	
	/**
	 * policy111 table Name of Database
	 * All policy Name selected from database using this query
	 * Here myEquirylistOfpolicies varriable to use view all of the policies for customers when they Enquiry 
	 * myEquirylistOfpolicies used in EnquiryDao Class
	 */
	public static String myEquirylistOfpolicies ="select * from policy111";
	
	/**
	 * agentregister table Name of Database
	 * All Agents Name selected from database using this query
	 * Here myAgentsselectedforEnquiry varriable to use view all of the Agents name for customers when they Enquiry 
	 * myAgentsselectedforEnquiry used in EnquiryDao Class
	 */
	public static String myAgentsselectedforEnquiry ="select * from agentregister";
	
	/**
	 *  enquirycustomers table Name of Database
	 *  (Queriesfile.tablesofenquiry) used to creating table
	 *  Queriesfile is class and tablesofenquiry is varriable name
	 *  This method return type is string
	 */
	public static String tablesofenquiry ="create table enquirycustomers"
			+ "("
			+ "enquiryId number(9) primary key ,"
			+ "customerName varchar(50),"
			+ "customaddress varchar(255),"
			+ "customMobNo varchar(15),"
			+ "enquirydate varchar(50),"
			+ "policyId number(9),"
			+ "FOREIGN KEY (policyId) REFERENCES policy111(policyId),"
			+ "agentId number(9),"
			+ "FOREIGN KEY (agentId) REFERENCES agentregister(agentId)"
			+ ")";
	
	/**
	 *  enquirycustomers table Name of Database
	 *  (Queriesfile.savecustomersenquiry) used to save data into database
	 *  Queriesfile is class and savecustomersenquiry is varriable name
	 *  This method return type is string
	 */
	public static String savecustomersenquiry ="insert into enquirycustomers values(enquirySeq.nextVal,?,?,?,?,?,?)";
	
	/**
	 * policy111 table Name of Database
	 * All policy Data selected from database using Agent Id
	 * Here agentUsingIdSelected varriable to use view all of the policies for customers when they Enquiry 
	 * agentUsingIdSelected used in EnquiryDao Class
	 */
	public static String agentUsingIdSelected ="select * from enquirycustomers where agentId=?";
	
	
/*
*****************************************************************************************************************************
* 									Agents Reply Of customers Enquiries i.e Quotations
* 
*****************************************************************************************************************************
*/	
	
	/**
	 * policy111 table Name of Database
	 * All policy Data selected from database 
	 * Here fetchdataContentsOfPolicy varriable to use view all of the policies for Agents when they Enquiry 
	 * fetchdataContentsOfPolicy used in QuotationDao Class
	 */
	public static String fetchdataContentsOfPolicy ="select * from policy111";
	
	/**
	 * enquiry table Name of Database
	 * enquiry Id selected from database 
	 * Here selectIdUsingdata varriable to use view all of the policies for Agents when they Enquiry 
	 * selectIdUsingdata used in QuotationDao Class
	 */
	public static String selectIdUsingdata ="select * from enquirycustomers where enquiryId=?";
	
	
	/**
	 * quotations table Name of Database
	 * quotations created in database 
	 * Here quotationstablescreated varriable to use creating table in database
	 * quotationstablescreated used in QuotationDao Class
	 */
	public static String quotationstablescreated ="create table quotations"
			+ "("
			+ "quotationId number(9) primary key,"
			+ "quotationAmounts varchar(50),"
			+ "replydate varchar(50),"
			+ "enquiryId number(9),"
			+ "FOREIGN KEY (enquiryId) REFERENCES enquirycustomers(enquiryId),"
			+ "policyId number(9),"
			+ "FOREIGN KEY (policyId) REFERENCES policy111(policyId)"
			+ ")";
	

	/**
	 * quotations table Name of Database
	 * quotations insert into database 
	 * Here savedataOfqoutations varriable to use insert data into database 
	 * savedataOfqoutations used in QuotationDao Class
	 * quotationSeq create new sequences
	 */
	public static String savedataOfqoutations ="insert into quotations values(quotationSeq.nextVal,?,?,?,?)";
	
	/**
	 * quotations table Name of Database
	 * quotations Retrive From database 
	 * Here retriveByAgentsTofetchquotations varriable to use Retrive data from database 
	 * retriveByAgentsTofetchquotations used in QuotationDao Class
	 */
	public static String retriveByAgentsTofetchquotations ="select * from quotations";
	
/*
*****************************************************************************************************************************
* 									Health Insurance
* 
*****************************************************************************************************************************
*/	
	/**
	 * registeragent table Name of Database
	 * particularAgentSelected Retrive From database 
	 * Here particularAgentSelected varriable to use Retrive data from database 
	 * particularAgentSelected used in HealthDao Class
	 */
	public static String particularAgentSelected ="select * from agentregister where agentId=?";
	
	/**
	 * health table Name of Database
	 * Creating New Table into database 
	 * Here talesofHealths varriable to use Creating of table in database 
	 * talesofHealths used in HealthDao Class
	 */
	public static String talesofHealths ="create table health"
			+ "("
			+ "healthId number(9) primary key,"
			+ "healthfromdate varchar(50),"
			+ "healthtodate varchar(50),"
			+ "healthopt1 varchar(20),"
			+ "healthopt2 varchar(20),"
			+ "healthopt3 varchar(20),"
			+ "healthidv varchar(50),"
			+ "healththirdparty varchar(50),"
			+ "healthservicetax varchar(50),"
			+ "paymethod varchar(20),"
			+ "agentId number(9),"
			+ "FOREIGN KEY (agentId) REFERENCES agentregister(agentId),"
			+ "clientId number(9),"
			+ "FOREIGN KEY (clientId) REFERENCES clientregister(clientId)"
			+ ")";
	
	/**
	 * health table Name of Database
	 * saveHealthdata save From database 
	 * Here saveHealthdata varriable to use save data from database 
	 * saveHealthdata used in HealthDao Class
	 */
	public static String saveHealthdata ="insert into health values(healthSeq.nextVal,?,?,?,?,?,?,?,?,?,?,?)";
	

	/**
	 * health table Name of Database
	 * saveHealthdata Retrive From database 
	 * Here saveHealthdata varriable to use retrive data from database 
	 * saveHealthdata used in HealthDao Class
	 */
	public static String seletedHealthData ="select * from health where agentId=?";
	
	/**
	 * health table Name of Database
	 * adminViewAllHealthInsurances Retrive From database 
	 * Here adminViewAllHealthInsurances varriable to use retrive data from database 
	 * adminViewAllHealthInsurances used in AdminDao Class
	 */
	public static String adminViewAllHealthInsurances ="select * from health";

/*
*****************************************************************************************************************************
* 									Health Insurance Nominees
* 
*****************************************************************************************************************************
*/	
	/**
	 * policy111 table Name of Database
	 * nomineeHealthFetchPolicy Retrive From database 
	 * Here nomineeHealthFetchPolicy varriable to use Retrive data from database 
	 * nomineeHealthFetchPolicy used in HealthNomineeDao Class
	 */
	public static String nomineeHealthFetchPolicy ="select * from policy111";
	
	/**
	 * healthnominee table Name of Database
	 * myNomineesTablesForHealth create table in database 
	 * Here myNomineesTablesForHealth varriable to use create table in database
	 * myNomineesTablesForHealth used in HealthNomineeDao Class
	 */
	public static String myNomineesTablesForHealth ="create table healthnominee"
			+ "("
			+ "healthNomineeId number(9) primary key,"
			+ "healthsumInsured varchar(20),"
			+ "healthpriemium varchar(20),"
			+ "healthnomineeName varchar(50),"
			+ "healthrelationsWithNominee varchar(50),"
			+ "policyId number(9),"
			+ "FOREIGN KEY (policyId) REFERENCES policy111(policyId),"
			+ "clientId number(9),"
			+ "FOREIGN KEY (clientId) REFERENCES clientregister(clientId)"
			+ ")";
	
	/**
	 * healthnominee table Name of Database
	 * storeContentsOfNominees save data  in database 
	 * Here storeContentsOfNominees varriable to use store data from  database
	 * storeContentsOfNominees used in HealthNomineeDao Class
	 */
	public static String storeContentsOfNominees ="insert into healthnominee values(nomineehealthSeq.nextVal,?,?,?,?,?,?)";
	
	/**
	 * healthnominee table Name of Database
	 * storeContentsOfNominees Retrive from  database 
	 * Here retriveNomineeValues varriable to use retrive from  database
	 * retriveNomineeValues used in HealthNomineeDao Class
	 */			
			
	public static String retriveNomineeValues ="select * from healthnominee where clientId=?";


/*
*****************************************************************************************************************************
* 									Vehicles Insurance Nominees
* 
*****************************************************************************************************************************
*/	
	
	/**
	 * policy111 table Name of Database
	 * nomineeHealthFetchPolicy Retrive From database 
	 * Here nomineeHealthFetchPolicy varriable to use Retrive data from database 
	 * nomineeHealthFetchPolicy used in HealthNomineeDao Class
	 */
	public static String nomineeVehiclesFetchPolicy ="select * from policy111";
	
	/**
	 * vehiclenominee table Name of Database
	 * myNomineesTablesForVehicles create table in database 
	 * Here myNomineesTablesForVehicles varriable to use create table in database
	 * myNomineesTablesForVehicles used in HealthNomineeDao Class
	 */
	public static String myNomineesTablesForVehicles ="create table vehiclenominee"
			+ "("
			+ "healthNomineeId number(9) primary key,"
			+ "healthsumInsured varchar(20),"
			+ "healthpriemium varchar(20),"
			+ "healthnomineeName varchar(50),"
			+ "healthrelationsWithNominee varchar(50),"
			+ "policyId number(9),"
			+ "FOREIGN KEY (policyId) REFERENCES policy111(policyId),"
			+ "clientId number(9),"
			+ "FOREIGN KEY (clientId) REFERENCES clientregister(clientId)"
			+ ")";
	
	/**
	 * healthnominee table Name of Database
	 * storeContentsOfNominees save data  in database 
	 * Here storeContentsOfNominees varriable to use store data from  database
	 * storeContentsOfNominees used in HealthNomineeDao Class
	 */
	public static String datasaveforVehicles ="insert into vehiclenominee values(nomineevehicleSeq.nextVal,?,?,?,?,?,?)";
	
	/**
	 * healthnominee table Name of Database
	 * storeContentsOfNominees Retrive from  database 
	 * Here retriveNomineeValues varriable to use retrive from  database
	 * retriveNomineeValues used in HealthNomineeDao Class
	 */		
			
	public static String retriveNomineeValuesforVehcles ="select * from vehiclenominee where clientId=?";
}
