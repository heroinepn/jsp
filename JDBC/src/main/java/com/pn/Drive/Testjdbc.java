package com.pn.Drive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Testjdbc {
    public static void main(String[] args)throws Exception {
        //配置信息
        String url="jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8";
        String username="root";
        String password="123456";
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.连接数据库，代表数据库
        Connection connection = DriverManager.getConnection(url, username, password);
        //3.向数据库发生SQL的对象 crud创建：Create， 读取：Read，更新：Update，删除： Delete)
        Statement statement = connection.createStatement();

        //4.编写sql
        String sql="select * from smbms_user;";
        //String sql="delete from smbms_user where id=1"
        System.out.println("受行数的影响，增删改都是用executeUpdate");
       // int i = statement.executeUpdate();
        //5.执行查询sql，返回一个resultSet结果集
        ResultSet rs = statement.executeQuery(sql);

        while(rs.next()){
            System.out.println("id="+rs.getObject("id"));
            System.out.println("userCode="+rs.getObject("userCode"));
            System.out.println("userName="+rs.getObject("userName"));
            System.out.println("userPassword="+rs.getObject("userPassword"));
            System.out.println("gender="+rs.getObject("gender"));

        }
       //6.关闭连接，释放资源 先开后关
        rs.close();
        statement.close();
        connection.close();



    }


}
