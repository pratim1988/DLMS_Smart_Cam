package com.tpodisha.dlms_smart_lib;

import com.hoho.android.usbserial.driver.UsbSerialDriver;

import gurux.dlms.secure.GXDLMSSecureClient;

public interface SmartDLMSActionListener {
    void onActionComplete(boolean status);
    void relayStatus(int i);
    void onAssociationComplete(boolean status, GXDLMSSecureClient secureClient);
    void onError(String message);
    void onPortConfigSuccess(UsbSerialDriver driver);
}
