// Created 10/10/2024
// Author: MAIY07!!
package Bai13;

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
