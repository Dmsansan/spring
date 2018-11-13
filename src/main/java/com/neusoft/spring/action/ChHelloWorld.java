package com.neusoft.spring.action;

public class ChHelloWorld {
    public String msg = null;

    public void setMsg(String msg){
        this.msg = msg;
    }

    public String getMsg(){
        return "你好："+msg;
    }
}
