<<<<<<< HEAD:BKTTH_01/Bai13/Main.java
//Author: MAIY 07!!
package BKTTH_01.Bai13;
=======
// Created 10/10/2024
// Author: MAIY07!!
package Bai13;
>>>>>>> b66927e00c624d9e9bcda4bbf71cb7ec11f24165:Bai13/Main.java

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			DaiLyQuanLy daiLy = new DaiLyQuanLy();
			daiLy.input(sc);
			
			daiLy.isValidMaDaiLy();
			System.out.println(daiLy.toString());
		}
		catch (InvalidMaDaiLyException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
