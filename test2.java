import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;

public class test2 {

  public static void main(String[] args) throws ClassNotFoundException {
    Class.forName(null);

    SQLData s = new SQLData() {
      @Override
      public String getSQLTypeName() throws SQLException {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public void readSQL(SQLInput arg0, String arg1) throws SQLException {
        // TODO Auto-generated method stub

      }

      @Override
      public void writeSQL(SQLOutput arg0) throws SQLException {
        // TODO Auto-generated method stub

      }
    };
  }
}
