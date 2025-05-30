// Generated from CSSParser.g4 by ANTLR 4.4
package cz.vutbr.web.csskit.antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSSParser}.
 */
public interface CSSParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSSParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterCombinator(@NotNull CSSParser.CombinatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitCombinator(@NotNull CSSParser.CombinatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull CSSParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull CSSParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#ident_list_item}.
	 * @param ctx the parse tree
	 */
	void enterIdent_list_item(@NotNull CSSParser.Ident_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#ident_list_item}.
	 * @param ctx the parse tree
	 */
	void exitIdent_list_item(@NotNull CSSParser.Ident_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#media}.
	 * @param ctx the parse tree
	 */
	void enterMedia(@NotNull CSSParser.MediaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#media}.
	 * @param ctx the parse tree
	 */
	void exitMedia(@NotNull CSSParser.MediaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#valuepart}.
	 * @param ctx the parse tree
	 */
	void enterValuepart(@NotNull CSSParser.ValuepartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#valuepart}.
	 * @param ctx the parse tree
	 */
	void exitValuepart(@NotNull CSSParser.ValuepartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#inlinestyle}.
	 * @param ctx the parse tree
	 */
	void enterInlinestyle(@NotNull CSSParser.InlinestyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#inlinestyle}.
	 * @param ctx the parse tree
	 */
	void exitInlinestyle(@NotNull CSSParser.InlinestyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#media_query}.
	 * @param ctx the parse tree
	 */
	void enterMedia_query(@NotNull CSSParser.Media_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#media_query}.
	 * @param ctx the parse tree
	 */
	void exitMedia_query(@NotNull CSSParser.Media_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(@NotNull CSSParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(@NotNull CSSParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termInvalid}
	 * labeled alternative in {@link CSSParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermInvalid(@NotNull CSSParser.TermInvalidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termInvalid}
	 * labeled alternative in {@link CSSParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermInvalid(@NotNull CSSParser.TermInvalidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull CSSParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull CSSParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#unknown_atrule_body}.
	 * @param ctx the parse tree
	 */
	void enterUnknown_atrule_body(@NotNull CSSParser.Unknown_atrule_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#unknown_atrule_body}.
	 * @param ctx the parse tree
	 */
	void exitUnknown_atrule_body(@NotNull CSSParser.Unknown_atrule_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(@NotNull CSSParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(@NotNull CSSParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(@NotNull CSSParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(@NotNull CSSParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#nostatement}.
	 * @param ctx the parse tree
	 */
	void enterNostatement(@NotNull CSSParser.NostatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#nostatement}.
	 * @param ctx the parse tree
	 */
	void exitNostatement(@NotNull CSSParser.NostatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull CSSParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull CSSParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#keyframe_selector}.
	 * @param ctx the parse tree
	 */
	void enterKeyframe_selector(@NotNull CSSParser.Keyframe_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#keyframe_selector}.
	 * @param ctx the parse tree
	 */
	void exitKeyframe_selector(@NotNull CSSParser.Keyframe_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void enterPseudo(@NotNull CSSParser.PseudoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void exitPseudo(@NotNull CSSParser.PseudoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#funct_argument}.
	 * @param ctx the parse tree
	 */
	void enterFunct_argument(@NotNull CSSParser.Funct_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#funct_argument}.
	 * @param ctx the parse tree
	 */
	void exitFunct_argument(@NotNull CSSParser.Funct_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(@NotNull CSSParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(@NotNull CSSParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#import_uri}.
	 * @param ctx the parse tree
	 */
	void enterImport_uri(@NotNull CSSParser.Import_uriContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#import_uri}.
	 * @param ctx the parse tree
	 */
	void exitImport_uri(@NotNull CSSParser.Import_uriContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#selpart}.
	 * @param ctx the parse tree
	 */
	void enterSelpart(@NotNull CSSParser.SelpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#selpart}.
	 * @param ctx the parse tree
	 */
	void exitSelpart(@NotNull CSSParser.SelpartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#noprop}.
	 * @param ctx the parse tree
	 */
	void enterNoprop(@NotNull CSSParser.NopropContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#noprop}.
	 * @param ctx the parse tree
	 */
	void exitNoprop(@NotNull CSSParser.NopropContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#unknown_atrule}.
	 * @param ctx the parse tree
	 */
	void enterUnknown_atrule(@NotNull CSSParser.Unknown_atruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#unknown_atrule}.
	 * @param ctx the parse tree
	 */
	void exitUnknown_atrule(@NotNull CSSParser.Unknown_atruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#funct_args}.
	 * @param ctx the parse tree
	 */
	void enterFunct_args(@NotNull CSSParser.Funct_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#funct_args}.
	 * @param ctx the parse tree
	 */
	void exitFunct_args(@NotNull CSSParser.Funct_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#funct}.
	 * @param ctx the parse tree
	 */
	void enterFunct(@NotNull CSSParser.FunctContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#funct}.
	 * @param ctx the parse tree
	 */
	void exitFunct(@NotNull CSSParser.FunctContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#media_expression}.
	 * @param ctx the parse tree
	 */
	void enterMedia_expression(@NotNull CSSParser.Media_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#media_expression}.
	 * @param ctx the parse tree
	 */
	void exitMedia_expression(@NotNull CSSParser.Media_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termValuePart}
	 * labeled alternative in {@link CSSParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermValuePart(@NotNull CSSParser.TermValuePartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termValuePart}
	 * labeled alternative in {@link CSSParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermValuePart(@NotNull CSSParser.TermValuePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#media_rule}.
	 * @param ctx the parse tree
	 */
	void enterMedia_rule(@NotNull CSSParser.Media_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#media_rule}.
	 * @param ctx the parse tree
	 */
	void exitMedia_rule(@NotNull CSSParser.Media_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void enterRuleset(@NotNull CSSParser.RulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void exitRuleset(@NotNull CSSParser.RulesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull CSSParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull CSSParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#any}.
	 * @param ctx the parse tree
	 */
	void enterAny(@NotNull CSSParser.AnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#any}.
	 * @param ctx the parse tree
	 */
	void exitAny(@NotNull CSSParser.AnyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(@NotNull CSSParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(@NotNull CSSParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#important}.
	 * @param ctx the parse tree
	 */
	void enterImportant(@NotNull CSSParser.ImportantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#important}.
	 * @param ctx the parse tree
	 */
	void exitImportant(@NotNull CSSParser.ImportantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#combined_selector}.
	 * @param ctx the parse tree
	 */
	void enterCombined_selector(@NotNull CSSParser.Combined_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#combined_selector}.
	 * @param ctx the parse tree
	 */
	void exitCombined_selector(@NotNull CSSParser.Combined_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#margin_rule}.
	 * @param ctx the parse tree
	 */
	void enterMargin_rule(@NotNull CSSParser.Margin_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#margin_rule}.
	 * @param ctx the parse tree
	 */
	void exitMargin_rule(@NotNull CSSParser.Margin_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#inlineset}.
	 * @param ctx the parse tree
	 */
	void enterInlineset(@NotNull CSSParser.InlinesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#inlineset}.
	 * @param ctx the parse tree
	 */
	void exitInlineset(@NotNull CSSParser.InlinesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#media_term}.
	 * @param ctx the parse tree
	 */
	void enterMedia_term(@NotNull CSSParser.Media_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#media_term}.
	 * @param ctx the parse tree
	 */
	void exitMedia_term(@NotNull CSSParser.Media_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#nomediaquery}.
	 * @param ctx the parse tree
	 */
	void enterNomediaquery(@NotNull CSSParser.NomediaqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#nomediaquery}.
	 * @param ctx the parse tree
	 */
	void exitNomediaquery(@NotNull CSSParser.NomediaqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#atstatement}.
	 * @param ctx the parse tree
	 */
	void enterAtstatement(@NotNull CSSParser.AtstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#atstatement}.
	 * @param ctx the parse tree
	 */
	void exitAtstatement(@NotNull CSSParser.AtstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(@NotNull CSSParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(@NotNull CSSParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#keyframes_name}.
	 * @param ctx the parse tree
	 */
	void enterKeyframes_name(@NotNull CSSParser.Keyframes_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#keyframes_name}.
	 * @param ctx the parse tree
	 */
	void exitKeyframes_name(@NotNull CSSParser.Keyframes_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#keyframe_block}.
	 * @param ctx the parse tree
	 */
	void enterKeyframe_block(@NotNull CSSParser.Keyframe_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#keyframe_block}.
	 * @param ctx the parse tree
	 */
	void exitKeyframe_block(@NotNull CSSParser.Keyframe_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#norule}.
	 * @param ctx the parse tree
	 */
	void enterNorule(@NotNull CSSParser.NoruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#norule}.
	 * @param ctx the parse tree
	 */
	void exitNorule(@NotNull CSSParser.NoruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#bracketed_idents}.
	 * @param ctx the parse tree
	 */
	void enterBracketed_idents(@NotNull CSSParser.Bracketed_identsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#bracketed_idents}.
	 * @param ctx the parse tree
	 */
	void exitBracketed_idents(@NotNull CSSParser.Bracketed_identsContext ctx);
}