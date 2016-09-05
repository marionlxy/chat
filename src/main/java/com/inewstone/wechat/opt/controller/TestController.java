package com.inewstone.wechat.opt.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inewstone.wechat.opt.pojo.Menu;
import com.inewstone.wechat.opt.service.IMenuService;

@Controller  
@RequestMapping("/menu")  
public class TestController {
	 	@Resource  
	    private IMenuService menuService;  
	      
	    @RequestMapping("/showUser")  
	    public String toIndex(HttpServletRequest request,Model model){  
	        String id = request.getParameter("id");
	        int menuId=(StringUtils.isEmpty(id))?1:Integer.parseInt(id);
	        Menu menu = this.menuService.getMenuById(menuId);  
	        model.addAttribute("menu", menu);  
	        return "showUser";  
	    }  
}
