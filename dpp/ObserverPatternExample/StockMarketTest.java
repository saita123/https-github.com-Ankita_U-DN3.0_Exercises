package com.example.test;

import com.example.observer.StockMarket;
import com.example.observer.MobileApp;
import com.example.observer.WebApp;
import com.example.observer.Observer;

public class StockMarketTest {
    public static void main(String[] args) {
        // Create StockMarket instance
        StockMarket stockMarket = new StockMarket();

        // Create Observer instances
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        // Register observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Change stock price and notify observers
        stockMarket.setStockPrice(150.75);
        stockMarket.setStockPrice(155.20);
    }
}