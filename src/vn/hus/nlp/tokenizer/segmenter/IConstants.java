/**
 * (C) Le Hong Phuong, phuonglh@gmail.com
 *  Vietnam National University, Hanoi, Vietnam.
 */
package vn.hus.nlp.tokenizer.segmenter;

/**
 * @author Le Hong Phuong, phuonglh@gmail.com
 * <p>
 * Nov 12, 2007, 8:48:03 PM
 * <p>
 * Some constants for the package.
 */
public interface IConstants {
	/**
	 * The lexicon dfa.
	 */
<<<<<<< HEAD
	static String LEXICON_DFA = "models/tokenization/automata/dfaLexicon.xml";
=======
	static String LEXICON_DFA = "resources/automata/dfaLexicon.xml";
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
	
	/**
	 * The external lexicon
	 */
<<<<<<< HEAD
	static String EXTERNAL_LEXICON = "models/tokenization/automata/externalLexicon.xml";
	/**
	 * The file contains normalization rules for Vietnamese accents.
	 */
	static String NORMALIZATION_RULES = "models/tokenization/normalization/rules.txt";
=======
	static String EXTERNAL_LEXICON = "resources/automata/externalLexicon.xml";
	/**
	 * The file contains normalization rules for Vietnamese accents.
	 */
	static String NORMALIZATION_RULES = "resources/normalization/rules.txt";
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
}
