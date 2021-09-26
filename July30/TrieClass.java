package July30;

import java.util.ArrayList;
import java.util.HashMap;

public class TrieClass {
	private class Node {
		Character data;
		boolean eow;
		HashMap<Character, Node> chidren = new HashMap<>();
	}

	private Node root = new Node();
	private int numwords = 0;
	private int numNodes = 1;

	public void addword(String str) {
		addword(str, root);
	}

	private void addword(String str, Node node) {
		if (str.length() == 0) {
			this.numwords++;
			node.eow = true;
			return;
		}
		Character ch = str.charAt(0);
		String ros = str.substring(1);
		Node child = node.chidren.get(ch);
		if (child == null) {
			child = new Node();
			this.numNodes++;
			child.data = ch;
			node.chidren.put(ch, child);
			addword(ros, child);
		} else {
			addword(ros, child);
		}
	}

	public boolean searchWord(String str) {
		return searchWord(str, root);
	}

	private boolean searchWord(String str, Node node) {
		if (str.length() == 0)
			return node.eow;

		Character ch = str.charAt(0);
		String ros = str.substring(1);
		Node child = node.chidren.get(ch);
		if (child == null) {
			return false;
		} else {
			return searchWord(ros, child);
		}

	}

	public void removeWord(String str) {
		removeWord(str, root);
	}

	private void removeWord(String str, Node node) {
		if (str.length() == 0) {
			node.eow = false;
			this.numwords--;
			return;
		}
		Character ch = str.charAt(0);
		String ros = str.substring(1);
		Node child = node.chidren.get(ch);
		if (child == null)
			return;
		else {
			removeWord(ros, child);
			if (child.eow == false && child.chidren.size() == 0)
				node.chidren.remove(ch);
			numNodes--;
		}

	}

	public void display() {
		display(root, "");
	}

	private void display(Node node, String osf) {
		if (node.eow)
			System.out.println(osf);

		ArrayList<Character> keys = new ArrayList<>(node.chidren.keySet());
		for (Character ch : keys) {
			Node child = node.chidren.get(ch);
			display(child, osf + ch);
		}
	}
}