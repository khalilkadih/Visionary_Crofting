package com.visionarycrofting.visionary__crofting.Controller;

import com.visionarycrofting.visionary__crofting.Entities.Vendor;
import com.visionarycrofting.visionary__crofting.Service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VendorController {
    @Autowired
    public VendorService vendorService;
    @GetMapping(value = "/vendor/{id}")
    public Vendor getVendor(@PathVariable(value = "id") Integer id){
        return vendorService.findVendor(id);
    }
    @PostMapping (value = "/vendor")
    public Vendor addVendor(@RequestBody Vendor vendor){
        return vendorService.saveVendor(vendor);
    }
    @GetMapping(value = "/vendor")
    public List<Vendor> getVendors(){
        return vendorService.findAllVendors();
    }
    @DeleteMapping(value = "/vendor/{id}")
    public int deleteVendor(@PathVariable("id") Integer id){
        return vendorService.deleteVendor(id);
    }
    @PutMapping(value = "/vendor")
    public Vendor updateVendor(@RequestBody Vendor vendor){
        return vendorService.updateVendor(vendor);
    }

}
