package com.visionarycrofting.visionary__crofting.Service.impl;

import com.visionarycrofting.visionary__crofting.Dao.StockRepo;
import com.visionarycrofting.visionary__crofting.Entities.Stock;
import com.visionarycrofting.visionary__crofting.Service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StockServiceImp implements StockService {
    @Autowired
    private StockRepo stockRepo;

    public List<Stock> stocksFindAll(){
        return (List<Stock>) stockRepo.findAll();
    }
    public Stock getStockByID(Long id){
        return stockRepo.findById(id).get();
    }

    public void addStock(Stock stock){
        stockRepo.save(stock);
    }
    public void deleteStock(Long id){
         stockRepo.deleteById(id);
    }
    public  void updateStock(Stock stock){
        stockRepo.save(stock);
    }
}
