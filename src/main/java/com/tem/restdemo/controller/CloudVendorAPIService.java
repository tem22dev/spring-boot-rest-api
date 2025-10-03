package com.tem.restdemo.controller;

import com.tem.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;

    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendorDetail(@PathVariable("vendorId") String vendorId) {
//        return new CloudVendor("C1", "Vendor 1", "Address One", "xxxx");
        return cloudVendor;
    }

    @PostMapping()
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor created successfully";
    }

    @PutMapping()
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(@PathVariable("vendorId") String vendorId) {
        this.cloudVendor = null;
        return "Cloud vendor deleted successfully";
    }
}
