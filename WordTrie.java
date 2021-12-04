import java.io.*;
import java.util.*;
class Node{
	Node[] childs;
	boolean isEnd;
	String s;
	Node(){
		this.isEnd = false;
		this.childs = new Node[26];
		this.s = "";
	}
}
class WordTrie{
	static Node root;
	WordTrie(){
		root =  new Node();
	}
	public static void insert(String s){
		Node node = root;
		for(char ch : s.toCharArray()){
			if(node.childs[ch-'a'] == null) node.childs[ch-'a'] = new Node();
			node = node.childs[ch-'a'];
		}
		node.isEnd = true;
		node.s = s;
	}
	public static void print(Node root){
		if(root == null) return;
		if(root.isEnd) System.out.println(root.s);
		for(int i=0; i<26; i++){
			print(root.childs[i]);
		}
	}
	public static void main(String[] args) {
		new WordTrie();
		insert("hello");
		insert("artificial");
		insert("help");
		insert("wrong");
		insert("java");
		insert("python");
		insert("execute");
		insert("owner");
		print(root);
	}
}