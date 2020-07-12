package com.company;

import com.company.model.entity.FileEntity;
import com.company.model.service.FileService;

import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws Exception{
        Thread thread1 = new Thread(){

            @Override
            public void run(){
                try {
                    FileService.getInstance().save(new FileEntity().setAddress1("C:\\Users\\arash\\IdeaProjects\\HW10\\FILE1.txt").setAddress2("C:\\Users\\arash\\IdeaProjects\\HW10\\FILE2.txt").setAddress3("C:\\Users\\arash\\IdeaProjects\\HW10\\FILE3.txt"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                try {
                    FileService.getInstance().save(new FileEntity().setAddress1("C:\\Users\\arash\\IdeaProjects\\HW10\\FILE4.txt").setAddress2("C:\\Users\\arash\\IdeaProjects\\HW10\\FILE5.txt").setAddress3("C:\\Users\\arash\\IdeaProjects\\HW10\\FILE6.txt"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread3 = new Thread(){
            @Override
            public void run() {
                try {
                    FileService.getInstance().save(new FileEntity().setAddress1("C:\\Users\\arash\\IdeaProjects\\HW10\\FILE7.txt").setAddress2("C:\\Users\\arash\\IdeaProjects\\HW10\\FILE8.txt").setAddress3("C:\\Users\\arash\\IdeaProjects\\HW10\\FILE9.txt"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread4 = new Thread(){
            @Override
            public void run() {
                try {
                    FileService.getInstance().save(new FileEntity().setAddress1("C:\\Users\\arash\\IdeaProjects\\HW10\\FILE10.txt").setAddress2("C:\\Users\\arash\\IdeaProjects\\HW10\\FILE11.txt").setAddress3("C:\\Users\\arash\\IdeaProjects\\HW10\\FILE12.txt"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
