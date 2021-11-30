import java.io.*;
import java.util.*;
class CombinationSum{
	public static ArrayList<ArrayList<Integer>> get(int[] arr, int sum){
		int n = arr.length;
		ArrayList<ArrayList<Integer>> ans = new ArrayList();
		ArrayList<Integer> temp = new ArrayList<>();
		dfs(arr, ans, sum, 0, temp, n);
		return ans;
	}
	public static void dfs(int[] arr, ArrayList<ArrayList<Integer>> ans, int sum, int index, ArrayList<Integer> temp, int n){
		if( sum == 0 ){
			System.out.println(temp.get(0));
			ans.add(new ArrayList<>(temp));
		}
		for(int i=index; i<n; i++){
			if( sum-arr[i] >= 0 ){
				temp.add(arr[i]);
				dfs(arr, ans, sum-arr[i], i, temp, n);
				temp.remove(temp.size()-1);
			}
		}
	}
	static final Scanner sn = new Scanner(System.in);
	static final Random rn = new Random();
	public static void main(String[] args) {
		int n = sn.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sn.nextInt();
			// System.out.print(arr[i]+" ");
		}
		// System.out.println();
		int sum = sn.nextInt();
		ArrayList<ArrayList<Integer>> ans = get(arr, sum);
		for(ArrayList<Integer> x : ans)
			System.out.println(x);
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
	static char[] chararr(String s){
		return s.toCharArray();
	}
}
