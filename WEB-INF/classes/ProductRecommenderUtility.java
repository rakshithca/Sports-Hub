import java.io.*;
import java.sql.*;
import java.io.IOException;
import java.util.*;

public class ProductRecommenderUtility{
	
	static Connection conn = null;
    static String message;
	
	public static String getConnection()
	{

		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sportshub","root","rakshu");							
			message="Successfull";
			return message;
		}
		catch(SQLException e)
		{
			 message="unsuccessful";
		     return message;
		}
		catch(Exception e)
		{
			 message="unsuccessful";
		     return message;
		}
	}

	public HashMap<String,String> readOutputFile(){

		String TOMCAT_HOME = System.getProperty("catalina.home");
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
		HashMap<String,String> prodRecmMap = new HashMap<String,String>();
		try {

            br = new BufferedReader(new FileReader(new File(TOMCAT_HOME+"\\webapps\\EWA_Project\\output.csv")));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] prod_recm = line.split(cvsSplitBy,2);
				prodRecmMap.put(prod_recm[0],prod_recm[1]);
            }
			
		} catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
		}
		
		return prodRecmMap;
	}
	
	public static Event getProduct(String Event){
		Event prodObj = new Event();
		try 
		{
			String msg = getConnection();
			String selectProd="select * from  Eventdetails where eventId=?";
			PreparedStatement pst = conn.prepareStatement(selectProd);
			pst.setString(1,Event);
			ResultSet rs = pst.executeQuery();
		
			while(rs.next())
			{	
				System.out.println("SQL"+ rs.getString("eventName"));
				prodObj = new Event(rs.getString("eventId"), rs.getString("eventName"),rs.getDouble("maxPrice"),rs.getString("eventDate"), rs.getString("eventTime"),rs.getString("subGenre"),rs.getString("genre"), rs.getString("eventImage"));
			}
			rs.close();
			pst.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Issue " + e);
		}
		return prodObj;	
	}
}