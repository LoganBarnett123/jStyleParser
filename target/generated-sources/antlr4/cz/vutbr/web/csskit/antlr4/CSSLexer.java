// Generated from CSSLexer.g4 by ANTLR 4.4
package cz.vutbr.web.csskit.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STYLESHEET=1, INLINESTYLE=2, ATBLOCK=3, CURLYBLOCK=4, PARENBLOCK=5, BRACKETBLOCK=6, 
		RULE=7, SELECTOR=8, ELEMENT=9, PSEUDOCLASS=10, PSEUDOELEM=11, ADJACENT=12, 
		PRECEDING=13, CHILD=14, DESCENDANT=15, ATTRIBUTE=16, SET=17, DECLARATION=18, 
		VALUE=19, MEDIA_QUERY=20, INVALID_STRING=21, INVALID_SELECTOR=22, INVALID_SELPART=23, 
		INVALID_DECLARATION=24, INVALID_STATEMENT=25, INVALID_ATSTATEMENT=26, 
		INVALID_IMPORT=27, INVALID_DIRECTIVE=28, IMPORTANT=29, IDENT=30, CHARSET=31, 
		IMPORT=32, KEYFRAMES=33, MEDIA=34, PAGE=35, MARGIN_AREA=36, VIEWPORT=37, 
		FONTFACE=38, ATKEYWORD=39, CLASSKEYWORD=40, STRING=41, UNCLOSED_STRING=42, 
		HASH=43, INDEX=44, NUMBER=45, PERCENTAGE=46, DIMENSION=47, URI=48, UNCLOSED_URI=49, 
		UNIRANGE=50, CDO=51, CDC=52, SEMICOLON=53, COLON=54, COMMA=55, QUESTION=56, 
		PERCENT=57, EQUALS=58, SLASH=59, GREATER=60, LESS=61, LCURLY=62, RCURLY=63, 
		APOS=64, QUOT=65, LPAREN=66, RPAREN=67, LBRACKET=68, RBRACKET=69, EXCLAMATION=70, 
		TILDE=71, MINUS=72, PLUS=73, ASTERISK=74, POUND=75, AMPERSAND=76, HAT=77, 
		S=78, COMMENT=79, SL_COMMENT=80, EXPRESSION=81, FUNCTION=82, INCLUDES=83, 
		DASHMATCH=84, STARTSWITH=85, ENDSWITH=86, CONTAINS=87, CTRL=88, INVALID_TOKEN=89, 
		STRING_MACR=90, UNCLOSED_STRING_MACR=91, STRING_CHAR=92;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'", 
		"'<'", "'='", "'>'", "'?'", "'@'", "'A'", "'B'", "'C'", "'D'", "'E'", 
		"'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", 
		"'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", 
		"'Z'", "'['", "'\\'"
	};
	public static final String[] ruleNames = {
		"IMPORTANT", "IDENT", "CHARSET", "IMPORT", "KEYFRAMES", "MEDIA", "PAGE", 
		"MARGIN_AREA", "VIEWPORT", "FONTFACE", "ATKEYWORD", "CLASSKEYWORD", "STRING", 
		"UNCLOSED_STRING", "HASH", "INDEX", "NUMBER", "PERCENTAGE", "DIMENSION", 
		"URI", "UNCLOSED_URI", "UNIRANGE", "CDO", "CDC", "SEMICOLON", "COLON", 
		"COMMA", "QUESTION", "PERCENT", "EQUALS", "SLASH", "GREATER", "LESS", 
		"LCURLY", "RCURLY", "APOS", "QUOT", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
		"EXCLAMATION", "TILDE", "MINUS", "PLUS", "ASTERISK", "POUND", "AMPERSAND", 
		"HAT", "S", "COMMENT", "SL_COMMENT", "EXPRESSION", "FUNCTION", "INCLUDES", 
		"DASHMATCH", "STARTSWITH", "ENDSWITH", "CONTAINS", "CTRL", "INVALID_TOKEN", 
		"IDENT_MACR", "NAME_MACR", "NAME_START", "NON_ASCII", "ESCAPE_CHAR", "NAME_CHAR", 
		"INTEGER_MACR", "NUMBER_MACR", "STRING_MACR", "UNCLOSED_STRING_MACR", 
		"STRING_CHAR", "URI_MACR", "URI_CHAR", "NL_CHAR", "W_MACR", "W_CHAR", 
		"CTRL_CHAR"
	};


	    // CSSLexer.g4 members start

	    private org.slf4j.Logger log;

	    // number of already processed tokens (for checking the beginning of the style sheet)
	    protected int tokencnt = 0;
	    
	    // 'charset changed' flag for preventing multiple @charset rules
	    protected boolean charsetChanged = false;

	    // current lexer state
	    protected cz.vutbr.web.csskit.antlr4.CSSLexerState ls;
	    
	    // last UNCLOSED_* token
	    protected cz.vutbr.web.csskit.antlr4.CSSToken lastUnclosed;

	    /**
	      * token facctory for generating custom tokens (CSSToken)
	      */
	    protected cz.vutbr.web.csskit.antlr4.CSSTokenFactory tf;
	    protected cz.vutbr.web.csskit.antlr4.CSSTokenRecovery tr;

	    /**
	     * This function must be called to initialize lexer's state.
	     * Because we can't change directly generated constructors.
	     */
	    public void init() {
	        this.log = org.slf4j.LoggerFactory.getLogger(getClass());
	        this.ls = new cz.vutbr.web.csskit.antlr4.CSSLexerState();
	        //initialize CSSTokenFactory
	        this.tf = new cz.vutbr.web.csskit.antlr4.CSSTokenFactory(_tokenFactorySourcePair, this, ls, getClass());
	        //initialize CSSTokenRecovery
	        this.tr = new cz.vutbr.web.csskit.antlr4.CSSTokenRecovery(this, _input, ls, log);
	    }

	    @Override
	    public void reset() {
	        throw new UnsupportedOperationException();
	    }

	    /**
	      * Overrides inputStream to avoid setting input
	      * stream after construction
	      */
	    @Override
	    public void setInputStream(IntStream input) {
	        throw new UnsupportedOperationException();
	    }

	    /**
	     * Overrides next token to match includes and to
	     * recover from EOF
	     */
		@Override
	    public Token nextToken(){
	       Token token = tr.nextToken();

	       //count non-empty tokens for eventual checking of the style sheet start
	       if (token.getType() == S) {
	           tokencnt++;
	       }
	       
	       //save last UNCLOSED_URI for later checking the EOF
	       if (token.getType() == UNCLOSED_URI) {
	           lastUnclosed = (CSSToken) token;
	           lastUnclosed.setValid(false);
	       }
	       //in case of EOF, convert the unclosed token to closed one
	       else if (token.getType() == Token.EOF) {
	           if (lastUnclosed != null) {
	               lastUnclosed.setValid(true);
	               log.debug("Validating UNCLOSED_URI by EOF");
	           }
	       }
	       //reset unclosed uri
	       else if (!tr.isAtEof())
	           lastUnclosed = null;

	       // Skip first token after switching on another input.
	       if(((CommonToken)token).getStartIndex() < 0)
	         token = nextToken();

	       return token;
	    }

	    /**
	     * Adds contextual information about nesting into token.
		 */
	    @Override
		public Token emit() {
	        Token t = tf.make();
	        emit(t);
	        return t;
		}

	    /**
	     * Does special token recovery for some cases
	     */
	    @Override
	    public void recover(RecognitionException re) {
	        log.debug("recover" + re.toString());
	        if (!tr.recover())
	            super.recover(re);
	    }
	    // CSSLexer.g4 members end


	public CSSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CSSLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 2: CHARSET_action((RuleContext)_localctx, actionIndex); break;
		case 12: STRING_action((RuleContext)_localctx, actionIndex); break;
		case 24: SEMICOLON_action((RuleContext)_localctx, actionIndex); break;
		case 33: LCURLY_action((RuleContext)_localctx, actionIndex); break;
		case 34: RCURLY_action((RuleContext)_localctx, actionIndex); break;
		case 35: APOS_action((RuleContext)_localctx, actionIndex); break;
		case 36: QUOT_action((RuleContext)_localctx, actionIndex); break;
		case 37: LPAREN_action((RuleContext)_localctx, actionIndex); break;
		case 38: RPAREN_action((RuleContext)_localctx, actionIndex); break;
		case 39: LBRACKET_action((RuleContext)_localctx, actionIndex); break;
		case 40: RBRACKET_action((RuleContext)_localctx, actionIndex); break;
		case 53: FUNCTION_action((RuleContext)_localctx, actionIndex); break;
		case 69: STRING_MACR_action((RuleContext)_localctx, actionIndex); break;
		case 70: UNCLOSED_STRING_MACR_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void UNCLOSED_STRING_MACR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16: ls.aposOpen=false; break;
		case 17: ls.quotOpen=false; break;
		}
	}
	private void LPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: ls.parenNest++;  break;
		}
	}
	private void LCURLY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: ls.curlyNest++; break;
		}
	}
	private void LBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:  ls.sqNest++;  break;
		}
	}
	private void RBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:  if(ls.sqNest>0) ls.sqNest--;  break;
		}
	}
	private void RPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:  if(ls.parenNest>0) ls.parenNest--;  break;
		}
	}
	private void APOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:  ls.aposOpen=!ls.aposOpen;  break;
		}
	}
	private void FUNCTION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13: ls.parenNest++;  break;
		}
	}
	private void QUOT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:  ls.quotOpen=!ls.quotOpen;  break;
		}
	}
	private void CHARSET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: 
			    tr.expecting(CHARSET);
		     break;
		case 1: 
			    // we have to trim manually
			    String enc = cz.vutbr.web.csskit.antlr4.CSSToken.extractCHARSET(getText());
			    if (tokencnt <= 1 && !charsetChanged) //we are at the beginning of the style sheet
			    {
		            try {
		                log.warn("Changing charset to {}", enc);
		                charsetChanged = true;
		                ((cz.vutbr.web.csskit.antlr4.CSSInputStream) _input).setEncoding(enc);
		            }
		            catch(java.nio.charset.IllegalCharsetNameException icne) {
		                log.warn("Could not change to unsupported charset!", icne);
		                throw new RuntimeException(new cz.vutbr.web.css.CSSException("Unsupported charset: " + enc));
		            }
		            catch (java.io.IOException e) {
		                log.warn("Could not change to unsupported charset!", e);
		            }
		        }
		        else{
		            log.warn("Ignoring @charset rule not at the beginning of the style sheet");
		        }

		        tr.end();
			   break;
		}
	}
	private void SEMICOLON_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:  ls.sqNest = 0;  break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: 
			    tr.expecting(STRING);
			 break;
		case 3: 
			    tr.end();
			 break;
		}
	}
	private void STRING_MACR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14: ls.aposOpen=false; break;
		case 15: ls.quotOpen=false; break;
		}
	}
	private void RCURLY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:  if(ls.curlyNest>0) ls.curlyNest--; ls.sqNest = 0;  break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2^\u034b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00b7"+
		"\n\4\f\4\16\4\u00ba\13\4\3\4\5\4\u00bd\n\4\3\4\7\4\u00c0\n\4\f\4\16\4"+
		"\u00c3\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u01ba\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u01d3\n"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\5\21\u01e4\n\21\3\21\3\21\7\21\u01e8\n\21\f\21\16\21\u01eb\13\21\3"+
		"\21\3\21\5\21\u01ef\n\21\3\21\7\21\u01f2\n\21\f\21\16\21\u01f5\13\21\3"+
		"\21\3\21\5\21\u01f9\n\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u020b\n\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0219\n\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0226\n\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u022f\n\27\5\27\u0231\n\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3"+
		"%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3"+
		".\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\6\63\u0278\n\63\r\63\16"+
		"\63\u0279\3\64\3\64\3\64\3\64\7\64\u0280\n\64\f\64\16\64\u0283\13\64\3"+
		"\64\3\64\3\64\5\64\u0288\n\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0290"+
		"\n\65\f\65\16\65\u0293\13\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\3"+
		"9\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\6=\u02b9\n=\r=\16=\u02ba\3>\3>\3"+
		"?\3?\7?\u02c1\n?\f?\16?\u02c4\13?\3@\6@\u02c7\n@\r@\16@\u02c8\3A\3A\3"+
		"A\5A\u02ce\nA\3B\3B\3C\3C\6C\u02d4\nC\rC\16C\u02d5\3C\5C\u02d9\nC\3C\5"+
		"C\u02dc\nC\3D\3D\3D\5D\u02e1\nD\3E\6E\u02e4\nE\rE\16E\u02e5\3F\6F\u02e9"+
		"\nF\rF\16F\u02ea\3F\7F\u02ee\nF\fF\16F\u02f1\13F\3F\3F\6F\u02f5\nF\rF"+
		"\16F\u02f6\5F\u02f9\nF\3G\3G\3G\3G\3G\7G\u0300\nG\fG\16G\u0303\13G\3G"+
		"\3G\3G\3G\3G\3G\3G\7G\u030c\nG\fG\16G\u030f\13G\3G\3G\5G\u0313\nG\3H\3"+
		"H\3H\3H\3H\7H\u031a\nH\fH\16H\u031d\13H\3H\3H\3H\3H\3H\7H\u0324\nH\fH"+
		"\16H\u0327\13H\5H\u0329\nH\3I\3I\3I\3I\5I\u032f\nI\3J\7J\u0332\nJ\fJ\16"+
		"J\u0335\13J\3K\3K\3K\5K\u033a\nK\3L\3L\3L\3L\5L\u0340\nL\3M\7M\u0343\n"+
		"M\fM\16M\u0346\13M\3N\3N\3O\3O\4\u0281\u0291\2P\3\37\5 \7!\t\"\13#\r$"+
		"\17%\21&\23\'\25(\27)\31*\33+\35,\37-!.#/%\60\'\61)\62+\63-\64/\65\61"+
		"\66\63\67\658\6799:;;=<?=A>C?E@GAIBKCMDOEQFSGUHWIYJ[K]L_MaNcOePgQiRkS"+
		"mToUqVsWuXwYyZ{[}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b"+
		"\2\u008d\\\u008f]\u0091^\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d"+
		"\2\3\2\16\4\2PPpp\6\2\62;AACHch\5\2\62;CHch\4\2\f\f\17\17\5\2C\\aac|\4"+
		"\2\u0082\ud801\ue002\uffff\b\2\"\61<BIbi\u0080\u0082\ud801\ue002\uffff"+
		"\7\2//\62;C\\aac|\4\2\"\"*+\6\2\13\13##%(,\u0080\4\2\13\17\"\"\4\2\2\n"+
		"\20!\u037f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3"+
		"\u009f\3\2\2\2\5\u00a9\3\2\2\2\7\u00ab\3\2\2\2\t\u00c7\3\2\2\2\13\u00cf"+
		"\3\2\2\2\r\u00da\3\2\2\2\17\u00e1\3\2\2\2\21\u01b9\3\2\2\2\23\u01bb\3"+
		"\2\2\2\25\u01c5\3\2\2\2\27\u01d0\3\2\2\2\31\u01d6\3\2\2\2\33\u01d9\3\2"+
		"\2\2\35\u01dd\3\2\2\2\37\u01df\3\2\2\2!\u01e3\3\2\2\2#\u01fa\3\2\2\2%"+
		"\u01fc\3\2\2\2\'\u01ff\3\2\2\2)\u0202\3\2\2\2+\u020f\3\2\2\2-\u021c\3"+
		"\2\2\2/\u0232\3\2\2\2\61\u0237\3\2\2\2\63\u023b\3\2\2\2\65\u023e\3\2\2"+
		"\2\67\u0240\3\2\2\29\u0242\3\2\2\2;\u0244\3\2\2\2=\u0246\3\2\2\2?\u0248"+
		"\3\2\2\2A\u024a\3\2\2\2C\u024c\3\2\2\2E\u024e\3\2\2\2G\u0251\3\2\2\2I"+
		"\u0254\3\2\2\2K\u0257\3\2\2\2M\u025a\3\2\2\2O\u025d\3\2\2\2Q\u0260\3\2"+
		"\2\2S\u0263\3\2\2\2U\u0266\3\2\2\2W\u0268\3\2\2\2Y\u026a\3\2\2\2[\u026c"+
		"\3\2\2\2]\u026e\3\2\2\2_\u0270\3\2\2\2a\u0272\3\2\2\2c\u0274\3\2\2\2e"+
		"\u0277\3\2\2\2g\u027b\3\2\2\2i\u028b\3\2\2\2k\u0298\3\2\2\2m\u02a4\3\2"+
		"\2\2o\u02a8\3\2\2\2q\u02ab\3\2\2\2s\u02ae\3\2\2\2u\u02b1\3\2\2\2w\u02b4"+
		"\3\2\2\2y\u02b8\3\2\2\2{\u02bc\3\2\2\2}\u02be\3\2\2\2\177\u02c6\3\2\2"+
		"\2\u0081\u02cd\3\2\2\2\u0083\u02cf\3\2\2\2\u0085\u02d1\3\2\2\2\u0087\u02e0"+
		"\3\2\2\2\u0089\u02e3\3\2\2\2\u008b\u02f8\3\2\2\2\u008d\u0312\3\2\2\2\u008f"+
		"\u0328\3\2\2\2\u0091\u032e\3\2\2\2\u0093\u0333\3\2\2\2\u0095\u0339\3\2"+
		"\2\2\u0097\u033f\3\2\2\2\u0099\u0344\3\2\2\2\u009b\u0347\3\2\2\2\u009d"+
		"\u0349\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7o\2\2\u00a1\u00a2\7r\2"+
		"\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6"+
		"\7c\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7v\2\2\u00a8\4\3\2\2\2\u00a9\u00aa"+
		"\5}?\2\u00aa\6\3\2\2\2\u00ab\u00ac\b\4\2\2\u00ac\u00ad\7B\2\2\u00ad\u00ae"+
		"\7e\2\2\u00ae\u00af\7j\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7t\2\2\u00b1"+
		"\u00b2\7u\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b8\3\2\2"+
		"\2\u00b5\u00b7\5e\63\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bd\5\u008dG\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c1"+
		"\3\2\2\2\u00be\u00c0\5e\63\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c4\u00c5\5\63\32\2\u00c5\u00c6\b\4\3\2\u00c6\b\3\2\2\2\u00c7\u00c8"+
		"\7B\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7o\2\2\u00ca\u00cb\7r\2\2\u00cb"+
		"\u00cc\7q\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7v\2\2\u00ce\n\3\2\2\2\u00cf"+
		"\u00d0\7B\2\2\u00d0\u00d1\7m\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7{\2\2"+
		"\u00d3\u00d4\7h\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7"+
		"\7o\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7u\2\2\u00d9\f\3\2\2\2\u00da\u00db"+
		"\7B\2\2\u00db\u00dc\7o\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7f\2\2\u00de"+
		"\u00df\7k\2\2\u00df\u00e0\7c\2\2\u00e0\16\3\2\2\2\u00e1\u00e2\7B\2\2\u00e2"+
		"\u00e3\7r\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7i\2\2\u00e5\u00e6\7g\2\2"+
		"\u00e6\20\3\2\2\2\u00e7\u00e8\7B\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7"+
		"q\2\2\u00ea\u00eb\7r\2\2\u00eb\u00ec\7/\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee"+
		"\7g\2\2\u00ee\u00ef\7h\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7/\2\2\u00f1"+
		"\u00f2\7e\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7p\2\2"+
		"\u00f5\u00f6\7g\2\2\u00f6\u01ba\7t\2\2\u00f7\u00f8\7B\2\2\u00f8\u00f9"+
		"\7v\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc\7/\2\2\u00fc"+
		"\u00fd\7n\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7h\2\2\u00ff\u01ba\7v\2\2"+
		"\u0100\u0101\7B\2\2\u0101\u0102\7v\2\2\u0102\u0103\7q\2\2\u0103\u0104"+
		"\7r\2\2\u0104\u0105\7/\2\2\u0105\u0106\7e\2\2\u0106\u0107\7g\2\2\u0107"+
		"\u0108\7p\2\2\u0108\u0109\7v\2\2\u0109\u010a\7g\2\2\u010a\u01ba\7t\2\2"+
		"\u010b\u010c\7B\2\2\u010c\u010d\7v\2\2\u010d\u010e\7q\2\2\u010e\u010f"+
		"\7r\2\2\u010f\u0110\7/\2\2\u0110\u0111\7t\2\2\u0111\u0112\7k\2\2\u0112"+
		"\u0113\7i\2\2\u0113\u0114\7j\2\2\u0114\u01ba\7v\2\2\u0115\u0116\7B\2\2"+
		"\u0116\u0117\7v\2\2\u0117\u0118\7q\2\2\u0118\u0119\7r\2\2\u0119\u011a"+
		"\7/\2\2\u011a\u011b\7t\2\2\u011b\u011c\7k\2\2\u011c\u011d\7i\2\2\u011d"+
		"\u011e\7j\2\2\u011e\u011f\7v\2\2\u011f\u0120\7/\2\2\u0120\u0121\7e\2\2"+
		"\u0121\u0122\7q\2\2\u0122\u0123\7t\2\2\u0123\u0124\7p\2\2\u0124\u0125"+
		"\7g\2\2\u0125\u01ba\7t\2\2\u0126\u0127\7B\2\2\u0127\u0128\7d\2\2\u0128"+
		"\u0129\7q\2\2\u0129\u012a\7v\2\2\u012a\u012b\7v\2\2\u012b\u012c\7q\2\2"+
		"\u012c\u012d\7o\2\2\u012d\u012e\7/\2\2\u012e\u012f\7n\2\2\u012f\u0130"+
		"\7g\2\2\u0130\u0131\7h\2\2\u0131\u0132\7v\2\2\u0132\u0133\7/\2\2\u0133"+
		"\u0134\7e\2\2\u0134\u0135\7q\2\2\u0135\u0136\7t\2\2\u0136\u0137\7p\2\2"+
		"\u0137\u0138\7g\2\2\u0138\u01ba\7t\2\2\u0139\u013a\7B\2\2\u013a\u013b"+
		"\7d\2\2\u013b\u013c\7q\2\2\u013c\u013d\7v\2\2\u013d\u013e\7v\2\2\u013e"+
		"\u013f\7q\2\2\u013f\u0140\7o\2\2\u0140\u0141\7/\2\2\u0141\u0142\7n\2\2"+
		"\u0142\u0143\7g\2\2\u0143\u0144\7h\2\2\u0144\u01ba\7v\2\2\u0145\u0146"+
		"\7B\2\2\u0146\u0147\7d\2\2\u0147\u0148\7q\2\2\u0148\u0149\7v\2\2\u0149"+
		"\u014a\7v\2\2\u014a\u014b\7q\2\2\u014b\u014c\7o\2\2\u014c\u014d\7/\2\2"+
		"\u014d\u014e\7e\2\2\u014e\u014f\7g\2\2\u014f\u0150\7p\2\2\u0150\u0151"+
		"\7v\2\2\u0151\u0152\7g\2\2\u0152\u01ba\7t\2\2\u0153\u0154\7B\2\2\u0154"+
		"\u0155\7d\2\2\u0155\u0156\7q\2\2\u0156\u0157\7v\2\2\u0157\u0158\7v\2\2"+
		"\u0158\u0159\7q\2\2\u0159\u015a\7o\2\2\u015a\u015b\7/\2\2\u015b\u015c"+
		"\7t\2\2\u015c\u015d\7k\2\2\u015d\u015e\7i\2\2\u015e\u015f\7j\2\2\u015f"+
		"\u01ba\7v\2\2\u0160\u0161\7B\2\2\u0161\u0162\7d\2\2\u0162\u0163\7q\2\2"+
		"\u0163\u0164\7v\2\2\u0164\u0165\7v\2\2\u0165\u0166\7q\2\2\u0166\u0167"+
		"\7o\2\2\u0167\u0168\7/\2\2\u0168\u0169\7t\2\2\u0169\u016a\7k\2\2\u016a"+
		"\u016b\7i\2\2\u016b\u016c\7j\2\2\u016c\u016d\7v\2\2\u016d\u016e\7/\2\2"+
		"\u016e\u016f\7e\2\2\u016f\u0170\7q\2\2\u0170\u0171\7t\2\2\u0171\u0172"+
		"\7p\2\2\u0172\u0173\7g\2\2\u0173\u01ba\7t\2\2\u0174\u0175\7B\2\2\u0175"+
		"\u0176\7n\2\2\u0176\u0177\7g\2\2\u0177\u0178\7h\2\2\u0178\u0179\7v\2\2"+
		"\u0179\u017a\7/\2\2\u017a\u017b\7v\2\2\u017b\u017c\7q\2\2\u017c\u01ba"+
		"\7r\2\2\u017d\u017e\7B\2\2\u017e\u017f\7n\2\2\u017f\u0180\7g\2\2\u0180"+
		"\u0181\7h\2\2\u0181\u0182\7v\2\2\u0182\u0183\7/\2\2\u0183\u0184\7o\2\2"+
		"\u0184\u0185\7k\2\2\u0185\u0186\7f\2\2\u0186\u0187\7f\2\2\u0187\u0188"+
		"\7n\2\2\u0188\u01ba\7g\2\2\u0189\u018a\7B\2\2\u018a\u018b\7n\2\2\u018b"+
		"\u018c\7g\2\2\u018c\u018d\7h\2\2\u018d\u018e\7v\2\2\u018e\u018f\7/\2\2"+
		"\u018f\u0190\7d\2\2\u0190\u0191\7q\2\2\u0191\u0192\7v\2\2\u0192\u0193"+
		"\7v\2\2\u0193\u0194\7q\2\2\u0194\u01ba\7o\2\2\u0195\u0196\7B\2\2\u0196"+
		"\u0197\7t\2\2\u0197\u0198\7k\2\2\u0198\u0199\7i\2\2\u0199\u019a\7j\2\2"+
		"\u019a\u019b\7v\2\2\u019b\u019c\7/\2\2\u019c\u019d\7v\2\2\u019d\u019e"+
		"\7q\2\2\u019e\u01ba\7r\2\2\u019f\u01a0\7B\2\2\u01a0\u01a1\7t\2\2\u01a1"+
		"\u01a2\7k\2\2\u01a2\u01a3\7i\2\2\u01a3\u01a4\7j\2\2\u01a4\u01a5\7v\2\2"+
		"\u01a5\u01a6\7/\2\2\u01a6\u01a7\7o\2\2\u01a7\u01a8\7k\2\2\u01a8\u01a9"+
		"\7f\2\2\u01a9\u01aa\7f\2\2\u01aa\u01ab\7n\2\2\u01ab\u01ba\7g\2\2\u01ac"+
		"\u01ad\7B\2\2\u01ad\u01ae\7t\2\2\u01ae\u01af\7k\2\2\u01af\u01b0\7i\2\2"+
		"\u01b0\u01b1\7j\2\2\u01b1\u01b2\7v\2\2\u01b2\u01b3\7/\2\2\u01b3\u01b4"+
		"\7d\2\2\u01b4\u01b5\7q\2\2\u01b5\u01b6\7v\2\2\u01b6\u01b7\7v\2\2\u01b7"+
		"\u01b8\7q\2\2\u01b8\u01ba\7o\2\2\u01b9\u00e7\3\2\2\2\u01b9\u00f7\3\2\2"+
		"\2\u01b9\u0100\3\2\2\2\u01b9\u010b\3\2\2\2\u01b9\u0115\3\2\2\2\u01b9\u0126"+
		"\3\2\2\2\u01b9\u0139\3\2\2\2\u01b9\u0145\3\2\2\2\u01b9\u0153\3\2\2\2\u01b9"+
		"\u0160\3\2\2\2\u01b9\u0174\3\2\2\2\u01b9\u017d\3\2\2\2\u01b9\u0189\3\2"+
		"\2\2\u01b9\u0195\3\2\2\2\u01b9\u019f\3\2\2\2\u01b9\u01ac\3\2\2\2\u01ba"+
		"\22\3\2\2\2\u01bb\u01bc\7B\2\2\u01bc\u01bd\7x\2\2\u01bd\u01be\7k\2\2\u01be"+
		"\u01bf\7g\2\2\u01bf\u01c0\7y\2\2\u01c0\u01c1\7r\2\2\u01c1\u01c2\7q\2\2"+
		"\u01c2\u01c3\7t\2\2\u01c3\u01c4\7v\2\2\u01c4\24\3\2\2\2\u01c5\u01c6\7"+
		"B\2\2\u01c6\u01c7\7h\2\2\u01c7\u01c8\7q\2\2\u01c8\u01c9\7p\2\2\u01c9\u01ca"+
		"\7v\2\2\u01ca\u01cb\7/\2\2\u01cb\u01cc\7h\2\2\u01cc\u01cd\7c\2\2\u01cd"+
		"\u01ce\7e\2\2\u01ce\u01cf\7g\2\2\u01cf\26\3\2\2\2\u01d0\u01d2\7B\2\2\u01d1"+
		"\u01d3\5Y-\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2"+
		"\2\u01d4\u01d5\5}?\2\u01d5\30\3\2\2\2\u01d6\u01d7\7\60\2\2\u01d7\u01d8"+
		"\5}?\2\u01d8\32\3\2\2\2\u01d9\u01da\b\16\4\2\u01da\u01db\5\u008dG\2\u01db"+
		"\u01dc\b\16\5\2\u01dc\34\3\2\2\2\u01dd\u01de\5\u008fH\2\u01de\36\3\2\2"+
		"\2\u01df\u01e0\5_\60\2\u01e0\u01e1\5\177@\2\u01e1 \3\2\2\2\u01e2\u01e4"+
		"\5\u0089E\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2"+
		"\2\u01e5\u01f8\t\2\2\2\u01e6\u01e8\5e\63\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb"+
		"\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ee\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01ec\u01ef\5[.\2\u01ed\u01ef\5Y-\2\u01ee\u01ec\3\2\2\2"+
		"\u01ee\u01ed\3\2\2\2\u01ef\u01f3\3\2\2\2\u01f0\u01f2\5e\63\2\u01f1\u01f0"+
		"\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u01f6\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7\5\u0089E\2\u01f7\u01f9"+
		"\3\2\2\2\u01f8\u01e9\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\"\3\2\2\2\u01fa"+
		"\u01fb\5\u008bF\2\u01fb$\3\2\2\2\u01fc\u01fd\5\u008bF\2\u01fd\u01fe\7"+
		"\'\2\2\u01fe&\3\2\2\2\u01ff\u0200\5\u008bF\2\u0200\u0201\5}?\2\u0201("+
		"\3\2\2\2\u0202\u0203\7w\2\2\u0203\u0204\7t\2\2\u0204\u0205\7n\2\2\u0205"+
		"\u0206\7*\2\2\u0206\u0207\3\2\2\2\u0207\u020a\5\u0099M\2\u0208\u020b\5"+
		"\u008dG\2\u0209\u020b\5\u0093J\2\u020a\u0208\3\2\2\2\u020a\u0209\3\2\2"+
		"\2\u020b\u020c\3\2\2\2\u020c\u020d\5\u0099M\2\u020d\u020e\7+\2\2\u020e"+
		"*\3\2\2\2\u020f\u0210\7w\2\2\u0210\u0211\7t\2\2\u0211\u0212\7n\2\2\u0212"+
		"\u0213\7*\2\2\u0213\u0214\3\2\2\2\u0214\u0218\5\u0099M\2\u0215\u0219\5"+
		"\u008dG\2\u0216\u0219\5\u008fH\2\u0217\u0219\5\u0093J\2\u0218\u0215\3"+
		"\2\2\2\u0218\u0216\3\2\2\2\u0218\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u021b\5\u0099M\2\u021b,\3\2\2\2\u021c\u021d\7W\2\2\u021d\u021e\7-\2\2"+
		"\u021e\u021f\3\2\2\2\u021f\u0220\t\3\2\2\u0220\u0221\t\3\2\2\u0221\u0222"+
		"\t\3\2\2\u0222\u0225\t\3\2\2\u0223\u0224\t\3\2\2\u0224\u0226\t\3\2\2\u0225"+
		"\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0230\3\2\2\2\u0227\u0228\7/"+
		"\2\2\u0228\u0229\t\4\2\2\u0229\u022a\t\4\2\2\u022a\u022b\t\4\2\2\u022b"+
		"\u022e\t\4\2\2\u022c\u022d\t\4\2\2\u022d\u022f\t\4\2\2\u022e\u022c\3\2"+
		"\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u0227\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231.\3\2\2\2\u0232\u0233\7>\2\2\u0233\u0234\7#\2\2\u0234"+
		"\u0235\7/\2\2\u0235\u0236\7/\2\2\u0236\60\3\2\2\2\u0237\u0238\7/\2\2\u0238"+
		"\u0239\7/\2\2\u0239\u023a\7@\2\2\u023a\62\3\2\2\2\u023b\u023c\7=\2\2\u023c"+
		"\u023d\b\32\6\2\u023d\64\3\2\2\2\u023e\u023f\7<\2\2\u023f\66\3\2\2\2\u0240"+
		"\u0241\7.\2\2\u02418\3\2\2\2\u0242\u0243\7A\2\2\u0243:\3\2\2\2\u0244\u0245"+
		"\7\'\2\2\u0245<\3\2\2\2\u0246\u0247\7?\2\2\u0247>\3\2\2\2\u0248\u0249"+
		"\7\61\2\2\u0249@\3\2\2\2\u024a\u024b\7@\2\2\u024bB\3\2\2\2\u024c\u024d"+
		"\7>\2\2\u024dD\3\2\2\2\u024e\u024f\7}\2\2\u024f\u0250\b#\7\2\u0250F\3"+
		"\2\2\2\u0251\u0252\7\177\2\2\u0252\u0253\b$\b\2\u0253H\3\2\2\2\u0254\u0255"+
		"\7)\2\2\u0255\u0256\b%\t\2\u0256J\3\2\2\2\u0257\u0258\7$\2\2\u0258\u0259"+
		"\b&\n\2\u0259L\3\2\2\2\u025a\u025b\7*\2\2\u025b\u025c\b\'\13\2\u025cN"+
		"\3\2\2\2\u025d\u025e\7+\2\2\u025e\u025f\b(\f\2\u025fP\3\2\2\2\u0260\u0261"+
		"\7]\2\2\u0261\u0262\b)\r\2\u0262R\3\2\2\2\u0263\u0264\7_\2\2\u0264\u0265"+
		"\b*\16\2\u0265T\3\2\2\2\u0266\u0267\7#\2\2\u0267V\3\2\2\2\u0268\u0269"+
		"\7\u0080\2\2\u0269X\3\2\2\2\u026a\u026b\7/\2\2\u026bZ\3\2\2\2\u026c\u026d"+
		"\7-\2\2\u026d\\\3\2\2\2\u026e\u026f\7,\2\2\u026f^\3\2\2\2\u0270\u0271"+
		"\7%\2\2\u0271`\3\2\2\2\u0272\u0273\7(\2\2\u0273b\3\2\2\2\u0274\u0275\7"+
		"`\2\2\u0275d\3\2\2\2\u0276\u0278\5\u009bN\2\u0277\u0276\3\2\2\2\u0278"+
		"\u0279\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027af\3\2\2\2"+
		"\u027b\u027c\7\61\2\2\u027c\u027d\7,\2\2\u027d\u0281\3\2\2\2\u027e\u0280"+
		"\13\2\2\2\u027f\u027e\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u0282\3\2\2\2"+
		"\u0281\u027f\3\2\2\2\u0282\u0287\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0285"+
		"\7,\2\2\u0285\u0288\7\61\2\2\u0286\u0288\7\2\2\3\u0287\u0284\3\2\2\2\u0287"+
		"\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\b\64\17\2\u028ah\3\2\2"+
		"\2\u028b\u028c\7\61\2\2\u028c\u028d\7\61\2\2\u028d\u0291\3\2\2\2\u028e"+
		"\u0290\13\2\2\2\u028f\u028e\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u0292\3"+
		"\2\2\2\u0291\u028f\3\2\2\2\u0292\u0294\3\2\2\2\u0293\u0291\3\2\2\2\u0294"+
		"\u0295\t\5\2\2\u0295\u0296\3\2\2\2\u0296\u0297\b\65\17\2\u0297j\3\2\2"+
		"\2\u0298\u0299\7g\2\2\u0299\u029a\7z\2\2\u029a\u029b\7r\2\2\u029b\u029c"+
		"\7t\2\2\u029c\u029d\7g\2\2\u029d\u029e\7u\2\2\u029e\u029f\7u\2\2\u029f"+
		"\u02a0\7k\2\2\u02a0\u02a1\7q\2\2\u02a1\u02a2\7p\2\2\u02a2\u02a3\7*\2\2"+
		"\u02a3l\3\2\2\2\u02a4\u02a5\5}?\2\u02a5\u02a6\7*\2\2\u02a6\u02a7\b\67"+
		"\20\2\u02a7n\3\2\2\2\u02a8\u02a9\7\u0080\2\2\u02a9\u02aa\7?\2\2\u02aa"+
		"p\3\2\2\2\u02ab\u02ac\7~\2\2\u02ac\u02ad\7?\2\2\u02adr\3\2\2\2\u02ae\u02af"+
		"\7`\2\2\u02af\u02b0\7?\2\2\u02b0t\3\2\2\2\u02b1\u02b2\7&\2\2\u02b2\u02b3"+
		"\7?\2\2\u02b3v\3\2\2\2\u02b4\u02b5\7,\2\2\u02b5\u02b6\7?\2\2\u02b6x\3"+
		"\2\2\2\u02b7\u02b9\5\u009dO\2\u02b8\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2"+
		"\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bbz\3\2\2\2\u02bc\u02bd\13"+
		"\2\2\2\u02bd|\3\2\2\2\u02be\u02c2\5\u0081A\2\u02bf\u02c1\5\u0087D\2\u02c0"+
		"\u02bf\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2"+
		"\2\2\u02c3~\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c7\5\u0087D\2\u02c6\u02c5"+
		"\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\u0080\3\2\2\2\u02ca\u02ce\t\6\2\2\u02cb\u02ce\5\u0083B\2\u02cc\u02ce"+
		"\5\u0085C\2\u02cd\u02ca\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02cc\3\2\2"+
		"\2\u02ce\u0082\3\2\2\2\u02cf\u02d0\t\7\2\2\u02d0\u0084\3\2\2\2\u02d1\u02db"+
		"\7^\2\2\u02d2\u02d4\t\4\2\2\u02d3\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5"+
		"\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02d9\5\u009b"+
		"N\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02dc\3\2\2\2\u02da"+
		"\u02dc\t\b\2\2\u02db\u02d3\3\2\2\2\u02db\u02da\3\2\2\2\u02dc\u0086\3\2"+
		"\2\2\u02dd\u02e1\t\t\2\2\u02de\u02e1\5\u0083B\2\u02df\u02e1\5\u0085C\2"+
		"\u02e0\u02dd\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02df\3\2\2\2\u02e1\u0088"+
		"\3\2\2\2\u02e2\u02e4\4\62;\2\u02e3\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5"+
		"\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u008a\3\2\2\2\u02e7\u02e9\4\62"+
		";\2\u02e8\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea"+
		"\u02eb\3\2\2\2\u02eb\u02f9\3\2\2\2\u02ec\u02ee\4\62;\2\u02ed\u02ec\3\2"+
		"\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0"+
		"\u02f2\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f4\7\60\2\2\u02f3\u02f5\4"+
		"\62;\2\u02f4\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6"+
		"\u02f7\3\2\2\2\u02f7\u02f9\3\2\2\2\u02f8\u02e8\3\2\2\2\u02f8\u02ef\3\2"+
		"\2\2\u02f9\u008c\3\2\2\2\u02fa\u0301\5K&\2\u02fb\u0300\5\u0091I\2\u02fc"+
		"\u02fd\5I%\2\u02fd\u02fe\bG\21\2\u02fe\u0300\3\2\2\2\u02ff\u02fb\3\2\2"+
		"\2\u02ff\u02fc\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0302"+
		"\3\2\2\2\u0302\u0304\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u0305\5K&\2\u0305"+
		"\u0313\3\2\2\2\u0306\u030d\5I%\2\u0307\u030c\5\u0091I\2\u0308\u0309\5"+
		"K&\2\u0309\u030a\bG\22\2\u030a\u030c\3\2\2\2\u030b\u0307\3\2\2\2\u030b"+
		"\u0308\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2"+
		"\2\2\u030e\u0310\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0311\5I%\2\u0311\u0313"+
		"\3\2\2\2\u0312\u02fa\3\2\2\2\u0312\u0306\3\2\2\2\u0313\u008e\3\2\2\2\u0314"+
		"\u031b\5K&\2\u0315\u031a\5\u0091I\2\u0316\u0317\5I%\2\u0317\u0318\bH\23"+
		"\2\u0318\u031a\3\2\2\2\u0319\u0315\3\2\2\2\u0319\u0316\3\2\2\2\u031a\u031d"+
		"\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u0329\3\2\2\2\u031d"+
		"\u031b\3\2\2\2\u031e\u0325\5I%\2\u031f\u0324\5\u0091I\2\u0320\u0321\5"+
		"K&\2\u0321\u0322\bH\24\2\u0322\u0324\3\2\2\2\u0323\u031f\3\2\2\2\u0323"+
		"\u0320\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2"+
		"\2\2\u0326\u0329\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u0314\3\2\2\2\u0328"+
		"\u031e\3\2\2\2\u0329\u0090\3\2\2\2\u032a\u032f\5\u0095K\2\u032b\u032f"+
		"\t\n\2\2\u032c\u032d\7^\2\2\u032d\u032f\5\u0097L\2\u032e\u032a\3\2\2\2"+
		"\u032e\u032b\3\2\2\2\u032e\u032c\3\2\2\2\u032f\u0092\3\2\2\2\u0330\u0332"+
		"\5\u0095K\2\u0331\u0330\3\2\2\2\u0332\u0335\3\2\2\2\u0333\u0331\3\2\2"+
		"\2\u0333\u0334\3\2\2\2\u0334\u0094\3\2\2\2\u0335\u0333\3\2\2\2\u0336\u033a"+
		"\t\13\2\2\u0337\u033a\5\u0083B\2\u0338\u033a\5\u0085C\2\u0339\u0336\3"+
		"\2\2\2\u0339\u0337\3\2\2\2\u0339\u0338\3\2\2\2\u033a\u0096\3\2\2\2\u033b"+
		"\u0340\7\f\2\2\u033c\u033d\7\17\2\2\u033d\u0340\7\f\2\2\u033e\u0340\4"+
		"\16\17\2\u033f\u033b\3\2\2\2\u033f\u033c\3\2\2\2\u033f\u033e\3\2\2\2\u0340"+
		"\u0098\3\2\2\2\u0341\u0343\5\u009bN\2\u0342\u0341\3\2\2\2\u0343\u0346"+
		"\3\2\2\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u009a\3\2\2\2\u0346"+
		"\u0344\3\2\2\2\u0347\u0348\t\f\2\2\u0348\u009c\3\2\2\2\u0349\u034a\t\r"+
		"\2\2\u034a\u009e\3\2\2\2\62\2\u00b8\u00bc\u00c1\u01b9\u01d2\u01e3\u01e9"+
		"\u01ee\u01f3\u01f8\u020a\u0218\u0225\u022e\u0230\u0279\u0281\u0287\u0291"+
		"\u02ba\u02c2\u02c8\u02cd\u02d5\u02d8\u02db\u02e0\u02e5\u02ea\u02ef\u02f6"+
		"\u02f8\u02ff\u0301\u030b\u030d\u0312\u0319\u031b\u0323\u0325\u0328\u032e"+
		"\u0333\u0339\u033f\u0344\25\3\4\2\3\4\3\3\16\4\3\16\5\3\32\6\3#\7\3$\b"+
		"\3%\t\3&\n\3\'\13\3(\f\3)\r\3*\16\2\3\2\3\67\17\3G\20\3G\21\3H\22\3H\23";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}