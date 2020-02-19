package com.trainingbasket.javaee.modal;

public class League {
	 int year;
	 String title;
	 String season;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public League(int year, String title, String season) {
		super();
		this.year = year;
		this.title = title;
		this.season = season;
	}

	public League() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	@Override
	public String toString() {
		return "League [year=" + year + ", title=" + title + ", season=" + season + "]";
	}

	/*
	 * <tr> <td>${leagues.getSeason()}</td> <td>${leagues.getTitle()}</td>
	 * <td>${leagues.getYear()}</td> </tr>
	 */
	

}
