package com.gazbert.patterns.behavioural.strategy;

import java.math.BigDecimal;

/**
 * A Concrete Strategy impl.
 *
 * @author gazbert
 *
 */
public class SupportAndResistance implements TradingStrategy {

    @Override
    public void execute(final OrderBook orders) {
	
	System.out.println("Strategy Used: " + this.getClass().getSimpleName());
	
	/*
	 * Code goes in here to impl algo for deciding order to build using past trading history and what's
	 * currently in the order book...
	 *  
	 * I'm just hard coding stuff for demo!
	 */
	final Order orderToPlace = new ValidOrder(
		new BigDecimal(0.685), 
		new BigDecimal(100),
		new BigDecimal(68.5));
	
	// send order off to exchange...
    }
}
