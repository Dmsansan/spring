package com.neusoft.spring.action;

public class EnHelloWorld {
    public String msg = null;

    public void  setMsg(String msg){
        this.msg=msg;
    }

    public String getMsg(){
        return "Hello:"+msg;
    }
}
