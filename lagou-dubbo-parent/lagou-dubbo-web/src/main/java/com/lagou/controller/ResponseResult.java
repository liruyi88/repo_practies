package com.lagou.controller;

public class ResponseResult {
    private Boolean b;
    private int status;
    private String context;
    private Object obj;

    public ResponseResult() {
    }

    public ResponseResult(Boolean b, int status, String context, Object obj) {
        this.b = b;
        this.status = status;
        this.context = context;
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "b=" + b +
                ", status=" + status +
                ", context='" + context + '\'' +
                ", obj=" + obj +
                '}';
    }

    public Boolean getB() {
        return b;
    }

    public void setB(Boolean b) {
        this.b = b;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
