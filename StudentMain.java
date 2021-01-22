package com.klu.main;
import java.sql.SQLException;

import com.klu.bean.studentbean;
import com.klu.insert.StudentInsertion;
import java.util.*;

public class StudentMain {
static Scanner sc=new Scanner(System.in);
public static void main(String args[]) throws ClassNotFoundException, SQLException {
	studentbean stb=new studentbean();
	StudentInsertion sti=new StudentInsertion();
	while(true) {
		System.out.println("Enter option for crud operations");
		System.out.println("1.INSERTION\n");
		System.out.println("2.DELETION\n");
		System.out.println("3.UPDATION\n");
		int option=sc.nextInt();
		
		switch(option) 
		{
		     case 1:
		    	 System.out.println("Values for insertion\n");
		    	 System.out.println("Enter sid");
		    	 int sid=sc.nextInt();
		    	 System.out.println("Enter Name");
		    	 String name=sc.next();
		    	 System.out.println("Enter dept");
		    	 String dept=sc.next();
					stb.setsid(sid);
					stb.setName(name);
					stb.setdept(dept);
					
					int a=sti.StudentInsert(stb);
					if(a>0) {
						System.out.println("Insertion sucessful !!!");
					}
					else {
						System.out.println("Insertion failed !!!");
					}
					break;
				
		     case 2:System.out.println("Enter Id for deletion");
				    	 int sid1=sc.nextInt();
				    	 stb.setsid(sid1);
				    int b=sti.studentDelete(stb);
				    if(b>0) {
				    	System.out.println("Deletion sucessful !!!");
				    }
				    else {
						System.out.println("Deletion failed !!!");
					}

				    
		     			break;
		     case 3:System.out.println("Enter Id for updation");
	    	 			int id1=sc.nextInt();
	    	 			stb.setsid(id1);
	    	 		System.out.println("Enter Name for updation");
				    	 String name_update=sc.next();
				    	 stb.setName(name_update);
				    	 int a1=sti.studentUpdate(stb);
							if(a1>0) {
								System.out.println("updation sucessful !!!");
							}
							else {
								System.out.println("updation failed !!!");
							}
		                 break;
		    
		}
		
		
	}
}
}