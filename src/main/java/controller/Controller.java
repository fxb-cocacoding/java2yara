package controller;

import yara.YaraRule;

/** Controller class, used to generate a new YARA object.
 * @author Felix Bilstein
 * @author yara-signator (at) cocacoding (dot) com
 * @version 0.1
 * @since 0.1
*/
public class Controller {
	
	/**
	 * Returns a new YARA rule object
	 *
	 * @return      a new YaraRule object
	 * @see         Controller
	 */
	public YaraRule create() {
		return new YaraRule();
	}
}
