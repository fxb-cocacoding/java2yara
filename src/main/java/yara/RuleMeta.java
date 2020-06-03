package yara;

public class RuleMeta {
	private String author = new String();
	private String description = new String();
	private String date = new String();
	private String reference = new String();
	private String tool = new String();
	private String tool_config = new String();
	private String version = new String();
	private String malpedia_ref = new String();
	private String malpedia_rule_date = new String();
	private String malpedia_hash = new String();
	private String malpedia_version = new String();
	private String malpedia_license = new String();
	private String malpedia_sharing = new String();

	
	
	public String getMalpedia_rule_date() {
		return malpedia_rule_date;
	}
	public void setMalpedia_rule_date(String malpedia_rule_date) {
		this.malpedia_rule_date = malpedia_rule_date;
	}
	public String getMalpedia_hash() {
		return malpedia_hash;
	}
	public void setMalpedia_hash(String malpedia_hash) {
		this.malpedia_hash = malpedia_hash;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getMalpedia_ref() {
		return malpedia_ref;
	}
	public void setMalpedia_ref(String malpedia_ref) {
		this.malpedia_ref = malpedia_ref;
	}
	public String getMalpedia_version() {
		return malpedia_hash;
	}
	public void setMalpedia_version(String malpedia_version) {
		this.malpedia_hash = malpedia_version;
	}
	public String getMalpedia_license() {
		return malpedia_license;
	}
	public void setMalpedia_license(String malpedia_license) {
		this.malpedia_license = malpedia_license;
	}
	public String getMalpedia_sharing() {
		return malpedia_sharing;
	}
	public void setMalpedia_sharing(String malpedia_sharing) {
		this.malpedia_sharing = malpedia_sharing;
	}


	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getTool() {
		return tool;
	}
	public void setTool(String tool) {
		this.tool = tool;
	}
	
	public void setToolConfig(String wildcardConfig) {
		this.tool_config = wildcardConfig;
	}
	
	public String getToolConfig() {
		return this.tool_config;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("        author = \"" + this.author + "\"" + "\n");
		sb.append("        date = \"" + this.date + "\"" + "\n");
		sb.append("        version = \"" + this.version + "\"" + "\n");
		sb.append("        description = \"" + this.description + "\"" + "\n");
		sb.append("        tool = \"" + this.tool + "\"" + "\n");
		sb.append("        tool_config = \"" + this.tool_config + "\"" + "\n");
		
		sb.append("        malpedia_reference = \"" + this.malpedia_ref + "\"" + "\n");
		sb.append("        malpedia_rule_date = \"" + this.malpedia_rule_date + "\"" + "\n");
		sb.append("        malpedia_hash = \"" + this.malpedia_hash + "\"" + "\n");
		sb.append("        malpedia_version = \"" + this.malpedia_version + "\"" + "\n");
		sb.append("        malpedia_license = \"" + this.malpedia_license + "\"" + "\n");
		sb.append("        malpedia_sharing = \"" + this.malpedia_sharing + "\"" + "\n");
		return sb.toString();
	}
	
}
