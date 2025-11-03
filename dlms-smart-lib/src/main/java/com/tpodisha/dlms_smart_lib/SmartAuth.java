package com.tpodisha.dlms_smart_lib;

public class SmartAuth {
    private String authenticationKey,blockCipherKey,dedicatedKey,systemTitle,password;
    private int clientAddress=0;

    public String getAuthenticationKey() {
        return authenticationKey;
    }

    public void setAuthenticationKey(String authenticationKey) {
        this.authenticationKey = authenticationKey;
    }

    public String getBlockCipherKey() {
        return blockCipherKey;
    }

    public void setBlockCipherKey(String blockCipherKey) {
        this.blockCipherKey = blockCipherKey;
    }

    public String getDedicatedKey() {
        return dedicatedKey;
    }

    public void setDedicatedKey(String dedicatedKey) {
        this.dedicatedKey = dedicatedKey;
    }

    public String getSystemTitle() {
        return systemTitle;
    }

    public void setSystemTitle(String systemTitle) {
        this.systemTitle = systemTitle;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(int clientAddress) {
        this.clientAddress = clientAddress;
    }
}
