package yara;

/** Rule class, container object that contains all the sections.
 * @author Felix Bilstein
 * @author yara-signator (at) cocacoding (dot) com
 * @version 0.1
 * @since 0.1
*/
public class Rule {
	
	public String name = "";
	private RuleMeta meta;
	private RuleStrings strings;
	private RuleCondition condition;
	private String comment = "";
	
	public RuleMeta getMeta() {
		return meta;
	}
	public void setMeta(RuleMeta meta) {
		this.meta = meta;
	}
	public RuleStrings getStrings() {
		return strings;
	}
	public void setStrings(RuleStrings strings) {
		this.strings = strings;
	}
	public RuleCondition getCondition() {
		return condition;
	}
	public void setCondition(RuleCondition condition) {
		this.condition = condition;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("rule " + this.name + "_auto" + " {\n\n");
			sb.append("    meta:\n");
			sb.append(this.meta.toString() + "\n");
			
			sb.append(this.comment + "\n");
			
			sb.append("    strings:\n");
			sb.append(this.strings.toString() + "");
			sb.append("    condition:\n");
			sb.append(this.condition.toString() + "\n");
		sb.append("}");
		return sb.toString();
	}
}
