package antlr;

/* ANTLR Translator Generator
 * Project led by Terence Parr at http://www.jGuru.com
 * Software rights: http://www.antlr.org/license.html
 *
 * $Id: SemanticException.java,v 1.2 2005/10/20 12:22:43 alexa Exp $
 */

public class SemanticException extends RecognitionException {
    public SemanticException(String s) {
        super(s);
    }

    /** @deprecated As of ANTLR 2.7.2 use {@see #SemanticException(char, String, int, int) } */
	public SemanticException(String s, String fileName, int line) {
        this(s, fileName, line, -1);
    }

	public SemanticException(String s, String fileName, int line, int column) {
        super(s, fileName, line, column);
    }
}
