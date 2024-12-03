import src.LDB;

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

        // try{
            
        // }catch(Exception e){
        //     e.printStackTrace();
        // }
    }
}
