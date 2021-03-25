package com.pn.Drive;

import com.mysql.jdbc.Connection;
import org.junit.Test;

import java.sql.DriverManager;
import java.sql.SQLException;

public class junit {
//    不用new一个对象来调test方法可直接调用,只在方法上有效

    @Test
    public void test()  {
        System.out.println("hello");
        //配置信息
        String url="jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8";
        String username="root";
        String password="123456";
        Connection connection=null;
       try { //1.加载驱动
           Class.forName("com.mysql.jdbc.Driver");
           //2.连接数据库，代表数据库

            connection = (Connection) DriverManager.getConnection(url, username, password);
           //3.通知数据库开启事务 false开启
           connection.setAutoCommit(false);
           String sql1 = "update account set money=money-100 where name='A';";
           connection.prepareStatement(sql1).executeUpdate();
           //制造错误
           //int i=1/0;
           String sql2 = "update account set money=money-100 where name='B';";
           connection.prepareStatement(sql2).executeUpdate();
           connection.commit();
           System.out.println("提交成功");
       } catch (Exception e){
           try{//如果出现异常就通知数据库回滚事务
               connection.rollback();
           }catch (SQLException e1){
               e1.printStackTrace();
           }
           e.printStackTrace();
       }finally {
           try{
               connection.close();
           }catch (SQLException e){
               e.printStackTrace();

           }
       }
    }

}
