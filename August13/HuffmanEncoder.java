package August13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

import July31.GenericHeapClass;

public class HuffmanEncoder {
	private HashMap<Character, String> encoder = new HashMap<>();
	private HashMap<String, Character> decoder = new HashMap<>();

	public static class Node {
		Character data;
		int freq;
		Node left;
		Node right;
		private static final NodeComparator ctor = new NodeComparator();

		private static class NodeComparator implements Comparator<Node> {

			@Override
			public int compare(Node o1, Node o2) {
				return o2.freq - o1.freq;
			}

		}
	}

	public HuffmanEncoder(String feeder) {
		HashMap<Character, Integer> fm = new HashMap();
		for (int i = 0; i < feeder.length(); i++) {
			Character ch = feeder.charAt(i);
			if (fm.containsKey(ch))
				fm.put(ch, fm.get(ch) + 1);
			else
				fm.put(ch, 1);
		}
		GenericHeapClass<Node> heap = new GenericHeapClass<>(Node.ctor);
		ArrayList<Character> keys = new ArrayList<>(fm.keySet());
		for (Character key : keys) {
			Node node = new Node();
			node.data = key;
			node.freq = fm.get(key);
			heap.add(node);
		}
		while (heap.size() > 1) {
			Node one = heap.removeHP();
			Node two = heap.removeHP();
			Node merge = new Node();

			merge.freq = one.freq + two.freq;
			merge.left = one;
			merge.right = two;
			heap.add(merge);
		}
		Node finalNode = heap.removeHP();
		fillEncoderDecoder(finalNode, "");
	}

	private void fillEncoderDecoder(Node node, String osf) {
		if (node.left == null && node.right == null) {
			encoder.put(node.data, osf);
			decoder.put(osf, node.data);
			return;
		}

		fillEncoderDecoder(node.left, osf + "0");
		fillEncoderDecoder(node.right, osf + "1");
	}

	public String compress(String str) {
		String rv = "";
		for (int i = 0; i < str.length(); i++) {
			rv += encoder.get(str.charAt(i));
		}
		return rv;
	}

	public String decompress(String str) {
		String rv = "";
		String code = "";
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			code += ch;
			if (decoder.containsKey(code)) {
				rv += decoder.get(code);
				code = "";
			}
		}
		return rv;
	}
}
