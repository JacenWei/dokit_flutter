package com.didichuxing.doraemonkit.kit.methodtrace;


/**
 * Created by hasee on 2017/4/20.
 */
public class AppHealthMethodCostBean {
    private String functionName;
    private String costTime = "0";
    private String threadId;
    private String threadName;

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getCostTime() {
        return costTime;
    }

    public void setCostTime(String costTime) {
        this.costTime = costTime;
    }

    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public String toString() {
        return "AppHealthMethodCostBean{" +
                "functionName='" + functionName + '\'' +
                ", costTime='" + costTime + '\'' +
                ", threadId='" + threadId + '\'' +
                ", threadName='" + threadName + '\'' +
                '}';
    }
}
