package stock.model.service;

import java.sql.Connection;
import java.util.List;

import static common.JDBCTemplate.*;
import stock.model.dao.StockDao;
import stock.model.vo.Stock;

public class StockService {
	
	//Service -> JDBCTemplate으로 처리
	//1. DriverClass등록(최초1회)
	//2. Connection 객체생성 url, user, password
	//2.1 자동커밋 false설정
	//7. 트랜잭션 처리(DML) commit / rollback
	//8. 자원반납 (생성역순 rset - pstmt - conn)
	
	private StockDao stockDao = new StockDao();

	public List<Stock> selectAll() {
		Connection conn = getConnection();
		List<Stock> sList = stockDao.selectAll(conn);
		close(conn);
		return sList;
	}

	public Stock selectByNo(int no) {
		Connection conn = getConnection();
		Stock stock = stockDao.selectByNo(conn, no);
		close(conn);
		return stock;
	}

}
