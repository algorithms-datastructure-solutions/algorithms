import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author medany
 */

public class Contacts {

	public Integer[] solve(String[] lines, int f) {
		ContactsManager contacts = new ContactsManager();
		String operation, contact, pattern;
		Integer[] result = new Integer[f];
		int r = 0;
		for (String line : lines) {

			operation = line.split(" ")[0];

			if (operation.equals("add")) {
				contact = line.split(" ")[1];
				contacts.add(contact);
			} else if (operation.equals("find")) {
				pattern = line.split(" ")[1];
				result[r] = contacts.find(pattern);
				r++;
			}
		}
		return result;
	}
}

class ContactsManager {
	private Map<Character, Map<Character, List<String>>> book;

	public ContactsManager() {
		this.book = new TreeMap<>();
	}

	public void add(String name) {
		if (book.containsKey(name.charAt(0))) {
			if (book.get(name.charAt(0)).containsKey(name.charAt(1))) {
				book.get(name.charAt(0)).get(name.charAt(1)).add(name);
			} else {
				book.get(name.charAt(0)).put(name.charAt(1), new ArrayList<String>());
				book.get(name.charAt(0)).get(name.charAt(1)).add(name);
			}
		} else {
			book.put(name.charAt(0), new HashMap<Character, List<String>>());
			if (name.length() > 1) {
				book.get(name.charAt(0)).put(name.charAt(1), new ArrayList<String>());
				book.get(name.charAt(0)).get(name.charAt(1)).add(name);
			} else {
				book.get(name.charAt(0)).put(name.charAt(0), new ArrayList<String>());
				book.get(name.charAt(0)).get(name.charAt(0)).add(name);
			}
		}
	}

	public int find(String pattern) {
		int count = 0;
		if (pattern.length() < 2) {
			if (book.containsKey(pattern.charAt(0))) {
				for (List<String> list : book.get(pattern.charAt(0)).values())
					count += list.size();
			}
		} else {
			if (book.containsKey(pattern.charAt(0))) {
				if (book.get(pattern.charAt(0)).containsKey(pattern.charAt(1)))
					for (String contact : book.get(pattern.charAt(0)).get(pattern.charAt(1))) {
						if (contact.startsWith(pattern)) {
							count++;
						}
					}
			}
		}
		return count;

	}
}
