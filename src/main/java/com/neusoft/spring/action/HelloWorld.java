package com.neusoft.spring.action;

public class HelloWorld {
    public String msg = null;
    public HelloWorld(String msg){
        this.msg = msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }

    public String getMsg(){
        return this.msg;
    }
}
