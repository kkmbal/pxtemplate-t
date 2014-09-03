package kr.go.uni.common.web;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.context.MessageSource;

/**
 * 
 * kr.go.uni.common.web.AbstractController.java
 * 클래스 설명 : 
 * 		
 * @author 
 * @since 2014. 6. 17.
 * @version 1.0.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *  수정일		 	수정자		수정내용
 *  -------    		--------    ---------------------------
 *  2014. 6. 17.	 admin       	최초 생성
 * </pre>
 */

public abstract class AbstractController {
	
	protected Logger logger = Logger.getLogger(this.getClass());
	
	@Resource(name = "messageSource")
	protected MessageSource messageSource;
	
}
