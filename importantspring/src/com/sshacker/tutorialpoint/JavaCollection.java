package com.sshacker.tutorialpoint;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
    List<String> addressList;
    Set<String> addressSet;
    Map<Integer, String> addressMap;
    Properties addressProperties;

    public List<String> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<String> addressList) {
        this.addressList = addressList;
    }

    public Set<String> getAddressSet() {
        return addressSet;
    }

    public void setAddressSet(Set<String> addressSet) {
        this.addressSet = addressSet;
    }

    public Map<Integer, String> getAddressMap() {
        return addressMap;
    }

    public void setAddressMap(Map<Integer, String> addressMap) {
        this.addressMap = addressMap;
    }

    public Properties getAddressProperties() {
        return addressProperties;
    }

    public void setAddressProperties(Properties addressProperties) {
        this.addressProperties = addressProperties;
    }

}
