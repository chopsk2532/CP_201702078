
public class star {

	public static void main(String[] args) {
		

	int i;
	int j;
	int k;

	  for(i=1; i<=5;i++) 
	   {

		  for(j=4; j>=i; j--)   
	     System.out.print(" ");  
		  for(k=0; k<i*2-1;k++) 
			  System.out.print("*");
	    System.out.println();
	   }	
	 for (i=1;i<=4;i++) {
		 for(j=0;j<i;j++)
			System.out.print(" ");
		 for(k=8;k>2*i-1;k--)
			 System.out.print("*");
		 System.out.println();
	 }

	}

}
