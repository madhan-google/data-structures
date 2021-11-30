import java.io.*;
import java.util.*;
class SudokuChecker{
	public static boolean check(int[][] board){
		int n = board.length;
		//rows
		for(int i=0; i<n; i++){
			if( new ArrayList<Integer>(Arrays.asList(board[i])).size() != new HashSet<Integer>(Arrays.asList(board[i])).size() )
				return false;
		}
		//cols
		ArrayList<Integer> temp = list();
		for(int i=0; i<n; i++){
			temp.clear();
			for(int j=0; j<n; j++){
				temp.add(board[j][i]);
			}
			if( temp.size() != new HashSet<Integer>(temp).size() )
				return false;
		}
		//sub-grids
		
	}
	public static final int n = 9;
	static final Scanner sn = new Scanner(System.in);
	static final Random rn = new Random();
	public static void main(String[] args) {
		int[][] board = new int[n][n];
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				board = sn.nextInt();
		System.out.println(check(board));
	}

	static void fill(int[] ar, int n){
		Arrays.fill(ar, n);
	}
	static void clearScreen(){
		try{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	static ArrayList<Integer> list(){
		return new ArrayList<Integer>();
	}
	static HashSet<Integer> set(){
		return new HashSet<Integer>();
	}
	static char[] chararr(String s){
		return s.toCharArray();
	}
}
