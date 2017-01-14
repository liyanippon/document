package com.mydbsql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.mydbsql.bbs.BBsTzBean;
import com.mydbsql.bbs.BbsBean;
import com.mydbsql.bbs.RevertBean;
import com.mydbsql.view.CoursesBean;
import com.mydbsql.view.PlacardBean;
import com.web_serializable_bean.OlympicGames.OlympicGamesBean;
import com.web_serializable_bean.fenye_bean.Fenye;
import com.xinxi_Action.struts.form.bbs.BbsForm;

public class Dao {
	
	public List<RevertBean> getHuifuselect(int bbs_id){
		MysqlDb db = new MysqlDb();
		RevertBean r = new RevertBean();
		List<RevertBean> list_hui = new ArrayList<RevertBean>();
		String sql = "select user,neirong,shijian from bbs_revert where bbs_id = '"+bbs_id+"'";
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			while (rs.next()) {
				list_hui.add(new RevertBean(rs.getString("user"), rs.getString("neirong"),rs.getTimestamp("shijian")));
			}
			return list_hui;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list_hui;
	}

	/**
	 * 版面进入
	 */
	public List<BbsBean> getBbseditionList(int class_id) {
		MysqlDb db = new MysqlDb();
		BbsBean bb = new BbsBean();
		int id = 0;
		List<BbsBean> select = new ArrayList<BbsBean>();
		String sql = "select board_id,board_name,board_master,board_pcard  from  t_phonebook  where board_classID='"
				+ class_id + "'";
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			while (rs.next()) {
				bb.setBoard_id(rs.getInt("board_id"));
				bb.setBoard_name(rs.getString("board_name"));
				bb.setBoard_master(rs.getString("board_master"));
				bb.setBoard_pcard(rs.getString("board_pcard"));
				bb.setCount(this.getcountid(bb.getBoard_id()));

				select
						.add(new BbsBean(bb.getBoard_id(), bb.getBoard_name(),
								bb.getBoard_master(), bb.getBoard_pcard(), bb
										.getCount()));
			}
			return select;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return select;
	}

	public Integer getcountid(int id) {
		MysqlDb db = new MysqlDb();
		BbsBean bb = new BbsBean();
		String sql = "select count( bbs_id_boardid) as bbs_id_boardid  from bbs_article where bbs_article.onoff = '1' and bbs_article.bbs_id_boardid = '"
				+ id + "'";
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			if (rs.next()) {
				bb.setCount(rs.getInt("bbs_id_boardid"));
			}
			return bb.getCount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}


	public List<BBsTzBean> getbbsselect(int board_id) {
		MysqlDb db = new MysqlDb();
		List<BBsTzBean> select = new ArrayList<BBsTzBean>();
		String sql = "select bbs_id ,bbs_number,bbs_user,bbs_title,bbs_time  from bbs_article where bbs_article.onoff = '1' and bbs_article.bbs_id_boardid ='"
				+ board_id + "' order   by   bbs_id desc";
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			while (rs.next()) {
				select.add(new BBsTzBean(rs.getInt("bbs_id"), rs
						.getInt("bbs_number"), rs.getString("bbs_user"), rs
						.getString("bbs_title"), rs.getTimestamp("bbs_time")));
			}
			return select;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return select;
	}


	public List<BBsTzBean> getbbsid(int bbs_id) {
		MysqlDb db = new MysqlDb();
		List<BBsTzBean> select = new ArrayList<BBsTzBean>();
		String sql = "select bbs_id ,bbs_number,bbs_user,bbs_title,bbs_content,bbs_time  from bbs_article where bbs_article.onoff = '1' and bbs_article.bbs_id ='"
				+ bbs_id + "'";
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			while (rs.next()) {

				select.add(new BBsTzBean(rs.getInt("bbs_id"), rs
						.getInt("bbs_number"), rs.getString("bbs_user"), rs
						.getString("bbs_title"), rs.getString("bbs_content"),
						rs.getTimestamp("bbs_time")));
			}
			return select;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return select;
	}

	/**
	 * 主页
	 */
	public List<BbsBean> getBbs() {
		MysqlDb db = new MysqlDb();
		List<BbsBean> select = new ArrayList<BbsBean>();
		String sql = "select  tb_class.class_id , tb_class.class_name , tb_class.class_intro , count(t_phonebook.board_classID) as board_classID from tb_class,t_phonebook where  tb_class.class_id = t_phonebook.board_classID group by t_phonebook.board_classID";
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			while (rs.next()) {
				select.add(new BbsBean(rs.getInt("class_id"), rs
						.getString("class_name"), rs.getString("class_intro"),
						rs.getInt("board_classID")));
			}
			return select;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return select;
	}

	/**
	 * 最近心情
	 */
	public List<PlacardBean> getPlacardBeanList() {
		MysqlDb db = new MysqlDb();
		List<PlacardBean> select = new ArrayList<PlacardBean>();
		String sql = "select neirong,shijian from t_xinqing";
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			while (rs.next()) {
				select.add(new PlacardBean(rs.getString("neirong"), rs
						.getTimestamp("shijian")));
			}
			return select;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return select;
	}



	/**
	 * 心情日记文章返回
	 */
	public List getFenyeSelect(int fenye_Id) {
		MysqlDb db = new MysqlDb();
		List<Fenye> select = new ArrayList<Fenye>();
		String sql = "select fenye_Id, fwjilu, zhuti, zuozhe, neigong, shijian from wenzhang where fenye_Id= '"
				+ fenye_Id + "'";
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			if (rs.next()) {
				select.add(new Fenye(rs.getInt("fenye_Id"),
						rs.getInt("FWJILU"), rs.getString("ZHUTI"), rs
								.getString("ZUOZHE"), rs.getString("neigong"),
						rs.getTimestamp("SHIJIAN")));
			}
			return select;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return select;
	}

	/**
	 * 心情日记分页
	 */
	public List getFenyeList(int sum, int size) {
		MysqlDb db = new MysqlDb();
		List<Fenye> select = new ArrayList<Fenye>();
		String sql = "select fenye_Id,FWJILU ,ZHUTI ,ZUOZHE ,SHIJIAN  from wenzhang FWJILU limit "
				+ sum + "," + size;
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			while (rs.next()) {
				select.add(new Fenye(rs.getInt("fenye_Id"),
						rs.getInt("FWJILU"), rs.getString("ZHUTI"), rs
								.getString("ZUOZHE"), rs
								.getTimestamp("SHIJIAN")));
			}
			return select;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return select;
	}

	/**
	 * 工作日记返回
	 */
	public List getOlympicGamesBeanSelect(int fenye_Id) {
		MysqlDb db = new MysqlDb();
		List<OlympicGamesBean> select = new ArrayList<OlympicGamesBean>();
		String sql = "select fenye_Id, fwjilu, zhuti, zuozhe, neigong, shijian from t_worknote where fenye_Id= '"
				+ fenye_Id + "'";
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			if (rs.next()) {
				select.add(new OlympicGamesBean(rs.getInt("fenye_Id"), rs
						.getInt("FWJILU"), rs.getString("ZHUTI"), rs
						.getString("ZUOZHE"), rs.getString("neigong"), rs
						.getTimestamp("SHIJIAN")));
			}
			return select;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return select;
	}

	/**
	 * 学习日记
	 */
	public List getAcademyListsql(int cid) {
		MysqlDb db = new MysqlDb();
		List<CoursesBean> select = new ArrayList<CoursesBean>();
		String sql = "select cid,zhuti,zuozhe , neirong ,shijian  from t_studynote where cid='"
				+ cid + "'";
		System.err.println(sql);
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			while (rs.next()) {
				select.add(new CoursesBean(rs.getInt("cid"), rs
						.getString("zhuti"), rs.getString("zuozhe"), rs
						.getString("neirong"), rs.getTimestamp("SHIJIAN")));
			}
			return select;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return select;
	}

	/**
	 * 学习日记
	 */
	public List getAcademyList(int sum, int size) {
		MysqlDb db = new MysqlDb();
		List<CoursesBean> select = new ArrayList<CoursesBean>();

		String sql = "select cid,zhuti,shijian  from t_studynote  cid limit " + sum
				+ "," + size;
		System.err.println(sql);
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			while (rs.next()) {
				select.add(new CoursesBean(rs.getInt("cid"), rs
						.getString("zhuti"), rs.getTimestamp("SHIJIAN")));
			}
			// for (CoursesBean n : select) {
			// System.err.println(n.getZhuti() + "," + n.getShijian());
			// }
			return select;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return select;
	}

	/**
	 * 政策要闻分页
	 */
	public List getOlympicGamesBeanList(int sum, int size) {
		MysqlDb db = new MysqlDb();
		List<OlympicGamesBean> select = new ArrayList<OlympicGamesBean>();
		String sql = "select fenye_Id,FWJILU ,ZHUTI ,ZUOZHE ,SHIJIAN  from t_worknote  FWJILU limit "
				+ sum + "," + size;
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			while (rs.next()) {
				select.add(new OlympicGamesBean(rs.getInt("fenye_Id"), rs
						.getInt("FWJILU"), rs.getString("ZHUTI"), rs
						.getString("ZUOZHE"), rs.getTimestamp("SHIJIAN")));
			}
			// for (OlympicGamesBean n : select) {
			// System.err.println(n.getZhuti() + "," + n.getShijian());
			// }
			return select;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return select;
	}

	/**
	 * 帖子主题进入
	 * 
	 * @param i
	 * @return
	 */
	public List getluntantitle(int i) {
		MysqlDb db = new MysqlDb();
		List<BbsArticleBean> select = new ArrayList<BbsArticleBean>();
		String sql = "select bbs_id,bbs_user ,bbs_title ,bbs_content,bbs_time from bbs_article where bbs_id  = '"
				+ i + "'";
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			while (rs.next()) {
				select
						.add(new BbsArticleBean(rs.getInt("bbs_id"), rs
								.getString("bbs_user"), rs
								.getString("bbs_title"), rs
								.getString("bbs_content"), rs
								.getTimestamp("bbs_time")));
			}
			return select;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return select;
	}

	/**
	 * 帖子排序
	 * 
	 * @param b
	 * @return
	 */
	public List getluntantieziselect(int i) {
		//		
		MysqlDb db = new MysqlDb();
		List<BbsArticleBean> select = new ArrayList<BbsArticleBean>();
		String sql = "select bbs_id,bbs_number,bbs_user ,bbs_title ,bbs_time,onoff from bbs_article where bbs_id_boardid  = '"
				+ i + "' order   by   bbs_id desc";
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			while (rs.next()) {
				select.add(new BbsArticleBean(rs.getInt("bbs_id"), rs
						.getInt("bbs_number"), rs.getString("bbs_user"), rs
						.getString("bbs_title"), rs.getTimestamp("bbs_time"),
						rs.getInt("onoff")));
			}
			return select;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return select;
	}

	public List<BiaotiBean> getBiaoti(int b) {
		MysqlDb db = new MysqlDb();
		List<BiaotiBean> select = new ArrayList<BiaotiBean>();
		String sql = "select class_name from tb_class where class_id = '" + b
				+ "'";
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			if (rs.next()) {
				select.add(new BiaotiBean(rs.getString("class_name")));
			}
			return select;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return select;
	}

	public List<BoardBean> getLuntanlanmuuserselect(BoardBean b) {
		MysqlDb db = new MysqlDb();
		List<BoardBean> select = new ArrayList<BoardBean>();
		String sql = "select board_id, board_name, board_master, board_pcard from t_phonebook  where board_id='"
				+ b.getBoard_id() + "'";
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			if (rs.next()) {
				select.add(new BoardBean(rs.getInt("board_id"), rs
						.getString("board_name"), rs.getString("board_master"),
						rs.getString("board_pcard")));
			}
			return select;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return select;
	}

	/**
	 * 返回论坛栏目查询的集合
	 */
	public List<BoardBean> getLuntanlanmuselect(BoardBean b) {
		MysqlDb db = new MysqlDb();
		List<BoardBean> select = new ArrayList<BoardBean>();
		String sql = "select board_id, board_name, board_master, board_pcard from t_phonebook  where board_classID='"
				+ b.getBoard_classID() + "'";
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			while (rs.next()) {
				select.add(new BoardBean(rs.getInt("board_id"), rs
						.getString("board_name"), rs.getString("board_master"),
						rs.getString("board_pcard")));
			}
			return select;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return select;

	}

	/**
	 * 返回论坛板块的集合
	 */
	public List<LtBanKuai> getLuntanBanKuai() {
		MysqlDb db = new MysqlDb();
		List<LtBanKuai> bankuai = new ArrayList<LtBanKuai>();
		String sql = "select class_id, class_name , class_intro from tb_class";
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			while (rs.next()) {
				bankuai.add(new LtBanKuai(rs.getInt("class_id"), rs
						.getString("class_name"), rs.getString("class_intro")));
			}
			return bankuai;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return bankuai;
	}

	/**
	 * 近期要闻删除
	 */

	public static boolean newsdelete(int nid) {
		MysqlDb db = new MysqlDb();
		int delete = 0;
		String sql = "delete from news where nid = '" + nid + "'";
		System.err.println(sql);
		delete = db.ExcecuteUpdate(sql);
		if (delete == 1) {
			return true;
		}
		return false;
	}

	/**
	 * 后台学习日记删除
	 */
	public static boolean academydelete(int cid) {
		MysqlDb db = new MysqlDb();
		int delete = 0;
		String sql = "delete from t_studynote where cid = '" + cid + "'";
		System.err.println(sql);
		delete = db.ExcecuteUpdate(sql);
		if (delete == 1) {
			return true;
		}
		return false;
	}

	public static boolean linkdeledelect(int lid) {
		MysqlDb db = new MysqlDb();
		int delete = 0;
		String sql = "delete from link where lid = '" + lid + "'";
		System.err.println(sql);
		delete = db.ExcecuteUpdate(sql);
		if (delete == 1) {
			return true;
		}
		return false;
	}

	public static boolean luntandelete(LtBanKuai lt) {
		MysqlDb db = new MysqlDb();
		int delete = 0;
		String sql = "delete from tb_class where class_id = '"
				+ lt.getClass_id() + "'";
		System.err.println(sql);
		delete = db.ExcecuteUpdate(sql);
		if (delete == 1) {
			return true;
		}
		return false;
	}

	public static boolean luntanlanmudelete(BoardBean bb) {
		MysqlDb db = new MysqlDb();
		int delete = 0;
		String sql = "delete from t_phonebook where board_id = '"
				+ bb.getBoard_id() + "'";
		System.err.println(sql);
		delete = db.ExcecuteUpdate(sql);
		if (delete == 1) {
			return true;
		}
		return false;

	}

	/**
	 * 登录
	 */
	public static boolean getlongin(BbsForm b) {
		MysqlDb db = new MysqlDb();
		String username = "";
		String sql = "select username from user where username ='"
				+ b.getUserName() + "' and password ='" + b.getPassWord()
				+ "' ";
		ResultSet rs = db.ExcecuteQuery(sql);
		try {
			if (rs.next()) {
				username = rs.getString("username");
				System.out.println("user_name:" + username);
				if (username.equals("") || username == null) {
					return false;
				}
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}


	/**
	 * 版块添加
	 * 
	 * @param lt
	 * @return
	 */
	public static boolean luntaninsert(LtBanKuai lt) {
		MysqlDb db = new MysqlDb();
		int insert = 0;
		int max = 0;
		String selectsql = "SELECT MAX(class_id) AS class_id FROM tb_class";

		ResultSet rs = db.ExcecuteQuery(selectsql);
		try {
			if (rs.next())
				max = rs.getInt("class_id");
			max += 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String insertsql = "insert into tb_class VALUES ('" + max + "','"
				+ lt.getClass_name() + "','" + lt.getClass_intro() + "')";
		insert = db.ExcecuteUpdate(insertsql);
		if (insert == 1) {
			return true;
		}
		return false;
	}

	/**
	 * 后台学习日记添加
	 */
	public static boolean coursesinsert(String zuozhe, String neirong,
			String zhuti) {
		MysqlDb db = new MysqlDb();
		int insert = 0;
		int max = 0;
		String selectsql = "SELECT MAX(cid) AS cid FROM t_studynote";
		ResultSet rs = db.ExcecuteQuery(selectsql);
		try {
			if (rs.next())
				max = rs.getInt("cid");
			max += 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance(); // 获得当前的时间
		String bbs_time = sdf.format(cal.getTime());
		String insertsql = "INSERT INTO t_studynote VALUES ('" + max + "'," + "'"
				+ zhuti + "'," + "'" + zuozhe + "'," + "'" + neirong + "',"
				+ "'" + bbs_time + "')";
		insert = db.ExcecuteUpdate(insertsql);
		if (insert == 1) {
			return true;
		}
		return false;

	}

	/**
	 * 近期要闻添加
	 */
	public static boolean newsinsert(String zhuti) {
		MysqlDb db = new MysqlDb();
		int insert = 0;
		int max = 0;
		String selectsql = "SELECT MAX(nid) AS nid FROM news";
		ResultSet rs = db.ExcecuteQuery(selectsql);
		try {
			if (rs.next())
				max = rs.getInt("nid");
			max += 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String insertsql = "INSERT INTO news  (nid, zhuti) VALUES ('" + max
				+ "','" + zhuti + "')";
		insert = db.ExcecuteUpdate(insertsql);
		if (insert == 1) {
			return true;
		}
		return false;
	}

	/**
	 */
	public static boolean linkselectsql(String wzmingcheng, String dizhi) {
		MysqlDb db = new MysqlDb();
		int insert = 0;
		int max = 0;
		String selectsql = "SELECT MAX(lid) AS lid FROM link";
		ResultSet rs = db.ExcecuteQuery(selectsql);
		try {
			if (rs.next())
				max = rs.getInt("lid");
			max += 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String insertsql = "insert into link VALUES('" + max + "'," + "'"
				+ wzmingcheng + "'," + "'" + dizhi + "')";
		insert = db.ExcecuteUpdate(insertsql);
		if (insert == 1) {
			return true;
		}
		return false;
	}

	/**
	 */
	public static boolean luntanlanmutianjia(BoardBean bb) {
		MysqlDb db = new MysqlDb();
		int insert = 0;
		int max = 0;
		String selectsql = "SELECT MAX(board_id) AS board_id FROM t_phonebook";
		ResultSet rs = db.ExcecuteQuery(selectsql);
		try {
			if (rs.next())
				max = rs.getInt("board_id");
			max += 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String insertsql = "insert into t_phonebook VALUES ('" + max + "'," + "'"
				+ bb.getBoard_classID() + "'," + "'" + bb.getBoard_name()
				+ "'," + "'" + bb.getBoard_master() + "'," + "'"
				+ bb.getBoard_pcard() + "')";
		System.err.println(insertsql);
		insert = db.ExcecuteUpdate(insertsql);
		if (insert == 1) {
			return true;
		}
		return false;
	}

	public static boolean luntantieziinsert(String user, int board_id,
			String bbs_title, String bbs_content) {
		MysqlDb db = new MysqlDb();
		int insert = 0;
		int max = 0;
		String selectsql = "SELECT MAX(bbs_id) AS bbs_id FROM bbs_article";
		ResultSet rs = db.ExcecuteQuery(selectsql);
		try {
			if (rs.next())
				max = rs.getInt("bbs_id");
			max += 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance(); // 获得当前的时间
		String bbs_time = sdf.format(cal.getTime());
		System.out.println("今天是111111：" + bbs_time);
		//		
		String insertsql = "INSERT INTO bbs_article VALUES" + "(" + max + ", "
				+ board_id + ", 0, '" + user + "', '" + bbs_title + "', '"
				+ bbs_content + "','" + bbs_time + "', 1);";
		System.err.println(insertsql);
		insert = db.ExcecuteUpdate(insertsql);
		if (insert == 1) {
			return true;
		}
		return false;
	}
	
	public static boolean getbbs_id(int bbs_id){
		MysqlDb db = new MysqlDb();
		int insert = 0;
		int max = 0;
		String sesql = "select count(bbs_id) as bbs_id from bbs_revert where bbs_id = '"+bbs_id+"'";
		ResultSet rs = db.ExcecuteQuery(sesql);
		try {
			
			if (rs.next())
				max = rs.getInt("bbs_id");
				max += 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String upsql = "UPDATE bbs_article set bbs_number = '"+ max+ "' where bbs_id='"+bbs_id+"'";
		insert = db.ExcecuteUpdate(upsql);
		if(insert == 1){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * @param b
	 * @param user
	 * @return
	 */
	public static boolean getHuifu(BbsForm b, String user) {
		MysqlDb db = new MysqlDb();
		String huifu = b.getHuifu();
		int bbsid = Integer.parseInt((b.getBbs_id()));
		int insert = 0;
		int max = 0;
		int in = 0;
		int max1 = 0;
		String selectsql = "SELECT MAX(rid) AS rid FROM bbs_revert";
		ResultSet rs = db.ExcecuteQuery(selectsql);
		try {
			if (rs.next())
				max = rs.getInt("rid");
			max += 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance(); // 获得当前的时间
		String bbs_time = sdf.format(cal.getTime());
		System.out.println("今天是111111：" + bbs_time);

		String sqlinsert = "INSERT INTO bbs_revert VALUES" + "(" + max + ", "
				+ bbsid + ", '" + user + "', '" + huifu + "', '" + bbs_time
				+ "');";
		System.err.println(sqlinsert);
		insert = db.ExcecuteUpdate(sqlinsert);
		if (insert == 1) {
			return true;
		}
		return false;
	}
	

	/**
	 * 最近心情修改
	 */
	public static boolean afficheupdatesql(String neirong) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance(); // 获得当前的时间
		String bbs_time = sdf.format(cal.getTime());
		MysqlDb db = new MysqlDb();
		int update = 0;
		String updatesql = "UPDATE t_xinqing set neirong='" + neirong
				+ "', shijian='" + bbs_time + "' where pid='1'";
		update = db.ExcecuteUpdate(updatesql);
		System.err.println(updatesql);
		if (update == 1) {
			return true;
		}
		return false;

	}

	/**
	 * 论坛版块修改
	 * 
	 * @param title
	 * @param user_id
	 * @return
	 */
	public static boolean LuntanUpdate(LtBanKuai lt) {
		MysqlDb db = new MysqlDb();
		int update = 0;
		String updatesql = "UPDATE tb_class set class_name='"
				+ lt.getClass_name() + "', class_intro='" + lt.getClass_intro()
				+ "' where class_id='" + lt.getClass_id() + "'";
		System.err.println(updatesql);
		update = db.ExcecuteUpdate(updatesql);
		if (update == 1) {
			return true;
		}
		return false;
	}

	public static boolean luntanonoff(int onoff, int bbs_id) {
		// update bbs_article set onoff = '0' where bbs_id = '3'
		MysqlDb db = new MysqlDb();
		int update = 0;
		String sql = "update bbs_article set onoff = '" + onoff
				+ "' where bbs_id = '" + bbs_id + "'";
		System.err.println(sql);
		update = db.ExcecuteUpdate(sql);
		if (update == 1) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param b
	 * @return
	 */
	public static boolean getluntanundatesql(BoardBean b) {
		MysqlDb db = new MysqlDb();
		int update = 0;

		String sql = "UPDATE t_phonebook set board_name='" + b.getBoard_name()
				+ "', board_master='" + b.getBoard_master()
				+ "', board_pcard='" + b.getBoard_pcard()
				+ "' where board_id='" + b.getBoard_id() + "'";
		System.err.println(sql);
		update = db.ExcecuteUpdate(sql);
		if (update == 1) {
			return true;
		}
		return false;
	}

}
