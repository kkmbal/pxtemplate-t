package portalxpert.adm.sys.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import portalxpert.adm.board.model.AdmBoardNotiInfoVO;
import portalxpert.adm.sys.model.AdmSysPsnUserInfoVO;
import portalxpert.adm.sys.service.AdmSysSmsQtyService;
import portalxpert.common.model.JSONResult;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;


@Controller
@RequestMapping(value="adm/sys")
public class AdmSysSmsQtyController {
	
	/** AdmSysSmsQtyService */
    @Resource(name = "admSysSmsQtyService")
    private AdmSysSmsQtyService admSysSmsQtyService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
    
    @Resource(name="messageSourceAccessor")
    private MessageSourceAccessor messageSource;
   
    private final static Logger logger = LoggerFactory.getLogger(AdmSysSmsQtyController.class);
   
    /**
	 * SMS쿼터관리 목록
	 * @param AdmSysPsnUserInfoVO
	 * @param ModelMap
	 * @return String
	 * @throws Exception
	 */
    @RequestMapping(value="/getAdmSysSmsQtyList")
	public String getAdmSysSmsQtyList(
								AdmSysPsnUserInfoVO admSysPsnUserInfoVO,
								ModelMap modelMap
								)
								throws Exception {
    	
    	/** pageing setting START */
    	admSysPsnUserInfoVO.setPageUnit(propertiesService.getInt("pageUnit"));
    	admSysPsnUserInfoVO.setPageSize(propertiesService.getInt("pageSize"));
    	PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(admSysPsnUserInfoVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(admSysPsnUserInfoVO.getPageUnit());
		paginationInfo.setPageSize(admSysPsnUserInfoVO.getPageSize());
		admSysPsnUserInfoVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		admSysPsnUserInfoVO.setLastIndex(paginationInfo.getLastRecordIndex());
		admSysPsnUserInfoVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
		
		int smsQtyListCnt = admSysSmsQtyService.getAdmSysSmsQtyCnt(admSysPsnUserInfoVO);
		
		paginationInfo.setTotalRecordCount(smsQtyListCnt);
        modelMap.put("paginationInfo", paginationInfo);
        /** pageing setting END */
	   
    	List<AdmSysPsnUserInfoVO> smsQtyList = admSysSmsQtyService.getAdmSysSmsQtyList(admSysPsnUserInfoVO);
    	modelMap.put("smsQtyList", smsQtyList);
    	
    	AdmBoardNotiInfoVO pSearch = new AdmBoardNotiInfoVO();
    	pSearch.setSearchCondition(admSysPsnUserInfoVO.getSearchCondition());
    	pSearch.setSearchKeyword(admSysPsnUserInfoVO.getSearchKeyword());
    	pSearch.setCurrentRecordCount(smsQtyList.size());
    	modelMap.put("pSearch", pSearch);
    	
   		return ".adm/adm/sys/admSysSmsQtyList";
	}
 	
 	/**
     * SMS쿼터관리쿼터 수정
     * @param AdmSysPsnUserInfoVO
     * @return ModelMap
     * @exception Exception
     */
 	@RequestMapping(value = "/updateAdmSysSmsQty", method = RequestMethod.POST)
    public ModelMap updateAdmSysSmsQty(
    										AdmSysPsnUserInfoVO admSysPsnUserInfoVO,
    										ModelMap modelMap,
    										HttpSession session
    										) throws Exception {
 		
 		JSONResult jsonResult = new JSONResult();
 			
		try{
			admSysSmsQtyService.updateAdmSysSmsQty(admSysPsnUserInfoVO, session);
			jsonResult.setMessage(messageSource.getMessage("update.ok"));
    		
    	}catch (Exception e) {
    		jsonResult.setSuccess(false);
    		jsonResult.setMessage(messageSource.getMessage("common.error"));
    		jsonResult.setErrMessage(e.getMessage());
		}
 		
 		modelMap.put("jsonResult", jsonResult);
 		return modelMap;
 	}
  	
}
