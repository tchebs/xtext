/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class EntityDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.EntityDsl.Model");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsTypeParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Model:
		//	elements+=Type*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=Type*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Type
		public RuleCall getElementsTypeParserRuleCall_0() { return cElementsTypeParserRuleCall_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.EntityDsl.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSimpleTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Type:
		//	SimpleType | Entity;
		@Override public ParserRule getRule() { return rule; }
		
		//SimpleType | Entity
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SimpleType
		public RuleCall getSimpleTypeParserRuleCall_0() { return cSimpleTypeParserRuleCall_0; }
		
		//Entity
		public RuleCall getEntityParserRuleCall_1() { return cEntityParserRuleCall_1; }
	}
	public class SimpleTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.EntityDsl.SimpleType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//SimpleType:
		//	'type' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'type' name=ID
		public Group getGroup() { return cGroup; }
		
		//'type'
		public Keyword getTypeKeyword_0() { return cTypeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.EntityDsl.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExtendsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cExtendsEntityCrossReference_2_1_0 = (CrossReference)cExtendsAssignment_2_1.eContents().get(0);
		private final RuleCall cExtendsEntityIDTerminalRuleCall_2_1_0_1 = (RuleCall)cExtendsEntityCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPropertiesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPropertiesPropertyParserRuleCall_4_0 = (RuleCall)cPropertiesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Entity:
		//	'entity' name=ID ('extends' extends=[Entity])? '{' properties+=Property* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'entity' name=ID ('extends' extends=[Entity])? '{' properties+=Property* '}'
		public Group getGroup() { return cGroup; }
		
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('extends' extends=[Entity])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }
		
		//extends=[Entity]
		public Assignment getExtendsAssignment_2_1() { return cExtendsAssignment_2_1; }
		
		//[Entity]
		public CrossReference getExtendsEntityCrossReference_2_1_0() { return cExtendsEntityCrossReference_2_1_0; }
		
		//ID
		public RuleCall getExtendsEntityIDTerminalRuleCall_2_1_0_1() { return cExtendsEntityIDTerminalRuleCall_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//properties+=Property*
		public Assignment getPropertiesAssignment_4() { return cPropertiesAssignment_4; }
		
		//Property
		public RuleCall getPropertiesPropertyParserRuleCall_4_0() { return cPropertiesPropertyParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class PropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.EntityDsl.Property");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPropertyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cTypeTypeCrossReference_3_0 = (CrossReference)cTypeAssignment_3.eContents().get(0);
		private final RuleCall cTypeTypeIDTerminalRuleCall_3_0_1 = (RuleCall)cTypeTypeCrossReference_3_0.eContents().get(1);
		private final Assignment cManyAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final Keyword cManyLeftSquareBracketRightSquareBracketKeyword_4_0 = (Keyword)cManyAssignment_4.eContents().get(0);
		
		//Property:
		//	'property' name=ID ':' type=[Type] many?='[]'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'property' name=ID ':' type=[Type] many?='[]'?
		public Group getGroup() { return cGroup; }
		
		//'property'
		public Keyword getPropertyKeyword_0() { return cPropertyKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//type=[Type]
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }
		
		//[Type]
		public CrossReference getTypeTypeCrossReference_3_0() { return cTypeTypeCrossReference_3_0; }
		
		//ID
		public RuleCall getTypeTypeIDTerminalRuleCall_3_0_1() { return cTypeTypeIDTerminalRuleCall_3_0_1; }
		
		//many?='[]'?
		public Assignment getManyAssignment_4() { return cManyAssignment_4; }
		
		//'[]'
		public Keyword getManyLeftSquareBracketRightSquareBracketKeyword_4_0() { return cManyLeftSquareBracketRightSquareBracketKeyword_4_0; }
	}
	
	
	private final ModelElements pModel;
	private final TypeElements pType;
	private final SimpleTypeElements pSimpleType;
	private final EntityElements pEntity;
	private final PropertyElements pProperty;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EntityDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pType = new TypeElements();
		this.pSimpleType = new SimpleTypeElements();
		this.pEntity = new EntityElements();
		this.pProperty = new PropertyElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.EntityDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	elements+=Type*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Type:
	//	SimpleType | Entity;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//SimpleType:
	//	'type' name=ID;
	public SimpleTypeElements getSimpleTypeAccess() {
		return pSimpleType;
	}
	
	public ParserRule getSimpleTypeRule() {
		return getSimpleTypeAccess().getRule();
	}
	
	//Entity:
	//	'entity' name=ID ('extends' extends=[Entity])? '{' properties+=Property* '}';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//Property:
	//	'property' name=ID ':' type=[Type] many?='[]'?;
	public PropertyElements getPropertyAccess() {
		return pProperty;
	}
	
	public ParserRule getPropertyRule() {
		return getPropertyAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
