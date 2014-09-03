package kr.go.uni.common.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * kr.go.uni.common.web.FrameController.java
 * 클래스 설명 : 
 * 		
 * @author 
 * @since 2014. 6. 18.
 * @version 1.0.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *  수정일		 	수정자		수정내용
 *  -------    		--------    ---------------------------
 *  2014. 6. 18.	 admin     		    	최초 생성
 * </pre>
 */

@Controller
public class FrameController extends AbstractController {

	@RequestMapping("/common/frame/main.do")
	public String getMainFrame(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		return "common/frame/main";
	}
	
	@RequestMapping("/common/frame/leftMenu.do")
	public String getLeftMenu(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		return "common/frame/leftMenu";
	}
	
	@RequestMapping("/common/frame/top.do")
	public String getTopFrame(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		return "common/frame/top";
	}
	
	@RequestMapping("/common/frame/footer.do")
	public String getFooterFrame(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		return "common/frame/footer";
	}
	
	@RequestMapping("/common/login/login.do")
	public String getLoginFrame(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		return "common/login/login";
	}
	
	@RequestMapping("/adm/leftTree.do")
	public String getAdmLeftFrame(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		return "portalxpert/adm/leftTree";
	}
	
	@RequestMapping("/board/leftTree.do")
	public String getBoardLeftFrame(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		return "portalxpert/board/leftTree";
	}
	
}
