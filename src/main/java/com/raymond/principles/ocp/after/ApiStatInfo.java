package com.raymond.principles.ocp.after;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 21:50:31
 */
public class ApiStatInfo {
    private String api;
    private long requestCount;
    private long errorCount;
    private long timeoutCount;
    private long durationOfSeconds;

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public long getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(long requestCount) {
        this.requestCount = requestCount;
    }

    public long getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(long errorCount) {
        this.errorCount = errorCount;
    }

    public long getTimeoutCount() {
        return timeoutCount;
    }

    public void setTimeoutCount(long timeoutCount) {
        this.timeoutCount = timeoutCount;
    }

    public long getDurationOfSeconds() {
        return durationOfSeconds;
    }

    public void setDurationOfSeconds(long durationOfSeconds) {
        this.durationOfSeconds = durationOfSeconds;
    }

    public long getTps() {
        return requestCount / durationOfSeconds;
    }

    public long getTimeoutTps() {
        return timeoutCount / durationOfSeconds;
    }

}
