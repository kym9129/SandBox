package stock.controller;

import java.util.List;

import stock.model.exception.StockException;
import stock.model.service.StockService;
import stock.model.vo.Stock;
import stock.view.MainView;

public class StockController {
	private StockService stockService = new StockService();

	public List<Stock> selectAll() {
		List<Stock> sList = null;
		try {
			sList = stockService.selectAll();
			
		}catch(StockException e) {
			displayError(e);
		}
		return sList;
	}

	private void displayError(StockException e) {
		new MainView().displayError(e.getMessage() + ": 관리자에게 문의하세요.");
		
	}

	public Stock selectByNo(int no) {
		Stock stock = null;
		try {
			stock = stockService.selectByNo(no);
			
		} catch(StockException e) {
			displayError(e);
		}
		return stock;
	}

}
