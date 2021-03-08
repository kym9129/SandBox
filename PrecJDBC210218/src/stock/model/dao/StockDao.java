package stock.model.dao;

import static common.JDBCTemplate.close;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import stock.model.exception.StockException;
import stock.model.vo.Stock;

public class StockDao {
	
	private Properties prop = new Properties();
	
	//Dao객체 생성 시(최초1회)
	//1. query.properties의 내용을 읽어 prop에 저장.
	//2. dao메소드 호출 시마다 prop로부터 query를 가져다 사용.
	
	//3. PreparedStatement객체 생성
	//3.1 물음표에 값 대입
	//4. 실행과 동시에 리턴 받음 DML: int, DQL: ResultSet
	//5. 자원반납 (객체 생성 역순으로 rset - pstmt)
	
	public StockDao() {
		String filename = "resources/stock-query.properties";
			try {
				prop.load(new FileReader(filename));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}

	public List<Stock> selectAll(Connection conn) {
		List<Stock> sList = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rset = null;
		
		sql = prop.getProperty("selectAll");
		rset = null;
		
		try {
			//PreparedStatement객체 생성 (쿼리넣기)
			pstmt = conn.prepareStatement(sql);
			
			//pstmt실행. rset받기
			rset = pstmt.executeQuery();
			
			//rset -> java Obj
			sList = new ArrayList<>();
			while(rset.next()) {
				int no = rset.getInt("no");
				String product = rset.getString("product");
				int quantity = rset.getInt("quantity");
				
				Stock stock = new Stock(no, product, quantity);
				sList.add(stock);
			}
			
		} catch (SQLException e) {
//			e.printStackTrace();
			throw new StockException("상품전체조회", e);
		} finally {
			close(rset);
			close(pstmt);
		}

		return sList;
	}

	public Stock selectByNo(Connection conn, int no) {
		Stock stock = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rset = null;
		
		sql = prop.getProperty("selectById");
		try {
			pstmt = conn.prepareStatement(sql);
			//물음표 값 대입
			pstmt.setInt(1, no);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				no = rset.getInt("no");
				String product = rset.getNString("product");
				int quantity = rset.getInt("quantity");
				
				stock = new Stock(no, product, quantity);
			}
			
		} catch (SQLException e) {
//			e.printStackTrace();
			throw new StockException("상품전체조회", e);
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return stock;
	}

}
