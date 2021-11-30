import java.util.*;
class Trie{
	static class node{
		node[] children;
		boolean isEnd;
		node(){
			this.isEnd = false;
			this.children = new node[26];
			// Arrays.fill(this.children, null);
		}
	}
	static node root;
	static void insert(String s){
		node pcrawl = root;
		for(char ch : s.toCharArray()){
			if( pcrawl.children[ch-'a'] == null )
				pcrawl.children[ch-'a'] = new node();
			pcrawl = pcrawl.children[ch-'a'];
		}
		pcrawl.isEnd = true;
	}
	static boolean search(String s){
		node pcrawl = root;
		for(char ch : s.toCharArray()){
			if( pcrawl.children[ch-'a'] == null )
				return false;
			pcrawl = pcrawl.children[ch-'a'];
		}
		return pcrawl != null && pcrawl.isEnd;
	}
	public static final Scanner sn = new Scanner(System.in);
	public static void main(String[] args) {
		root = new node();
		while( true ){
			String s = sn.next();
			if( "000".equals(s) )
				break;
			insert(s);
		}
		System.out.println("search names : ");
		while( true ){
			String s = sn.next();
			if( "000".equals(s) )
				break;
			System.out.println(s+" : "+search(s));
		}
	}
}