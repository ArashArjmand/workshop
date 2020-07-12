package com.company.model.repository;

import com.company.model.entity.FileEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FileRepository implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public FileRepository() throws Exception{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "arash" , "myjava123");
        connection.setAutoCommit(false);
    }

    public void insert(FileEntity entity) throws Exception{
        preparedStatement = connection.prepareStatement("insert into notes(file1, file2, file3) values (?, ?, ?)");
        preparedStatement.setString(1, entity.getContent1());
        preparedStatement.setString(2, entity.getContent2());
        preparedStatement.setString(3, entity.getContent3());
        preparedStatement.executeUpdate();
    }

    public void commit() throws Exception{
        connection.commit();
    }

    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
