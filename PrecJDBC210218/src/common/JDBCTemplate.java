package common;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCTemplate {
	
	//1. DriverClass등록 (최초1회)
	//2. Connection 객체 생성 (url, user, password)
	//2.1 자동커밋 false 설정
	//트랜잭션 처리 (commint, rollback)
	//7. 자원반납 (conn, rset, pstmt)
	
	//JDBCTemplate객체생성 없이 호출 가능하도록 static으로
	static String driverClass;
	static String url;
	static String user;
	static String password;
	
	//초기화블럭에 DriverClass등록
	static {
		Properties prop = new Properties();
		String filename = "resources/data-source.properties";
		
		try {
			//data-source.properties 읽어오기
			prop.load(new FileReader(filename));
			
			//properties의 내용 읽어오기
			driverClass = prop.getProperty("driverClass");
			url = prop.getProperty("url");
			user = prop.getProperty("user");
			password = prop.getProperty("password");
			
			//1. DriverClass등록 (최초1회)
			Class.forName(driverClass);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			//2. Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
			//2.1 자동커밋 설정
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//트랜잭션 처리 (commint, rollback)
	public static void commit(Connection conn) {
		try {
			if(conn != null)
				conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn) {
		try {
			if(conn != null)
				conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//7. 자원반납 (conn, rset, pstmt)
	public static void close(Connection conn) {
		try {
			if(conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rset) {
		try {
			if(rset != null)
				rset.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement pstmt) {
		try {
			if(pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
