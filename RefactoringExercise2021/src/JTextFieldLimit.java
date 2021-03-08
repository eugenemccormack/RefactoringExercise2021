import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


class JTextFieldLimit extends PlainDocument {
	
  private int maxCharacters;
    
  
  JTextFieldLimit(int maxCharacters) {
	  
    super();
    this.maxCharacters = maxCharacters;
    
  }

  
  
  public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
	  
    if (str == null)
      return;

    if ((getLength() + str.length()) <= maxCharacters) 
      super.insertString(offset, str, attr);
    else
    	JOptionPane.showMessageDialog(null, "For input " + maxCharacters + " characters maximum!");
  }
}