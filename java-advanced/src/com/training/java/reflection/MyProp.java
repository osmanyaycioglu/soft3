package com.training.java.reflection;

@PropFile("myprop.properties")
public class MyProp {

    @Prop("db.connection.host")
    private String host;
    @Prop("db.connection.port")
    private int    port;
    @Prop("db.connection.connection.timeout")
    private long   connectionTimeout;
    @Prop("db.connection.connection.count")
    private int    connectionCount;
    @Prop("db.connection.connection.xyz")
    private int    xyz;

    public String getHost() {
        return this.host;
    }

    public void setHost(final String hostParam) {
        this.host = hostParam;
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(final int portParam) {
        this.port = portParam;
    }

    public long getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public void setConnectionTimeout(final long connectionTimeoutParam) {
        this.connectionTimeout = connectionTimeoutParam;
    }

    public int getConnectionCount() {
        return this.connectionCount;
    }

    public void setConnectionCount(final int connectionCountParam) {
        this.connectionCount = connectionCountParam;
    }

    public int getXyz() {
        return this.xyz;
    }

    public void setXyz(final int xyzParam) {
        this.xyz = xyzParam;
    }

    @Override
    public String toString() {
        return "MyProp [host="
               + this.host
               + ", port="
               + this.port
               + ", connectionTimeout="
               + this.connectionTimeout
               + ", connectionCount="
               + this.connectionCount
               + ", xyz="
               + this.xyz
               + "]";
    }


}
