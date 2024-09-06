package dao;
import java.sql.*;

public static class ConexaoMysql(){
    public Connection getConexao() throws Exception{
    return DriveManager.getConnection("jdcb:mysql://localhost:3306/db_ecommerce","root","");
    }

}