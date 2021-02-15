package com.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
    private String message;
    private String title;

    public HelloWorldBean(String message, String title) {
        this.message = message;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}