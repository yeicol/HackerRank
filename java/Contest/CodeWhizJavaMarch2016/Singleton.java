import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

/**
 * See <a href="https://www.hackerrank.com/contests/codewhiz-java-march-2016/challenges/java-singleton">Java Singleton</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
class Singleton {

	public String str;
	private static Singleton instance;
	
	private Singleton() {
		
	}
	
	public static Singleton getSingleInstance() {
		if (instance == null) {
			instance = new Singleton();

		}

		return instance;
	}

}
