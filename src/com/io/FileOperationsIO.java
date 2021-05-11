package com.io;
import java.io.File;                                                                               
import java.io.IOException;                                                                        
import java.nio.file.Files;                                                                        
import java.nio.file.Path;                                                                         
import java.nio.file.Paths;                                                                        
import java.util.List;                                                                             
import java.util.stream.Collectors;                                                                

public class FileOperationsIO {                                                                    
	public static void main(String[] args) {                                                       

		//check if file present or not                                                             
		File file = new File("amar.txt");                                                          
		if (file.exists())                                                                         
			System.out.println("file exists");                                                     
		else                                                                                       
			System.out.println("file does not exists");                                            

		//creating a file                                                                          
		File myfile = new File("amar.txt");                                                
		try {                                                                              
			myfile.createNewFile();                                                        
		} catch (IOException e) {                                                          
			System.out.println("unable to create file");                                   
			e.printStackTrace();                                                           
		}                                                                                  

		//deleting file                                                                    
		File myfile2 = new File("amar.txt");                                               
		if (myfile2.delete()) {                                                            
			System.out.println("File deleted "+ myfile2.getName());                        
		}                                                                                  
		else {                                                                             
			System.out.println("error occured");                                           
		}                                                                                  

		//creating a directory                                                             
		try {                                                                              
			Path path = Paths.get("C:/Users/www.abcom.in/Batch284/bridgelabz/IOStreams");      
			Files.createDirectory(path);                                                       
			System.out.println("directory created");                                       
		}catch(IOException e) {                                                            
			System.out.println("failed to create directory "+ e.getMessage());             
		}                                                                                  

		//list files                                                                       
		String pathName = "C:/Users/www.abcom.in/Batch284/TerminalCommands/Day6";          
		try {                                                                              
			List<File>files = Files.list(Paths.get(pathName))                              
					//.filter(Files::isRegularFile)                                
					.map(Path::toFile)                                             
					.collect(Collectors.toList());                                 
			files.forEach(System.out::println);			                                   
		}catch (IOException e) {                                                           

}                                                                                  

}                                                                                              


}                                                                                                  

