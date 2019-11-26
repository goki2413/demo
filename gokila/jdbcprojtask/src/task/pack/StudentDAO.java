package task.pack;
import java.sql.*;

public class StudentDAO {
	Connection c=null;
	Statement s=null;
	int i;
	
	  public int insert(Student stud){
		  
		  try{
			  c=MySqlConn.getCon();
			  PreparedStatement pst=c.prepareStatement("insert into details(id,name) values(?,?)");
			  pst.setInt(1,stud.getId());
			  pst.setString(2,stud.getName());
			  //System.out.println("inserted");
			   i=pst.executeUpdate();
			  s=c.createStatement();
			  ResultSet rs=s.executeQuery("select * from details");
			  while(rs.next()){
				  System.out.println(rs.getInt(1)+" "+rs.getString(2));
			  }
			  rs.close();
			  pst.close();
			  
			  }
		  catch(SQLException e){
			  System.out.println(e);
		  }
		  /*finally{
			
			  try{
					c.close();
				
				}
				
				catch(SQLException e){
					e.printStackTrace();
				}
			}
			  
			   
*/
		  return i;
	  }
	  
		 public int update(Student stud){
			  try{
				  c=MySqlConn.getCon();
				  PreparedStatement pst=c.prepareStatement("update details set name=? where id=?");
				  pst.setString(1,stud.getName());
				  pst.setInt(2,stud.getId());
			      //System.out.println("updated");
				   i=pst.executeUpdate();
				  s=c.createStatement();
				  ResultSet rs=s.executeQuery("select * from details");
				  while(rs.next()){
					  System.out.println(rs.getInt(1)+" "+rs.getString(2));
				  }
				  rs.close();
				  pst.close();
				  }
			  catch(SQLException e){
				  System.out.println(e);
			  }
			  /*finally{
				  try{
						c.close();
						
						
					}
					
					catch(SQLException e){
						e.printStackTrace();
					}
				}
				  */
			  
			  return i;
			  
	  }
		  void close() throws SQLException{
			  c.close();
		  }
		  
}	
		  
	  
	
	
	
	
	
	
	
	
	
	
	
	
	


