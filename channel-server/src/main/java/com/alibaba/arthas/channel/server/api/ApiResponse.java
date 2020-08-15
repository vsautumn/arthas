package com.alibaba.arthas.channel.server.api;

/**
 * Http Api exception
 * @author gongdewei 2020-03-19
 */
public class ApiResponse<T> {
    private String agentId;
    private String requestId;
    private ApiState state;
    private String message;
    private String sessionId;
    private String consumerId;
    private String jobId;
    private String jobStatus;
    private T result;

    public String getAgentId() {
        return agentId;
    }

    public ApiResponse<T> setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public ApiResponse<T> setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public ApiState getState() {
        return state;
    }

    public ApiResponse<T> setState(ApiState state) {
        this.state = state;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ApiResponse<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getSessionId() {
        return sessionId;
    }

    public ApiResponse<T> setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public ApiResponse<T> setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }

    public String getJobId() {
        return jobId;
    }

    public ApiResponse<T> setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public ApiResponse<T> setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    public T getResult() {
        return result;
    }

    public ApiResponse<T> setResult(T result) {
        this.result = result;
        return this;
    }
}