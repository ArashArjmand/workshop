package com.company.Model.Repository;

import com.company.Model.Entity.PoshakEnti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PoshakRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public PoshakRepo()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection
                ("jdbc:oracle:thin:@localhost:1521:xe","arash","myjava123");
    }
        public void insert(PoshakEnti poshakEnti)throws Exception{
            preparedStatement=connection.prepareStatement
                    ("insert into cloth(id,name,gheimat,color)values (?,?,?,?)");
            preparedStatement.setString(1,poshakEnti.getId());
            preparedStatement.setString(2,poshakEnti.getName());
            preparedStatement.setString(3,poshakEnti.getGheimat());
            preparedStatement.setString(4,poshakEnti.getColor());
            preparedStatement.executeUpdate();
        }
        public void update(PoshakEnti poshakEnti)throws Exception{
            preparedStatement=connection.prepareStatement("update cloth set name=?,gheimat=?,color=? where id=?");
            preparedStatement.setString(1,poshakEnti.getName());
            preparedStatement.setString(2,poshakEnti.getGheimat());
            preparedStatement.setString(3,poshakEnti.getColor());
            preparedStatement.setString(4,poshakEnti.getId());
            preparedStatement.executeUpdate();
        }
        public void delete(String id)throws Exception{
            preparedStatement=connection.prepareStatement("delete from cloth where id=?");
            preparedStatement.setString(1,id);
            preparedStatement.executeUpdate();
        }

        public void commit()throws Exception{
            connection.commit();
        }
        public void Rollback()throws Exception{
            connection.rollback();
        }
    @Override
    public void close() throws Exception {
        connection.close();
        preparedStatement.close();
    }
}
