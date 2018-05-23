package com.beans;

import java.util.Date;

public class Reservation {
	private String courtName;
	private Date date;
	private int hour;
	private Player player;
	private SportType sportType;
	
	
	public Reservation(String string, Date time, int i, Player player2, SportType tennis) {
		// TODO Auto-generated constructor stub
	}
	public String getCourtName() {
		return courtName;
	}
	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public SportType getSportType() {
		return sportType;
	}
	public void setSportType(SportType sportType) {
		this.sportType = sportType;
	}
	
	
	
}