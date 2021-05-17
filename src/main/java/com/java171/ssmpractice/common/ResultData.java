package com.java171.ssmpractice.common;

import lombok.Data;

@Data
public class ResultData implements StatusCode{
    private Integer code;
    private String message;
    private Object data;
    public static ResultData setData(String s,Object obj){
        ResultData resultData=new ResultData();
        resultData.message=s;
        resultData.data=obj;
        return resultData;
    }
    public static ResultData succeed(String s,Object obj){
        ResultData resultData=setData(s,obj);
        resultData.code=StatusCode.SUCCEED;
        return resultData;
    }
    public static ResultData fall(String s,Object obj){
        ResultData resultData=setData(s,obj);
        resultData.code=StatusCode.SUCCEED;
        return resultData;
    }
}
