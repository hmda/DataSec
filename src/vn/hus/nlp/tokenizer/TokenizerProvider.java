/**
 * (C) Le Hong Phuong, phuonglh@gmail.com
 * vn.hus.tokenizer
 * 2007
 */
package vn.hus.nlp.tokenizer;

<<<<<<< HEAD
<<<<<<< HEAD
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
import vn.hus.nlp.tokenizer.segmenter.AbstractResolver;
import vn.hus.nlp.tokenizer.segmenter.Segmenter;
import vn.hus.nlp.tokenizer.segmenter.UnigramResolver;



/**
 * @author LE Hong Phuong
 * <p>
 * 8 janv. 07
 * </p>
 * A provider of tokenizer. It creates a tokenizer for Vietnamese.
 * 
 */
public final class TokenizerProvider {
	
	/**
	 * A lexical segmenter
	 */
<<<<<<< HEAD
<<<<<<< HEAD
	private Segmenter segmenter;
	/**
	 * An ambiguity resolver
	 */
	private AbstractResolver resolver;
	/**
	 * The tokenizer
	 */
	private Tokenizer tokenizer;
=======
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
	private final Segmenter segmenter;
	/**
	 * An ambiguity resolver
	 */
	private final AbstractResolver resolver;
	/**
	 * The tokenizer
	 */
	private final Tokenizer tokenizer;
<<<<<<< HEAD
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
	/**
	 * An instance flag
	 */
	private static boolean instanceFlag = false;
<<<<<<< HEAD
<<<<<<< HEAD
	
	private static TokenizerProvider provider; 
	
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
	/**
	 * Private constructor
	 *
	 */
	private TokenizerProvider() {
<<<<<<< HEAD
<<<<<<< HEAD
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("tokenizer.properties"));
			// create a unigram resolver. 
			//
			resolver = new UnigramResolver(properties.getProperty("unigramModel"));
			// create a lexical segmenter that use the unigram resolver
			//
			System.out.println("Creating lexical segmenter...");
			segmenter = new Segmenter(properties, resolver);
			System.out.println("Lexical segmenter created.");
			// init the tokenizer
			System.out.print("Initializing tokenizer...");
			tokenizer = new Tokenizer(properties, segmenter);
			// Do not resolve the ambiguity.
//			tokenizer.setAmbiguitiesResolved(false);
			System.out.println("OK");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private TokenizerProvider(String propertiesFilename) {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(propertiesFilename));
			// create a unigram resolver. 
			//
			resolver = new UnigramResolver(properties.getProperty("unigramModel"));
			// create a lexical segmenter that use the unigram resolver
			//
			System.out.println("Creating lexical segmenter...");
			segmenter = new Segmenter(properties, resolver);
			System.out.println("Lexical segmenter created.");
			// init the tokenizer
			System.out.print("Initializing tokenizer...");
			tokenizer = new Tokenizer(properties, segmenter);
			// Do not resolve the ambiguity.
//			tokenizer.setAmbiguitiesResolved(false);
			System.out.println("OK");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	private TokenizerProvider(Properties properties) {
		// DEBUG 
		System.out.println("lexiconDFA = " + properties.getProperty("lexiconDFA"));
		System.out.println("unigramModel = " + properties.getProperty("unigramModel"));
		System.out.println("bigramModel = " + properties.getProperty("bigramModel"));
		
		// create a unigram resolver. 
		//
		resolver = new UnigramResolver(properties.getProperty("unigramModel"));
		// create a lexical segmenter that use the unigram resolver
		//
		System.out.println("Creating lexical segmenter...");
		segmenter = new Segmenter(properties, resolver);
		System.out.println("Lexical segmenter created.");
		// init the tokenizer
		System.out.print("Initializing tokenizer...");
		tokenizer = new Tokenizer(properties, segmenter);
=======
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
		// create a unigram resolver. 
		//
		resolver = new UnigramResolver(IConstants.UNIGRAM_MODEL);
		// create a lexical segmenter that use the unigram resolver
		//
		System.out.println("Creating lexical segmenter...");
		segmenter = new Segmenter(resolver);
		System.out.println("Lexical segmenter created.");
		// init the tokenizer
		System.out.print("Initializing tokenizer...");
		tokenizer = new Tokenizer(IConstants.LEXER_SPECIFICATION, segmenter);
<<<<<<< HEAD
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
		// Do not resolve the ambiguity.
//		tokenizer.setAmbiguitiesResolved(false);
		System.out.println("OK");
	}
<<<<<<< HEAD
<<<<<<< HEAD
	
	/**
	 * Instantiate a tokenizer provider object.
=======
	/**
	 * The only method to instantiate a data provider object.
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
	/**
	 * The only method to instantiate a data provider object.
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
	 * @return a provider object
	 */
	public static TokenizerProvider getInstance() {
		if (!instanceFlag) {
			instanceFlag = true;
<<<<<<< HEAD
<<<<<<< HEAD
			provider = new TokenizerProvider(); 
		}
		return provider;
	}
	
	/**
	 * Instantiate a tokenizer provider object, parameters are read from a properties file.
	 * @return a provider object
	 */
	public static TokenizerProvider getInstance(String propertiesFilename) {
		if (!instanceFlag) {
			instanceFlag = true;
			provider = new TokenizerProvider(propertiesFilename);
		}
		return provider;
	}

	/**
	 * Instantiate a tokenizer provider object, parameters are read from a properties object.
	 * @return a provider object
	 */
	public static TokenizerProvider getInstance(Properties properties) {
		if (!instanceFlag) {
			instanceFlag = true;
			provider = new TokenizerProvider(properties);
		} 
		return provider;
	}
	
=======
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
			return new TokenizerProvider();
		} else {
			System.err.println("The tokenizer provider has already existed.");
			return null;
		}
	}
<<<<<<< HEAD
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
=======
>>>>>>> f5a99cbac446db1d6a12982928942bced5427965
	/**
	 * Get the lexical segmenter
	 * @return the lexical segmenter
	 */
	public Segmenter getSegmenter() {
		return segmenter;
	}
	/**
	 * Returns the tokenizer
	 * @return
	 */
	public Tokenizer getTokenizer() {
		return tokenizer;
	}
	/**
	 * Dispose the data provider
	 *
	 */
	public void dispose() {
		// dispose the tokenizer
		// this will dispose the lexical tokenizer and the automata
		tokenizer.dispose();
	}
}
