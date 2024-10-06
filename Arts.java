package org.edu;
//sub class or derived
public class Arts extends Education {

	private void bsc() {
System.out.println("50000 rupees");
	}
	
	private void bed() {
		this.ba();
System.out.println("65000 rupees fees");
	}
	
	private void ba() {
System.out.println("53000 rupees fees");
	}
	
	@Override
	public void ug() {
		System.out.println("87000 rupees fees");
		super.ug();
	}
	
	@Override
	public void pg() {
		System.out.println("78000 rupees fees");
		super.pg();
	}
	
	public static void main(String[] args) {
		Arts obj = new Arts();
		
		obj.ba();
		obj.bed();
		obj.bsc();
		obj.ug();
		obj.pg();
		
	}
}
