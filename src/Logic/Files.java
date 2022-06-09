package Logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Domain.User;

public class Files {
	File file = new File(Utils.direction);
	File file2 = new File(Utils.direction2);
	
	public Files (){}
	
	public void addUser(User user) {
		try{
		  FileWriter writer = new FileWriter(file, true);
		  PrintWriter pw = new PrintWriter(writer);
		  pw.println(user);
		  writer.close();  
		 }catch(IOException e){}
	  }
	
	public void saveNamePassword(String name, String password) {
		try{
		 FileWriter writer = new FileWriter(file2, true);
		 PrintWriter pw = new PrintWriter(writer);
		 pw.println(name +","+ password);
		 writer.close();  
		}catch(IOException e){}
	}
	
	public boolean verifyUser(String user, String password) {
		boolean condition = false;
	    try {
	    	FileReader reader = new FileReader(file2);
	    	BufferedReader br = new BufferedReader(reader);
	    	
	    	String line="";
	    	while((line=br.readLine())!=null){ 
		    		String split [] = line.split(",");
		    		String user1 = split[0];
		    		String password1 = split[1];
		    		if(user1.equals(user) && password1.equals(password)) {
		    			condition = true;
		    			break;
		    		}else {
		    			condition = false;
		    		}
	    		}
	    }catch(IOException e) {}
	    	return condition;
	}
}