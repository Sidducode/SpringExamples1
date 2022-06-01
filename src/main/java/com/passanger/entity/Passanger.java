package com.passanger.entity;

public class Passanger {

	 private int id;
	 private String name;
	 private long seatno;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the seatno
	 */
	public long getSeatno() {
		return seatno;
	}
	/**
	 * @param seatno the seatno to set
	 */
	public void setSeatno(long seatno) {
		this.seatno = seatno;
	}
	@Override
	public String toString() {
		return "Passanger [id=" + id + ", name=" + name + ", seatno=" + seatno + "]";
	}
	 
	 
	 
}
