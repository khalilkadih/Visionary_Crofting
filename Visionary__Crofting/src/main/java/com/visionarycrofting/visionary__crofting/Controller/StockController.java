package com.visionarycrofting.visionary__crofting.Controller;

import com.visionarycrofting.visionary__crofting.Entities.Stock;
import com.visionarycrofting.visionary__crofting.Service.impl.StockServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Stocks")
public class StockController {

    @Autowired
    private StockServiceImp stockServiceImp;

    @GetMapping("/stock")
    public List<Stock> showAllStock(){
        return stockServiceImp.stocksFindAll();
    }
    @GetMapping("/stockByID/{id}")
    public Stock getStockByID(@PathVariable(value = "id") Long id){
        return stockServiceImp.getStockByID(id);
    }
    @PostMapping("/addStock")
    public String saveStock(@RequestBody Stock stock){
         stockServiceImp.addStock(stock);
         return "Stocke Added Successffully";
    }

    @PutMapping("/updateStock")
    public String updateStock(@RequestBody Stock stock){
        stockServiceImp.updateStock(stock);
        return "Updated Succcesseffully";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStock( @PathVariable("id") Long id){
        stockServiceImp.deleteStock(id);
    return "Stock deleted Successfully";
    }


}
