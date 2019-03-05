package yara;

public class YaraRule {
	private Import imports;
	private Rule rule;
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(imports != null) sb.append(imports.toString());
		sb.append(rule.toString());
		return sb.toString();
	}

	public Import getImports() {
		return imports;
	}

	public void setImports(Import imports) {
		this.imports = imports;
	}

	public Rule getRule() {
		return rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}
}
