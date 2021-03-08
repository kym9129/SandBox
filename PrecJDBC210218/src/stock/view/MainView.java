package stock.view;

import java.util.List;
import java.util.Scanner;

import stock.controller.StockController;
import stock.model.vo.Stock;

public class MainView {
	Scanner sc = new Scanner(System.in);
	private StockController stockController = new StockController();

	public void mainMenu() {
		List<Stock> sList = null;
		Stock stock = null;
		
		while(true) {
			printMenu();
			String choice = sc.next(); //문자로 받으면 유저가 문자로 입력해도 오류가 안난다.
			
			switch(choice) {
			case "1" : //현재 상품 및 재고 현황 보기
				sList = stockController.selectAll();
				displayStockList(sList);
				
				break;
			case "2" : //품목번호로 조회 DQL
				int no = inputNo();
				stock = stockController.selectByNo(no);
				displayStock(stock);
				
				break;
			case "3" : //품목으로 조회 (일부만 포함돼도 나오게)
				//여러개가 나올 수도 있으니까 ArrayList로 받기
				String product = inputProduct();
				sList = stockController.selectByProduct(product);
				displayStockList(sList);
				
				break;
			case "4" : //상품 추가
				
				break;
			case "5" : //상품 재고 변경 (품목으로 검색해서 변경)
				
				break;
			case "6" : //변경기록 확인 (upsert_stock테이블 조회)
				
				break;
			case "7" : //종료
				System.out.println("정말 종료하시겠습니까? (y/n): ");
				if(sc.next().toUpperCase().charAt(0) == 'Y') {
					return;
				}
				
				break;
			default : 
				System.out.println("잘못 입력하였습니다.");
				break;
			}
		}

		
	}
	
	private String inputProduct() {
		System.out.println("품목명 입력(띄어쓰기 없이) : ");
		return sc.next();
	}
	private void displayStock(Stock stock) {
		if(stock != null) {
			System.out.println("===========================");
			System.out.println(stock);
			System.out.println("===========================");
			
		}else {
			System.out.println(">>> 조회된 상품정보가 없습니다.");
		}
		
	}
	private int inputNo() {
		System.out.println("품목번호 입력: ");
		return sc.nextInt();
	}
	private void displayStockList(List<Stock> sList) {
		if(sList != null && !(sList.isEmpty())) {
			System.out.println("===========================");
			//stock 객체 리스트 출력
			for(int i = 0; i < sList.size(); i++) {
				System.out.println((i + 1) + " : " + sList.get(i));
			}
			System.out.println("===========================");
		}else {
			System.out.println(">>> 조회된 상품정보가 없습니다.");
		}
		
	}
	public void printMenu() {
		
		String menu = "============재고관리 시스템===============\n"
				+ "1. 현재 상품 및 재고 현황 보기\n"
				+ "2. 품목번호로 조회\n"
				+ "3. 품목으로 조회\n"
				+ "4. 상품 추가\n"
				+ "5. 상품 재고 변경\n"
				+ "6. 변경기록 확인\n"
				+ "7. 종료\n"
				+ "--------------------------\n"
				+ "선택 : ";
		System.out.println(menu);
	}
	public void displayError(String errorMsg) {
		System.err.println(errorMsg);
		
	}

}
