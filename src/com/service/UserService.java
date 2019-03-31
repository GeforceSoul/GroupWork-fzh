package com.service;

import java.sql.*;


public class UserService {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/web?serverTimezone=GMT%2B8";
 
    // 数据库的用户名与密码，需要根据自己的设置
    static final String DB_USER = "root";
    static final String DB_PASS = "1181207784";

    private Connection conn = null;

    public UserService(){

        //加载数据库驱动

        try {

        	Class.forName("com.mysql.jdbc.Driver");

            System.out.println("加载驱动成功");

        } catch (Exception e) {

            e.printStackTrace();

            System.err.println("数据库驱动加载失败");

        }

        //获取数据库链接

        try {

        	conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);

        } catch (SQLException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

            System.err.println("获取数据库链接失败");

        }

    }

    //执行各种SQL语句的方法

    private ResultSet execSQL(String sql,Object... args) throws SQLException{

        //建立PreparedStatement对象

        PreparedStatement pStmt = conn.prepareStatement(sql);

        //为pStmt对象设置SQL参数值

        for(int i = 0; i < args.length; i++){

            pStmt.setObject(i+1, args[i]);

        }

        //执行SQL语句

        pStmt.execute();

        //返回结果集,如果执行的SQL语句不返回结果集，则返回null

        return pStmt.getResultSet();

    }

    public String checkUser(String username,String password){

    	
        ResultSet rs = null;

        try {

            rs = execSQL("SELECT UserName,PassWord FROM user");

        } catch (SQLException e) {

            System.err.println("查询数据库出错");

            e.printStackTrace();

            return null;

        }

        try {

            while(rs.next()){

                String temp_username = rs.getString("UserName").trim();

                String temp_password = rs.getString("PassWord").trim();

                if(username.equals(temp_username)){

                    

                    if(password.equals(temp_password)){

                        
                    	
                        return "hasUserNameAndPasswordCorrect";

                    }

                    return "hasUserNameButPasswordInCorrect";

                }

            }

        } catch (SQLException e) {

            System.err.println("操作ResultSet出错");

            e.printStackTrace();

        }

        return "hasNoUserName";

    }

}