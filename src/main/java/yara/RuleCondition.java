package yara;

public class RuleCondition {
	private String condition = new String();

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(condition);
		return sb.toString();
	}
}
