package P2.Example;
/*
 * public is the access modifier and it determines if other classes
 * can access this class or no
 */
public class TextBox {
	public String text = ""; //field
	
	public void setText(String text) {
		//field = parameter
		this.text = text;
	}
	public void clear() {
		// no para text for this fun so we have the choice to use 'this' or not
		text = ""; 
	}
}
