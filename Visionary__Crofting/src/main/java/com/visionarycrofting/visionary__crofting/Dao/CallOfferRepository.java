package com.visionarycrofting.visionary__crofting.Dao;

import com.visionarycrofting.visionary__crofting.Entities.CallOffer;
import com.visionarycrofting.visionary__crofting.Entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CallOfferRepository extends JpaRepository<CallOffer, Integer> {
    List<CallOffer> findAllByStatus(Status status);
}
