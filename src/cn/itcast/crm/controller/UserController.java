package cn.itcast.crm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.crm.pojo.User;
import cn.itcast.crm.service.UserService;

@Controller
@RequestMapping("User")
public class UserController {

	@Autowired
	private UserService userService;
	
	/***
	 * 登入验证
	 */
	@RequestMapping("login")
	public String login(User user,Model model){
		try {
			List<User> login = userService.login(user);
			if(login.get(0)!=null){
				model.addAttribute("name",login.get(0).getNickname());
				return "index";
			}
		} catch (Exception e) {
			model.addAttribute("mssge", "未注册！");
		}
		return "login";
	}
	
	@RequestMapping("querAll")
	@ResponseBody//表示该方法的返回结果直接写入HTTP response body中，直接返回json数据
	public List<User> querAll(){
		List<User> list=userService.querAll();
		return list;
	}
}
