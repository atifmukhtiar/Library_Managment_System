package dataaccess;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class DataStorage{


	public void saveObject(String fileName,Object object) {
		 try
	        {    
	            FileOutputStream file = new FileOutputStream(fileName); 
	            ObjectOutputStream out = new ObjectOutputStream(file); 
	       
	            out.writeObject(object); 
	              
	            out.close(); 
	            file.close(); 
	              
	            System.out.println("Object has been serialized"); 
	  
	        } 
	          
	        catch(IOException ex) { 
	            System.out.println("IOException is caught"); 
	        } 
	}// end of saveMember
	
	public Object getObject(String fileName) {
		 Object object=null;
		
		 try
	        {    
	       
	            FileInputStream file = new FileInputStream(fileName); 
	            ObjectInputStream in = new ObjectInputStream(file); 
	      
	        
	            object = in.readObject(); 
	              
	            in.close(); 
	            file.close(); 
	              
	          /*  System.out.println("Member has been deserialized "); 
	            Member  member = (Member) object;
	            System.out.println("Name " + member.getFirstName() +" "+member.getLastName()); 
	            Address address = new Address();
	            address = member.getAddress();
	            System.out.println("Address = " + address.getStreet()+" "+address.getCity()+" "+address.getState()+" "+address.getZip()); 
	        */
	        } 
	          
	        catch(IOException ex) 
	        { 
	            System.out.println("IOException is caught"); 
	        } 
	          
	        catch(ClassNotFoundException ex) 
	        { 
	            System.out.println("ClassNotFoundException is caught"); 
	        } 
		 
		return object;
	}

}
