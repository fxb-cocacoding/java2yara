package yara;

import java.util.ArrayList;
import java.util.List;

public class RuleStrings {
	private List<String> strings = new ArrayList<String>();

	public void addString(String s) {
		this.strings.add(s);
	}
	
	public List<String> getStrings() {
		return strings;
	}

	public void setStrings(List<String> strings) {
		this.strings = strings;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(String s : strings) {
			sb.append(s + "\n");
		}
		return sb.toString();
	}
}
