package FLBook;


	import java.sql.*;

	public class FlightDAO {
		public void displayBusInfo() throws SQLException {
			String query = "Select * from Flight";
			Connection con = DbConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("Flight No: " + rs.getInt(1));
				if(rs.getInt(2)==0)
					System.out.println("AC: no ");
				else
					System.out.println("AC: yes ");
				System.out.println("Capacity: " + rs.getInt(3));
			}
			
			System.out.println("------------------------------------------");
		}
		
		public int getCapacity(int id) throws SQLException {
			String query = "Select capacity from Flight where id=" + id;
			Connection con = DbConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			return rs.getInt(1);
		}
	}


