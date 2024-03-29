package _test.haksa.model.dto;

import java.sql.Date;

public class SungjukDTO {
	private int sungjukNo;
	private int kor;
	private int eng;
	private int mat;
	private int sci;
	private int his;
	private int tot;
	private double avg;
	private String grade;
	private int hakbun;
	private int sihumNo;
	private Date regiDate;
	private String name;
	private String sihumName;
	
	public int getSungjukNo() {
		return sungjukNo;
	}
	public void setSungjukNo(int sungjukNo) {
		this.sungjukNo = sungjukNo;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getHis() {
		return his;
	}
	public void setHis(int his) {
		this.his = his;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public void setTot() {
		tot = kor + eng + mat + sci + his;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void setAvg() {
		avg = tot / 5.0;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setGrade() {
		grade = "가";
		
		if (avg >= 90) {
			grade = "수";
		} else if (avg >= 80) {
			grade = "우";
		} else if (avg >= 70) {
			grade = "미";
		} else if (avg >= 60) {
			grade = "양";
		}//if
	}
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public int getSihumNo() {
		return sihumNo;
	}
	public void setSihumNo(int sihumNo) {
		this.sihumNo = sihumNo;
	}
	public Date getRegiDate() {
		return regiDate;
	}
	public void setRegiDate(Date regiDate) {
		this.regiDate = regiDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSihumName() {
		return sihumName;
	}
	public void setSihumName(String sihumName) {
		this.sihumName = sihumName;
	}
}//SungjukDTO