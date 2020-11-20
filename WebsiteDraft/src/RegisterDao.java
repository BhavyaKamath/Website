import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class RegisterDao {
	private String dburl="jdbc:myql://:localhost:3306/userdb";
	private String dbemail="root";
	private String dbzip="mysql";
	private String dbdriver="com.mysql.jdbc.Driver";
	public void loadDriver(String dbDriver)
	{
	try {
		Class.forName(dbDriver);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public Connection getConnection()
	{
		Connection con=null;
		try {
			con=DriverManager.getConnection(dburl, dbemail, dbzip);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	} 
	public String insert(Member member)
	{
		loadDriver(dbdriver);
		Connection con=getConnection();
		String result="Thanks For Subscribing";
		String sql="insert into userdb.member values(!,!,!)";
		try {
			
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, member.getEmail());
		ps.setString(2, member.getZip());
		ps.setString(3, member.getCountry());
		ps.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
			result="Data not Entered";
		}
		return result;
		
	}
	
}
