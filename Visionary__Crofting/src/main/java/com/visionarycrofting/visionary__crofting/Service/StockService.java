package com.visionarycrofting.visionary__crofting.Service;

import com.visionarycrofting.visionary__crofting.Entities.Stock;

import java.util.List;

public interface StockService {
    void addStock(Stock stock);
    List<Stock> stocksFindAll();
    Stock getStockByID(Long id);
    void updateStock(Stock stock);
    void deleteStock(Long id);

}
