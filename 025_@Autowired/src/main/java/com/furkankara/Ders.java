package com.furkankara;

import org.springframework.beans.factory.annotation.Autowired;

public class Ders {

	private int puan;
	private String ders;
	private Ogrenci ogrenci;
	
	
	public int getPuan() {
		return puan;
	}
	public void setPuan(int puan) {
		this.puan = puan;
	}
	public String getDers() {
		return ders;
	}
	public void setDers(String ders) {
		this.ders = ders;
	}
	
	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	@Autowired
	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}
	
	
	


}
