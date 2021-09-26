package August13;

public class HEncoderClient {

	public static void main(String[] args) {
		HuffmanEncoder he=new HuffmanEncoder("aaaaaaaabbbbbbbbaacbbcccdd");
		System.out.println(he.compress("aaabcbbda"));
		System.out.println(he.decompress("11111101010010011"));

	}

}
