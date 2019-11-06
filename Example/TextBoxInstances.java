package P2.Example;

public class TextBoxInstances {

	public static void main(String[] args) {
		// use 'var' as shortcut of TextBox textBox1 = new TextBox();
		TextBox textBox1 = new TextBox(); 
		TextBox textBox2 = new TextBox(); 
		textBox1.setText("Box 1"); //initial
		//System.out.println(textBox1.text);
		textBox2.setText("Box 2");
		System.out.println(textBox2.text.toUpperCase());

	}

}
