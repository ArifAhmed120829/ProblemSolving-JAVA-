package LeetCode_Solving;

import java.util.ArrayList;

public class Vowel_String {
	static class Solution {
		public int vowelStrings(String[] words, int left, int right) {
			ArrayList<Character> list = new ArrayList<>();
			char[] arr = { 'a', 'e', 'i', 'o', 'u' };
			int x = 0;
			for (char v : arr) {
				list.add(v);
			}
			for (int i = left; i <= right; i++) {
				String n = words[i];
				if (list.contains(n.charAt(0)) && list.contains(n.charAt(n.length() - 1))) {
					x++;
				}
			}
			return x;
		}
	}

	public static void main(String[] args) {
		Solution ref = new Solution();
		String[] w = { "hey", "aeo", "mu", "ooo", "artro" };
		System.out.println(ref.vowelStrings(w, 1, 4));

	}

}
