package com.tem.restdemo.service;

import com.tem.restdemo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendorById(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
}
