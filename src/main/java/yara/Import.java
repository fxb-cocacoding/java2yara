package yara;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Import {
	private Set<String> imports;
	
	public Import() {
		imports = new HashSet<String>();
	}
	
	public void addImport(String imported) {
		imports.add(imported);
	}
	
	public void removeImport(String removeMe) {
		if(this.imports.contains(removeMe)) {
			this.imports.remove(removeMe);
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(String i : imports) {
			sb.append("import " + "\"");
			sb.append(i);
			sb.append("\"");
			sb.append("\n");
		}
		sb.append("\n");
		return sb.toString();
	}
}
