package kr.go.uni.sample.dao;

import java.util.List;

import kr.go.uni.sample.model.SampleVO;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

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

@Repository
public class SampleDAO extends EgovAbstractMapper {
	
	@SuppressWarnings("unchecked")
	public List<SampleVO> selectSampleList(SampleVO sampleVO) {
		return (List<SampleVO>)list("sample.selectSampleList", sampleVO);
	}
	
	public int selectSampleListCount(SampleVO sampleVO) {
		return (Integer) selectByPk("sample.selectSampleListCount", sampleVO);
	}
	
	public SampleVO selectSampleDetail(SampleVO sampleVO) {
		return (SampleVO) selectByPk("sample.selectSampleDetail", sampleVO);
	}
	
	public int insertSample(SampleVO sampleVO) {
		return insert("sample.insertSample", sampleVO);
	}
	
	public int addReadCount(SampleVO sampleVO) {
		return update("sample.addReadCount", sampleVO);
	}
	
}
