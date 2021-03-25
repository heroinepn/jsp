package com.pn.Drive;

import java.sql.*;

public class Testjdbc2 {
    public static void main(String[] args)throws Exception {
        //配置信息
        String url="jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8";
        String username="root";
        String password="123456";
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.连接数据库，代表数据库
        Connection connection = DriverManager.getConnection(url, username, password);
        //3.编写sql
        String sql="select * from smbms_user;";
        //String sql="insert into smbms_user（id,)values(?,?,?,?);";

        //4.预编译
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //preparedStatement.setInt(1,1);//给第一个占位符？的值赋值为1

        //5.执行查询sql，返回一个resultSet结果集

        int i = preparedStatement.executeUpdate();
        if (i>0){
            System.out.println("插入成功");
        }
        //6.关闭连接，释放资源 先开后关

        preparedStatement.close();
        connection.close();



    }


}
