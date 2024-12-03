package src;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LDB {
    String DB_URL = "jdbc:mysql://localhost:3306/java_native";
    String USER = "yale";
    String PASSWORD = "12345";
    Connection conn = null;

    public LDB(){
        boolean flag = true;
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch(Exception e){
            e.printStackTrace();
            flag = false;
        }
        if(flag){
            System.out.println("connection established");
        }
    }

    public String[][] queryFromPool(String sql) throws SQLException{

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        ResultSetMetaData md = rs.getMetaData();
        int cc = md.getColumnCount();

        List<String[]> ret = new ArrayList<>();

        while(rs.next()){
            String[] row = new String[cc];
            for(int i=0; i<cc; i++){
                row[i] = rs.getString(i+1);
            }
            ret.add(row);
        }
        return ret.toArray(new String[0][cc]);
    }
}
