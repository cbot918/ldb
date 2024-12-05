import src.LDB;
import redis.clients.jedis.Jedis;


public class Main {
    public static void main(String[] args) throws Exception{
        
        System.out.println("hihi");

        LDB ldb = new LDB();
        String sql = "select id, firstname, lastname, age from Employees";
        String[][] ret = null;
        ret = ldb.queryFromPool(sql);

        for(int i=0; i<ret.length; i++){
            String id = ret[i][0];
            String firstname = ret[i][1];
            String lastname = ret[i][2];
            String age = ret[i][3];

            System.out.println(id+" "+firstname+" "+lastname+" "+age+" ");
        }

        
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.auth("12345");
        System.out.println("服務執行中: "+jedis.ping());

        // try{
            
        // }catch(Exception e){
        //     e.printStackTrace();
        // }
    }
}
