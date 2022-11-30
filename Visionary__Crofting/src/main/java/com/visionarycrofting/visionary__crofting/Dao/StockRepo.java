package com.visionarycrofting.visionary__crofting.Dao;

import com.visionarycrofting.visionary__crofting.Entities.Stock;
import org.springframework.data.repository.CrudRepository;

public interface StockRepo  extends CrudRepository<Stock,Long> {
}
