// Generated from CSSParser.g4 by ANTLR 4.4
package cz.vutbr.web.csskit.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		UNCLOSED_STRING_MACR=91, CDC=52, PSEUDOELEM=11, INVALID_SELECTOR=22, CLASSKEYWORD=40, 
		ATBLOCK=3, VALUE=19, ADJACENT=12, CDO=51, MINUS=72, DIMENSION=47, STYLESHEET=1, 
		MARGIN_AREA=36, SEMICOLON=53, MEDIA=34, INVALID_STRING=21, INDEX=44, PSEUDOCLASS=10, 
		DESCENDANT=15, AMPERSAND=76, PARENBLOCK=5, INVALID_STATEMENT=25, NUMBER=45, 
		INLINESTYLE=2, ATTRIBUTE=16, ENDSWITH=86, IMPORTANT=29, LPAREN=66, PAGE=35, 
		RPAREN=67, INVALID_ATSTATEMENT=26, CHILD=14, UNCLOSED_URI=49, FUNCTION=82, 
		HASH=43, QUOT=65, DECLARATION=18, ATKEYWORD=39, UNCLOSED_STRING=42, LESS=61, 
		PLUS=73, SET=17, MEDIA_QUERY=20, INVALID_SELPART=23, INCLUDES=83, CONTAINS=87, 
		STRING_CHAR=92, URI=48, APOS=64, QUESTION=56, COMMENT=79, UNIRANGE=50, 
		IMPORT=32, S=78, FONTFACE=38, STARTSWITH=85, BRACKETBLOCK=6, RULE=7, INVALID_DECLARATION=24, 
		RCURLY=63, VIEWPORT=37, COMMA=55, POUND=75, INVALID_IMPORT=27, EQUALS=58, 
		DASHMATCH=84, SLASH=59, GREATER=60, INVALID_DIRECTIVE=28, LCURLY=62, LBRACKET=68, 
		ASTERISK=74, COLON=54, RBRACKET=69, PERCENTAGE=46, CURLYBLOCK=4, PRECEDING=13, 
		ELEMENT=9, SELECTOR=8, IDENT=30, CHARSET=31, CTRL=88, PERCENT=57, EXCLAMATION=70, 
		INVALID_TOKEN=89, KEYFRAMES=33, SL_COMMENT=80, STRING=41, TILDE=71, HAT=77, 
		STRING_MACR=90, EXPRESSION=81;
	public static final String[] tokenNames = {
		"<INVALID>", "STYLESHEET", "INLINESTYLE", "ATBLOCK", "CURLYBLOCK", "PARENBLOCK", 
		"BRACKETBLOCK", "RULE", "SELECTOR", "ELEMENT", "PSEUDOCLASS", "PSEUDOELEM", 
		"ADJACENT", "PRECEDING", "CHILD", "DESCENDANT", "ATTRIBUTE", "SET", "DECLARATION", 
		"VALUE", "MEDIA_QUERY", "INVALID_STRING", "INVALID_SELECTOR", "INVALID_SELPART", 
		"INVALID_DECLARATION", "INVALID_STATEMENT", "INVALID_ATSTATEMENT", "INVALID_IMPORT", 
		"INVALID_DIRECTIVE", "'important'", "IDENT", "CHARSET", "'@import'", "'@keyframes'", 
		"'@media'", "'@page'", "MARGIN_AREA", "'@viewport'", "'@font-face'", "ATKEYWORD", 
		"CLASSKEYWORD", "STRING", "UNCLOSED_STRING", "HASH", "INDEX", "NUMBER", 
		"PERCENTAGE", "DIMENSION", "URI", "UNCLOSED_URI", "UNIRANGE", "CDO", "CDC", 
		"';'", "':'", "','", "'?'", "'%'", "'='", "'/'", "'>'", "'<'", "'{'", 
		"'}'", "'''", "'\"'", "'('", "')'", "'['", "']'", "'!'", "'~'", "'-'", 
		"'+'", "'*'", "'#'", "'&'", "'^'", "S", "COMMENT", "SL_COMMENT", "EXPRESSION", 
		"FUNCTION", "'~='", "'|='", "'^='", "'$='", "'*='", "CTRL", "INVALID_TOKEN", 
		"STRING_MACR", "UNCLOSED_STRING_MACR", "STRING_CHAR"
	};
	public static final int
		RULE_inlinestyle = 0, RULE_stylesheet = 1, RULE_statement = 2, RULE_atstatement = 3, 
		RULE_import_uri = 4, RULE_page = 5, RULE_margin_rule = 6, RULE_inlineset = 7, 
		RULE_media = 8, RULE_media_query = 9, RULE_media_term = 10, RULE_media_expression = 11, 
		RULE_media_rule = 12, RULE_keyframes_name = 13, RULE_keyframe_block = 14, 
		RULE_keyframe_selector = 15, RULE_unknown_atrule = 16, RULE_unknown_atrule_body = 17, 
		RULE_ruleset = 18, RULE_declarations = 19, RULE_declaration = 20, RULE_important = 21, 
		RULE_property = 22, RULE_terms = 23, RULE_term = 24, RULE_funct = 25, 
		RULE_valuepart = 26, RULE_funct_args = 27, RULE_funct_argument = 28, RULE_combined_selector = 29, 
		RULE_combinator = 30, RULE_selector = 31, RULE_selpart = 32, RULE_attribute = 33, 
		RULE_pseudo = 34, RULE_string = 35, RULE_bracketed_idents = 36, RULE_ident_list_item = 37, 
		RULE_any = 38, RULE_nostatement = 39, RULE_noprop = 40, RULE_norule = 41, 
		RULE_nomediaquery = 42;
	public static final String[] ruleNames = {
		"inlinestyle", "stylesheet", "statement", "atstatement", "import_uri", 
		"page", "margin_rule", "inlineset", "media", "media_query", "media_term", 
		"media_expression", "media_rule", "keyframes_name", "keyframe_block", 
		"keyframe_selector", "unknown_atrule", "unknown_atrule_body", "ruleset", 
		"declarations", "declaration", "important", "property", "terms", "term", 
		"funct", "valuepart", "funct_args", "funct_argument", "combined_selector", 
		"combinator", "selector", "selpart", "attribute", "pseudo", "string", 
		"bracketed_idents", "ident_list_item", "any", "nostatement", "noprop", 
		"norule", "nomediaquery"
	};

	@Override
	public String getGrammarFileName() { return "CSSParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    // logger
	    private org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(getClass());

	    // function level e.g. function(function(function()))
	    private int functLevel = 0;

	    /**
	     * Obtains the current
	     
	      lexer state from current token
	     */
	    private cz.vutbr.web.csskit.antlr4.CSSLexerState getCurrentLexerState(Token t){
	        if (t instanceof cz.vutbr.web.csskit.antlr4.CSSToken){
	            return ((cz.vutbr.web.csskit.antlr4.CSSToken) t).getLexerState();
	        }
	        return null;
	    }

	    /**
	      * get overtyped error strategy
	      * - strategy must be set to CSSErrorStrategy before parsing !!
	      */
	    private CSSErrorStrategy getCSSErrorHandler(){
	        if(this._errHandler instanceof CSSErrorStrategy){
	            return ((CSSErrorStrategy) this._errHandler);
	        }
	        log.error("ERROR STRATEGY IS NOT OF TYPE CSSErrorStrategy");
	        return null;
	    }


	public CSSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InlinestyleContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public InlinesetContext inlineset(int i) {
			return getRuleContext(InlinesetContext.class,i);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public List<InlinesetContext> inlineset() {
			return getRuleContexts(InlinesetContext.class);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public InlinestyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlinestyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterInlinestyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitInlinestyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitInlinestyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlinestyleContext inlinestyle() throws RecognitionException {
		InlinestyleContext _localctx = new InlinestyleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inlinestyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(86); match(S);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(92); declarations();
				}
				break;
			case 2:
				{
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(93); inlineset();
					}
					}
					setState(96); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COLON || _la==LCURLY );
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | inlinestyle | should be EMPTY");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StylesheetContext extends ParserRuleContext {
		public TerminalNode CDO(int i) {
			return getToken(CSSParser.CDO, i);
		}
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<TerminalNode> CDC() { return getTokens(CSSParser.CDC); }
		public List<NostatementContext> nostatement() {
			return getRuleContexts(NostatementContext.class);
		}
		public TerminalNode CDC(int i) {
			return getToken(CSSParser.CDC, i);
		}
		public List<TerminalNode> CDO() { return getTokens(CSSParser.CDO); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public NostatementContext nostatement(int i) {
			return getRuleContext(NostatementContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INVALID_STRING) | (1L << INVALID_SELPART) | (1L << IDENT) | (1L << CHARSET) | (1L << IMPORT) | (1L << KEYFRAMES) | (1L << MEDIA) | (1L << PAGE) | (1L << VIEWPORT) | (1L << FONTFACE) | (1L << ATKEYWORD) | (1L << CLASSKEYWORD) | (1L << STRING) | (1L << UNCLOSED_STRING) | (1L << HASH) | (1L << NUMBER) | (1L << PERCENTAGE) | (1L << DIMENSION) | (1L << URI) | (1L << UNCLOSED_URI) | (1L << UNIRANGE) | (1L << CDO) | (1L << CDC) | (1L << SEMICOLON) | (1L << COLON) | (1L << COMMA) | (1L << QUESTION) | (1L << PERCENT) | (1L << EQUALS) | (1L << SLASH) | (1L << GREATER) | (1L << LESS) | (1L << LCURLY) | (1L << RCURLY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (APOS - 64)) | (1L << (QUOT - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACKET - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (MINUS - 64)) | (1L << (PLUS - 64)) | (1L << (ASTERISK - 64)) | (1L << (POUND - 64)) | (1L << (AMPERSAND - 64)) | (1L << (HAT - 64)) | (1L << (S - 64)) | (1L << (INCLUDES - 64)) | (1L << (DASHMATCH - 64)) | (1L << (CTRL - 64)) | (1L << (INVALID_TOKEN - 64)))) != 0)) {
				{
				setState(105);
				switch (_input.LA(1)) {
				case CDO:
					{
					setState(100); match(CDO);
					}
					break;
				case CDC:
					{
					setState(101); match(CDC);
					}
					break;
				case S:
					{
					setState(102); match(S);
					}
					break;
				case SEMICOLON:
				case RCURLY:
				case APOS:
				case QUOT:
					{
					setState(103); nostatement();
					}
					break;
				case INVALID_STRING:
				case INVALID_SELPART:
				case IDENT:
				case CHARSET:
				case IMPORT:
				case KEYFRAMES:
				case MEDIA:
				case PAGE:
				case VIEWPORT:
				case FONTFACE:
				case ATKEYWORD:
				case CLASSKEYWORD:
				case STRING:
				case UNCLOSED_STRING:
				case HASH:
				case NUMBER:
				case PERCENTAGE:
				case DIMENSION:
				case URI:
				case UNCLOSED_URI:
				case UNIRANGE:
				case COLON:
				case COMMA:
				case QUESTION:
				case PERCENT:
				case EQUALS:
				case SLASH:
				case GREATER:
				case LESS:
				case LCURLY:
				case RPAREN:
				case LBRACKET:
				case EXCLAMATION:
				case MINUS:
				case PLUS:
				case ASTERISK:
				case POUND:
				case AMPERSAND:
				case HAT:
				case INCLUDES:
				case DASHMATCH:
				case CTRL:
				case INVALID_TOKEN:
					{
					setState(104); statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | stylesheet | should be EMPTY");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AtstatementContext atstatement() {
			return getRuleContext(AtstatementContext.class,0);
		}
		public RulesetContext ruleset() {
			return getRuleContext(RulesetContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(112);
			switch (_input.LA(1)) {
			case INVALID_STRING:
			case INVALID_SELPART:
			case IDENT:
			case CLASSKEYWORD:
			case STRING:
			case UNCLOSED_STRING:
			case HASH:
			case NUMBER:
			case PERCENTAGE:
			case DIMENSION:
			case URI:
			case UNCLOSED_URI:
			case UNIRANGE:
			case COLON:
			case COMMA:
			case QUESTION:
			case PERCENT:
			case EQUALS:
			case SLASH:
			case GREATER:
			case LESS:
			case LCURLY:
			case RPAREN:
			case LBRACKET:
			case EXCLAMATION:
			case MINUS:
			case PLUS:
			case ASTERISK:
			case POUND:
			case AMPERSAND:
			case HAT:
			case INCLUDES:
			case DASHMATCH:
			case CTRL:
			case INVALID_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(110); ruleset();
				}
				break;
			case CHARSET:
			case IMPORT:
			case KEYFRAMES:
			case MEDIA:
			case PAGE:
			case VIEWPORT:
			case FONTFACE:
			case ATKEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(111); atstatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | statement | should be EMPTY");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtstatementContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TerminalNode KEYFRAMES() { return getToken(CSSParser.KEYFRAMES, 0); }
		public Keyframe_blockContext keyframe_block(int i) {
			return getRuleContext(Keyframe_blockContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(CSSParser.SEMICOLON, 0); }
		public Media_ruleContext media_rule(int i) {
			return getRuleContext(Media_ruleContext.class,i);
		}
		public Unknown_atruleContext unknown_atrule() {
			return getRuleContext(Unknown_atruleContext.class,0);
		}
		public MediaContext media() {
			return getRuleContext(MediaContext.class,0);
		}
		public Import_uriContext import_uri() {
			return getRuleContext(Import_uriContext.class,0);
		}
		public TerminalNode FONTFACE() { return getToken(CSSParser.FONTFACE, 0); }
		public List<Media_ruleContext> media_rule() {
			return getRuleContexts(Media_ruleContext.class);
		}
		public TerminalNode LCURLY() { return getToken(CSSParser.LCURLY, 0); }
		public TerminalNode VIEWPORT() { return getToken(CSSParser.VIEWPORT, 0); }
		public Keyframes_nameContext keyframes_name() {
			return getRuleContext(Keyframes_nameContext.class,0);
		}
		public TerminalNode CHARSET() { return getToken(CSSParser.CHARSET, 0); }
		public PageContext page() {
			return getRuleContext(PageContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode MEDIA() { return getToken(CSSParser.MEDIA, 0); }
		public TerminalNode RCURLY() { return getToken(CSSParser.RCURLY, 0); }
		public TerminalNode IMPORT() { return getToken(CSSParser.IMPORT, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public List<Keyframe_blockContext> keyframe_block() {
			return getRuleContexts(Keyframe_blockContext.class);
		}
		public AtstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterAtstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitAtstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitAtstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtstatementContext atstatement() throws RecognitionException {
		AtstatementContext _localctx = new AtstatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atstatement);
		int _la;
		try {
			setState(235);
			switch (_input.LA(1)) {
			case CHARSET:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); match(CHARSET);
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); match(IMPORT);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(116); match(S);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122); import_uri();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(123); match(S);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INVALID_STRING) | (1L << IDENT) | (1L << STRING) | (1L << UNCLOSED_STRING) | (1L << NUMBER) | (1L << PERCENTAGE) | (1L << DIMENSION) | (1L << URI) | (1L << UNCLOSED_URI) | (1L << UNIRANGE) | (1L << COLON) | (1L << QUESTION) | (1L << PERCENT) | (1L << EQUALS) | (1L << SLASH) | (1L << GREATER) | (1L << LESS))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LPAREN - 66)) | (1L << (RPAREN - 66)) | (1L << (EXCLAMATION - 66)) | (1L << (MINUS - 66)) | (1L << (PLUS - 66)) | (1L << (ASTERISK - 66)) | (1L << (POUND - 66)) | (1L << (AMPERSAND - 66)) | (1L << (HAT - 66)) | (1L << (FUNCTION - 66)) | (1L << (INCLUDES - 66)) | (1L << (DASHMATCH - 66)) | (1L << (CTRL - 66)))) != 0)) {
					{
					setState(129); media();
					}
				}

				setState(132); match(SEMICOLON);
				}
				break;
			case PAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(134); page();
				}
				break;
			case VIEWPORT:
				enterOuterAlt(_localctx, 4);
				{
				setState(135); match(VIEWPORT);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(136); match(S);
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142); match(LCURLY);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(143); match(S);
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149); declarations();
				setState(150); match(RCURLY);
				}
				break;
			case FONTFACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(152); match(FONTFACE);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(153); match(S);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159); match(LCURLY);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(160); match(S);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166); declarations();
				setState(167); match(RCURLY);
				}
				break;
			case MEDIA:
				enterOuterAlt(_localctx, 6);
				{
				setState(169); match(MEDIA);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(170); match(S);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INVALID_STRING) | (1L << IDENT) | (1L << STRING) | (1L << UNCLOSED_STRING) | (1L << NUMBER) | (1L << PERCENTAGE) | (1L << DIMENSION) | (1L << URI) | (1L << UNCLOSED_URI) | (1L << UNIRANGE) | (1L << COLON) | (1L << QUESTION) | (1L << PERCENT) | (1L << EQUALS) | (1L << SLASH) | (1L << GREATER) | (1L << LESS))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LPAREN - 66)) | (1L << (RPAREN - 66)) | (1L << (EXCLAMATION - 66)) | (1L << (MINUS - 66)) | (1L << (PLUS - 66)) | (1L << (ASTERISK - 66)) | (1L << (POUND - 66)) | (1L << (AMPERSAND - 66)) | (1L << (HAT - 66)) | (1L << (FUNCTION - 66)) | (1L << (INCLUDES - 66)) | (1L << (DASHMATCH - 66)) | (1L << (CTRL - 66)))) != 0)) {
					{
					setState(176); media();
					}
				}

				setState(179); match(LCURLY);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(180); match(S);
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INVALID_STRING) | (1L << INVALID_SELPART) | (1L << IDENT) | (1L << CHARSET) | (1L << IMPORT) | (1L << KEYFRAMES) | (1L << MEDIA) | (1L << PAGE) | (1L << VIEWPORT) | (1L << FONTFACE) | (1L << ATKEYWORD) | (1L << CLASSKEYWORD) | (1L << STRING) | (1L << UNCLOSED_STRING) | (1L << HASH) | (1L << NUMBER) | (1L << PERCENTAGE) | (1L << DIMENSION) | (1L << URI) | (1L << UNCLOSED_URI) | (1L << UNIRANGE) | (1L << COLON) | (1L << COMMA) | (1L << QUESTION) | (1L << PERCENT) | (1L << EQUALS) | (1L << SLASH) | (1L << GREATER) | (1L << LESS) | (1L << LCURLY))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (RPAREN - 67)) | (1L << (LBRACKET - 67)) | (1L << (EXCLAMATION - 67)) | (1L << (MINUS - 67)) | (1L << (PLUS - 67)) | (1L << (ASTERISK - 67)) | (1L << (POUND - 67)) | (1L << (AMPERSAND - 67)) | (1L << (HAT - 67)) | (1L << (INCLUDES - 67)) | (1L << (DASHMATCH - 67)) | (1L << (CTRL - 67)) | (1L << (INVALID_TOKEN - 67)))) != 0)) {
					{
					{
					setState(186); media_rule();
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==S) {
						{
						{
						setState(187); match(S);
						}
						}
						setState(192);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198); match(RCURLY);
				}
				break;
			case KEYFRAMES:
				enterOuterAlt(_localctx, 7);
				{
				setState(199); match(KEYFRAMES);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(200); match(S);
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206); keyframes_name();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(207); match(S);
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213); match(LCURLY);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(214); match(S);
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT || _la==PERCENTAGE) {
					{
					{
					setState(220); keyframe_block();
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==S) {
						{
						{
						setState(221); match(S);
						}
						}
						setState(226);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232); match(RCURLY);
				}
				break;
			case ATKEYWORD:
				enterOuterAlt(_localctx, 8);
				{
				setState(234); unknown_atrule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | atstatement consume until RCURLY | SEMICOLON");
			        IntervalSet intervalSet = new IntervalSet(RCURLY, SEMICOLON);
			        getCSSErrorHandler().consumeUntilGreedy(this, intervalSet);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_ATSTATEMENT, "INVALID_ATSTATEMENT"));
			     
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_uriContext extends ParserRuleContext {
		public TerminalNode UNCLOSED_STRING() { return getToken(CSSParser.UNCLOSED_STRING, 0); }
		public TerminalNode UNCLOSED_URI() { return getToken(CSSParser.UNCLOSED_URI, 0); }
		public TerminalNode STRING() { return getToken(CSSParser.STRING, 0); }
		public TerminalNode URI() { return getToken(CSSParser.URI, 0); }
		public Import_uriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_uri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterImport_uri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitImport_uri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitImport_uri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_uriContext import_uri() throws RecognitionException {
		Import_uriContext _localctx = new Import_uriContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_import_uri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << UNCLOSED_STRING) | (1L << URI) | (1L << UNCLOSED_URI))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | import_uri | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PageContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public Margin_ruleContext margin_rule(int i) {
			return getRuleContext(Margin_ruleContext.class,i);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode PAGE() { return getToken(CSSParser.PAGE, 0); }
		public TerminalNode RCURLY() { return getToken(CSSParser.RCURLY, 0); }
		public TerminalNode LCURLY() { return getToken(CSSParser.LCURLY, 0); }
		public PseudoContext pseudo() {
			return getRuleContext(PseudoContext.class,0);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public List<Margin_ruleContext> margin_rule() {
			return getRuleContexts(Margin_ruleContext.class);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_page);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(PAGE);
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(240); match(S);
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(247);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(246); match(IDENT);
				}
			}

			setState(250);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(249); pseudo();
				}
			}

			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(252); match(S);
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258); match(LCURLY);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(259); match(S);
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265); declarations();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MARGIN_AREA) {
				{
				{
				setState(266); margin_rule();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272); match(RCURLY);
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | page | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Margin_ruleContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(CSSParser.RCURLY, 0); }
		public TerminalNode LCURLY() { return getToken(CSSParser.LCURLY, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode MARGIN_AREA() { return getToken(CSSParser.MARGIN_AREA, 0); }
		public Margin_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_margin_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterMargin_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitMargin_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitMargin_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Margin_ruleContext margin_rule() throws RecognitionException {
		Margin_ruleContext _localctx = new Margin_ruleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_margin_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); match(MARGIN_AREA);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(275); match(S);
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281); match(LCURLY);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(282); match(S);
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288); declarations();
			setState(289); match(RCURLY);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(290); match(S);
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | margin_rule | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlinesetContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSSParser.COMMA); }
		public TerminalNode RCURLY() { return getToken(CSSParser.RCURLY, 0); }
		public TerminalNode LCURLY() { return getToken(CSSParser.LCURLY, 0); }
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode COMMA(int i) {
			return getToken(CSSParser.COMMA, i);
		}
		public InlinesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterInlineset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitInlineset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitInlineset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlinesetContext inlineset() throws RecognitionException {
		InlinesetContext _localctx = new InlinesetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inlineset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(296); pseudo();
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(297); match(S);
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(303); match(COMMA);
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==S) {
						{
						{
						setState(304); match(S);
						}
						}
						setState(309);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(310); pseudo();
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==S) {
						{
						{
						setState(311); match(S);
						}
						}
						setState(316);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(324); match(LCURLY);
			setState(325); declarations();
			setState(326); match(RCURLY);
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | inlineset | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MediaContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public Media_queryContext media_query(int i) {
			return getRuleContext(Media_queryContext.class,i);
		}
		public List<Media_queryContext> media_query() {
			return getRuleContexts(Media_queryContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSSParser.COMMA); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode COMMA(int i) {
			return getToken(CSSParser.COMMA, i);
		}
		public MediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterMedia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitMedia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitMedia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaContext media() throws RecognitionException {
		MediaContext _localctx = new MediaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_media);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); media_query();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(329); match(COMMA);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(330); match(S);
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(336); media_query();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING MEDIA ERROR | consume until COMMA, LCURLY, SEMICOLON");
			        IntervalSet intervalSet = new IntervalSet(COMMA, LCURLY, SEMICOLON);
			        getCSSErrorHandler().consumeUntil(this, intervalSet, CSSLexerState.RecoveryMode.BALANCED, null);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT, "INVALID_STATEMENT"));
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Media_queryContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<Media_termContext> media_term() {
			return getRuleContexts(Media_termContext.class);
		}
		public Media_termContext media_term(int i) {
			return getRuleContext(Media_termContext.class,i);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public Media_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterMedia_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitMedia_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitMedia_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Media_queryContext media_query() throws RecognitionException {
		Media_queryContext _localctx = new Media_queryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_media_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(342); media_term();
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(343); match(S);
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INVALID_STRING) | (1L << IDENT) | (1L << STRING) | (1L << UNCLOSED_STRING) | (1L << NUMBER) | (1L << PERCENTAGE) | (1L << DIMENSION) | (1L << URI) | (1L << UNCLOSED_URI) | (1L << UNIRANGE) | (1L << COLON) | (1L << QUESTION) | (1L << PERCENT) | (1L << EQUALS) | (1L << SLASH) | (1L << GREATER) | (1L << LESS))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LPAREN - 66)) | (1L << (RPAREN - 66)) | (1L << (EXCLAMATION - 66)) | (1L << (MINUS - 66)) | (1L << (PLUS - 66)) | (1L << (ASTERISK - 66)) | (1L << (POUND - 66)) | (1L << (AMPERSAND - 66)) | (1L << (HAT - 66)) | (1L << (FUNCTION - 66)) | (1L << (INCLUDES - 66)) | (1L << (DASHMATCH - 66)) | (1L << (CTRL - 66)))) != 0) );
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | media_query | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Media_termContext extends ParserRuleContext {
		public NomediaqueryContext nomediaquery() {
			return getRuleContext(NomediaqueryContext.class,0);
		}
		public Media_expressionContext media_expression() {
			return getRuleContext(Media_expressionContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public Media_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterMedia_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitMedia_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitMedia_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Media_termContext media_term() throws RecognitionException {
		Media_termContext _localctx = new Media_termContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_media_term);
		try {
			setState(358);
			switch (_input.LA(1)) {
			case IDENT:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(353); match(IDENT);
					}
					break;
				case LPAREN:
					{
					setState(354); media_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case INVALID_STRING:
			case STRING:
			case UNCLOSED_STRING:
			case NUMBER:
			case PERCENTAGE:
			case DIMENSION:
			case URI:
			case UNCLOSED_URI:
			case UNIRANGE:
			case COLON:
			case QUESTION:
			case PERCENT:
			case EQUALS:
			case SLASH:
			case GREATER:
			case LESS:
			case RPAREN:
			case EXCLAMATION:
			case MINUS:
			case PLUS:
			case ASTERISK:
			case POUND:
			case AMPERSAND:
			case HAT:
			case FUNCTION:
			case INCLUDES:
			case DASHMATCH:
			case CTRL:
				enterOuterAlt(_localctx, 2);
				{
				setState(357); nomediaquery();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING MEDIATERM ERROR | consume until COMMA, LCURLY, SEMICOLON");
			        IntervalSet intervalSet = new IntervalSet(COMMA, LCURLY, SEMICOLON);
			        getCSSErrorHandler().consumeUntil(this, intervalSet, CSSLexerState.RecoveryMode.RULE, null);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT, "INVALID_STATEMENT"));
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Media_expressionContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TerminalNode LPAREN() { return getToken(CSSParser.LPAREN, 0); }
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode RPAREN() { return getToken(CSSParser.RPAREN, 0); }
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public Media_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterMedia_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitMedia_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitMedia_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Media_expressionContext media_expression() throws RecognitionException {
		Media_expressionContext _localctx = new Media_expressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_media_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); match(LPAREN);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(361); match(S);
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367); match(IDENT);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(368); match(S);
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(374); match(COLON);
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(375); match(S);
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(381); terms();
				}
			}

			setState(384); match(RPAREN);
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING media_expression ERROR | consume until RPAREN, SEMICOLON");
			        IntervalSet intervalSet = new IntervalSet(RPAREN, SEMICOLON);
			        getCSSErrorHandler().consumeUntilGreedy(this, intervalSet);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT, "INVALID_STATEMENT"));
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Media_ruleContext extends ParserRuleContext {
		public AtstatementContext atstatement() {
			return getRuleContext(AtstatementContext.class,0);
		}
		public RulesetContext ruleset() {
			return getRuleContext(RulesetContext.class,0);
		}
		public Media_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterMedia_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitMedia_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitMedia_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Media_ruleContext media_rule() throws RecognitionException {
		Media_ruleContext _localctx = new Media_ruleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_media_rule);
		try {
			setState(388);
			switch (_input.LA(1)) {
			case INVALID_STRING:
			case INVALID_SELPART:
			case IDENT:
			case CLASSKEYWORD:
			case STRING:
			case UNCLOSED_STRING:
			case HASH:
			case NUMBER:
			case PERCENTAGE:
			case DIMENSION:
			case URI:
			case UNCLOSED_URI:
			case UNIRANGE:
			case COLON:
			case COMMA:
			case QUESTION:
			case PERCENT:
			case EQUALS:
			case SLASH:
			case GREATER:
			case LESS:
			case LCURLY:
			case RPAREN:
			case LBRACKET:
			case EXCLAMATION:
			case MINUS:
			case PLUS:
			case ASTERISK:
			case POUND:
			case AMPERSAND:
			case HAT:
			case INCLUDES:
			case DASHMATCH:
			case CTRL:
			case INVALID_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(386); ruleset();
				}
				break;
			case CHARSET:
			case IMPORT:
			case KEYFRAMES:
			case MEDIA:
			case PAGE:
			case VIEWPORT:
			case FONTFACE:
			case ATKEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(387); atstatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | media_rule | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Keyframes_nameContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public Keyframes_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframes_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterKeyframes_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitKeyframes_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitKeyframes_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyframes_nameContext keyframes_name() throws RecognitionException {
		Keyframes_nameContext _localctx = new Keyframes_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_keyframes_name);
		try {
			setState(392);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(390); match(IDENT);
				}
				break;
			case INVALID_STRING:
			case STRING:
			case UNCLOSED_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(391); string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Keyframe_blockContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSSParser.COMMA); }
		public TerminalNode RCURLY() { return getToken(CSSParser.RCURLY, 0); }
		public TerminalNode LCURLY() { return getToken(CSSParser.LCURLY, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public Keyframe_selectorContext keyframe_selector(int i) {
			return getRuleContext(Keyframe_selectorContext.class,i);
		}
		public List<Keyframe_selectorContext> keyframe_selector() {
			return getRuleContexts(Keyframe_selectorContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CSSParser.COMMA, i);
		}
		public Keyframe_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframe_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterKeyframe_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitKeyframe_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitKeyframe_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyframe_blockContext keyframe_block() throws RecognitionException {
		Keyframe_blockContext _localctx = new Keyframe_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_keyframe_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394); keyframe_selector();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(395); match(COMMA);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(396); match(S);
					}
					}
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(402); keyframe_selector();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408); match(LCURLY);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(409); match(S);
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415); declarations();
			setState(416); match(RCURLY);
			}
		}
		catch (RecognitionException re) {

				    log.debug("PARSING keyframe_selector ERROR | consume until RCURLY and add INVALID_STATEMENT");
			        IntervalSet intervalSet = new IntervalSet(RCURLY);
			        //we don't require {} to be balanced here because of possible parent 'media' sections that may remain open => RecoveryMode.RULE
			        getCSSErrorHandler().consumeUntilGreedy(this, intervalSet/*, CSSLexerState.RecoveryMode.RULE*/);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT, "INVALID_STATEMENT"));
				
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Keyframe_selectorContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode PERCENTAGE() { return getToken(CSSParser.PERCENTAGE, 0); }
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public Keyframe_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframe_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterKeyframe_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitKeyframe_selector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitKeyframe_selector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyframe_selectorContext keyframe_selector() throws RecognitionException {
		Keyframe_selectorContext _localctx = new Keyframe_selectorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_keyframe_selector);
		int _la;
		try {
			setState(432);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(418); match(IDENT);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(419); match(S);
					}
					}
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PERCENTAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(425); match(PERCENTAGE);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(426); match(S);
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | keyframes_selector | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unknown_atruleContext extends ParserRuleContext {
		public Unknown_atrule_bodyContext unknown_atrule_body() {
			return getRuleContext(Unknown_atrule_bodyContext.class,0);
		}
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TerminalNode SEMICOLON() { return getToken(CSSParser.SEMICOLON, 0); }
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode ATKEYWORD() { return getToken(CSSParser.ATKEYWORD, 0); }
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public Unknown_atruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown_atrule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterUnknown_atrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitUnknown_atrule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitUnknown_atrule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unknown_atruleContext unknown_atrule() throws RecognitionException {
		Unknown_atruleContext _localctx = new Unknown_atruleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unknown_atrule);
		int _la;
		try {
			setState(462);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434); match(ATKEYWORD);
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(435); match(S);
					}
					}
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (INVALID_STRING - 21)) | (1L << (IDENT - 21)) | (1L << (CLASSKEYWORD - 21)) | (1L << (STRING - 21)) | (1L << (UNCLOSED_STRING - 21)) | (1L << (HASH - 21)) | (1L << (NUMBER - 21)) | (1L << (PERCENTAGE - 21)) | (1L << (DIMENSION - 21)) | (1L << (URI - 21)) | (1L << (UNCLOSED_URI - 21)) | (1L << (UNIRANGE - 21)) | (1L << (COLON - 21)) | (1L << (COMMA - 21)) | (1L << (QUESTION - 21)) | (1L << (PERCENT - 21)) | (1L << (EQUALS - 21)) | (1L << (SLASH - 21)) | (1L << (GREATER - 21)) | (1L << (LESS - 21)) | (1L << (LPAREN - 21)) | (1L << (LBRACKET - 21)) | (1L << (EXCLAMATION - 21)) | (1L << (MINUS - 21)) | (1L << (PLUS - 21)) | (1L << (ASTERISK - 21)) | (1L << (FUNCTION - 21)) | (1L << (INCLUDES - 21)) | (1L << (DASHMATCH - 21)))) != 0)) {
					{
					{
					setState(441); any();
					}
					}
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(447); unknown_atrule_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448); match(ATKEYWORD);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(449); match(S);
					}
					}
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (INVALID_STRING - 21)) | (1L << (IDENT - 21)) | (1L << (CLASSKEYWORD - 21)) | (1L << (STRING - 21)) | (1L << (UNCLOSED_STRING - 21)) | (1L << (HASH - 21)) | (1L << (NUMBER - 21)) | (1L << (PERCENTAGE - 21)) | (1L << (DIMENSION - 21)) | (1L << (URI - 21)) | (1L << (UNCLOSED_URI - 21)) | (1L << (UNIRANGE - 21)) | (1L << (COLON - 21)) | (1L << (COMMA - 21)) | (1L << (QUESTION - 21)) | (1L << (PERCENT - 21)) | (1L << (EQUALS - 21)) | (1L << (SLASH - 21)) | (1L << (GREATER - 21)) | (1L << (LESS - 21)) | (1L << (LPAREN - 21)) | (1L << (LBRACKET - 21)) | (1L << (EXCLAMATION - 21)) | (1L << (MINUS - 21)) | (1L << (PLUS - 21)) | (1L << (ASTERISK - 21)) | (1L << (FUNCTION - 21)) | (1L << (INCLUDES - 21)) | (1L << (DASHMATCH - 21)))) != 0)) {
					{
					{
					setState(455); any();
					}
					}
					setState(460);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(461); match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING unknown_atrule ERROR - consume until RCURLY");
			        IntervalSet intervalSet = new IntervalSet(RCURLY, SEMICOLON);
			        getCSSErrorHandler().consumeUntilGreedy(this, intervalSet, CSSLexerState.RecoveryMode.BALANCED);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_ATSTATEMENT, "INVALID_ATSTATEMENT"));
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unknown_atrule_bodyContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TerminalNode RCURLY() { return getToken(CSSParser.RCURLY, 0); }
		public TerminalNode LCURLY() { return getToken(CSSParser.LCURLY, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public Unknown_atrule_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown_atrule_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterUnknown_atrule_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitUnknown_atrule_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitUnknown_atrule_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unknown_atrule_bodyContext unknown_atrule_body() throws RecognitionException {
		Unknown_atrule_bodyContext _localctx = new Unknown_atrule_bodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unknown_atrule_body);

		      //the body is defined as empty so any content leads to recognition exception
		      //in that case, the whole body is consumed and the rule is closed
		      CSSLexerState begin = getCurrentLexerState(_localctx.getStart());
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); match(LCURLY);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(465); match(S);
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(471); match(RCURLY);
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING unknown_atrule_body has some content | consume until RCURLY");
			        IntervalSet follow = new IntervalSet(RCURLY); //recover on the rule end
			        this.getCSSErrorHandler().consumeUntilGreedy(this, follow, CSSLexerState.RecoveryMode.DECL, begin);
			        _localctx.addErrorNode(this.getTokenFactory().create(RPAREN, "}")); //formally close the body
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulesetContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public NoruleContext norule() {
			return getRuleContext(NoruleContext.class,0);
		}
		public List<Combined_selectorContext> combined_selector() {
			return getRuleContexts(Combined_selectorContext.class);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSSParser.COMMA); }
		public TerminalNode RCURLY() { return getToken(CSSParser.RCURLY, 0); }
		public TerminalNode LCURLY() { return getToken(CSSParser.LCURLY, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public Combined_selectorContext combined_selector(int i) {
			return getRuleContext(Combined_selectorContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CSSParser.COMMA, i);
		}
		public RulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitRuleset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ruleset);
		int _la;
		try {
			setState(502);
			switch (_input.LA(1)) {
			case INVALID_SELPART:
			case IDENT:
			case CLASSKEYWORD:
			case HASH:
			case COLON:
			case LCURLY:
			case LBRACKET:
			case ASTERISK:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				_la = _input.LA(1);
				if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (INVALID_SELPART - 23)) | (1L << (IDENT - 23)) | (1L << (CLASSKEYWORD - 23)) | (1L << (HASH - 23)) | (1L << (COLON - 23)) | (1L << (LBRACKET - 23)) | (1L << (ASTERISK - 23)))) != 0)) {
					{
					setState(473); combined_selector();
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(474); match(COMMA);
						setState(478);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==S) {
							{
							{
							setState(475); match(S);
							}
							}
							setState(480);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(481); combined_selector();
						}
						}
						setState(486);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(489); match(LCURLY);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(490); match(S);
					}
					}
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(496); declarations();
				setState(497); match(RCURLY);
				}
				break;
			case INVALID_STRING:
			case STRING:
			case UNCLOSED_STRING:
			case NUMBER:
			case PERCENTAGE:
			case DIMENSION:
			case URI:
			case UNCLOSED_URI:
			case UNIRANGE:
			case COMMA:
			case QUESTION:
			case PERCENT:
			case EQUALS:
			case SLASH:
			case GREATER:
			case LESS:
			case RPAREN:
			case EXCLAMATION:
			case MINUS:
			case PLUS:
			case POUND:
			case AMPERSAND:
			case HAT:
			case INCLUDES:
			case DASHMATCH:
			case CTRL:
			case INVALID_TOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(499); norule();

					    log.debug("PARSING ruleset: norule encountered | consume until RCURLY and add INVALID_STATEMENT");
				        IntervalSet intervalSet = new IntervalSet(RCURLY);
				        //we don't require {} to be balanced here because of possible parent 'media' sections that may remain open => RecoveryMode.RULE
				        getCSSErrorHandler().consumeUntilGreedy(this, intervalSet/*, CSSLexerState.RecoveryMode.RULE*/);
				        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT, "INVALID_STATEMENT"));
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

				    log.debug("PARSING ruleset ERROR | consume until RCURLY and add INVALID_STATEMENT");
			        IntervalSet intervalSet = new IntervalSet(RCURLY);
			        //we don't require {} to be balanced here because of possible parent 'media' sections that may remain open => RecoveryMode.RULE
			        getCSSErrorHandler().consumeUntilGreedy(this, intervalSet/*, CSSLexerState.RecoveryMode.RULE*/);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT, "INVALID_STATEMENT"));
				
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CSSParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CSSParser.SEMICOLON, i);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INVALID_STRING) | (1L << IDENT) | (1L << CLASSKEYWORD) | (1L << STRING) | (1L << UNCLOSED_STRING) | (1L << HASH) | (1L << NUMBER) | (1L << PERCENTAGE) | (1L << DIMENSION) | (1L << URI) | (1L << UNCLOSED_URI) | (1L << COLON) | (1L << COMMA) | (1L << QUESTION) | (1L << PERCENT) | (1L << EQUALS) | (1L << SLASH) | (1L << GREATER) | (1L << LESS))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (EXCLAMATION - 70)) | (1L << (MINUS - 70)) | (1L << (PLUS - 70)) | (1L << (ASTERISK - 70)) | (1L << (INCLUDES - 70)) | (1L << (DASHMATCH - 70)) | (1L << (CTRL - 70)) | (1L << (INVALID_TOKEN - 70)) | (1L << (STRING_CHAR - 70)))) != 0)) {
				{
				setState(504); declaration();
				}
			}

			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(507); match(SEMICOLON);
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(508); match(S);
					}
					}
					setState(513);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(515);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INVALID_STRING) | (1L << IDENT) | (1L << CLASSKEYWORD) | (1L << STRING) | (1L << UNCLOSED_STRING) | (1L << HASH) | (1L << NUMBER) | (1L << PERCENTAGE) | (1L << DIMENSION) | (1L << URI) | (1L << UNCLOSED_URI) | (1L << COLON) | (1L << COMMA) | (1L << QUESTION) | (1L << PERCENT) | (1L << EQUALS) | (1L << SLASH) | (1L << GREATER) | (1L << LESS))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (EXCLAMATION - 70)) | (1L << (MINUS - 70)) | (1L << (PLUS - 70)) | (1L << (ASTERISK - 70)) | (1L << (INCLUDES - 70)) | (1L << (DASHMATCH - 70)) | (1L << (CTRL - 70)) | (1L << (INVALID_TOKEN - 70)) | (1L << (STRING_CHAR - 70)))) != 0)) {
					{
					setState(514); declaration();
					}
				}

				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | declarations | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public ImportantContext important() {
			return getRuleContext(ImportantContext.class,0);
		}
		public NopropContext noprop() {
			return getRuleContext(NopropContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaration);

		      CSSLexerState begin = getCurrentLexerState(_localctx.getStart());
		      log.debug("Decl begin: " + begin);
		    
		int _la;
		try {
			setState(543);
			switch (_input.LA(1)) {
			case IDENT:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(522); property();
				setState(523); match(COLON);
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(524); match(S);
					}
					}
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(531);
				_la = _input.LA(1);
				if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (INVALID_STRING - 21)) | (1L << (INVALID_STATEMENT - 21)) | (1L << (IDENT - 21)) | (1L << (ATKEYWORD - 21)) | (1L << (CLASSKEYWORD - 21)) | (1L << (STRING - 21)) | (1L << (UNCLOSED_STRING - 21)) | (1L << (HASH - 21)) | (1L << (NUMBER - 21)) | (1L << (PERCENTAGE - 21)) | (1L << (DIMENSION - 21)) | (1L << (URI - 21)) | (1L << (UNCLOSED_URI - 21)) | (1L << (UNIRANGE - 21)) | (1L << (COLON - 21)) | (1L << (COMMA - 21)) | (1L << (QUESTION - 21)) | (1L << (PERCENT - 21)) | (1L << (EQUALS - 21)) | (1L << (SLASH - 21)) | (1L << (GREATER - 21)) | (1L << (LESS - 21)) | (1L << (LCURLY - 21)) | (1L << (LPAREN - 21)) | (1L << (LBRACKET - 21)) | (1L << (MINUS - 21)) | (1L << (PLUS - 21)) | (1L << (ASTERISK - 21)) | (1L << (EXPRESSION - 21)) | (1L << (FUNCTION - 21)) | (1L << (INCLUDES - 21)) | (1L << (DASHMATCH - 21)))) != 0)) {
					{
					setState(530); terms();
					}
				}

				setState(534);
				_la = _input.LA(1);
				if (_la==EXCLAMATION) {
					{
					setState(533); important();
					}
				}

				}
				break;
			case INVALID_STRING:
			case CLASSKEYWORD:
			case STRING:
			case UNCLOSED_STRING:
			case HASH:
			case NUMBER:
			case PERCENTAGE:
			case DIMENSION:
			case URI:
			case UNCLOSED_URI:
			case COLON:
			case COMMA:
			case QUESTION:
			case PERCENT:
			case EQUALS:
			case SLASH:
			case GREATER:
			case LESS:
			case EXCLAMATION:
			case PLUS:
			case ASTERISK:
			case INCLUDES:
			case DASHMATCH:
			case CTRL:
			case INVALID_TOKEN:
			case STRING_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(536); noprop();
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (INVALID_STRING - 21)) | (1L << (IDENT - 21)) | (1L << (CLASSKEYWORD - 21)) | (1L << (STRING - 21)) | (1L << (UNCLOSED_STRING - 21)) | (1L << (HASH - 21)) | (1L << (NUMBER - 21)) | (1L << (PERCENTAGE - 21)) | (1L << (DIMENSION - 21)) | (1L << (URI - 21)) | (1L << (UNCLOSED_URI - 21)) | (1L << (UNIRANGE - 21)) | (1L << (COLON - 21)) | (1L << (COMMA - 21)) | (1L << (QUESTION - 21)) | (1L << (PERCENT - 21)) | (1L << (EQUALS - 21)) | (1L << (SLASH - 21)) | (1L << (GREATER - 21)) | (1L << (LESS - 21)) | (1L << (LPAREN - 21)) | (1L << (LBRACKET - 21)) | (1L << (EXCLAMATION - 21)) | (1L << (MINUS - 21)) | (1L << (PLUS - 21)) | (1L << (ASTERISK - 21)) | (1L << (FUNCTION - 21)) | (1L << (INCLUDES - 21)) | (1L << (DASHMATCH - 21)))) != 0)) {
					{
					{
					setState(537); any();
					}
					}
					setState(542);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING declaration ERROR | consume until SEMICOLON, RCURLY");
			        IntervalSet follow = new IntervalSet(SEMICOLON, RCURLY); //recover on the declaration end or rule end
			        //not greedy - the final ; or } must remain for properly finishing the declaration/rule
			        this.getCSSErrorHandler().consumeUntil(this, follow, CSSLexerState.RecoveryMode.DECL, begin);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_DECLARATION, "INVALID_DECLARATION"));
				
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportantContext extends ParserRuleContext {
		public TerminalNode IMPORTANT() { return getToken(CSSParser.IMPORTANT, 0); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TerminalNode EXCLAMATION() { return getToken(CSSParser.EXCLAMATION, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public ImportantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_important; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterImportant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitImportant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitImportant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportantContext important() throws RecognitionException {
		ImportantContext _localctx = new ImportantContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_important);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545); match(EXCLAMATION);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(546); match(S);
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(552); match(IMPORTANT);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(553); match(S);
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING IMPORTANT error");
			        IntervalSet intervalSet = new IntervalSet(RCURLY,SEMICOLON);
			        this.getCSSErrorHandler().consumeUntil(this, intervalSet, CSSLexerState.RecoveryMode.RULE, null);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_DIRECTIVE, "INVALID_DIRECTIVE"));
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode MINUS() { return getToken(CSSParser.MINUS, 0); }
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(559); match(MINUS);
				}
			}

			setState(562); match(IDENT);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(563); match(S);
				}
				}
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING property ERROR | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermsContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitTerms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitTerms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(569); term();
				}
				}
				setState(572); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (INVALID_STRING - 21)) | (1L << (INVALID_STATEMENT - 21)) | (1L << (IDENT - 21)) | (1L << (ATKEYWORD - 21)) | (1L << (CLASSKEYWORD - 21)) | (1L << (STRING - 21)) | (1L << (UNCLOSED_STRING - 21)) | (1L << (HASH - 21)) | (1L << (NUMBER - 21)) | (1L << (PERCENTAGE - 21)) | (1L << (DIMENSION - 21)) | (1L << (URI - 21)) | (1L << (UNCLOSED_URI - 21)) | (1L << (UNIRANGE - 21)) | (1L << (COLON - 21)) | (1L << (COMMA - 21)) | (1L << (QUESTION - 21)) | (1L << (PERCENT - 21)) | (1L << (EQUALS - 21)) | (1L << (SLASH - 21)) | (1L << (GREATER - 21)) | (1L << (LESS - 21)) | (1L << (LCURLY - 21)) | (1L << (LPAREN - 21)) | (1L << (LBRACKET - 21)) | (1L << (MINUS - 21)) | (1L << (PLUS - 21)) | (1L << (ASTERISK - 21)) | (1L << (EXPRESSION - 21)) | (1L << (FUNCTION - 21)) | (1L << (INCLUDES - 21)) | (1L << (DASHMATCH - 21)))) != 0) );
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING terms ERROR functLevel = {}", functLevel);
			        if (functLevel == 0){
			            IntervalSet intervalSet = new IntervalSet(RCURLY, SEMICOLON);
			            this.getCSSErrorHandler().consumeUntilGreedy(this, intervalSet);
			            _localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT, "INVALID_STATEMENT"));
			        }
			        else{
			            IntervalSet intervalSet = new IntervalSet(RPAREN, RCURLY, SEMICOLON);
			            this.getCSSErrorHandler().consumeUntilGreedy(this, intervalSet, CSSLexerState.RecoveryMode.FUNCTION);
			            _localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT, "INVALID_STATEMENT"));
			        }
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermValuePartContext extends TermContext {
		public ValuepartContext valuepart() {
			return getRuleContext(ValuepartContext.class,0);
		}
		public TermValuePartContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterTermValuePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitTermValuePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitTermValuePart(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermInvalidContext extends TermContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CSSParser.SEMICOLON); }
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(CSSParser.RCURLY, 0); }
		public TerminalNode LCURLY() { return getToken(CSSParser.LCURLY, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CSSParser.SEMICOLON, i);
		}
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public TerminalNode ATKEYWORD() { return getToken(CSSParser.ATKEYWORD, 0); }
		public TermInvalidContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterTermInvalid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitTermInvalid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitTermInvalid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_term);
		int _la;
		try {
			setState(603);
			switch (_input.LA(1)) {
			case INVALID_STRING:
			case INVALID_STATEMENT:
			case IDENT:
			case CLASSKEYWORD:
			case STRING:
			case UNCLOSED_STRING:
			case HASH:
			case NUMBER:
			case PERCENTAGE:
			case DIMENSION:
			case URI:
			case UNCLOSED_URI:
			case UNIRANGE:
			case COLON:
			case COMMA:
			case QUESTION:
			case PERCENT:
			case EQUALS:
			case SLASH:
			case GREATER:
			case LESS:
			case LPAREN:
			case LBRACKET:
			case MINUS:
			case PLUS:
			case ASTERISK:
			case EXPRESSION:
			case FUNCTION:
			case INCLUDES:
			case DASHMATCH:
				_localctx = new TermValuePartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(574); valuepart();
				}
				break;
			case LCURLY:
				_localctx = new TermInvalidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(575); match(LCURLY);
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(576); match(S);
					}
					}
					setState(581);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (INVALID_STRING - 21)) | (1L << (IDENT - 21)) | (1L << (CLASSKEYWORD - 21)) | (1L << (STRING - 21)) | (1L << (UNCLOSED_STRING - 21)) | (1L << (HASH - 21)) | (1L << (NUMBER - 21)) | (1L << (PERCENTAGE - 21)) | (1L << (DIMENSION - 21)) | (1L << (URI - 21)) | (1L << (UNCLOSED_URI - 21)) | (1L << (UNIRANGE - 21)) | (1L << (SEMICOLON - 21)) | (1L << (COLON - 21)) | (1L << (COMMA - 21)) | (1L << (QUESTION - 21)) | (1L << (PERCENT - 21)) | (1L << (EQUALS - 21)) | (1L << (SLASH - 21)) | (1L << (GREATER - 21)) | (1L << (LESS - 21)) | (1L << (LPAREN - 21)) | (1L << (LBRACKET - 21)) | (1L << (EXCLAMATION - 21)) | (1L << (MINUS - 21)) | (1L << (PLUS - 21)) | (1L << (ASTERISK - 21)) | (1L << (FUNCTION - 21)) | (1L << (INCLUDES - 21)) | (1L << (DASHMATCH - 21)))) != 0)) {
					{
					setState(590);
					switch (_input.LA(1)) {
					case INVALID_STRING:
					case IDENT:
					case CLASSKEYWORD:
					case STRING:
					case UNCLOSED_STRING:
					case HASH:
					case NUMBER:
					case PERCENTAGE:
					case DIMENSION:
					case URI:
					case UNCLOSED_URI:
					case UNIRANGE:
					case COLON:
					case COMMA:
					case QUESTION:
					case PERCENT:
					case EQUALS:
					case SLASH:
					case GREATER:
					case LESS:
					case LPAREN:
					case LBRACKET:
					case EXCLAMATION:
					case MINUS:
					case PLUS:
					case ASTERISK:
					case FUNCTION:
					case INCLUDES:
					case DASHMATCH:
						{
						setState(582); any();
						}
						break;
					case SEMICOLON:
						{
						setState(583); match(SEMICOLON);
						setState(587);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==S) {
							{
							{
							setState(584); match(S);
							}
							}
							setState(589);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(595); match(RCURLY);
				}
				break;
			case ATKEYWORD:
				_localctx = new TermInvalidContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(596); match(ATKEYWORD);
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(597); match(S);
					}
					}
					setState(602);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			      log.error("PARSING term ERROR | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CSSParser.SEMICOLON); }
		public TerminalNode FUNCTION() { return getToken(CSSParser.FUNCTION, 0); }
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public TerminalNode EXPRESSION() { return getToken(CSSParser.EXPRESSION, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CSSParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(CSSParser.RPAREN, 0); }
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public Funct_argsContext funct_args() {
			return getRuleContext(Funct_argsContext.class,0);
		}
		public FunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterFunct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitFunct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitFunct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctContext funct() throws RecognitionException {
		FunctContext _localctx = new FunctContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funct);

		        functLevel++;
		    
		int _la;
		try {
			setState(637);
			switch (_input.LA(1)) {
			case EXPRESSION:
				enterOuterAlt(_localctx, 1);
				{
				setState(605); match(EXPRESSION);
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(606); match(S);
					}
					}
					setState(611);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (INVALID_STRING - 21)) | (1L << (IDENT - 21)) | (1L << (CLASSKEYWORD - 21)) | (1L << (STRING - 21)) | (1L << (UNCLOSED_STRING - 21)) | (1L << (HASH - 21)) | (1L << (NUMBER - 21)) | (1L << (PERCENTAGE - 21)) | (1L << (DIMENSION - 21)) | (1L << (URI - 21)) | (1L << (UNCLOSED_URI - 21)) | (1L << (UNIRANGE - 21)) | (1L << (SEMICOLON - 21)) | (1L << (COLON - 21)) | (1L << (COMMA - 21)) | (1L << (QUESTION - 21)) | (1L << (PERCENT - 21)) | (1L << (EQUALS - 21)) | (1L << (SLASH - 21)) | (1L << (GREATER - 21)) | (1L << (LESS - 21)) | (1L << (LPAREN - 21)) | (1L << (LBRACKET - 21)) | (1L << (EXCLAMATION - 21)) | (1L << (MINUS - 21)) | (1L << (PLUS - 21)) | (1L << (ASTERISK - 21)) | (1L << (FUNCTION - 21)) | (1L << (INCLUDES - 21)) | (1L << (DASHMATCH - 21)))) != 0)) {
					{
					setState(620);
					switch (_input.LA(1)) {
					case INVALID_STRING:
					case IDENT:
					case CLASSKEYWORD:
					case STRING:
					case UNCLOSED_STRING:
					case HASH:
					case NUMBER:
					case PERCENTAGE:
					case DIMENSION:
					case URI:
					case UNCLOSED_URI:
					case UNIRANGE:
					case COLON:
					case COMMA:
					case QUESTION:
					case PERCENT:
					case EQUALS:
					case SLASH:
					case GREATER:
					case LESS:
					case LPAREN:
					case LBRACKET:
					case EXCLAMATION:
					case MINUS:
					case PLUS:
					case ASTERISK:
					case FUNCTION:
					case INCLUDES:
					case DASHMATCH:
						{
						setState(612); any();
						}
						break;
					case SEMICOLON:
						{
						setState(613); match(SEMICOLON);
						setState(617);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==S) {
							{
							{
							setState(614); match(S);
							}
							}
							setState(619);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(625); match(RPAREN);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(626); match(FUNCTION);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(627); match(S);
					}
					}
					setState(632);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(634);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(633); funct_args();
					}
					break;
				}
				setState(636); match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			        functLevel--;
			    
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | funct | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuepartContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(CSSParser.LESS, 0); }
		public TerminalNode CLASSKEYWORD() { return getToken(CSSParser.CLASSKEYWORD, 0); }
		public ValuepartContext valuepart(int i) {
			return getRuleContext(ValuepartContext.class,i);
		}
		public TerminalNode PERCENT() { return getToken(CSSParser.PERCENT, 0); }
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode URI() { return getToken(CSSParser.URI, 0); }
		public TerminalNode ASTERISK() { return getToken(CSSParser.ASTERISK, 0); }
		public TerminalNode EQUALS() { return getToken(CSSParser.EQUALS, 0); }
		public TerminalNode LPAREN() { return getToken(CSSParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(CSSParser.COMMA, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode PERCENTAGE() { return getToken(CSSParser.PERCENTAGE, 0); }
		public TerminalNode QUESTION() { return getToken(CSSParser.QUESTION, 0); }
		public TerminalNode HASH() { return getToken(CSSParser.HASH, 0); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TerminalNode DIMENSION() { return getToken(CSSParser.DIMENSION, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode UNIRANGE() { return getToken(CSSParser.UNIRANGE, 0); }
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public TerminalNode DASHMATCH() { return getToken(CSSParser.DASHMATCH, 0); }
		public TerminalNode UNCLOSED_URI() { return getToken(CSSParser.UNCLOSED_URI, 0); }
		public FunctContext funct() {
			return getRuleContext(FunctContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CSSParser.RPAREN, 0); }
		public TerminalNode GREATER() { return getToken(CSSParser.GREATER, 0); }
		public Bracketed_identsContext bracketed_idents() {
			return getRuleContext(Bracketed_identsContext.class,0);
		}
		public List<ValuepartContext> valuepart() {
			return getRuleContexts(ValuepartContext.class);
		}
		public TerminalNode SLASH() { return getToken(CSSParser.SLASH, 0); }
		public TerminalNode MINUS() { return getToken(CSSParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(CSSParser.PLUS, 0); }
		public TerminalNode NUMBER() { return getToken(CSSParser.NUMBER, 0); }
		public TerminalNode INCLUDES() { return getToken(CSSParser.INCLUDES, 0); }
		public ValuepartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuepart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterValuepart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitValuepart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitValuepart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuepartContext valuepart() throws RecognitionException {
		ValuepartContext _localctx = new ValuepartContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_valuepart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(640);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(639); match(MINUS);
					}
				}

				setState(642); match(IDENT);
				}
				break;
			case 2:
				{
				setState(644);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(643);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(646); match(NUMBER);
				}
				break;
			case 3:
				{
				setState(648);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(647);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(650); match(PERCENTAGE);
				}
				break;
			case 4:
				{
				setState(652);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(651);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(654); match(DIMENSION);
				}
				break;
			case 5:
				{
				setState(655); string();
				}
				break;
			case 6:
				{
				setState(656); match(URI);
				}
				break;
			case 7:
				{
				setState(657); match(UNCLOSED_URI);
				}
				break;
			case 8:
				{
				setState(658); match(HASH);
				}
				break;
			case 9:
				{
				setState(660);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(659);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(662); funct();
				}
				break;
			case 10:
				{
				setState(663); match(COMMA);
				}
				break;
			case 11:
				{
				setState(664); match(SLASH);
				}
				break;
			case 12:
				{
				setState(665); bracketed_idents();
				}
				break;
			case 13:
				{
				setState(666); match(CLASSKEYWORD);
				}
				break;
			case 14:
				{
				setState(667); match(UNIRANGE);
				}
				break;
			case 15:
				{
				setState(668); match(INCLUDES);
				}
				break;
			case 16:
				{
				setState(669); match(COLON);
				}
				break;
			case 17:
				{
				setState(670); match(GREATER);
				}
				break;
			case 18:
				{
				setState(671); match(LESS);
				}
				break;
			case 19:
				{
				setState(672); match(QUESTION);
				}
				break;
			case 20:
				{
				setState(673); match(PERCENT);
				}
				break;
			case 21:
				{
				setState(674); match(EQUALS);
				}
				break;
			case 22:
				{
				setState(675); match(ASTERISK);
				}
				break;
			case 23:
				{
				setState(676); match(DASHMATCH);
				}
				break;
			case 24:
				{
				setState(677); match(LPAREN);
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (INVALID_STRING - 21)) | (1L << (INVALID_STATEMENT - 21)) | (1L << (IDENT - 21)) | (1L << (CLASSKEYWORD - 21)) | (1L << (STRING - 21)) | (1L << (UNCLOSED_STRING - 21)) | (1L << (HASH - 21)) | (1L << (NUMBER - 21)) | (1L << (PERCENTAGE - 21)) | (1L << (DIMENSION - 21)) | (1L << (URI - 21)) | (1L << (UNCLOSED_URI - 21)) | (1L << (UNIRANGE - 21)) | (1L << (COLON - 21)) | (1L << (COMMA - 21)) | (1L << (QUESTION - 21)) | (1L << (PERCENT - 21)) | (1L << (EQUALS - 21)) | (1L << (SLASH - 21)) | (1L << (GREATER - 21)) | (1L << (LESS - 21)) | (1L << (LPAREN - 21)) | (1L << (LBRACKET - 21)) | (1L << (MINUS - 21)) | (1L << (PLUS - 21)) | (1L << (ASTERISK - 21)) | (1L << (EXPRESSION - 21)) | (1L << (FUNCTION - 21)) | (1L << (INCLUDES - 21)) | (1L << (DASHMATCH - 21)))) != 0)) {
					{
					{
					setState(678); valuepart();
					}
					}
					setState(683);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(684); match(RPAREN);
				}
				break;
			}
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(687); match(S);
				}
				}
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

					log.error("Recognition exception | valuepart");
					IntervalSet intervalSet = new IntervalSet(RCURLY, SEMICOLON);
					getCSSErrorHandler().consumeUntil(this, intervalSet, CSSLexerState.RecoveryMode.NOBALANCE, null);
					_localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT,""));
				
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funct_argsContext extends ParserRuleContext {
		public Funct_argumentContext funct_argument(int i) {
			return getRuleContext(Funct_argumentContext.class,i);
		}
		public List<Funct_argumentContext> funct_argument() {
			return getRuleContexts(Funct_argumentContext.class);
		}
		public Funct_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funct_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterFunct_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitFunct_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitFunct_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funct_argsContext funct_args() throws RecognitionException {
		Funct_argsContext _localctx = new Funct_argsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_funct_args);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(694); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(693); funct_argument();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(696); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING funct_args ERROR functLevel = {}", functLevel);
			        IntervalSet intervalSet = new IntervalSet(RPAREN, RCURLY, SEMICOLON);
			        this.getCSSErrorHandler().consumeUntilGreedy(this, intervalSet, CSSLexerState.RecoveryMode.FUNCTION);
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT, "INVALID_STATEMENT"));
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funct_argumentContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(CSSParser.LESS, 0); }
		public TerminalNode CLASSKEYWORD() { return getToken(CSSParser.CLASSKEYWORD, 0); }
		public TerminalNode PERCENT() { return getToken(CSSParser.PERCENT, 0); }
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode ASTERISK() { return getToken(CSSParser.ASTERISK, 0); }
		public TerminalNode EQUALS() { return getToken(CSSParser.EQUALS, 0); }
		public TerminalNode LPAREN() { return getToken(CSSParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(CSSParser.COMMA, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode PERCENTAGE() { return getToken(CSSParser.PERCENTAGE, 0); }
		public TerminalNode QUESTION() { return getToken(CSSParser.QUESTION, 0); }
		public TerminalNode HASH() { return getToken(CSSParser.HASH, 0); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TerminalNode DIMENSION() { return getToken(CSSParser.DIMENSION, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode UNIRANGE() { return getToken(CSSParser.UNIRANGE, 0); }
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public TerminalNode DASHMATCH() { return getToken(CSSParser.DASHMATCH, 0); }
		public TerminalNode RPAREN() { return getToken(CSSParser.RPAREN, 0); }
		public FunctContext funct() {
			return getRuleContext(FunctContext.class,0);
		}
		public TerminalNode GREATER() { return getToken(CSSParser.GREATER, 0); }
		public TerminalNode SLASH() { return getToken(CSSParser.SLASH, 0); }
		public TerminalNode PLUS() { return getToken(CSSParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CSSParser.MINUS, 0); }
		public TerminalNode NUMBER() { return getToken(CSSParser.NUMBER, 0); }
		public TerminalNode INCLUDES() { return getToken(CSSParser.INCLUDES, 0); }
		public Funct_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funct_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterFunct_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitFunct_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitFunct_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funct_argumentContext funct_argument() throws RecognitionException {
		Funct_argumentContext _localctx = new Funct_argumentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_funct_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(698); match(IDENT);
				}
				break;
			case PLUS:
				{
				setState(699); match(PLUS);
				}
				break;
			case MINUS:
				{
				setState(700); match(MINUS);
				}
				break;
			case ASTERISK:
				{
				setState(701); match(ASTERISK);
				}
				break;
			case SLASH:
				{
				setState(702); match(SLASH);
				}
				break;
			case LPAREN:
				{
				setState(703); match(LPAREN);
				}
				break;
			case RPAREN:
				{
				setState(704); match(RPAREN);
				}
				break;
			case NUMBER:
				{
				setState(705); match(NUMBER);
				}
				break;
			case PERCENTAGE:
				{
				setState(706); match(PERCENTAGE);
				}
				break;
			case DIMENSION:
				{
				setState(707); match(DIMENSION);
				}
				break;
			case HASH:
				{
				setState(708); match(HASH);
				}
				break;
			case INVALID_STRING:
			case STRING:
			case UNCLOSED_STRING:
				{
				setState(709); string();
				}
				break;
			case EXPRESSION:
			case FUNCTION:
				{
				setState(710); funct();
				}
				break;
			case COMMA:
				{
				setState(711); match(COMMA);
				}
				break;
			case CLASSKEYWORD:
				{
				setState(712); match(CLASSKEYWORD);
				}
				break;
			case UNIRANGE:
				{
				setState(713); match(UNIRANGE);
				}
				break;
			case INCLUDES:
				{
				setState(714); match(INCLUDES);
				}
				break;
			case COLON:
				{
				setState(715); match(COLON);
				}
				break;
			case GREATER:
				{
				setState(716); match(GREATER);
				}
				break;
			case LESS:
				{
				setState(717); match(LESS);
				}
				break;
			case QUESTION:
				{
				setState(718); match(QUESTION);
				}
				break;
			case PERCENT:
				{
				setState(719); match(PERCENT);
				}
				break;
			case EQUALS:
				{
				setState(720); match(EQUALS);
				}
				break;
			case DASHMATCH:
				{
				setState(721); match(DASHMATCH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(724); match(S);
				}
				}
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

					log.error("Recognition exception | funct_argument");
					IntervalSet intervalSet = new IntervalSet(RCURLY, SEMICOLON);
					getCSSErrorHandler().consumeUntil(this, intervalSet, CSSLexerState.RecoveryMode.BALANCED, null);
					_localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT,""));
				
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Combined_selectorContext extends ParserRuleContext {
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public Combined_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combined_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterCombined_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitCombined_selector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitCombined_selector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Combined_selectorContext combined_selector() throws RecognitionException {
		Combined_selectorContext _localctx = new Combined_selectorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_combined_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730); selector();
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (GREATER - 60)) | (1L << (TILDE - 60)) | (1L << (PLUS - 60)) | (1L << (S - 60)))) != 0)) {
				{
				{
				{
				setState(731); combinator();
				}
				setState(732); selector();
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

				  log.error("Recognition exception | combined_selector | should be empty");
				
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CombinatorContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode PLUS() { return getToken(CSSParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(CSSParser.TILDE, 0); }
		public TerminalNode GREATER() { return getToken(CSSParser.GREATER, 0); }
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitCombinator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_combinator);
		int _la;
		try {
			setState(761);
			switch (_input.LA(1)) {
			case GREATER:
				enterOuterAlt(_localctx, 1);
				{
				setState(739); match(GREATER);
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(740); match(S);
					}
					}
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(746); match(PLUS);
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(747); match(S);
					}
					}
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(753); match(TILDE);
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(754); match(S);
					}
					}
					setState(759);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case S:
				enterOuterAlt(_localctx, 4);
				{
				setState(760); match(S);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | combinator| should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public SelpartContext selpart(int i) {
			return getRuleContext(SelpartContext.class,i);
		}
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<SelpartContext> selpart() {
			return getRuleContexts(SelpartContext.class);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode ASTERISK() { return getToken(CSSParser.ASTERISK, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selector);
		int _la;
		try {
			int _alt;
			setState(787);
			switch (_input.LA(1)) {
			case IDENT:
			case ASTERISK:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==ASTERISK) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (INVALID_SELPART - 23)) | (1L << (CLASSKEYWORD - 23)) | (1L << (HASH - 23)) | (1L << (COLON - 23)) | (1L << (LBRACKET - 23)))) != 0)) {
					{
					{
					setState(764); selpart();
					}
					}
					setState(769);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(773);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(770); match(S);
						}
						} 
					}
					setState(775);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				}
				}
				break;
			case INVALID_SELPART:
			case CLASSKEYWORD:
			case HASH:
			case COLON:
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(777); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(776); selpart();
					}
					}
					setState(779); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (INVALID_SELPART - 23)) | (1L << (CLASSKEYWORD - 23)) | (1L << (HASH - 23)) | (1L << (COLON - 23)) | (1L << (LBRACKET - 23)))) != 0) );
				setState(784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(781); match(S);
						}
						} 
					}
					setState(786);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING selector ERROR | inserting INVALID_SELECTOR");
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_SELECTOR, "INVALID_SELECTOR"));
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelpartContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(CSSParser.RBRACKET, 0); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TerminalNode CLASSKEYWORD() { return getToken(CSSParser.CLASSKEYWORD, 0); }
		public TerminalNode INVALID_SELPART() { return getToken(CSSParser.INVALID_SELPART, 0); }
		public PseudoContext pseudo() {
			return getRuleContext(PseudoContext.class,0);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode LBRACKET() { return getToken(CSSParser.LBRACKET, 0); }
		public TerminalNode HASH() { return getToken(CSSParser.HASH, 0); }
		public SelpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selpart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterSelpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitSelpart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitSelpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelpartContext selpart() throws RecognitionException {
		SelpartContext _localctx = new SelpartContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_selpart);
		int _la;
		try {
			setState(803);
			switch (_input.LA(1)) {
			case HASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(789); match(HASH);
				}
				break;
			case CLASSKEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(790); match(CLASSKEYWORD);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(791); match(LBRACKET);
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(792); match(S);
					}
					}
					setState(797);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(798); attribute();
				setState(799); match(RBRACKET);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(801); pseudo();
				}
				break;
			case INVALID_SELPART:
				enterOuterAlt(_localctx, 5);
				{
				setState(802); match(INVALID_SELPART);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING SELPART ERROR");
			        _localctx.addErrorNode(this.getTokenFactory().create(INVALID_SELPART, "INVALID_SELPART"));
				  
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TerminalNode EQUALS() { return getToken(CSSParser.EQUALS, 0); }
		public TerminalNode CONTAINS() { return getToken(CSSParser.CONTAINS, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode DASHMATCH() { return getToken(CSSParser.DASHMATCH, 0); }
		public TerminalNode IDENT(int i) {
			return getToken(CSSParser.IDENT, i);
		}
		public TerminalNode STARTSWITH() { return getToken(CSSParser.STARTSWITH, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode ENDSWITH() { return getToken(CSSParser.ENDSWITH, 0); }
		public TerminalNode INCLUDES() { return getToken(CSSParser.INCLUDES, 0); }
		public List<TerminalNode> IDENT() { return getTokens(CSSParser.IDENT); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805); match(IDENT);
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(806); match(S);
				}
				}
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(829);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (EQUALS - 58)) | (1L << (INCLUDES - 58)) | (1L << (DASHMATCH - 58)) | (1L << (STARTSWITH - 58)) | (1L << (ENDSWITH - 58)) | (1L << (CONTAINS - 58)))) != 0)) {
				{
				setState(812);
				_la = _input.LA(1);
				if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (EQUALS - 58)) | (1L << (INCLUDES - 58)) | (1L << (DASHMATCH - 58)) | (1L << (STARTSWITH - 58)) | (1L << (ENDSWITH - 58)) | (1L << (CONTAINS - 58)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(813); match(S);
					}
					}
					setState(818);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(821);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(819); match(IDENT);
					}
					break;
				case INVALID_STRING:
				case STRING:
				case UNCLOSED_STRING:
					{
					setState(820); string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(823); match(S);
					}
					}
					setState(828);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {

			        log.error("Recognition exception | attribute | should be empty");
			     
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PseudoContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(CSSParser.INDEX, 0); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TerminalNode FUNCTION() { return getToken(CSSParser.FUNCTION, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode COLON(int i) {
			return getToken(CSSParser.COLON, i);
		}
		public List<TerminalNode> COLON() { return getTokens(CSSParser.COLON); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode RPAREN() { return getToken(CSSParser.RPAREN, 0); }
		public TerminalNode MINUS() { return getToken(CSSParser.MINUS, 0); }
		public TerminalNode NUMBER() { return getToken(CSSParser.NUMBER, 0); }
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public PseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitPseudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitPseudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoContext pseudo() throws RecognitionException {
		PseudoContext _localctx = new PseudoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_pseudo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831); match(COLON);
			setState(833);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(832); match(COLON);
				}
			}

			setState(868);
			switch (_input.LA(1)) {
			case IDENT:
			case MINUS:
				{
				setState(836);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(835); match(MINUS);
					}
				}

				setState(838); match(IDENT);
				}
				break;
			case FUNCTION:
				{
				setState(839); match(FUNCTION);
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(840); match(S);
					}
					}
					setState(845);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(859);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(847);
					_la = _input.LA(1);
					if (_la==MINUS) {
						{
						setState(846); match(MINUS);
						}
					}

					setState(849); match(IDENT);
					}
					break;
				case 2:
					{
					setState(851);
					_la = _input.LA(1);
					if (_la==MINUS) {
						{
						setState(850); match(MINUS);
						}
					}

					setState(853); match(NUMBER);
					}
					break;
				case 3:
					{
					setState(855);
					_la = _input.LA(1);
					if (_la==MINUS) {
						{
						setState(854); match(MINUS);
						}
					}

					setState(857); match(INDEX);
					}
					break;
				case 4:
					{
					setState(858); selector();
					}
					break;
				}
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(861); match(S);
					}
					}
					setState(866);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(867); match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {

			      log.error("PARSING pseudo ERROR | inserting INVALID_SELPART");
			       _localctx.addErrorNode(this.getTokenFactory().create(INVALID_SELPART, "INVALID_SELPART"));
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode UNCLOSED_STRING() { return getToken(CSSParser.UNCLOSED_STRING, 0); }
		public TerminalNode STRING() { return getToken(CSSParser.STRING, 0); }
		public TerminalNode INVALID_STRING() { return getToken(CSSParser.INVALID_STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INVALID_STRING) | (1L << STRING) | (1L << UNCLOSED_STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING string ERROR | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bracketed_identsContext extends ParserRuleContext {
		public TerminalNode RBRACKET() { return getToken(CSSParser.RBRACKET, 0); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<Ident_list_itemContext> ident_list_item() {
			return getRuleContexts(Ident_list_itemContext.class);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode LBRACKET() { return getToken(CSSParser.LBRACKET, 0); }
		public TerminalNode INVALID_STATEMENT() { return getToken(CSSParser.INVALID_STATEMENT, 0); }
		public Ident_list_itemContext ident_list_item(int i) {
			return getRuleContext(Ident_list_itemContext.class,i);
		}
		public Bracketed_identsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketed_idents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterBracketed_idents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitBracketed_idents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitBracketed_idents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bracketed_identsContext bracketed_idents() throws RecognitionException {
		Bracketed_identsContext _localctx = new Bracketed_identsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_bracketed_idents);
		int _la;
		try {
			setState(887);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(872); match(LBRACKET);
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(873); match(S);
					}
					}
					setState(878);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (INVALID_STATEMENT - 25)) | (1L << (IDENT - 25)) | (1L << (MINUS - 25)))) != 0)) {
					{
					{
					setState(879); ident_list_item();
					}
					}
					setState(884);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(885); match(RBRACKET);
				}
				break;
			case INVALID_STATEMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(886); match(INVALID_STATEMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

					log.error("Recognition exception | bracketed_idents | empty");
					_localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT,""));
				
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ident_list_itemContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode MINUS() { return getToken(CSSParser.MINUS, 0); }
		public TerminalNode INVALID_STATEMENT() { return getToken(CSSParser.INVALID_STATEMENT, 0); }
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public Ident_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterIdent_list_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitIdent_list_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitIdent_list_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ident_list_itemContext ident_list_item() throws RecognitionException {
		Ident_list_itemContext _localctx = new Ident_list_itemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ident_list_item);
		int _la;
		try {
			setState(900);
			switch (_input.LA(1)) {
			case IDENT:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(889); match(MINUS);
					}
				}

				setState(892); match(IDENT);
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(893); match(S);
					}
					}
					setState(898);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case INVALID_STATEMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(899); match(INVALID_STATEMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {

					log.error("Recognition exception | ident_list_item | empty");
					_localctx.addErrorNode(this.getTokenFactory().create(INVALID_STATEMENT,""));
				
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(CSSParser.LESS, 0); }
		public TerminalNode RBRACKET() { return getToken(CSSParser.RBRACKET, 0); }
		public TerminalNode CLASSKEYWORD() { return getToken(CSSParser.CLASSKEYWORD, 0); }
		public TerminalNode PERCENT() { return getToken(CSSParser.PERCENT, 0); }
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode URI() { return getToken(CSSParser.URI, 0); }
		public TerminalNode ASTERISK() { return getToken(CSSParser.ASTERISK, 0); }
		public TerminalNode EQUALS() { return getToken(CSSParser.EQUALS, 0); }
		public TerminalNode LPAREN() { return getToken(CSSParser.LPAREN, 0); }
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(CSSParser.COMMA, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode PERCENTAGE() { return getToken(CSSParser.PERCENTAGE, 0); }
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public TerminalNode QUESTION() { return getToken(CSSParser.QUESTION, 0); }
		public TerminalNode HASH() { return getToken(CSSParser.HASH, 0); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TerminalNode DIMENSION() { return getToken(CSSParser.DIMENSION, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode UNIRANGE() { return getToken(CSSParser.UNIRANGE, 0); }
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public TerminalNode DASHMATCH() { return getToken(CSSParser.DASHMATCH, 0); }
		public TerminalNode UNCLOSED_URI() { return getToken(CSSParser.UNCLOSED_URI, 0); }
		public TerminalNode RPAREN() { return getToken(CSSParser.RPAREN, 0); }
		public TerminalNode LBRACKET() { return getToken(CSSParser.LBRACKET, 0); }
		public TerminalNode GREATER() { return getToken(CSSParser.GREATER, 0); }
		public TerminalNode FUNCTION() { return getToken(CSSParser.FUNCTION, 0); }
		public TerminalNode SLASH() { return getToken(CSSParser.SLASH, 0); }
		public TerminalNode EXCLAMATION() { return getToken(CSSParser.EXCLAMATION, 0); }
		public TerminalNode MINUS() { return getToken(CSSParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(CSSParser.PLUS, 0); }
		public TerminalNode NUMBER() { return getToken(CSSParser.NUMBER, 0); }
		public TerminalNode INCLUDES() { return getToken(CSSParser.INCLUDES, 0); }
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_any);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(902); match(IDENT);
				}
				break;
			case CLASSKEYWORD:
				{
				setState(903); match(CLASSKEYWORD);
				}
				break;
			case NUMBER:
				{
				setState(904); match(NUMBER);
				}
				break;
			case PERCENTAGE:
				{
				setState(905); match(PERCENTAGE);
				}
				break;
			case DIMENSION:
				{
				setState(906); match(DIMENSION);
				}
				break;
			case INVALID_STRING:
			case STRING:
			case UNCLOSED_STRING:
				{
				setState(907); string();
				}
				break;
			case URI:
				{
				setState(908); match(URI);
				}
				break;
			case UNCLOSED_URI:
				{
				setState(909); match(UNCLOSED_URI);
				}
				break;
			case HASH:
				{
				setState(910); match(HASH);
				}
				break;
			case UNIRANGE:
				{
				setState(911); match(UNIRANGE);
				}
				break;
			case INCLUDES:
				{
				setState(912); match(INCLUDES);
				}
				break;
			case COLON:
				{
				setState(913); match(COLON);
				}
				break;
			case COMMA:
				{
				setState(914); match(COMMA);
				}
				break;
			case GREATER:
				{
				setState(915); match(GREATER);
				}
				break;
			case LESS:
				{
				setState(916); match(LESS);
				}
				break;
			case QUESTION:
				{
				setState(917); match(QUESTION);
				}
				break;
			case PERCENT:
				{
				setState(918); match(PERCENT);
				}
				break;
			case EQUALS:
				{
				setState(919); match(EQUALS);
				}
				break;
			case SLASH:
				{
				setState(920); match(SLASH);
				}
				break;
			case EXCLAMATION:
				{
				setState(921); match(EXCLAMATION);
				}
				break;
			case MINUS:
				{
				setState(922); match(MINUS);
				}
				break;
			case PLUS:
				{
				setState(923); match(PLUS);
				}
				break;
			case ASTERISK:
				{
				setState(924); match(ASTERISK);
				}
				break;
			case FUNCTION:
				{
				setState(925); match(FUNCTION);
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==S) {
					{
					{
					setState(926); match(S);
					}
					}
					setState(931);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (INVALID_STRING - 21)) | (1L << (IDENT - 21)) | (1L << (CLASSKEYWORD - 21)) | (1L << (STRING - 21)) | (1L << (UNCLOSED_STRING - 21)) | (1L << (HASH - 21)) | (1L << (NUMBER - 21)) | (1L << (PERCENTAGE - 21)) | (1L << (DIMENSION - 21)) | (1L << (URI - 21)) | (1L << (UNCLOSED_URI - 21)) | (1L << (UNIRANGE - 21)) | (1L << (COLON - 21)) | (1L << (COMMA - 21)) | (1L << (QUESTION - 21)) | (1L << (PERCENT - 21)) | (1L << (EQUALS - 21)) | (1L << (SLASH - 21)) | (1L << (GREATER - 21)) | (1L << (LESS - 21)) | (1L << (LPAREN - 21)) | (1L << (LBRACKET - 21)) | (1L << (EXCLAMATION - 21)) | (1L << (MINUS - 21)) | (1L << (PLUS - 21)) | (1L << (ASTERISK - 21)) | (1L << (FUNCTION - 21)) | (1L << (INCLUDES - 21)) | (1L << (DASHMATCH - 21)))) != 0)) {
					{
					{
					setState(932); any();
					}
					}
					setState(937);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(938); match(RPAREN);
				}
				break;
			case DASHMATCH:
				{
				setState(939); match(DASHMATCH);
				}
				break;
			case LPAREN:
				{
				setState(940); match(LPAREN);
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (INVALID_STRING - 21)) | (1L << (IDENT - 21)) | (1L << (CLASSKEYWORD - 21)) | (1L << (STRING - 21)) | (1L << (UNCLOSED_STRING - 21)) | (1L << (HASH - 21)) | (1L << (NUMBER - 21)) | (1L << (PERCENTAGE - 21)) | (1L << (DIMENSION - 21)) | (1L << (URI - 21)) | (1L << (UNCLOSED_URI - 21)) | (1L << (UNIRANGE - 21)) | (1L << (COLON - 21)) | (1L << (COMMA - 21)) | (1L << (QUESTION - 21)) | (1L << (PERCENT - 21)) | (1L << (EQUALS - 21)) | (1L << (SLASH - 21)) | (1L << (GREATER - 21)) | (1L << (LESS - 21)) | (1L << (LPAREN - 21)) | (1L << (LBRACKET - 21)) | (1L << (EXCLAMATION - 21)) | (1L << (MINUS - 21)) | (1L << (PLUS - 21)) | (1L << (ASTERISK - 21)) | (1L << (FUNCTION - 21)) | (1L << (INCLUDES - 21)) | (1L << (DASHMATCH - 21)))) != 0)) {
					{
					{
					setState(941); any();
					}
					}
					setState(946);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(947); match(RPAREN);
				}
				break;
			case LBRACKET:
				{
				setState(948); match(LBRACKET);
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (INVALID_STRING - 21)) | (1L << (IDENT - 21)) | (1L << (CLASSKEYWORD - 21)) | (1L << (STRING - 21)) | (1L << (UNCLOSED_STRING - 21)) | (1L << (HASH - 21)) | (1L << (NUMBER - 21)) | (1L << (PERCENTAGE - 21)) | (1L << (DIMENSION - 21)) | (1L << (URI - 21)) | (1L << (UNCLOSED_URI - 21)) | (1L << (UNIRANGE - 21)) | (1L << (COLON - 21)) | (1L << (COMMA - 21)) | (1L << (QUESTION - 21)) | (1L << (PERCENT - 21)) | (1L << (EQUALS - 21)) | (1L << (SLASH - 21)) | (1L << (GREATER - 21)) | (1L << (LESS - 21)) | (1L << (LPAREN - 21)) | (1L << (LBRACKET - 21)) | (1L << (EXCLAMATION - 21)) | (1L << (MINUS - 21)) | (1L << (PLUS - 21)) | (1L << (ASTERISK - 21)) | (1L << (FUNCTION - 21)) | (1L << (INCLUDES - 21)) | (1L << (DASHMATCH - 21)))) != 0)) {
					{
					{
					setState(949); any();
					}
					}
					setState(954);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(955); match(RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(958); match(S);
				}
				}
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING any ERROR | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NostatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(CSSParser.SEMICOLON, 0); }
		public TerminalNode APOS() { return getToken(CSSParser.APOS, 0); }
		public TerminalNode RCURLY() { return getToken(CSSParser.RCURLY, 0); }
		public TerminalNode QUOT() { return getToken(CSSParser.QUOT, 0); }
		public NostatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nostatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterNostatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitNostatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitNostatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NostatementContext nostatement() throws RecognitionException {
		NostatementContext _localctx = new NostatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_nostatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (SEMICOLON - 53)) | (1L << (RCURLY - 53)) | (1L << (APOS - 53)) | (1L << (QUOT - 53)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {

			    log.error("PARSING nostatement ERROR | should be empty");
			  
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NopropContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(CSSParser.LESS, 0); }
		public TerminalNode CLASSKEYWORD() { return getToken(CSSParser.CLASSKEYWORD, 0); }
		public TerminalNode PERCENT() { return getToken(CSSParser.PERCENT, 0); }
		public TerminalNode URI() { return getToken(CSSParser.URI, 0); }
		public TerminalNode ASTERISK() { return getToken(CSSParser.ASTERISK, 0); }
		public TerminalNode EQUALS() { return getToken(CSSParser.EQUALS, 0); }
		public TerminalNode INVALID_TOKEN() { return getToken(CSSParser.INVALID_TOKEN, 0); }
		public TerminalNode COMMA() { return getToken(CSSParser.COMMA, 0); }
		public List<TerminalNode> S() { return getTokens(CSSParser.S); }
		public TerminalNode PERCENTAGE() { return getToken(CSSParser.PERCENTAGE, 0); }
		public TerminalNode QUESTION() { return getToken(CSSParser.QUESTION, 0); }
		public TerminalNode HASH() { return getToken(CSSParser.HASH, 0); }
		public TerminalNode S(int i) {
			return getToken(CSSParser.S, i);
		}
		public TerminalNode DIMENSION() { return getToken(CSSParser.DIMENSION, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode DASHMATCH() { return getToken(CSSParser.DASHMATCH, 0); }
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public TerminalNode UNCLOSED_URI() { return getToken(CSSParser.UNCLOSED_URI, 0); }
		public TerminalNode GREATER() { return getToken(CSSParser.GREATER, 0); }
		public TerminalNode STRING_CHAR() { return getToken(CSSParser.STRING_CHAR, 0); }
		public TerminalNode SLASH() { return getToken(CSSParser.SLASH, 0); }
		public TerminalNode EXCLAMATION() { return getToken(CSSParser.EXCLAMATION, 0); }
		public TerminalNode CTRL() { return getToken(CSSParser.CTRL, 0); }
		public TerminalNode PLUS() { return getToken(CSSParser.PLUS, 0); }
		public TerminalNode NUMBER() { return getToken(CSSParser.NUMBER, 0); }
		public TerminalNode INCLUDES() { return getToken(CSSParser.INCLUDES, 0); }
		public NopropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noprop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterNoprop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitNoprop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitNoprop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NopropContext noprop() throws RecognitionException {
		NopropContext _localctx = new NopropContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_noprop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			switch (_input.LA(1)) {
			case CLASSKEYWORD:
				{
				setState(966); match(CLASSKEYWORD);
				}
				break;
			case NUMBER:
				{
				setState(967); match(NUMBER);
				}
				break;
			case PERCENTAGE:
				{
				setState(968); match(PERCENTAGE);
				}
				break;
			case DIMENSION:
				{
				setState(969); match(DIMENSION);
				}
				break;
			case INVALID_STRING:
			case STRING:
			case UNCLOSED_STRING:
				{
				setState(970); string();
				}
				break;
			case COMMA:
				{
				setState(971); match(COMMA);
				}
				break;
			case HASH:
				{
				setState(972); match(HASH);
				}
				break;
			case URI:
				{
				setState(973); match(URI);
				}
				break;
			case UNCLOSED_URI:
				{
				setState(974); match(UNCLOSED_URI);
				}
				break;
			case GREATER:
				{
				setState(975); match(GREATER);
				}
				break;
			case LESS:
				{
				setState(976); match(LESS);
				}
				break;
			case QUESTION:
				{
				setState(977); match(QUESTION);
				}
				break;
			case PERCENT:
				{
				setState(978); match(PERCENT);
				}
				break;
			case EQUALS:
				{
				setState(979); match(EQUALS);
				}
				break;
			case SLASH:
				{
				setState(980); match(SLASH);
				}
				break;
			case EXCLAMATION:
				{
				setState(981); match(EXCLAMATION);
				}
				break;
			case PLUS:
				{
				setState(982); match(PLUS);
				}
				break;
			case ASTERISK:
				{
				setState(983); match(ASTERISK);
				}
				break;
			case DASHMATCH:
				{
				setState(984); match(DASHMATCH);
				}
				break;
			case INCLUDES:
				{
				setState(985); match(INCLUDES);
				}
				break;
			case COLON:
				{
				setState(986); match(COLON);
				}
				break;
			case STRING_CHAR:
				{
				setState(987); match(STRING_CHAR);
				}
				break;
			case CTRL:
				{
				setState(988); match(CTRL);
				}
				break;
			case INVALID_TOKEN:
				{
				setState(989); match(INVALID_TOKEN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(992); match(S);
				}
				}
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING noprop ERROR | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoruleContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(CSSParser.LESS, 0); }
		public TerminalNode AMPERSAND() { return getToken(CSSParser.AMPERSAND, 0); }
		public TerminalNode PERCENT() { return getToken(CSSParser.PERCENT, 0); }
		public TerminalNode URI() { return getToken(CSSParser.URI, 0); }
		public TerminalNode EQUALS() { return getToken(CSSParser.EQUALS, 0); }
		public TerminalNode INVALID_TOKEN() { return getToken(CSSParser.INVALID_TOKEN, 0); }
		public TerminalNode COMMA() { return getToken(CSSParser.COMMA, 0); }
		public TerminalNode PERCENTAGE() { return getToken(CSSParser.PERCENTAGE, 0); }
		public TerminalNode QUESTION() { return getToken(CSSParser.QUESTION, 0); }
		public TerminalNode DIMENSION() { return getToken(CSSParser.DIMENSION, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode HAT() { return getToken(CSSParser.HAT, 0); }
		public TerminalNode UNIRANGE() { return getToken(CSSParser.UNIRANGE, 0); }
		public TerminalNode DASHMATCH() { return getToken(CSSParser.DASHMATCH, 0); }
		public TerminalNode UNCLOSED_URI() { return getToken(CSSParser.UNCLOSED_URI, 0); }
		public TerminalNode RPAREN() { return getToken(CSSParser.RPAREN, 0); }
		public TerminalNode GREATER() { return getToken(CSSParser.GREATER, 0); }
		public TerminalNode POUND() { return getToken(CSSParser.POUND, 0); }
		public TerminalNode SLASH() { return getToken(CSSParser.SLASH, 0); }
		public TerminalNode EXCLAMATION() { return getToken(CSSParser.EXCLAMATION, 0); }
		public TerminalNode CTRL() { return getToken(CSSParser.CTRL, 0); }
		public TerminalNode MINUS() { return getToken(CSSParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(CSSParser.PLUS, 0); }
		public TerminalNode NUMBER() { return getToken(CSSParser.NUMBER, 0); }
		public TerminalNode INCLUDES() { return getToken(CSSParser.INCLUDES, 0); }
		public NoruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_norule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterNorule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitNorule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitNorule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoruleContext norule() throws RecognitionException {
		NoruleContext _localctx = new NoruleContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_norule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(998); match(NUMBER);
				}
				break;
			case PERCENTAGE:
				{
				setState(999); match(PERCENTAGE);
				}
				break;
			case DIMENSION:
				{
				setState(1000); match(DIMENSION);
				}
				break;
			case INVALID_STRING:
			case STRING:
			case UNCLOSED_STRING:
				{
				setState(1001); string();
				}
				break;
			case URI:
				{
				setState(1002); match(URI);
				}
				break;
			case UNCLOSED_URI:
				{
				setState(1003); match(UNCLOSED_URI);
				}
				break;
			case UNIRANGE:
				{
				setState(1004); match(UNIRANGE);
				}
				break;
			case INCLUDES:
				{
				setState(1005); match(INCLUDES);
				}
				break;
			case COMMA:
				{
				setState(1006); match(COMMA);
				}
				break;
			case GREATER:
				{
				setState(1007); match(GREATER);
				}
				break;
			case LESS:
				{
				setState(1008); match(LESS);
				}
				break;
			case QUESTION:
				{
				setState(1009); match(QUESTION);
				}
				break;
			case PERCENT:
				{
				setState(1010); match(PERCENT);
				}
				break;
			case EQUALS:
				{
				setState(1011); match(EQUALS);
				}
				break;
			case SLASH:
				{
				setState(1012); match(SLASH);
				}
				break;
			case EXCLAMATION:
				{
				setState(1013); match(EXCLAMATION);
				}
				break;
			case MINUS:
				{
				setState(1014); match(MINUS);
				}
				break;
			case PLUS:
				{
				setState(1015); match(PLUS);
				}
				break;
			case DASHMATCH:
				{
				setState(1016); match(DASHMATCH);
				}
				break;
			case RPAREN:
				{
				setState(1017); match(RPAREN);
				}
				break;
			case CTRL:
				{
				setState(1018); match(CTRL);
				}
				break;
			case POUND:
				{
				setState(1019); match(POUND);
				}
				break;
			case HAT:
				{
				setState(1020); match(HAT);
				}
				break;
			case AMPERSAND:
				{
				setState(1021); match(AMPERSAND);
				}
				break;
			case INVALID_TOKEN:
				{
				setState(1022); match(INVALID_TOKEN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING norule ERROR | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomediaqueryContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(CSSParser.LESS, 0); }
		public TerminalNode AMPERSAND() { return getToken(CSSParser.AMPERSAND, 0); }
		public TerminalNode PERCENT() { return getToken(CSSParser.PERCENT, 0); }
		public TerminalNode URI() { return getToken(CSSParser.URI, 0); }
		public TerminalNode ASTERISK() { return getToken(CSSParser.ASTERISK, 0); }
		public TerminalNode EQUALS() { return getToken(CSSParser.EQUALS, 0); }
		public TerminalNode PERCENTAGE() { return getToken(CSSParser.PERCENTAGE, 0); }
		public TerminalNode QUESTION() { return getToken(CSSParser.QUESTION, 0); }
		public TerminalNode DIMENSION() { return getToken(CSSParser.DIMENSION, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode HAT() { return getToken(CSSParser.HAT, 0); }
		public TerminalNode UNIRANGE() { return getToken(CSSParser.UNIRANGE, 0); }
		public TerminalNode DASHMATCH() { return getToken(CSSParser.DASHMATCH, 0); }
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public TerminalNode UNCLOSED_URI() { return getToken(CSSParser.UNCLOSED_URI, 0); }
		public TerminalNode RPAREN() { return getToken(CSSParser.RPAREN, 0); }
		public TerminalNode GREATER() { return getToken(CSSParser.GREATER, 0); }
		public TerminalNode FUNCTION() { return getToken(CSSParser.FUNCTION, 0); }
		public TerminalNode POUND() { return getToken(CSSParser.POUND, 0); }
		public TerminalNode SLASH() { return getToken(CSSParser.SLASH, 0); }
		public TerminalNode EXCLAMATION() { return getToken(CSSParser.EXCLAMATION, 0); }
		public TerminalNode CTRL() { return getToken(CSSParser.CTRL, 0); }
		public TerminalNode MINUS() { return getToken(CSSParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(CSSParser.PLUS, 0); }
		public TerminalNode NUMBER() { return getToken(CSSParser.NUMBER, 0); }
		public TerminalNode INCLUDES() { return getToken(CSSParser.INCLUDES, 0); }
		public NomediaqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomediaquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterNomediaquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitNomediaquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitNomediaquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomediaqueryContext nomediaquery() throws RecognitionException {
		NomediaqueryContext _localctx = new NomediaqueryContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_nomediaquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(1025); match(NUMBER);
				}
				break;
			case PERCENTAGE:
				{
				setState(1026); match(PERCENTAGE);
				}
				break;
			case DIMENSION:
				{
				setState(1027); match(DIMENSION);
				}
				break;
			case INVALID_STRING:
			case STRING:
			case UNCLOSED_STRING:
				{
				setState(1028); string();
				}
				break;
			case URI:
				{
				setState(1029); match(URI);
				}
				break;
			case UNCLOSED_URI:
				{
				setState(1030); match(UNCLOSED_URI);
				}
				break;
			case UNIRANGE:
				{
				setState(1031); match(UNIRANGE);
				}
				break;
			case INCLUDES:
				{
				setState(1032); match(INCLUDES);
				}
				break;
			case GREATER:
				{
				setState(1033); match(GREATER);
				}
				break;
			case LESS:
				{
				setState(1034); match(LESS);
				}
				break;
			case QUESTION:
				{
				setState(1035); match(QUESTION);
				}
				break;
			case PERCENT:
				{
				setState(1036); match(PERCENT);
				}
				break;
			case EQUALS:
				{
				setState(1037); match(EQUALS);
				}
				break;
			case SLASH:
				{
				setState(1038); match(SLASH);
				}
				break;
			case EXCLAMATION:
				{
				setState(1039); match(EXCLAMATION);
				}
				break;
			case MINUS:
				{
				setState(1040); match(MINUS);
				}
				break;
			case PLUS:
				{
				setState(1041); match(PLUS);
				}
				break;
			case DASHMATCH:
				{
				setState(1042); match(DASHMATCH);
				}
				break;
			case RPAREN:
				{
				setState(1043); match(RPAREN);
				}
				break;
			case CTRL:
				{
				setState(1044); match(CTRL);
				}
				break;
			case COLON:
				{
				setState(1045); match(COLON);
				}
				break;
			case ASTERISK:
				{
				setState(1046); match(ASTERISK);
				}
				break;
			case FUNCTION:
				{
				setState(1047); match(FUNCTION);
				}
				break;
			case POUND:
				{
				setState(1048); match(POUND);
				}
				break;
			case HAT:
				{
				setState(1049); match(HAT);
				}
				break;
			case AMPERSAND:
				{
				setState(1050); match(AMPERSAND);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {

			        log.error("PARSING nomediaquery ERROR | should be empty");
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3^\u0420\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\6\2a\n\2\r\2\16\2b\5\2e\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\7\3l\n\3\f\3\16\3o\13\3\3\4\3\4\5\4s\n\4\3\5\3\5\3"+
		"\5\7\5x\n\5\f\5\16\5{\13\5\3\5\3\5\7\5\177\n\5\f\5\16\5\u0082\13\5\3\5"+
		"\5\5\u0085\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u008c\n\5\f\5\16\5\u008f\13\5\3"+
		"\5\3\5\7\5\u0093\n\5\f\5\16\5\u0096\13\5\3\5\3\5\3\5\3\5\3\5\7\5\u009d"+
		"\n\5\f\5\16\5\u00a0\13\5\3\5\3\5\7\5\u00a4\n\5\f\5\16\5\u00a7\13\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5\u00ae\n\5\f\5\16\5\u00b1\13\5\3\5\5\5\u00b4\n\5\3"+
		"\5\3\5\7\5\u00b8\n\5\f\5\16\5\u00bb\13\5\3\5\3\5\7\5\u00bf\n\5\f\5\16"+
		"\5\u00c2\13\5\7\5\u00c4\n\5\f\5\16\5\u00c7\13\5\3\5\3\5\3\5\7\5\u00cc"+
		"\n\5\f\5\16\5\u00cf\13\5\3\5\3\5\7\5\u00d3\n\5\f\5\16\5\u00d6\13\5\3\5"+
		"\3\5\7\5\u00da\n\5\f\5\16\5\u00dd\13\5\3\5\3\5\7\5\u00e1\n\5\f\5\16\5"+
		"\u00e4\13\5\7\5\u00e6\n\5\f\5\16\5\u00e9\13\5\3\5\3\5\3\5\5\5\u00ee\n"+
		"\5\3\6\3\6\3\7\3\7\7\7\u00f4\n\7\f\7\16\7\u00f7\13\7\3\7\5\7\u00fa\n\7"+
		"\3\7\5\7\u00fd\n\7\3\7\7\7\u0100\n\7\f\7\16\7\u0103\13\7\3\7\3\7\7\7\u0107"+
		"\n\7\f\7\16\7\u010a\13\7\3\7\3\7\7\7\u010e\n\7\f\7\16\7\u0111\13\7\3\7"+
		"\3\7\3\b\3\b\7\b\u0117\n\b\f\b\16\b\u011a\13\b\3\b\3\b\7\b\u011e\n\b\f"+
		"\b\16\b\u0121\13\b\3\b\3\b\3\b\7\b\u0126\n\b\f\b\16\b\u0129\13\b\3\t\3"+
		"\t\7\t\u012d\n\t\f\t\16\t\u0130\13\t\3\t\3\t\7\t\u0134\n\t\f\t\16\t\u0137"+
		"\13\t\3\t\3\t\7\t\u013b\n\t\f\t\16\t\u013e\13\t\7\t\u0140\n\t\f\t\16\t"+
		"\u0143\13\t\5\t\u0145\n\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u014e\n\n\f"+
		"\n\16\n\u0151\13\n\3\n\7\n\u0154\n\n\f\n\16\n\u0157\13\n\3\13\3\13\7\13"+
		"\u015b\n\13\f\13\16\13\u015e\13\13\6\13\u0160\n\13\r\13\16\13\u0161\3"+
		"\f\3\f\5\f\u0166\n\f\3\f\5\f\u0169\n\f\3\r\3\r\7\r\u016d\n\r\f\r\16\r"+
		"\u0170\13\r\3\r\3\r\7\r\u0174\n\r\f\r\16\r\u0177\13\r\3\r\3\r\7\r\u017b"+
		"\n\r\f\r\16\r\u017e\13\r\3\r\5\r\u0181\n\r\3\r\3\r\3\16\3\16\5\16\u0187"+
		"\n\16\3\17\3\17\5\17\u018b\n\17\3\20\3\20\3\20\7\20\u0190\n\20\f\20\16"+
		"\20\u0193\13\20\3\20\7\20\u0196\n\20\f\20\16\20\u0199\13\20\3\20\3\20"+
		"\7\20\u019d\n\20\f\20\16\20\u01a0\13\20\3\20\3\20\3\20\3\21\3\21\7\21"+
		"\u01a7\n\21\f\21\16\21\u01aa\13\21\3\21\3\21\7\21\u01ae\n\21\f\21\16\21"+
		"\u01b1\13\21\5\21\u01b3\n\21\3\22\3\22\7\22\u01b7\n\22\f\22\16\22\u01ba"+
		"\13\22\3\22\7\22\u01bd\n\22\f\22\16\22\u01c0\13\22\3\22\3\22\3\22\7\22"+
		"\u01c5\n\22\f\22\16\22\u01c8\13\22\3\22\7\22\u01cb\n\22\f\22\16\22\u01ce"+
		"\13\22\3\22\5\22\u01d1\n\22\3\23\3\23\7\23\u01d5\n\23\f\23\16\23\u01d8"+
		"\13\23\3\23\3\23\3\24\3\24\3\24\7\24\u01df\n\24\f\24\16\24\u01e2\13\24"+
		"\3\24\7\24\u01e5\n\24\f\24\16\24\u01e8\13\24\5\24\u01ea\n\24\3\24\3\24"+
		"\7\24\u01ee\n\24\f\24\16\24\u01f1\13\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u01f9\n\24\3\25\5\25\u01fc\n\25\3\25\3\25\7\25\u0200\n\25\f\25\16"+
		"\25\u0203\13\25\3\25\5\25\u0206\n\25\7\25\u0208\n\25\f\25\16\25\u020b"+
		"\13\25\3\26\3\26\3\26\7\26\u0210\n\26\f\26\16\26\u0213\13\26\3\26\5\26"+
		"\u0216\n\26\3\26\5\26\u0219\n\26\3\26\3\26\7\26\u021d\n\26\f\26\16\26"+
		"\u0220\13\26\5\26\u0222\n\26\3\27\3\27\7\27\u0226\n\27\f\27\16\27\u0229"+
		"\13\27\3\27\3\27\7\27\u022d\n\27\f\27\16\27\u0230\13\27\3\30\5\30\u0233"+
		"\n\30\3\30\3\30\7\30\u0237\n\30\f\30\16\30\u023a\13\30\3\31\6\31\u023d"+
		"\n\31\r\31\16\31\u023e\3\32\3\32\3\32\7\32\u0244\n\32\f\32\16\32\u0247"+
		"\13\32\3\32\3\32\3\32\7\32\u024c\n\32\f\32\16\32\u024f\13\32\7\32\u0251"+
		"\n\32\f\32\16\32\u0254\13\32\3\32\3\32\3\32\7\32\u0259\n\32\f\32\16\32"+
		"\u025c\13\32\5\32\u025e\n\32\3\33\3\33\7\33\u0262\n\33\f\33\16\33\u0265"+
		"\13\33\3\33\3\33\3\33\7\33\u026a\n\33\f\33\16\33\u026d\13\33\7\33\u026f"+
		"\n\33\f\33\16\33\u0272\13\33\3\33\3\33\3\33\7\33\u0277\n\33\f\33\16\33"+
		"\u027a\13\33\3\33\5\33\u027d\n\33\3\33\5\33\u0280\n\33\3\34\5\34\u0283"+
		"\n\34\3\34\3\34\5\34\u0287\n\34\3\34\3\34\5\34\u028b\n\34\3\34\3\34\5"+
		"\34\u028f\n\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0297\n\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\7\34\u02aa\n\34\f\34\16\34\u02ad\13\34\3\34\5\34\u02b0\n\34\3\34"+
		"\7\34\u02b3\n\34\f\34\16\34\u02b6\13\34\3\35\6\35\u02b9\n\35\r\35\16\35"+
		"\u02ba\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u02d5\n\36"+
		"\3\36\7\36\u02d8\n\36\f\36\16\36\u02db\13\36\3\37\3\37\3\37\3\37\7\37"+
		"\u02e1\n\37\f\37\16\37\u02e4\13\37\3 \3 \7 \u02e8\n \f \16 \u02eb\13 "+
		"\3 \3 \7 \u02ef\n \f \16 \u02f2\13 \3 \3 \7 \u02f6\n \f \16 \u02f9\13"+
		" \3 \5 \u02fc\n \3!\3!\7!\u0300\n!\f!\16!\u0303\13!\3!\7!\u0306\n!\f!"+
		"\16!\u0309\13!\3!\6!\u030c\n!\r!\16!\u030d\3!\7!\u0311\n!\f!\16!\u0314"+
		"\13!\5!\u0316\n!\3\"\3\"\3\"\3\"\7\"\u031c\n\"\f\"\16\"\u031f\13\"\3\""+
		"\3\"\3\"\3\"\3\"\5\"\u0326\n\"\3#\3#\7#\u032a\n#\f#\16#\u032d\13#\3#\3"+
		"#\7#\u0331\n#\f#\16#\u0334\13#\3#\3#\5#\u0338\n#\3#\7#\u033b\n#\f#\16"+
		"#\u033e\13#\5#\u0340\n#\3$\3$\5$\u0344\n$\3$\5$\u0347\n$\3$\3$\3$\7$\u034c"+
		"\n$\f$\16$\u034f\13$\3$\5$\u0352\n$\3$\3$\5$\u0356\n$\3$\3$\5$\u035a\n"+
		"$\3$\3$\5$\u035e\n$\3$\7$\u0361\n$\f$\16$\u0364\13$\3$\5$\u0367\n$\3%"+
		"\3%\3&\3&\7&\u036d\n&\f&\16&\u0370\13&\3&\7&\u0373\n&\f&\16&\u0376\13"+
		"&\3&\3&\5&\u037a\n&\3\'\5\'\u037d\n\'\3\'\3\'\7\'\u0381\n\'\f\'\16\'\u0384"+
		"\13\'\3\'\5\'\u0387\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u03a2\n(\f(\16(\u03a5\13(\3(\7(\u03a8"+
		"\n(\f(\16(\u03ab\13(\3(\3(\3(\3(\7(\u03b1\n(\f(\16(\u03b4\13(\3(\3(\3"+
		"(\7(\u03b9\n(\f(\16(\u03bc\13(\3(\5(\u03bf\n(\3(\7(\u03c2\n(\f(\16(\u03c5"+
		"\13(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\5*\u03e1\n*\3*\7*\u03e4\n*\f*\16*\u03e7\13*\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0402"+
		"\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\5,\u041e\n,\3,\2\2-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\b\4\2+,\62\63\3\2JK\4\2  LL\4"+
		"\2<<UY\4\2\27\27+,\4\2\67\67AC\u0522\2[\3\2\2\2\4m\3\2\2\2\6r\3\2\2\2"+
		"\b\u00ed\3\2\2\2\n\u00ef\3\2\2\2\f\u00f1\3\2\2\2\16\u0114\3\2\2\2\20\u0144"+
		"\3\2\2\2\22\u014a\3\2\2\2\24\u015f\3\2\2\2\26\u0168\3\2\2\2\30\u016a\3"+
		"\2\2\2\32\u0186\3\2\2\2\34\u018a\3\2\2\2\36\u018c\3\2\2\2 \u01b2\3\2\2"+
		"\2\"\u01d0\3\2\2\2$\u01d2\3\2\2\2&\u01f8\3\2\2\2(\u01fb\3\2\2\2*\u0221"+
		"\3\2\2\2,\u0223\3\2\2\2.\u0232\3\2\2\2\60\u023c\3\2\2\2\62\u025d\3\2\2"+
		"\2\64\u027f\3\2\2\2\66\u02af\3\2\2\28\u02b8\3\2\2\2:\u02d4\3\2\2\2<\u02dc"+
		"\3\2\2\2>\u02fb\3\2\2\2@\u0315\3\2\2\2B\u0325\3\2\2\2D\u0327\3\2\2\2F"+
		"\u0341\3\2\2\2H\u0368\3\2\2\2J\u0379\3\2\2\2L\u0386\3\2\2\2N\u03be\3\2"+
		"\2\2P\u03c6\3\2\2\2R\u03e0\3\2\2\2T\u0401\3\2\2\2V\u041d\3\2\2\2XZ\7P"+
		"\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\d\3\2\2\2][\3\2\2\2^e\5"+
		"(\25\2_a\5\20\t\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2d^"+
		"\3\2\2\2d`\3\2\2\2e\3\3\2\2\2fl\7\65\2\2gl\7\66\2\2hl\7P\2\2il\5P)\2j"+
		"l\5\6\4\2kf\3\2\2\2kg\3\2\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2lo\3\2\2\2"+
		"mk\3\2\2\2mn\3\2\2\2n\5\3\2\2\2om\3\2\2\2ps\5&\24\2qs\5\b\5\2rp\3\2\2"+
		"\2rq\3\2\2\2s\7\3\2\2\2t\u00ee\7!\2\2uy\7\"\2\2vx\7P\2\2wv\3\2\2\2x{\3"+
		"\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|\u0080\5\n\6\2}\177\7P"+
		"\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\5\22\n\2\u0084\u0083\3"+
		"\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\67\2\2\u0087"+
		"\u00ee\3\2\2\2\u0088\u00ee\5\f\7\2\u0089\u008d\7\'\2\2\u008a\u008c\7P"+
		"\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0094\7@"+
		"\2\2\u0091\u0093\7P\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0098\5(\25\2\u0098\u0099\7A\2\2\u0099\u00ee\3\2\2\2\u009a"+
		"\u009e\7(\2\2\u009b\u009d\7P\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2"+
		"\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a1\u00a5\7@\2\2\u00a2\u00a4\7P\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\5(\25\2\u00a9\u00aa\7A\2\2\u00aa"+
		"\u00ee\3\2\2\2\u00ab\u00af\7$\2\2\u00ac\u00ae\7P\2\2\u00ad\u00ac\3\2\2"+
		"\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b3"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\5\22\n\2\u00b3\u00b2\3\2\2\2"+
		"\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b9\7@\2\2\u00b6\u00b8"+
		"\7P\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00c5\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c0\5\32"+
		"\16\2\u00bd\u00bf\7P\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c3\u00bc\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ee\7A"+
		"\2\2\u00c9\u00cd\7#\2\2\u00ca\u00cc\7P\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d4\5\34\17\2\u00d1\u00d3\7P\2\2\u00d2\u00d1\3"+
		"\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00db\7@\2\2\u00d8\u00da\7P\2"+
		"\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00e7\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e2\5\36\20\2"+
		"\u00df\u00e1\7P\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00de\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7A\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ee\5\"\22\2\u00edt\3\2\2\2\u00edu\3\2\2\2\u00ed"+
		"\u0088\3\2\2\2\u00ed\u0089\3\2\2\2\u00ed\u009a\3\2\2\2\u00ed\u00ab\3\2"+
		"\2\2\u00ed\u00c9\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\t\3\2\2\2\u00ef\u00f0"+
		"\t\2\2\2\u00f0\13\3\2\2\2\u00f1\u00f5\7%\2\2\u00f2\u00f4\7P\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\7 \2\2\u00f9"+
		"\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00fd\5F"+
		"$\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0101\3\2\2\2\u00fe"+
		"\u0100\7P\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104"+
		"\u0108\7@\2\2\u0105\u0107\7P\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2"+
		"\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010b\u010f\5(\25\2\u010c\u010e\5\16\b\2\u010d\u010c\3\2\2\2"+
		"\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7A\2\2\u0113\r\3\2\2\2\u0114"+
		"\u0118\7&\2\2\u0115\u0117\7P\2\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2"+
		"\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011b\u011f\7@\2\2\u011c\u011e\7P\2\2\u011d\u011c\3\2\2\2\u011e"+
		"\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0122\u0123\5(\25\2\u0123\u0127\7A\2\2\u0124"+
		"\u0126\7P\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128\17\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012e"+
		"\5F$\2\u012b\u012d\7P\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0141\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0131\u0135\79\2\2\u0132\u0134\7P\2\2\u0133\u0132\3\2\2\2\u0134\u0137"+
		"\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0138\u013c\5F$\2\u0139\u013b\7P\2\2\u013a\u0139\3\2\2"+
		"\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0140"+
		"\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0131\3\2\2\2\u0140\u0143\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0144\u012a\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0147\7@\2\2\u0147\u0148\5(\25\2\u0148\u0149\7A\2\2\u0149\21\3\2\2\2"+
		"\u014a\u0155\5\24\13\2\u014b\u014f\79\2\2\u014c\u014e\7P\2\2\u014d\u014c"+
		"\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0154\5\24\13\2\u0153\u014b\3"+
		"\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\23\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015c\5\26\f\2\u0159\u015b\7P\2"+
		"\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0158\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\25\3\2\2"+
		"\2\u0163\u0166\7 \2\2\u0164\u0166\5\30\r\2\u0165\u0163\3\2\2\2\u0165\u0164"+
		"\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0169\5V,\2\u0168\u0165\3\2\2\2\u0168"+
		"\u0167\3\2\2\2\u0169\27\3\2\2\2\u016a\u016e\7D\2\2\u016b\u016d\7P\2\2"+
		"\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0175\7 \2\2\u0172"+
		"\u0174\7P\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176\u0180\3\2\2\2\u0177\u0175\3\2\2\2\u0178"+
		"\u017c\78\2\2\u0179\u017b\7P\2\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2"+
		"\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c"+
		"\3\2\2\2\u017f\u0181\5\60\31\2\u0180\u0178\3\2\2\2\u0180\u0181\3\2\2\2"+
		"\u0181\u0182\3\2\2\2\u0182\u0183\7E\2\2\u0183\31\3\2\2\2\u0184\u0187\5"+
		"&\24\2\u0185\u0187\5\b\5\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187"+
		"\33\3\2\2\2\u0188\u018b\7 \2\2\u0189\u018b\5H%\2\u018a\u0188\3\2\2\2\u018a"+
		"\u0189\3\2\2\2\u018b\35\3\2\2\2\u018c\u0197\5 \21\2\u018d\u0191\79\2\2"+
		"\u018e\u0190\7P\2\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194"+
		"\u0196\5 \21\2\u0195\u018d\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2"+
		"\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a"+
		"\u019e\7@\2\2\u019b\u019d\7P\2\2\u019c\u019b\3\2\2\2\u019d\u01a0\3\2\2"+
		"\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e"+
		"\3\2\2\2\u01a1\u01a2\5(\25\2\u01a2\u01a3\7A\2\2\u01a3\37\3\2\2\2\u01a4"+
		"\u01a8\7 \2\2\u01a5\u01a7\7P\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2"+
		"\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01b3\3\2\2\2\u01aa\u01a8"+
		"\3\2\2\2\u01ab\u01af\7\60\2\2\u01ac\u01ae\7P\2\2\u01ad\u01ac\3\2\2\2\u01ae"+
		"\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b3\3\2"+
		"\2\2\u01b1\u01af\3\2\2\2\u01b2\u01a4\3\2\2\2\u01b2\u01ab\3\2\2\2\u01b3"+
		"!\3\2\2\2\u01b4\u01b8\7)\2\2\u01b5\u01b7\7P\2\2\u01b6\u01b5\3\2\2\2\u01b7"+
		"\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01be\3\2"+
		"\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bd\5N(\2\u01bc\u01bb\3\2\2\2\u01bd\u01c0"+
		"\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c1\u01d1\5$\23\2\u01c2\u01c6\7)\2\2\u01c3\u01c5\7P\2"+
		"\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7"+
		"\3\2\2\2\u01c7\u01cc\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01cb\5N(\2\u01ca"+
		"\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2"+
		"\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d1\7\67\2\2\u01d0"+
		"\u01b4\3\2\2\2\u01d0\u01c2\3\2\2\2\u01d1#\3\2\2\2\u01d2\u01d6\7@\2\2\u01d3"+
		"\u01d5\7P\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2"+
		"\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9"+
		"\u01da\7A\2\2\u01da%\3\2\2\2\u01db\u01e6\5<\37\2\u01dc\u01e0\79\2\2\u01dd"+
		"\u01df\7P\2\2\u01de\u01dd\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2"+
		"\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3"+
		"\u01e5\5<\37\2\u01e4\u01dc\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9"+
		"\u01db\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ef\7@"+
		"\2\2\u01ec\u01ee\7P\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2"+
		"\2\2\u01f2\u01f3\5(\25\2\u01f3\u01f4\7A\2\2\u01f4\u01f9\3\2\2\2\u01f5"+
		"\u01f6\5T+\2\u01f6\u01f7\b\24\1\2\u01f7\u01f9\3\2\2\2\u01f8\u01e9\3\2"+
		"\2\2\u01f8\u01f5\3\2\2\2\u01f9\'\3\2\2\2\u01fa\u01fc\5*\26\2\u01fb\u01fa"+
		"\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0209\3\2\2\2\u01fd\u0201\7\67\2\2"+
		"\u01fe\u0200\7P\2\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff"+
		"\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0204"+
		"\u0206\5*\26\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208\3\2"+
		"\2\2\u0207\u01fd\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a)\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\5.\30\2"+
		"\u020d\u0211\78\2\2\u020e\u0210\7P\2\2\u020f\u020e\3\2\2\2\u0210\u0213"+
		"\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0215\3\2\2\2\u0213"+
		"\u0211\3\2\2\2\u0214\u0216\5\60\31\2\u0215\u0214\3\2\2\2\u0215\u0216\3"+
		"\2\2\2\u0216\u0218\3\2\2\2\u0217\u0219\5,\27\2\u0218\u0217\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u0222\3\2\2\2\u021a\u021e\5R*\2\u021b\u021d\5N(\2"+
		"\u021c\u021b\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f"+
		"\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u020c\3\2\2\2\u0221"+
		"\u021a\3\2\2\2\u0222+\3\2\2\2\u0223\u0227\7H\2\2\u0224\u0226\7P\2\2\u0225"+
		"\u0224\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2"+
		"\2\2\u0228\u022a\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022e\7\37\2\2\u022b"+
		"\u022d\7P\2\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2"+
		"\2\2\u022e\u022f\3\2\2\2\u022f-\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0233"+
		"\7J\2\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"\u0238\7 \2\2\u0235\u0237\7P\2\2\u0236\u0235\3\2\2\2\u0237\u023a\3\2\2"+
		"\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239/\3\2\2\2\u023a\u0238"+
		"\3\2\2\2\u023b\u023d\5\62\32\2\u023c\u023b\3\2\2\2\u023d\u023e\3\2\2\2"+
		"\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\61\3\2\2\2\u0240\u025e"+
		"\5\66\34\2\u0241\u0245\7@\2\2\u0242\u0244\7P\2\2\u0243\u0242\3\2\2\2\u0244"+
		"\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0252\3\2"+
		"\2\2\u0247\u0245\3\2\2\2\u0248\u0251\5N(\2\u0249\u024d\7\67\2\2\u024a"+
		"\u024c\7P\2\2\u024b\u024a\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2"+
		"\2\2\u024d\u024e\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u0250"+
		"\u0248\3\2\2\2\u0250\u0249\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2"+
		"\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u0252\3\2\2\2\u0255"+
		"\u025e\7A\2\2\u0256\u025a\7)\2\2\u0257\u0259\7P\2\2\u0258\u0257\3\2\2"+
		"\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025e"+
		"\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u0240\3\2\2\2\u025d\u0241\3\2\2\2\u025d"+
		"\u0256\3\2\2\2\u025e\63\3\2\2\2\u025f\u0263\7S\2\2\u0260\u0262\7P\2\2"+
		"\u0261\u0260\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264"+
		"\3\2\2\2\u0264\u0270\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u026f\5N(\2\u0267"+
		"\u026b\7\67\2\2\u0268\u026a\7P\2\2\u0269\u0268\3\2\2\2\u026a\u026d\3\2"+
		"\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026f\3\2\2\2\u026d"+
		"\u026b\3\2\2\2\u026e\u0266\3\2\2\2\u026e\u0267\3\2\2\2\u026f\u0272\3\2"+
		"\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0273\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0273\u0280\7E\2\2\u0274\u0278\7T\2\2\u0275\u0277\7P\2"+
		"\2\u0276\u0275\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279"+
		"\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u027d\58\35\2\u027c"+
		"\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\7E"+
		"\2\2\u027f\u025f\3\2\2\2\u027f\u0274\3\2\2\2\u0280\65\3\2\2\2\u0281\u0283"+
		"\7J\2\2\u0282\u0281\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u02b0\7 \2\2\u0285\u0287\t\3\2\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2"+
		"\2\2\u0287\u0288\3\2\2\2\u0288\u02b0\7/\2\2\u0289\u028b\t\3\2\2\u028a"+
		"\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u02b0\7\60"+
		"\2\2\u028d\u028f\t\3\2\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"\u0290\3\2\2\2\u0290\u02b0\7\61\2\2\u0291\u02b0\5H%\2\u0292\u02b0\7\62"+
		"\2\2\u0293\u02b0\7\63\2\2\u0294\u02b0\7-\2\2\u0295\u0297\t\3\2\2\u0296"+
		"\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u02b0\5\64"+
		"\33\2\u0299\u02b0\79\2\2\u029a\u02b0\7=\2\2\u029b\u02b0\5J&\2\u029c\u02b0"+
		"\7*\2\2\u029d\u02b0\7\64\2\2\u029e\u02b0\7U\2\2\u029f\u02b0\78\2\2\u02a0"+
		"\u02b0\7>\2\2\u02a1\u02b0\7?\2\2\u02a2\u02b0\7:\2\2\u02a3\u02b0\7;\2\2"+
		"\u02a4\u02b0\7<\2\2\u02a5\u02b0\7L\2\2\u02a6\u02b0\7V\2\2\u02a7\u02ab"+
		"\7D\2\2\u02a8\u02aa\5\66\34\2\u02a9\u02a8\3\2\2\2\u02aa\u02ad\3\2\2\2"+
		"\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02ab"+
		"\3\2\2\2\u02ae\u02b0\7E\2\2\u02af\u0282\3\2\2\2\u02af\u0286\3\2\2\2\u02af"+
		"\u028a\3\2\2\2\u02af\u028e\3\2\2\2\u02af\u0291\3\2\2\2\u02af\u0292\3\2"+
		"\2\2\u02af\u0293\3\2\2\2\u02af\u0294\3\2\2\2\u02af\u0296\3\2\2\2\u02af"+
		"\u0299\3\2\2\2\u02af\u029a\3\2\2\2\u02af\u029b\3\2\2\2\u02af\u029c\3\2"+
		"\2\2\u02af\u029d\3\2\2\2\u02af\u029e\3\2\2\2\u02af\u029f\3\2\2\2\u02af"+
		"\u02a0\3\2\2\2\u02af\u02a1\3\2\2\2\u02af\u02a2\3\2\2\2\u02af\u02a3\3\2"+
		"\2\2\u02af\u02a4\3\2\2\2\u02af\u02a5\3\2\2\2\u02af\u02a6\3\2\2\2\u02af"+
		"\u02a7\3\2\2\2\u02b0\u02b4\3\2\2\2\u02b1\u02b3\7P\2\2\u02b2\u02b1\3\2"+
		"\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5"+
		"\67\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02b9\5:\36\2\u02b8\u02b7\3\2\2"+
		"\2\u02b9\u02ba\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb9"+
		"\3\2\2\2\u02bc\u02d5\7 \2\2\u02bd\u02d5\7K\2\2\u02be\u02d5\7J\2\2\u02bf"+
		"\u02d5\7L\2\2\u02c0\u02d5\7=\2\2\u02c1\u02d5\7D\2\2\u02c2\u02d5\7E\2\2"+
		"\u02c3\u02d5\7/\2\2\u02c4\u02d5\7\60\2\2\u02c5\u02d5\7\61\2\2\u02c6\u02d5"+
		"\7-\2\2\u02c7\u02d5\5H%\2\u02c8\u02d5\5\64\33\2\u02c9\u02d5\79\2\2\u02ca"+
		"\u02d5\7*\2\2\u02cb\u02d5\7\64\2\2\u02cc\u02d5\7U\2\2\u02cd\u02d5\78\2"+
		"\2\u02ce\u02d5\7>\2\2\u02cf\u02d5\7?\2\2\u02d0\u02d5\7:\2\2\u02d1\u02d5"+
		"\7;\2\2\u02d2\u02d5\7<\2\2\u02d3\u02d5\7V\2\2\u02d4\u02bc\3\2\2\2\u02d4"+
		"\u02bd\3\2\2\2\u02d4\u02be\3\2\2\2\u02d4\u02bf\3\2\2\2\u02d4\u02c0\3\2"+
		"\2\2\u02d4\u02c1\3\2\2\2\u02d4\u02c2\3\2\2\2\u02d4\u02c3\3\2\2\2\u02d4"+
		"\u02c4\3\2\2\2\u02d4\u02c5\3\2\2\2\u02d4\u02c6\3\2\2\2\u02d4\u02c7\3\2"+
		"\2\2\u02d4\u02c8\3\2\2\2\u02d4\u02c9\3\2\2\2\u02d4\u02ca\3\2\2\2\u02d4"+
		"\u02cb\3\2\2\2\u02d4\u02cc\3\2\2\2\u02d4\u02cd\3\2\2\2\u02d4\u02ce\3\2"+
		"\2\2\u02d4\u02cf\3\2\2\2\u02d4\u02d0\3\2\2\2\u02d4\u02d1\3\2\2\2\u02d4"+
		"\u02d2\3\2\2\2\u02d4\u02d3\3\2\2\2\u02d5\u02d9\3\2\2\2\u02d6\u02d8\7P"+
		"\2\2\u02d7\u02d6\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9"+
		"\u02da\3\2\2\2\u02da;\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02e2\5@!\2\u02dd"+
		"\u02de\5> \2\u02de\u02df\5@!\2\u02df\u02e1\3\2\2\2\u02e0\u02dd\3\2\2\2"+
		"\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3=\3"+
		"\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e9\7>\2\2\u02e6\u02e8\7P\2\2\u02e7"+
		"\u02e6\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2"+
		"\2\2\u02ea\u02fc\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02f0\7K\2\2\u02ed"+
		"\u02ef\7P\2\2\u02ee\u02ed\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2"+
		"\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02fc\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3"+
		"\u02f7\7I\2\2\u02f4\u02f6\7P\2\2\u02f5\u02f4\3\2\2\2\u02f6\u02f9\3\2\2"+
		"\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fc\3\2\2\2\u02f9\u02f7"+
		"\3\2\2\2\u02fa\u02fc\7P\2\2\u02fb\u02e5\3\2\2\2\u02fb\u02ec\3\2\2\2\u02fb"+
		"\u02f3\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fc?\3\2\2\2\u02fd\u0301\t\4\2\2"+
		"\u02fe\u0300\5B\"\2\u02ff\u02fe\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff"+
		"\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0307\3\2\2\2\u0303\u0301\3\2\2\2\u0304"+
		"\u0306\7P\2\2\u0305\u0304\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305\3\2"+
		"\2\2\u0307\u0308\3\2\2\2\u0308\u0316\3\2\2\2\u0309\u0307\3\2\2\2\u030a"+
		"\u030c\5B\"\2\u030b\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030b\3\2"+
		"\2\2\u030d\u030e\3\2\2\2\u030e\u0312\3\2\2\2\u030f\u0311\7P\2\2\u0310"+
		"\u030f\3\2\2\2\u0311\u0314\3\2\2\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2"+
		"\2\2\u0313\u0316\3\2\2\2\u0314\u0312\3\2\2\2\u0315\u02fd\3\2\2\2\u0315"+
		"\u030b\3\2\2\2\u0316A\3\2\2\2\u0317\u0326\7-\2\2\u0318\u0326\7*\2\2\u0319"+
		"\u031d\7F\2\2\u031a\u031c\7P\2\2\u031b\u031a\3\2\2\2\u031c\u031f\3\2\2"+
		"\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0320\3\2\2\2\u031f\u031d"+
		"\3\2\2\2\u0320\u0321\5D#\2\u0321\u0322\7G\2\2\u0322\u0326\3\2\2\2\u0323"+
		"\u0326\5F$\2\u0324\u0326\7\31\2\2\u0325\u0317\3\2\2\2\u0325\u0318\3\2"+
		"\2\2\u0325\u0319\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0324\3\2\2\2\u0326"+
		"C\3\2\2\2\u0327\u032b\7 \2\2\u0328\u032a\7P\2\2\u0329\u0328\3\2\2\2\u032a"+
		"\u032d\3\2\2\2\u032b\u0329\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u033f\3\2"+
		"\2\2\u032d\u032b\3\2\2\2\u032e\u0332\t\5\2\2\u032f\u0331\7P\2\2\u0330"+
		"\u032f\3\2\2\2\u0331\u0334\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2"+
		"\2\2\u0333\u0337\3\2\2\2\u0334\u0332\3\2\2\2\u0335\u0338\7 \2\2\u0336"+
		"\u0338\5H%\2\u0337\u0335\3\2\2\2\u0337\u0336\3\2\2\2\u0338\u033c\3\2\2"+
		"\2\u0339\u033b\7P\2\2\u033a\u0339\3\2\2\2\u033b\u033e\3\2\2\2\u033c\u033a"+
		"\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u0340\3\2\2\2\u033e\u033c\3\2\2\2\u033f"+
		"\u032e\3\2\2\2\u033f\u0340\3\2\2\2\u0340E\3\2\2\2\u0341\u0343\78\2\2\u0342"+
		"\u0344\78\2\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0366\3\2"+
		"\2\2\u0345\u0347\7J\2\2\u0346\u0345\3\2\2\2\u0346\u0347\3\2\2\2\u0347"+
		"\u0348\3\2\2\2\u0348\u0367\7 \2\2\u0349\u034d\7T\2\2\u034a\u034c\7P\2"+
		"\2\u034b\u034a\3\2\2\2\u034c\u034f\3\2\2\2\u034d\u034b\3\2\2\2\u034d\u034e"+
		"\3\2\2\2\u034e\u035d\3\2\2\2\u034f\u034d\3\2\2\2\u0350\u0352\7J\2\2\u0351"+
		"\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u035e\7 "+
		"\2\2\u0354\u0356\7J\2\2\u0355\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356"+
		"\u0357\3\2\2\2\u0357\u035e\7/\2\2\u0358\u035a\7J\2\2\u0359\u0358\3\2\2"+
		"\2\u0359\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035e\7.\2\2\u035c\u035e"+
		"\5@!\2\u035d\u0351\3\2\2\2\u035d\u0355\3\2\2\2\u035d\u0359\3\2\2\2\u035d"+
		"\u035c\3\2\2\2\u035e\u0362\3\2\2\2\u035f\u0361\7P\2\2\u0360\u035f\3\2"+
		"\2\2\u0361\u0364\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363"+
		"\u0365\3\2\2\2\u0364\u0362\3\2\2\2\u0365\u0367\7E\2\2\u0366\u0346\3\2"+
		"\2\2\u0366\u0349\3\2\2\2\u0367G\3\2\2\2\u0368\u0369\t\6\2\2\u0369I\3\2"+
		"\2\2\u036a\u036e\7F\2\2\u036b\u036d\7P\2\2\u036c\u036b\3\2\2\2\u036d\u0370"+
		"\3\2\2\2\u036e\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0374\3\2\2\2\u0370"+
		"\u036e\3\2\2\2\u0371\u0373\5L\'\2\u0372\u0371\3\2\2\2\u0373\u0376\3\2"+
		"\2\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0377\3\2\2\2\u0376"+
		"\u0374\3\2\2\2\u0377\u037a\7G\2\2\u0378\u037a\7\33\2\2\u0379\u036a\3\2"+
		"\2\2\u0379\u0378\3\2\2\2\u037aK\3\2\2\2\u037b\u037d\7J\2\2\u037c\u037b"+
		"\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u0382\7 \2\2\u037f"+
		"\u0381\7P\2\2\u0380\u037f\3\2\2\2\u0381\u0384\3\2\2\2\u0382\u0380\3\2"+
		"\2\2\u0382\u0383\3\2\2\2\u0383\u0387\3\2\2\2\u0384\u0382\3\2\2\2\u0385"+
		"\u0387\7\33\2\2\u0386\u037c\3\2\2\2\u0386\u0385\3\2\2\2\u0387M\3\2\2\2"+
		"\u0388\u03bf\7 \2\2\u0389\u03bf\7*\2\2\u038a\u03bf\7/\2\2\u038b\u03bf"+
		"\7\60\2\2\u038c\u03bf\7\61\2\2\u038d\u03bf\5H%\2\u038e\u03bf\7\62\2\2"+
		"\u038f\u03bf\7\63\2\2\u0390\u03bf\7-\2\2\u0391\u03bf\7\64\2\2\u0392\u03bf"+
		"\7U\2\2\u0393\u03bf\78\2\2\u0394\u03bf\79\2\2\u0395\u03bf\7>\2\2\u0396"+
		"\u03bf\7?\2\2\u0397\u03bf\7:\2\2\u0398\u03bf\7;\2\2\u0399\u03bf\7<\2\2"+
		"\u039a\u03bf\7=\2\2\u039b\u03bf\7H\2\2\u039c\u03bf\7J\2\2\u039d\u03bf"+
		"\7K\2\2\u039e\u03bf\7L\2\2\u039f\u03a3\7T\2\2\u03a0\u03a2\7P\2\2\u03a1"+
		"\u03a0\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2"+
		"\2\2\u03a4\u03a9\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a6\u03a8\5N(\2\u03a7\u03a6"+
		"\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa"+
		"\u03ac\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac\u03bf\7E\2\2\u03ad\u03bf\7V\2"+
		"\2\u03ae\u03b2\7D\2\2\u03af\u03b1\5N(\2\u03b0\u03af\3\2\2\2\u03b1\u03b4"+
		"\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b5\3\2\2\2\u03b4"+
		"\u03b2\3\2\2\2\u03b5\u03bf\7E\2\2\u03b6\u03ba\7F\2\2\u03b7\u03b9\5N(\2"+
		"\u03b8\u03b7\3\2\2\2\u03b9\u03bc\3\2\2\2\u03ba\u03b8\3\2\2\2\u03ba\u03bb"+
		"\3\2\2\2\u03bb\u03bd\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bd\u03bf\7G\2\2\u03be"+
		"\u0388\3\2\2\2\u03be\u0389\3\2\2\2\u03be\u038a\3\2\2\2\u03be\u038b\3\2"+
		"\2\2\u03be\u038c\3\2\2\2\u03be\u038d\3\2\2\2\u03be\u038e\3\2\2\2\u03be"+
		"\u038f\3\2\2\2\u03be\u0390\3\2\2\2\u03be\u0391\3\2\2\2\u03be\u0392\3\2"+
		"\2\2\u03be\u0393\3\2\2\2\u03be\u0394\3\2\2\2\u03be\u0395\3\2\2\2\u03be"+
		"\u0396\3\2\2\2\u03be\u0397\3\2\2\2\u03be\u0398\3\2\2\2\u03be\u0399\3\2"+
		"\2\2\u03be\u039a\3\2\2\2\u03be\u039b\3\2\2\2\u03be\u039c\3\2\2\2\u03be"+
		"\u039d\3\2\2\2\u03be\u039e\3\2\2\2\u03be\u039f\3\2\2\2\u03be\u03ad\3\2"+
		"\2\2\u03be\u03ae\3\2\2\2\u03be\u03b6\3\2\2\2\u03bf\u03c3\3\2\2\2\u03c0"+
		"\u03c2\7P\2\2\u03c1\u03c0\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3\u03c1\3\2"+
		"\2\2\u03c3\u03c4\3\2\2\2\u03c4O\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c6\u03c7"+
		"\t\7\2\2\u03c7Q\3\2\2\2\u03c8\u03e1\7*\2\2\u03c9\u03e1\7/\2\2\u03ca\u03e1"+
		"\7\60\2\2\u03cb\u03e1\7\61\2\2\u03cc\u03e1\5H%\2\u03cd\u03e1\79\2\2\u03ce"+
		"\u03e1\7-\2\2\u03cf\u03e1\7\62\2\2\u03d0\u03e1\7\63\2\2\u03d1\u03e1\7"+
		">\2\2\u03d2\u03e1\7?\2\2\u03d3\u03e1\7:\2\2\u03d4\u03e1\7;\2\2\u03d5\u03e1"+
		"\7<\2\2\u03d6\u03e1\7=\2\2\u03d7\u03e1\7H\2\2\u03d8\u03e1\7K\2\2\u03d9"+
		"\u03e1\7L\2\2\u03da\u03e1\7V\2\2\u03db\u03e1\7U\2\2\u03dc\u03e1\78\2\2"+
		"\u03dd\u03e1\7^\2\2\u03de\u03e1\7Z\2\2\u03df\u03e1\7[\2\2\u03e0\u03c8"+
		"\3\2\2\2\u03e0\u03c9\3\2\2\2\u03e0\u03ca\3\2\2\2\u03e0\u03cb\3\2\2\2\u03e0"+
		"\u03cc\3\2\2\2\u03e0\u03cd\3\2\2\2\u03e0\u03ce\3\2\2\2\u03e0\u03cf\3\2"+
		"\2\2\u03e0\u03d0\3\2\2\2\u03e0\u03d1\3\2\2\2\u03e0\u03d2\3\2\2\2\u03e0"+
		"\u03d3\3\2\2\2\u03e0\u03d4\3\2\2\2\u03e0\u03d5\3\2\2\2\u03e0\u03d6\3\2"+
		"\2\2\u03e0\u03d7\3\2\2\2\u03e0\u03d8\3\2\2\2\u03e0\u03d9\3\2\2\2\u03e0"+
		"\u03da\3\2\2\2\u03e0\u03db\3\2\2\2\u03e0\u03dc\3\2\2\2\u03e0\u03dd\3\2"+
		"\2\2\u03e0\u03de\3\2\2\2\u03e0\u03df\3\2\2\2\u03e1\u03e5\3\2\2\2\u03e2"+
		"\u03e4\7P\2\2\u03e3\u03e2\3\2\2\2\u03e4\u03e7\3\2\2\2\u03e5\u03e3\3\2"+
		"\2\2\u03e5\u03e6\3\2\2\2\u03e6S\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e8\u0402"+
		"\7/\2\2\u03e9\u0402\7\60\2\2\u03ea\u0402\7\61\2\2\u03eb\u0402\5H%\2\u03ec"+
		"\u0402\7\62\2\2\u03ed\u0402\7\63\2\2\u03ee\u0402\7\64\2\2\u03ef\u0402"+
		"\7U\2\2\u03f0\u0402\79\2\2\u03f1\u0402\7>\2\2\u03f2\u0402\7?\2\2\u03f3"+
		"\u0402\7:\2\2\u03f4\u0402\7;\2\2\u03f5\u0402\7<\2\2\u03f6\u0402\7=\2\2"+
		"\u03f7\u0402\7H\2\2\u03f8\u0402\7J\2\2\u03f9\u0402\7K\2\2\u03fa\u0402"+
		"\7V\2\2\u03fb\u0402\7E\2\2\u03fc\u0402\7Z\2\2\u03fd\u0402\7M\2\2\u03fe"+
		"\u0402\7O\2\2\u03ff\u0402\7N\2\2\u0400\u0402\7[\2\2\u0401\u03e8\3\2\2"+
		"\2\u0401\u03e9\3\2\2\2\u0401\u03ea\3\2\2\2\u0401\u03eb\3\2\2\2\u0401\u03ec"+
		"\3\2\2\2\u0401\u03ed\3\2\2\2\u0401\u03ee\3\2\2\2\u0401\u03ef\3\2\2\2\u0401"+
		"\u03f0\3\2\2\2\u0401\u03f1\3\2\2\2\u0401\u03f2\3\2\2\2\u0401\u03f3\3\2"+
		"\2\2\u0401\u03f4\3\2\2\2\u0401\u03f5\3\2\2\2\u0401\u03f6\3\2\2\2\u0401"+
		"\u03f7\3\2\2\2\u0401\u03f8\3\2\2\2\u0401\u03f9\3\2\2\2\u0401\u03fa\3\2"+
		"\2\2\u0401\u03fb\3\2\2\2\u0401\u03fc\3\2\2\2\u0401\u03fd\3\2\2\2\u0401"+
		"\u03fe\3\2\2\2\u0401\u03ff\3\2\2\2\u0401\u0400\3\2\2\2\u0402U\3\2\2\2"+
		"\u0403\u041e\7/\2\2\u0404\u041e\7\60\2\2\u0405\u041e\7\61\2\2\u0406\u041e"+
		"\5H%\2\u0407\u041e\7\62\2\2\u0408\u041e\7\63\2\2\u0409\u041e\7\64\2\2"+
		"\u040a\u041e\7U\2\2\u040b\u041e\7>\2\2\u040c\u041e\7?\2\2\u040d\u041e"+
		"\7:\2\2\u040e\u041e\7;\2\2\u040f\u041e\7<\2\2\u0410\u041e\7=\2\2\u0411"+
		"\u041e\7H\2\2\u0412\u041e\7J\2\2\u0413\u041e\7K\2\2\u0414\u041e\7V\2\2"+
		"\u0415\u041e\7E\2\2\u0416\u041e\7Z\2\2\u0417\u041e\78\2\2\u0418\u041e"+
		"\7L\2\2\u0419\u041e\7T\2\2\u041a\u041e\7M\2\2\u041b\u041e\7O\2\2\u041c"+
		"\u041e\7N\2\2\u041d\u0403\3\2\2\2\u041d\u0404\3\2\2\2\u041d\u0405\3\2"+
		"\2\2\u041d\u0406\3\2\2\2\u041d\u0407\3\2\2\2\u041d\u0408\3\2\2\2\u041d"+
		"\u0409\3\2\2\2\u041d\u040a\3\2\2\2\u041d\u040b\3\2\2\2\u041d\u040c\3\2"+
		"\2\2\u041d\u040d\3\2\2\2\u041d\u040e\3\2\2\2\u041d\u040f\3\2\2\2\u041d"+
		"\u0410\3\2\2\2\u041d\u0411\3\2\2\2\u041d\u0412\3\2\2\2\u041d\u0413\3\2"+
		"\2\2\u041d\u0414\3\2\2\2\u041d\u0415\3\2\2\2\u041d\u0416\3\2\2\2\u041d"+
		"\u0417\3\2\2\2\u041d\u0418\3\2\2\2\u041d\u0419\3\2\2\2\u041d\u041a\3\2"+
		"\2\2\u041d\u041b\3\2\2\2\u041d\u041c\3\2\2\2\u041eW\3\2\2\2\u0095[bdk"+
		"mry\u0080\u0084\u008d\u0094\u009e\u00a5\u00af\u00b3\u00b9\u00c0\u00c5"+
		"\u00cd\u00d4\u00db\u00e2\u00e7\u00ed\u00f5\u00f9\u00fc\u0101\u0108\u010f"+
		"\u0118\u011f\u0127\u012e\u0135\u013c\u0141\u0144\u014f\u0155\u015c\u0161"+
		"\u0165\u0168\u016e\u0175\u017c\u0180\u0186\u018a\u0191\u0197\u019e\u01a8"+
		"\u01af\u01b2\u01b8\u01be\u01c6\u01cc\u01d0\u01d6\u01e0\u01e6\u01e9\u01ef"+
		"\u01f8\u01fb\u0201\u0205\u0209\u0211\u0215\u0218\u021e\u0221\u0227\u022e"+
		"\u0232\u0238\u023e\u0245\u024d\u0250\u0252\u025a\u025d\u0263\u026b\u026e"+
		"\u0270\u0278\u027c\u027f\u0282\u0286\u028a\u028e\u0296\u02ab\u02af\u02b4"+
		"\u02ba\u02d4\u02d9\u02e2\u02e9\u02f0\u02f7\u02fb\u0301\u0307\u030d\u0312"+
		"\u0315\u031d\u0325\u032b\u0332\u0337\u033c\u033f\u0343\u0346\u034d\u0351"+
		"\u0355\u0359\u035d\u0362\u0366\u036e\u0374\u0379\u037c\u0382\u0386\u03a3"+
		"\u03a9\u03b2\u03ba\u03be\u03c3\u03e0\u03e5\u0401\u041d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}