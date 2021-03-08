package kh.model;

import java.util.ArrayList;
import java.util.List;

import kh.model.vo.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void fileSave() {
//=> 2번 문항의 [원인]에 기술한 Book 객체만 저장할 수 있는 ArrayList bookList 객체를 생성한다.
		List<Book> bList = new ArrayList<>();
		
		bList.add(new Book("자바를 잡아라", 30000));
		bList.add(new Book("오라클 정복", 35000));
		bList.add(new Book("웹표준 2.0", 27500));
		bList.add(new Book("자바 Servlet/JSP", 28000));
		bList.add(new Book("ajax 사용법", 15000));
		
		System.out.println(bList);
	}
	
	
}

//
//=> bookList 에 아래의 5개의 Book 객체를 리스트에 저장한다.
//
//Book("자바를 잡아라", 30000));
//
//Book("오라클 정복", 35000));
//
//Book("웹표준 2.0", 27500));
//
//Book("자바 Servlet/JSP", 28000));
//
//Book("ajax 사용법", 15000));
//
//=> 저장된 bookList 정보 출력 확인한다.