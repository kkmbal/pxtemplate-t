package kr.go.uni.sample.web;

import java.util.Map;

import kr.go.uni.common.util.BeanUtil;
import kr.go.uni.sample.model.SampleVO;
import kr.go.uni.sample.service.SampleService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import portalxpert.common.model.JSONResult;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

/**
 * 
 * <Notice>
 * 		
 * @author 
 * @since 2014. 5. 30.
 * @version 1.0.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *  수정일		 	수정자		수정내용
 *  -------    		--------    ---------------------------
 *  2014. 5. 30.	admin	    	최초 생성
 * </pre>
 */

@Controller
public class SampleController {

	private static final Logger LOG = Logger.getLogger(SampleController.class.getClass());
	
	@Autowired
    private SampleService sampleService;
	
	@Value("#{config['page.countPerPage']}")
	private int countPerPage;
	
	@Value("#{config['page.size']}")
	private int pageSize;
	
	@RequestMapping("/sample/selectSampleList.do")
	public String selectSampleList(@ModelAttribute("searchVO") SampleVO sampleVO, ModelMap modelMap) {
	
		PaginationInfo paginationInfo = new PaginationInfo();
		
		sampleVO.setRecordCountPerPage(countPerPage);
		sampleVO.setPageSize(pageSize);
		
		paginationInfo.setCurrentPageNo(sampleVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(sampleVO.getRecordCountPerPage());
		paginationInfo.setPageSize(sampleVO.getPageSize());

		sampleVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		sampleVO.setLastIndex(paginationInfo.getLastRecordIndex());
		
		Map<String, Object> map = sampleService.selectSampleList(sampleVO);
		int totCnt = Integer.parseInt((String)map.get("resultCnt"));
		
		paginationInfo.setTotalRecordCount(totCnt);

		modelMap.addAttribute("resultList", map.get("resultList"));
		modelMap.addAttribute("resultCnt", map.get("resultCnt"));	
		modelMap.addAttribute("paginationInfo", paginationInfo);

		return "sample/sampleList";
	}
	
	@RequestMapping("/sample/sampleView.do")
	public String sampleView(@ModelAttribute("searchVO") SampleVO sampleVO, ModelMap modelMap) {
		
		SampleVO result = sampleService.selectSampleDetail(sampleVO);

		modelMap.addAttribute("result", result);
		
		return "sample/sampleView";
	}
	
	@RequestMapping("/sample/sampleWrite.do")
	public String sampleWrite(@ModelAttribute("searchVO") SampleVO sampleVO, ModelMap modelMap) {
	
		return "sample/sampleRegist";
	}

	@RequestMapping("/sample/sampleSave.do")
	public ModelMap sampleSave(String data, ModelMap modelMap) {
		JSONResult jsonResult = new JSONResult();
		try{
			SampleVO sampleVO = BeanUtil.getData(data, SampleVO.class);
		    sampleService.insertSample(sampleVO);
		    
		    jsonResult.setMessage("저장이 완료 되었습니다.");
		}catch(Exception e){
			jsonResult.setSuccess(false);
		 	jsonResult.setErrMessage(e.getMessage());
		}
		modelMap.put("jsonResult", jsonResult);
		
	    return modelMap;
	}
	
}

