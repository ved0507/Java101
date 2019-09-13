package org.darth.vedar;
public class Triangle{
	public static void main(String args[]){
		
		private String type;
		
		public Triangle(int height){
		
			this.height=height;
		}
		
		public Triangle(String type){
			this.type=type;
		
		}
		public Triangle(String type,int height){
			this.type=type;
			this.height=height;
		}
		public String getType(){
			return type;
		}
		// public void setType(String type){
			// this type=type;
		// }
		
		public void draw(){
			System.out.println(getType() + "Draw Triangle"+getHeight());
		
		}
	}
	
}