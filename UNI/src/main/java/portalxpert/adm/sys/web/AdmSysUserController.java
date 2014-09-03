/**
 * 
 */
package portalxpert.adm.sys.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import portalxpert.adm.sys.model.AdmSysAuthVO;
import portalxpert.adm.sys.model.AdmSysDeptInfo;
import portalxpert.adm.sys.model.AdmSysPsnUserInfoVO;
import portalxpert.adm.sys.service.AdmSysAuthService;
import portalxpert.adm.sys.service.AdmSysUserService;
import portalxpert.common.model.JSONResult;
import portalxpert.common.utils.CommUtil;
import portalxpert.common.utils.JSONUtils;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;


/**
 * @author crossent
 *
 */
@Controller
@RequestMapping(value = "adm/sys")
public class AdmSysUserController {
	
	@Resource(name = "admSysUserService")
	private AdmSysUserService admSysUserService;
	
	
	
	@Resource(name = "admSysAuthService")
	private AdmSysAuthService admSysAuthService;
	
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    @Resource(name="messageSourceAccessor")
    private MessageSourceAccessor messageSource;

	private final static Logger logger = LoggerFactory.getLogger(AdmSysUserController.class);
	
	
	
	/**
	 * 사용자목록 조회
	 * @param modelMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/getAdmSysUserList")
	public String getAdmSysUserList(@ModelAttribute("admSysPsnUserInfoVO") AdmSysPsnUserInfoVO admSysPsnUserInfoVO ,ModelMap modelMap) throws Exception{
		
		/** PropertyService.sample */
		admSysPsnUserInfoVO.setPageUnit(admSysPsnUserInfoVO.getPageUnit());
		admSysPsnUserInfoVO.setPageSize(propertiesService.getInt("pageSize"));
		admSysPsnUserInfoVO.setPageIndex(admSysPsnUserInfoVO.getPageIndex());
    	
    	/** pageing setting */
    	PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(admSysPsnUserInfoVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(admSysPsnUserInfoVO.getPageUnit());
		paginationInfo.setPageSize(admSysPsnUserInfoVO.getPageSize());
		
		admSysPsnUserInfoVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		admSysPsnUserInfoVO.setLastIndex(paginationInfo.getLastRecordIndex());
		admSysPsnUserInfoVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
		
		List<AdmSysPsnUserInfoVO> notiList = admSysUserService.getAdmSysUserInfoList(admSysPsnUserInfoVO);
		int totCnt = admSysUserService.getAdmSysUserInfoListCnt(admSysPsnUserInfoVO);
		
		paginationInfo.setTotalRecordCount(totCnt);
		
		//권한코드
		AdmSysAuthVO admSysAuthVO = new AdmSysAuthVO();
		List<AdmSysAuthVO> listAdmSysAuthVO = admSysAuthService.getAuchCodeList(admSysAuthVO);
		
		modelMap.put("paginationInfo", paginationInfo);
		modelMap.put("admSysPsnUserInfoVO", admSysPsnUserInfoVO);
		modelMap.put("authCodeList", listAdmSysAuthVO);
		modelMap.put("notiList", notiList);
		
		
		return "portalxpert/adm/sys/admSysUserList";
	}	
	
	
	/**
	 * 사용자정보 조회
	 * @param modelMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/getAdmSysUserManage")
	public String getAdmSysUserManage(@RequestParam(value="userId",required = true) String userId ,ModelMap modelMap) throws Exception{
		
		AdmSysPsnUserInfoVO admSysPsnUserInfoVO = new AdmSysPsnUserInfoVO();
		if(!CommUtil.isEmpty(userId)){
			admSysPsnUserInfoVO.setUserId(userId);
			admSysPsnUserInfoVO = admSysUserService.getAdmSysUserInfo(admSysPsnUserInfoVO);
			
			//소유권한목록
			List<AdmSysAuthVO> authList = admSysAuthService.getAuthInfo(userId);
			modelMap.put("userAuthList", authList);
		}
		
		//권한코드
		AdmSysAuthVO admSysAuthVO = new AdmSysAuthVO();
		List<AdmSysAuthVO> listAdmSysAuthVO = admSysAuthService.getAuchCodeList(admSysAuthVO);
		
		
		//부서코드
		List<AdmSysPsnUserInfoVO> userDeptInfoList = admSysUserService.getUserDeptInfoList(new AdmSysPsnUserInfoVO());
		List<AdmSysDeptInfo> deptList = new ArrayList<AdmSysDeptInfo>();
		for(AdmSysPsnUserInfoVO vo : userDeptInfoList){
			AdmSysDeptInfo deptvo = new AdmSysDeptInfo();
			deptvo.setDeptCode(vo.getDeptCode());
			deptvo.setDeptName(vo.getDeptName());
			deptvo.setDeptFname(vo.getDeptFname());
			deptList.add(deptvo);
		}
		
		
		modelMap.put("admSysPsnUserInfoVO", admSysPsnUserInfoVO);
		modelMap.put("authCodeList", JSONUtils.objectToJSON(listAdmSysAuthVO));
		modelMap.put("deptList", JSONUtils.objectToJSON(deptList));
		
		
		return "portalxpert/adm/sys/admSysUserManage";
	}	

	   /**
	    * 사용자등록
		* @param modelMap
		* @return
		* @throws Exception
		*/
	@RequestMapping(value = "/insertAdmUser")
	public ModelMap insertAdmUser(@RequestParam(value="data",required = true) String data ,ModelMap modelMap, HttpSession session) throws Exception{
	
			JSONResult jsonResult = new JSONResult();
				
			try{
				admSysUserService.insertPsnUserInfo(data, session);
				
		   	}catch (Exception e) {
		   		jsonResult.setSuccess(false);
		   		jsonResult.setMessage(messageSource.getMessage("common.error"));
		   		jsonResult.setErrMessage(e.getMessage());
			}
			
			modelMap.put("jsonResult", jsonResult);
			return modelMap;
	}
}
