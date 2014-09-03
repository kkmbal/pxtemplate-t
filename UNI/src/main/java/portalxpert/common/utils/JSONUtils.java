package portalxpert.common.utils;

import java.io.StringWriter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

/**********************************************************************************
* CLASS 명		:	JSONUtils	
* 설명            	: 	JSON Utility
* 작성자         	: 	crossent
* 작성일         	: 	2013-03-10
* 버전          	: 	1.0
* 수정이력       	:    수정자:      DESC: 
***********************************************************************************/
public class JSONUtils {


	public static StringBuffer objectToJSON(Object obj) {

		StringWriter sw = new StringWriter();
		StringBuffer strBuffer = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			MappingJsonFactory jsonFactory = new MappingJsonFactory();
			JsonGenerator jsonGenerator = jsonFactory.createJsonGenerator(sw);
			mapper.writeValue(jsonGenerator, obj);
			sw.close();
			
			strBuffer = sw.getBuffer();
			
			if (sw.getBuffer().length() == 0)
			{
				strBuffer.append("[]");
			}
					
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		} 
		return strBuffer;
	}

}

