package com.visionarycrofting.visionary__crofting.Service;

import com.visionarycrofting.visionary__crofting.Dao.VendorRepository;
import com.visionarycrofting.visionary__crofting.Entities.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class VendorServiceImpl implements VendorService{
    @Autowired
    public VendorRepository vendorRepository;
    @Override
    public Vendor saveVendor(@Valid Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    @Override
    public int deleteVendor(int i) {
        if(i<1) return -1;
        vendorRepository.deleteById(i);
        return i;
    }

    @Override
    public Vendor updateVendor(@Valid Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    @Override
    public Vendor findVendor(int i) {
        Optional<Vendor> vendor= vendorRepository.findById(i);
        Vendor vendorFounded = vendor.get();
        return vendorFounded;
    }
    @Override
    public List<Vendor> findAllVendors(){
        return vendorRepository.findAll();
    }

}
