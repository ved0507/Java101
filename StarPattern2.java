// import java.util.*;
// class Test{
	// public static void main(String args[]){
		// for(int i=1;i<=3;i++){
			//System.out.print(" ");
			// for(int j=2;j>=i;j--){
			// System.out.print(" ");}
				// for(int k=1;k<=(2*i-1);k++){
				// System.out.print("*");}
					// System.out.println("");
				// }
			
		
	// }
// }
// import java.util.*;
// class Test{
	// public static void main(String args[]){
		// for(int i=1;i<=3;i++){
			// System.out.print("#");
			
			// for(int j=1;j<=3;j++){
			// System.out.print("*");
			
			// }
			// System.out.println("");
			
		// }
	// }
// }
// import java.util.*;
// class StarPattern{
	// public static void main(String args[]){
		// for(int i=1;i<=3;i++){
			//System.out.print(" ");
			
			// for(int j=3;j>=i;j--){
			// System.out.print(" ");
			
			// }
			
			// for(int k=1;k<=2*i-i;k++){
			// System.out.print(" ");
			// System.out.print("*");
			
			
			// }
			
			// System.out.println("");
			
		// }
	// }
// }


import java.util.*;
class StarPattern2{
	public static void main(String args[]){
		for(int i=3;i>=1;i--){
			//System.out.print("*");
			for(int j=3;j>i;j--){
			System.out.print(" ");
			
			
		}
		for(int k=1;k<2*i;k++){
			
			if(i==2 && k==2){
				System.out.print("#");
			}
			else{
			//System.out.print(" ");
			System.out.print("*");}
			
			
			
			
			
		}
		System.out.println(" ");
		}
	}
}


