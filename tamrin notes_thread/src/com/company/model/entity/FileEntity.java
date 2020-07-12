package com.company.model.entity;

public class FileEntity {
    private String address1;
    private String address2;
    private String address3;

    private String content1;
    private String content2;
    private String content3;

    public String getAddress1() {
        return address1;
    }

    public FileEntity setAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public String getAddress2() {
        return address2;
    }

    public FileEntity setAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public String getAddress3() {
        return address3;
    }

    public FileEntity setAddress3(String address3) {
        this.address3 = address3;
        return this;
    }

    public String getContent1() {
        return content1;
    }

    public FileEntity setContent1(String content1) {
        this.content1 = content1;
        return this;
    }

    public String getContent2() {
        return content2;
    }

    public FileEntity setContent2(String content2) {
        this.content2 = content2;
        return this;
    }

    public String getContent3() {
        return content3;
    }

    public FileEntity setContent3(String content3) {
        this.content3 = content3;
        return this;
    }
}
