package yara;

import java.util.HashSet;
import java.util.Set;

/** Import class, used for the import section in YARA signatures.
 * @author Felix Bilstein
 * @author yara-signator (at) cocacoding (dot) com
 * @version 0.1
 * @since 0.1
*/
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
