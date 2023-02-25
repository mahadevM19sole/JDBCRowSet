import javax.sql.rowset.*;
import oracle.jdbc.rowset.*;
class TestJdbcRowSet
{
     public static void main(String args[])
   {
      try
      {
           
             javax.sql.rowset.JdbcRowSet jrs=new OracleJDBCRowSet();
             jrs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
                 jrs.setUsername("scott");
                 jrs.setPassword("tiger");
                  jrs.setCommand("select * from student");
                  jrs.execute();
                while(jrs.next())
             {
                    System.out.print(jrs.getInt("rollno")+"\t");
                      System.out.print(jrs.getString("name")+"\t");
                   System.out.println(jrs.getInt("mark")+"\t");
                   }
          }
      catch(Exception e)
         {
                  System.out.println(e);
             }
       }
 }
