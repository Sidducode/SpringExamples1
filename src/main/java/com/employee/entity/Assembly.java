package com.employee.entity;

public class Assembly {
	 private int id;
	 private String name;
	 private String address;
	 private long num;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the num
	 */
	public long getNum() {
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(long num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Assembly [id=" + id + ", name=" + name + ", address=" + address + ", num=" + num + "]";
	}
	
	 
	 

}
