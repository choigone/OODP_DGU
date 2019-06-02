//2016112182 최고운

package com.top.homework2;

public class SellStockOrder implements Order{
    private StockTrade sell;
    SellStockOrder(StockTrade stockTrade){
        this.sell = stockTrade;
    }

    @Override
    public void execute() {
        sell.sell();
    }
}
