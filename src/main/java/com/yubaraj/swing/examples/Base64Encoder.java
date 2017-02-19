
package com.yubaraj.swing.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.tomcat.util.codec.binary.Base64;

/**
 *
 * @author Yubaraj
 */
public class Base64Encoder {
/**
     * Encodes to Base64 string.
     * 
     * @param file
     *            The file must be encoded to Base64 that should not be null.
     * @return The Base64 encoded value.
     * @throws IOException
     *             If file is null.
     */
    public static String encode(File file) throws IOException {
	byte[] bytes = loadFile(file);
	byte[] encoded = Base64.encodeBase64(bytes);
	String encodedString = new String(encoded);
	return encodedString;
    }

    /**
     * Loads file.
     */
    private static byte[] loadFile(File file) throws IOException {
	InputStream is = new FileInputStream(file);
	long length = file.length();
	if (length > Integer.MAX_VALUE) {
	    // file is too large. :P
	}
	byte[] bytes = new byte[(int) length];
	int offset = 0;
	int numRead = 0;
	while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
	    offset += numRead;
	}
	if (offset < bytes.length) {
	    extracted(file);
	}
	is.close();
	return bytes;
    }

    /**
     * Extracts to file.
     */
    private static void extracted(File file) throws IOException {
	throw new IOException("Could not completely read file " + file.getName());
    }    
}
