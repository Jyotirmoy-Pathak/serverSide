import java.sql.*;
class databasemanager{
	public static void main(String args[]){
		getpassengerDetails1 pd = new getpassengerDetails1();
	}
}
class getpassengerDetails1{
String name;
int age;
String start;
String end;
String PNRno;
int seatNo;
Statement stmt;
Connection con;

getpassengerDetails1(){
	con=null;
	stmt=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/backend","root","123456789");
		//PreparedStatement ps = connection.prepareStatement("CREATE DATABASE sonoo");
		//int result = ps.executeUpdate();
		stmt = con.createStatement();
		System.out.println("Connected to local mysql database successfully!");
		

        }
    catch(Exception e){
    System.out.println("Unable To Create DataBase Connection");
    e.printStackTrace();
    }

}
 /*ResultSet getDetails(){
 	ResultSet set = null;
 	try{
 		set = stmt.executeQuery("select * from passengerinfo order by seatno asc");
 	}
 	catch(Exception e){
 		System.out.println("DataBaseManager_getpassengerDetails_getDetails() Failed");
 	}
 	return set;
 }*/

 ResultSet GetPassengerDetailsAtSeat(void){
 	ResultSet res = null;
 	try{
 		stmt.executeQuery("select * from passengertable;" );
 		return res;
 	}
 	catch(Exception e){
 		e.printStackTrace();
 	}
 	return res;
 } 


 
}	     