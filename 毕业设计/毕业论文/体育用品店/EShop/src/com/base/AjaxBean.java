package com.base;

import java.util.Iterator;
import java.util.List;

import com.ORM.Category;
import com.ORM.Member;
import com.ORM.Memberlevel;
import com.service.CartService;
import com.service.CartServiceImpl;
import com.service.MemService;
import com.service.MemServiceImpl;
import com.service.MerService;
import com.service.MerServiceImpl;

/** 供JSON-RPC组件远程调用的AjaxBean */
public class AjaxBean extends BaseLog {
	/**取得商品分类列表*/
	public String[][] getCategory(){
		String[][] options = null;
		MerService service = new MerServiceImpl();
		try{
			//商品的分类list表
			List list = service.browseCategory();
			Category cate = null;
			int i = 0;
			if (list!=null){
				//新建二维数组  一维为分类list的长度  二维为2（1个id，1个name）
				options = new String[list.size()][2];
				Iterator it = list.iterator();
				//迭代输出分类列表
				while(it.hasNext()){
					cate = (Category)it.next();
					options[i][0] =cate.getId().toString();
					options[i][1] =cate.getCateName().trim();
					i++;
				}
			}else{
				options = new String[1][2];
				options[0][0] ="0";
				options[0][1] ="无商品分类";
			}
		}catch(Exception ex){
			logger.info("在执行AjaxBean类中的getCategory方法时出错;\n");
			ex.printStackTrace();			
		}
		return options;
	}
	
	/**取得会员级别*/
	public String[][] getMemberLevel(){
		String[][] options = null;
		MemService service = new MemServiceImpl();
		try{
			//会员等级列表
			List list = service.browseMemberLevel();
			Memberlevel ml = null;
			int i = 0;
			if (list!=null){
				// 新建数组储存选项
				options = new String[list.size()][2];
				Iterator it = list.iterator();
				while(it.hasNext()){
					//迭代输入出会员等级
					ml = (Memberlevel)it.next();
					options[i][0] =ml.getId().toString();
					options[i][1] =ml.getLevelName().trim();
					i++;
				}
			}else{
				options = new String[1][2];
				options[0][0] ="0";
				options[0][1] ="无会员级别";
			}
		}catch(Exception ex){
			logger.info("在执行AjaxBean类中的getMemberLevel方法时出错：\n");
			ex.printStackTrace();			
		}
		return options;
	}
	
	/**注册登录帐号有效性验证*/
	public boolean chkLoginName(String loginName){
		MemService service = new MemServiceImpl();
		boolean result = false;
		try{
			result = service.chkLoginName(loginName);
		}catch(Exception ex){
			logger.info("在执行AjaxBean类中的chkLoginName方法时出错：\n");
			ex.printStackTrace();			
		}
		return result;
	}
	
	/**修改选购商品数量*/
	public boolean modiCart(int id,int number){
		CartService service = new CartServiceImpl();
		boolean result = false;
		try{
			result = service.modiCart(Integer.valueOf(id), number);
		}catch(Exception ex){
			logger.info("在执行AjaxBean类中的modiCart方法时出错：\n");
			ex.printStackTrace();			
		}
		return result;
	}
	
	/**调整会员级别*/
	public boolean updateLevel(Integer id,Integer levelId){
		MemService service = new MemServiceImpl();
		boolean result = false;
		try{
			Member member = service.loadMember(id);
			Memberlevel level = service.loadMemberLevel(levelId);
			member.setMemberlevel(level);
			service.updateMember(member);
			result = true;
		}catch(Exception ex){
			logger.info("在执行AjaxBean类中的updateLevel方法时出错：\n");
			ex.printStackTrace();
		}
		return result;
	}	
}