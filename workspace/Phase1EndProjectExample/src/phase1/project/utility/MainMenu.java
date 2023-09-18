package phase1.project.utility;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

import phase1.project.exception.ProperOptionValue;

public class MainMenu {
	
	static File rootPath = new File("./MyFolder/");
	
	public static void menuOptions() {
		File ff[] = rootPath.listFiles();
		System.out.println(ff.length);
//		Scanner sc =new Scanner(System.in);
//		String con;
//		do {
//			System.out.println("1:Display all files in ascending order");
//			System.out.println("2:Sub Option");
//			System.out.println("3:Exit");
//			System.out.println("Plz enter your choice");
//			int choice = sc.nextInt();
//			switch (choice) {
//			case 1:System.out.println("all files");			
//				break;
//			case 2:SubMenu.subMenuOptions();
//					break;
//			case 3:System.exit(0);
//			}
//			
//			System.out.println("do you want to continue?(y/n)");
//			con = sc.next();
//			
//			try {
//			if(!con.equals("y") || !con.equals("n")) {
//				throw new ProperOptionValue("Plz enter Y or N");
//			}
//			}catch(Exception e) {
//		      System.out.print(e);
//			}
//			
//		} while (con.equalsIgnoreCase("y"));
	}
}
