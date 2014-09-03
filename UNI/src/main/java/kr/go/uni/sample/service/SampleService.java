package kr.go.uni.sample.service;

import java.util.Map;

import kr.go.uni.sample.model.SampleVO;

/**
 * 
 * <Notice>
 * 		
 * @author 
 * @since 2014. 6. 2.
 * @version 1.0.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *  수정일		 	수정자		수정내용
 *  -------    		--------    ---------------------------
 *  2014. 6. 2.	    admin	    	최초 생성
 * </pre>
 */

public interface SampleService {

	Map<String, Object> selectSampleList(SampleVO sampleVO);
	
	SampleVO selectSampleDetail(SampleVO sampleVO);
	
	void insertSample(SampleVO sampleVO);
	
}
