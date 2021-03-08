package com.oop.movie.run;

import java.util.Calendar;

import com.oop.movie.model.entity.Movie;

//    - movieTitle : String                   //영화제목
//    - director : String                     //감독이름
//    - casting : String[]                    //출연배우 최대5명까지
//    - release : Calendar                    //개봉일

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m1 = new Movie("Movie1");
		Movie m2 = new Movie("Movie2", "Director1");
		String[] casting1 = {"James", "Kate", "sofy", "Emy", "Bruse"};
		Movie m3 = new Movie("Movie3", "Director2", casting1);
		String[] casting2 = {"Cameron", "Olivia", "Phil", "Clair", "Luke"};
		Calendar release4 = Calendar.getInstance();
		release4.set(1991, Calendar.FEBRUARY, 9); //1991-02-09
		Movie m4 = new Movie("Movie4", "Director3", casting2, release4);
		
		System.out.println(m1.information());
		System.out.println(m2.information());
		System.out.println(m3.information());
		System.out.println(m4.information());
		
		

	}

}
