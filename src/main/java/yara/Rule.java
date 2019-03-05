package yara;

public class Rule {
	public String name;
	private RuleMeta meta;
	private RuleStrings strings;
	private RuleCondition condition;
	
/*
	private String disclaimer =   "    /* DISCLAIMER\n"
								+ "     * The strings used in this rule have been automatically selected from the\n"
								+ "     * disassembly of memory dumps and unpacked files, using yara-signator.\n"
								+ "     * The code is published here:\n"
								+ "     *   <GITHUB?LINK>\n"
								+ "     * and the approach is described in detail here:\n"
								+ "     *   <GITHUB/BA?LINK>\n"
								+ "     *   <PAPER?LINK>\n"
								+ "     * As Malpedia is used as data source, please note that for a given\n"
								+ "     * number of families, only single samples are documented.\n"
								+ "     * This likely impacts the degree of generalization these rules will offer.\n"
								+ "     * Take the described generation method also into consideration when you\n"
								+ "     * apply the rules in your use cases and assign them confidence levels.\n"
								+ "     *\/\n\n";

*/

	private String disclaimer =   "    /* DISCLAIMER\n"
								+ "     * The strings used in this rule have been automatically selected from the\n"
								+ "     * disassembly of memory dumps and unpacked files, using yara-signator.\n"
								+ "     * The code and documentation / approach will be published in the near future here:\n"
								+ "     * https://github.com/fxb-cocacoding/yara-signator\n"
								+ "     * As Malpedia is used as data source, please note that for a given\n"
								+ "     * number of families, only single samples are documented.\n"
								+ "     * This likely impacts the degree of generalization these rules will offer.\n"
								+ "     * Take the described generation method also into consideration when you\n"
								+ "     * apply the rules in your use cases and assign them confidence levels.\n"
								+ "     */\n\n";
	
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
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("rule " + this.name + "_auto" + " {\n\n");
			sb.append("    meta:\n");
			sb.append(this.meta.toString() + "\n");
			
			sb.append(this.disclaimer);
			
			sb.append("    strings:\n");
			sb.append(this.strings.toString() + "");
			sb.append("    condition:\n");
			sb.append(this.condition.toString() + "\n");
		sb.append("}");
		return sb.toString();
	}
}
