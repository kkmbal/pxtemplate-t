package kr.go.uni.sample.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.go.uni.sample.dao.SampleDAO;
import kr.go.uni.sample.model.SampleVO;
import kr.go.uni.sample.service.SampleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

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
 *  2014. 6. 2.	    ShinHK	    	최초 생성
 * </pre>
 */

@Service
public class SampleServiceImpl extends EgovAbstractServiceImpl implements SampleService {

	@Autowired
    private SampleDAO sampleDAO;
	
	public Map<String, Object> selectSampleList(SampleVO sampleVO) {
		
		List<SampleVO> result = sampleDAO.selectSampleList(sampleVO);
		int cnt = sampleDAO.selectSampleListCount(sampleVO);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("resultList", result);
		map.put("resultCnt", Integer.toString(cnt));

		return map;
		
	}
	
	public SampleVO selectSampleDetail(SampleVO sampleVO) {
		sampleDAO.addReadCount(sampleVO);
		return sampleDAO.selectSampleDetail(sampleVO);
	}
	
	
	public void insertSample(SampleVO sampleVO) {
		
		sampleVO.setDocTitle("TEST DOC TITLE!!");
		sampleVO.setDocUrl("/sample/url");
		sampleDAO.insertSample(sampleVO);
		
	}
}
