package com.jsp.data.between;

public class Data {

	int dd;
	int mm;
	int yy;
	int month[]= {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	String[] dname= {"sunday", "Monday", "Tuesday", "Wedneday", "Thursday", "Friday", "Saturday"};

	public Data(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		if(yy%4==0 && yy%100!=0 || yy%
				400==0) {
			month[2]=29;
		}

	}

	public int noOfDays() {
		int y=yy-1;
		int days=y*365+y/400-y/100;

		for(int i=1; i<mm; i++) {
			days=days+month[i];
		}
		days=days+dd;
		return days;
	}

	public String dayName() {
		int days=noOfDays();
		return dname[days%7];
	}

	public String toString() {
		return dd+"/"+mm+"/"+yy;
	}
}
