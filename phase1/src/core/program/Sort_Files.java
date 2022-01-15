package core.program;

import java.io.File;
import java.io.FileFilter;

public class Sort_Files {
	  public static void main(String[] args)
	  {
	    File dir = new File("C:\\");
	    if(dir.isDirectory())
	    {
	      // Fetching the list from the directory
	      File[] files = dir.listFiles();

	      System.out.println("All the files including folders");
	      System.out.println("--------------------------------");
	      
	      //Lists only files since we have applied file filter
	      for(File file:files)
	      {
	        System.out.println(file.getName());
	      }
	   
	   // Creating a filter to return only files.
	      FileFilter fileFilter = new FileFilter()
	      {
	        @Override
	        public boolean accept(File file) {
	          return !file.isDirectory();
	        }
	      };
	   files = dir.listFiles(fileFilter);
	   
	      System.out.println("\nAfter filtering the folders");
	      System.out.println("--------------------------------");
	        }
	}
	    }
