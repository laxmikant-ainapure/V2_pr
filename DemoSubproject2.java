package subproject2;

import org.subproject2_A.App;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.text.StrSubstitutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.core.util.SettingFormatter;

public class DemoSubproject2 { 

	int k;
	App app;
	
	public static void main(String[] args) {
		int k_subproject;
	}
	Reader reader = null;
	private static DemoSubproject2 fook = null;

	public static DemoSubproject2 getFook() { 
		
		 try {
      reader = new InputStreamReader(new FileInputStream(propertyFile), StandardCharsets.UTF_8);
    } catch (Exception e) {
      throw new IllegalStateException("Could not read properties from file: " + args[0], e);
    } finally {
      IOUtils.closeQuietly(reader);
    }
		if (fook==null) {
			fook = new DemoSubproject2();
		}                       
		return fook;
	}

	
	
	public static int getIntValue() {
	int k = 58; 
	return k;	
	}
	
	public void x(){
		System.out.println("text");
		System.out.println("text");
		try{
			
		System.out.println("inside try");
		}
		catch(Exception ex){
			
		System.out.println("error");
		}
		
		
	}
	
}
