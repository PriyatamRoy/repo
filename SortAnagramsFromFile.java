package misc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class SortAnagramsFromFile {

	public static void main(String[] args) {

		File file = new File("C://Desktop//anagrams.txt");
		String line = null;
		try {
			BufferedReader is = new BufferedReader(new FileReader(file));
			Map<String, TreeSet<String>> map = new HashMap<>();
			try {
				while ((line = is.readLine()) != null) {
					String[] words = line.split(" ");

					for (int i = 0; i < words.length; i++) {
						String sorted = sortLetters(words[i]);
						if (!map.containsKey(sorted)) {
							map.put(sorted, new TreeSet<String>());
						}
						map.get(sorted).add(words[i]);
					}
				}

				for (Map.Entry<String, TreeSet<String>> entry : map.entrySet()) {
					for (String string : entry.getValue()) {
						System.out.print(string + "    ");
					}
					System.out.println("");
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String sortLetters(String str) {
		char[] arr = str.toCharArray();

		Arrays.sort(arr);

		return new String(arr);
	}

}
