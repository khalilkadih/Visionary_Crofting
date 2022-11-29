package com.visionarycrofting.visionary__crofting.Service;

import com.visionarycrofting.visionary__crofting.Entities.Product;
import com.visionarycrofting.visionary__crofting.Entities.Vendor;

import java.util.List;

public interface VendorService {
    Vendor saveVendor(Vendor vendor);
    int deleteVendor(int i);
    Vendor updateVendor(Vendor vendor);
    Vendor findVendor(int i);
    List<Vendor> findAllVendors();
}
