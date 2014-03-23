/**
 * (C) Le Hong Phuong, phuonglh@gmail.com
 * vn.hus.toolkit
 * 2006
 */
package vn.hus.nlp.tokenizer;

/**
 * @author LE Hong Phuong
 * <p>
 * 31 déc. 06
 * </p>
 * Some predefined contants for vnTokenizer tool.
 * 
 */
public interface IConstants {
	/**
	 * Vietnamese word set
	 */
	public static final String WORD_SET = "data/dictionaries/words_v4.txt";
	
	/**
	 * The Vietnamese lexicon
	 */
	public static final String LEXICON = "data/dictionaries/words_v4.xml";
	
	/**
	 * The Vietnamese DFA lexicon
	 */
<<<<<<< HEAD
	public static final String LEXICON_DFA = "models/tokenization/automata/lexicon_dfa_minimal.xml";
=======
	public static final String LEXICON_DFA = "resources/automata/lexicon_dfa_minimal.xml";
	
	/**
	 * Lexer specification
	 */
	public static final String LEXER_SPECIFICATION= "resources/lexers/lexers.xml";
	/**
	 * Unigram model
	 */
	public static final String UNIGRAM_MODEL = "resources/bigram/unigram.xml";
	/**
	 * Bigram model
	 */
	public static final String BIGRAM_MODEL = "resources/bigram/bigram.xml";
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
	
	/**
	 * The named entity prefix.
	 */
<<<<<<< HEAD
	public static final String NAMED_ENTITY_PREFIX = "models/tokenization/prefix/namedEntityPrefix.xml";
=======
	public static final String NAMED_ENTITY_PREFIX = "resources/prefix/namedEntityPrefix.xml";
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
}
