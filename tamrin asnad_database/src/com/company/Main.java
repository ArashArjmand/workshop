package com.company;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.Executor;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection connection=DriverManager.getConnection
                   ("jdbc:oracle:thin:@localhost:1521:xe","arash","myjava123");
            System.out.println("1.sabt sanad");
            System.out.println("2.virayesh sanad");
            System.out.println("3.hazf sanad");
            System.out.print("whitch one:");
            int i=scanner.nextInt();

            if (i==1)
                System.out.print("id sabt:");
             else if(i==2)
                System.out.print("id k mikhid update konid:");
             else if(i==3)
                System.out.print("id k mikhid remove konid:");

                int id=scanner.nextInt();

           switch (i){
               case 1:PreparedStatement preparedStatement=connection.prepareStatement
                       ("insert into asnad(id,name,shomarepeigiri,namemalek) values (?,?,?,?)");
               preparedStatement.setLong(1,id);
                   System.out.print("name sanad:");
                   String name=scanner.next();
                   preparedStatement.setString(2,name);
                   System.out.print("shomare peigir:");
                   int number=scanner.nextInt();
                   preparedStatement.setLong(3,number);
                   System.out.print("name malek:");
                   String name1=scanner.next();
                   preparedStatement.setString(4,name1);
                   preparedStatement.executeUpdate();
                   preparedStatement.close();break;

                case 2:PreparedStatement preparedStatement1=connection.prepareStatement
                        ("update asnad set name=?,shomarepeigiri=?,namemalek=? where id=?");
                    preparedStatement1.setLong(4,id);
                    System.out.print("name sanad:");
                    String nameup=scanner.next();
                    preparedStatement1.setString(1,nameup);
                    System.out.print("shomare peigir:");
                    int numberup=scanner.nextInt();
                    preparedStatement1.setLong(2,numberup);
                    System.out.print("name malek:");
                    String name2=scanner.next();
                    preparedStatement1.setString(3,name2);
                    preparedStatement1.executeUpdate();
                    preparedStatement1.close();break;

               case 3:PreparedStatement preparedStatement2=connection.prepareStatement("delete from asnad where id=?");
                        preparedStatement2.setLong(1,id);
                        preparedStatement2.executeUpdate();
                        preparedStatement2.close();break;

           }


        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
