package com.yubaraj.image;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import org.apache.tomcat.util.codec.binary.Base64;

/**
 *
 * @author Yubaraj
 */
public class FileUtil {

    /**
     * Writes file in specified location.
     *
     * @param fileName The file name that can not be null and saves file with
     * this given name.
     * @param location The location can not be null and uses to save file in
     * this given location.
     * @param value The value that should not be null and must containg Base64
     * string.
     * @return <code>true</code> if written successfully otherwise
     * <code>false</code>
     */
    public static boolean write(String fileName, String location, String value) {
        InputStream is = null;
        OutputStream os = null;
        location += "//" + fileName;
        try {
            File file = new File(location);
            is = new ByteArrayInputStream(value.getBytes(StandardCharsets.UTF_8));
            fileName = null;
            value = null;
            os = new FileOutputStream(file);
            int bytesRead = 0;
            int batchLength = 10000000;
            byte[] batch = new byte[batchLength];
            while ((bytesRead = is.read(batch)) > 0) {
                byte[] ba = new byte[bytesRead];

                for (int i = 0; i < ba.length; i++) {
                    ba[i] = batch[i];
                }
                ba = Base64.decodeBase64(new String(ba));
                os.write(ba, 0, ba.length);
            }
            System.out.println("File uploaded to: " + file.getAbsolutePath());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Writes file in default location.
     *
     * @param fileName The file name that can not be null and saves file with
     * this given name.
     * @param value The value that should not be null and must containg Base64
     * string.
     * @return file object if written successfully otherwise
     * <code>null</code>
     */
    public static File write(String fileName, String value) {
        InputStream is = null;
        OutputStream os = null;
        try {
            File file = new File(fileName);
            is = new ByteArrayInputStream(value.getBytes(StandardCharsets.UTF_8));
            fileName = null;
            value = null;
            os = new FileOutputStream(file);
            int bytesRead = 0;
            int batchLength = 10000000;
            byte[] batch = new byte[batchLength];
            while ((bytesRead = is.read(batch)) > 0) {
                byte[] ba = new byte[bytesRead];

                for (int i = 0; i < ba.length; i++) {
                    ba[i] = batch[i];
                }
                ba = Base64.decodeBase64(new String(ba));
                os.write(ba, 0, ba.length);
            }
            System.out.println("File uploaded to: " + file.getAbsolutePath());
            return file;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
