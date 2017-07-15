package cn.itcast.crm.controller;

import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.crm.pojo.Cust;
import cn.itcast.crm.pojo.QueryVo;
import cn.itcast.crm.pojo.User;
import cn.itcast.crm.service.CustService;
import cn.itcast.crm.service.UserService;

@Controller
@RequestMapping("Cust")
public class CustController {

	@Autowired
	private CustService custService;
	
	/***
	 * 查询所有
	 */
	@RequestMapping("findall")
	public String findall(Model model,QueryVo queryVo){
		List<Cust> findall = custService.findall(queryVo);
		model.addAttribute("list",findall);
		return "center";
	}
	
	
	@RequestMapping("delete")
	public String delete(Long cid ){
		custService.delete(cid);
		//redirect是重定向
		return "redirect:/Cust/findall";
	}
	
	@RequestMapping("add")
	public String add(Cust cust){
		custService.add(cust);
		return "redirect:/Cust/findall";
	}
}
