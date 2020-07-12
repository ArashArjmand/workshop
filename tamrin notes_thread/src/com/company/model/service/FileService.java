package com.company.model.service;

import com.company.model.entity.FileEntity;
import com.company.model.repository.FileRepository;

import java.io.File;
import java.io.IOException;

public class FileService {
    private static FileService ourInstance = new FileService();

    public static FileService getInstance() {
        return ourInstance;
    }

    private FileService() {
    }

    private void thecontent(FileEntity entity) throws Exception{
        try {
            File file1 = new File(entity.getAddress1());
            java.io.FileReader fileReader = new java.io.FileReader(file1);
            int ascii = fileReader.read();
            String content = "";
            while (ascii != -1) {
                content +=(char) ascii;
                ascii = fileReader.read();
            }
            fileReader.close();
            entity.setContent1(content);
            System.out.println(content);
        } catch (IOException e){
            e.getMessage();
        }
        try {
            File file2 = new File(entity.getAddress2());
            java.io.FileReader fileReader = new java.io.FileReader(file2);
            int ascii = fileReader.read();
            String content = "";
            while (ascii != -1) {
                content +=(char) ascii;
                ascii = fileReader.read();
            }
            fileReader.close();
            entity.setContent2(content);
            System.out.println(content);
        } catch (IOException e){
            e.getMessage();
        }
        try {
            File file3 = new File(entity.getAddress3());
            java.io.FileReader fileReader = new java.io.FileReader(file3);
            int ascii = fileReader.read();
            String content = "";
            while (ascii != -1) {
                content +=(char) ascii;
                ascii = fileReader.read();
            }
            fileReader.close();
            entity.setContent3(content);
            System.out.println(content);
        } catch (IOException e){
            e.getMessage();
        }
    }

    public void save(FileEntity entity) throws Exception{
        synchronized (this) {
            FileRepository repository = new FileRepository();
            thecontent(entity);
            System.out.println("3 files copied");
            repository.insert(entity);
            repository.commit();
            repository.close();
            System.out.println("Files are saved in database");
        }
    }
}
