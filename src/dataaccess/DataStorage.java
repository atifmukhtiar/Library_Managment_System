package dataaccess;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class DataStorage{


	String prePath = "src/dataaccess/storage/";
	public void saveObject(String fileName,Object object) {
		 try
	        {    
	            FileOutputStream file = new FileOutputStream(prePath+fileName,true); 
	            
	            ObjectOutputStream out = new ObjectOutputStream(file); 
	       
	            out.writeObject(object); 
	            out.write('\n');
	        
	            
	              
	            out.close(); 
	            file.close(); 
	              
	           
	        } 
	          
	        catch(IOException ex) { 
	            System.out.println("IOException is caught"); 
	        } 
	}// end of saveMember
	
	
	public List<Object> getObjectList(String fileName) {
		 Object object=null;
		 List<Object> listObject = new ArrayList<>();
		
		 try
	        {    
	       
	            FileInputStream file = new FileInputStream(prePath+fileName); 
	            ObjectInputStream in = new ObjectInputStream(file); 
	      
	        
	            object = in.readObject(); 
	            
	            while ((object = in.readObject()) != null) {
	            	listObject.add(object);
	            }
	              
	            in.close(); 
	            file.close(); 
	              
	        } 
	          
	        catch(IOException ex) 
	        { 
	            System.out.println("IOException is caught"); 
	        } 
	          
	        catch(ClassNotFoundException ex) 
	        { 
	            System.out.println("ClassNotFoundException is caught"); 
	        } 
		 
		 return listObject;
		 
	
	}
	
	public Object getObject(String fileName) {
		 Object object=null;

		 try
	        {    	       
	            FileInputStream file = new FileInputStream(prePath+fileName); 
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
