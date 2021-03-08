package com.oop.movie.model.entity;

import java.util.Arrays;
import java.util.Calendar;

/**
 * - 멤버변수 : 반드시 캡슐화를 적용할 것
    - movieTitle : String                   //영화제목
    - director : String                     //감독이름
    - casting : String[]                    //출연배우 최대5명까지
    - release : Calendar                    //개봉일
- 각 멤버변수별 getter, setter
- 영화정보를 담은 information():String
- 파라미터 생성자.
    1. movieTitle
    2. movieTitle, director
    3. movieTitle, director, casting
    4. movieTitle, director, casting, release
생성자간 생성자호출 this()를 활용할 것.

 * @author jin
 *
 */

public class Movie {
	
	private String movieTitle;
	private String director;
	private String[] casting;
	private Calendar release;
	
	public Movie() {
		
	}
	
	public Movie(String movieTitle){
		this.movieTitle = movieTitle;
	}
	
	public Movie(String movieTitle, String director) {
		this(movieTitle);
		this.director = director;
	}
	
	public Movie(String movieTitle, String director, String[] casting) {
		this(movieTitle, director);
		this.casting = casting;
	}
	
	public Movie(String movieTitle, String director, String[] casting, Calendar release) {
		this(movieTitle, director, casting);
		this.release = release;
	}
	
	public String information() {
		String str = movieTitle + " / " + director + " / " + Arrays.toString(casting) + " / ";
		
		if(this.release != null)
			str += release.get(Calendar.YEAR) + "-" + (release.get(Calendar.MONTH))+1 + "-" + release.get(Calendar.DATE);
		
		return str;
		
	}
	
//	public String information2() {
//		String s = "[movieTitle=" + movieTitle + ", director=" + director + ", casting=" + Arrays.toString(casting)
//				+ ", release=";
//		if(release != null) 
//			s += release.get(Calendar.YEAR)+"/"+(release.get(Calendar.MONTH)+1)+"/"+release.get(Calendar.DAY_OF_MONTH) + "]";
//		else 
//			s += null + "]";
//		
//		return s;
//	}

	
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String[] getCasting() {
		return casting;
	}
	public void setCasting(String[] casting) {
		this.casting = casting;
	}
	public Calendar getRelease() {
		return release;
	}
	public void setRelease(Calendar release) {
		this.release = release;
	}
	
	

}
