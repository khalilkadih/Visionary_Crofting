package com.visionarycrofting.visionary__crofting.Dao;

import com.visionarycrofting.visionary__crofting.Entities.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer> {
}
