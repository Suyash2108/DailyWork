package com.cg.string;

public class StringbuilderSample {

	public static void main(String[] args) {
		 StringBuffer sb = new StringBuffer("Hello ");
         sb.append("Folks"); 
         System.out.println(sb);
        
         // INSERT METHOD
        StringBuffer sb1 = new StringBuffer("Hello ");
        sb1.insert(1, "Folks");
        
        System.out.println(sb1);
        
       // Replace method
            StringBuffer sb3=new StringBuffer("Hello"); 
            sb3.replace(1,3,"world"); 
            System.out.println(sb3);
            
        // Delete method
            StringBuffer sb4=new StringBuffer("Hello"); 
            sb4.delete(1,3); 
            System.out.println(sb4);
            
         // Reverse Method
            StringBuffer sb5 = new StringBuffer("Pranav");
            sb5.reverse();
            System.out.println(sb5);
            
            
         // Capcity method
                StringBuffer sb6 = new StringBuffer();
                System.out.println(sb6.capacity()); 
                sb.append("Hello");
                System.out.println(sb6.capacity()); 
                sb.append("java is my favourite language");
                System.out.println(sb6.capacity());
	}

}
