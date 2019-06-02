//2016112182 최고운

package com.top.homework2;

public class BuyStockOrder implements Order {
    private StockTrade buy;
    BuyStockOrder(StockTrade stockTrade){
        this.buy = stockTrade;
    }

    @Override
    public void execute() {
        buy.buy();
    }
}
