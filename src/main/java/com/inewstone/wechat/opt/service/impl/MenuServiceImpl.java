package com.inewstone.wechat.opt.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inewstone.wechat.opt.dao.IMenuDAO;
import com.inewstone.wechat.opt.pojo.Menu;
import com.inewstone.wechat.opt.service.IMenuService;

@Service("menuService") 
public class MenuServiceImpl implements IMenuService{
	  @Resource  
	   private IMenuDAO menuDao;  
	  
	@Override
	public Menu getMenuById(int menuId) {
		// TODO Auto-generated method stub
		 return this.menuDao.selectByPrimaryKey(menuId);  
	}

}
