/*
MySQL Data Transfer
Source Host: localhost
Source Database: db_note
Target Host: localhost
Target Database: db_note
Date: 2013-3-13 22:01:26
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for bbs_article
-- ----------------------------
CREATE TABLE `bbs_article` (
  `bbs_id` int(4) NOT NULL auto_increment,
  `bbs_id_boardid` int(11) NOT NULL,
  `bbs_number` int(11) default NULL,
  `bbs_user` varchar(40) default NULL,
  `bbs_title` varchar(100) default NULL,
  `bbs_content` varchar(10000) default NULL,
  `bbs_time` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `onoff` int(2) default NULL,
  PRIMARY KEY  (`bbs_id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Table structure for t_phonebook
-- ----------------------------
CREATE TABLE `t_phonebook` (
  `board_id` int(4) NOT NULL auto_increment,
  `board_classID` smallint(2) default NULL,
  `board_name` varchar(40) default NULL,
  `board_master` varchar(20) default NULL,
  `board_pcard` varchar(200) default NULL,
  PRIMARY KEY  (`board_id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Table structure for t_studynote
-- ----------------------------
CREATE TABLE `t_studynote` (
  `cid` int(11) NOT NULL auto_increment,
  `zhuti` varchar(100) NOT NULL,
  `zuozhe` varchar(20) NOT NULL,
  `neirong` varchar(2000) NOT NULL,
  `shijian` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  PRIMARY KEY  (`cid`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Table structure for t_worknote
-- ----------------------------
CREATE TABLE `t_worknote` (
  `FENYE_ID` int(11) NOT NULL auto_increment,
  `FWJILU` int(11) NOT NULL,
  `ZHUTI` varchar(100) NOT NULL,
  `ZUOZHE` varchar(20) NOT NULL,
  `NEIGONG` varchar(2000) NOT NULL,
  `SHIJIAN` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  PRIMARY KEY  (`FENYE_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Table structure for t_xinqing
-- ----------------------------
CREATE TABLE `t_xinqing` (
  `pid` int(11) NOT NULL auto_increment,
  `neirong` varchar(2000) NOT NULL,
  `shijian` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  PRIMARY KEY  (`pid`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Table structure for tb_class
-- ----------------------------
CREATE TABLE `tb_class` (
  `class_id` smallint(2) NOT NULL auto_increment,
  `class_name` varchar(40) default NULL,
  `class_intro` varchar(200) default NULL,
  PRIMARY KEY  (`class_id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Table structure for user
-- ----------------------------
CREATE TABLE `user` (
  `USER_ID` int(11) NOT NULL auto_increment,
  `USERNAME` varchar(20) NOT NULL,
  `PASSWORD` varchar(20) NOT NULL,
  `quanxian` int(2) NOT NULL default '0',
  PRIMARY KEY  (`USER_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Table structure for wenzhang
-- ----------------------------
CREATE TABLE `wenzhang` (
  `FENYE_ID` int(11) NOT NULL auto_increment,
  `FWJILU` int(11) NOT NULL,
  `ZHUTI` varchar(100) NOT NULL,
  `ZUOZHE` varchar(20) NOT NULL,
  `NEIGONG` varchar(2000) NOT NULL,
  `SHIJIAN` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  PRIMARY KEY  (`FENYE_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `bbs_article` VALUES ('1', '15', '2', 'whp', '我想学习它可以吗？', '不知道，难不难哦。。。。。。。。。', '2013-03-13 11:18:39', '1');
INSERT INTO `t_phonebook` VALUES ('27', '8', '陈道明', 'null', '15656565656');
INSERT INTO `t_phonebook` VALUES ('22', '9', '乾隆', 'null', '1999999990');
INSERT INTO `t_phonebook` VALUES ('20', '6', '张之洞', '', '0411-8497987');
INSERT INTO `t_phonebook` VALUES ('21', '8', '刘墉', 'null', '18888888847');
INSERT INTO `t_phonebook` VALUES ('19', '7', '李小六', '', '15998407331');
INSERT INTO `t_phonebook` VALUES ('23', '8', '爱新觉罗玄烨', '', '15998008000');
INSERT INTO `t_phonebook` VALUES ('24', '9', '南越王赵佗', 'null', '0411-58290888');
INSERT INTO `t_phonebook` VALUES ('25', '10', '李鸿章', 'null', '5289036');
INSERT INTO `t_phonebook` VALUES ('26', '10', '艾薇儿', 'null', '5999399');
INSERT INTO `t_studynote` VALUES ('6', 'Servlet&JSP学习', 'admin', '8.2.1 与标签 1978.2.2 、与简介 1988.2.3 深入、与 2008.2.4 Model 1简介 2048.2.5 其他标准标签 2068.3 表达式语言(EL) 2078.3.1 EL简介 2078.3.2 使用EL访问属性 2108.3.3 EL隐含对象 2138.3.4 EL运算符 2148.3.5 EL函数的自定义 2158.4 综合练习/在线书签 2188.4.1 使用JSP实现“查看书签”页面 2188.4.2 使用JSP实现“添加书签”页面 2208.4.3 调整web.xml与其他源代码 2238.5 重点复习 226课后练习 229实训题 231第9章 使用JSTL与自定义标签 2339.1 JSTL的使用 2349.1.1 JSTL简介 2349.1.2 流程处理标签 2369.1.3 错误处理标签 2399.1.4 网页导入、重定向标签 2419.1.5 属性处理与输出标签 2429.1.6 URL处理标签 2459.2 Tag File自定义标签 2469.2.1 Tag File简介 2479.2.2 处理标签属性与主体 2499.2.3 TLD文件 2529.3 Simple Tag自定义标签 2539.3.1 Simple Tag简介 2549.3.2 架构与生命周期 2569.3.3 处理标签属性与主体 2599.3.4 与父标签的沟通 2639.3.5 TLD文件 2689.4 Tag自定义标签 2689.4.1 Tag简介 2699.4.2 架构与生命周期 2719.4.3 重复执行标签主体 2739.4.4 处理主体运行结果 2759.4.5 与父标签的沟通 2789.5 综合练习/在线书签 2819.5.1 在“查看书签”页面使用JSTL 2829.5.2 在“添加书签”页面使用JSTL 2829.6 重点复习 283课后练习 288实训题 291第10章 Web容器安全管理 29310.1 Web容器的安全管理 29410.1.1 Java EE安全的基本概念 29410.1.2 声明式基本验证 29710.1.3 容器基本验证原理 30210.1.4 声明式窗体验证 30310.1.5 容器窗体验证原理 30410.1.6 使用HTTPS保护数据 30510.1.7 编程安全管理 30910.2 综合练习/在线书签 31010.2.1 使用容器窗体验证 31010.2.2 设置服务器对应文件 31210.3 重点复习 313课后练习 315实训题 317第11章 整合数据库 31911.1 使用JDBC连接数据库 32011.1.1 JDBC简介 32011.1.2 数据库的连接 32411.1.3 使用DataSource取得连接 32811.1.4 Statement、ResultSet的使用 33211.1.5 PreparedStatement的使用 33711.2 综合练习/在线书签 33911.2.1 重构/创建DAO 34011.2.2 重构/修改BookmarkService 34411.2.3 设置JNDI部署描述 34611.2.4 添加“删除书签”功能 34711.3 重点复习 349课后练习 351实训题 353第12章 模式与重构 35512.1 设计模式 35612.1.1 Template Method模式(Gof设计模式) 35612.1.2 Intercepting Filter模式(Java EE设计模式) 35712.1.3 Model-View-Controller模式(架构模式) 35812.2 从重构中认识模式 36012.2.1 Business Delegate模式 36012.2.2 Service Locator模式 36112.2.3 Transfer Object模式 36112.2.4 Front Controller模式 36212.3 重点复习 363课后练习 365附录A NetBeans入门 367A.1 NetBeans IDE与Tomcat的安装 368A.2 Servlet的编写 370A.3 Web应用程序的部署和运行 373A.4 NetBeans工程的关闭和打开 375附录B Eclipse入门 377B.1 Eclipse与Tomcat的安装 378B.2 Servlet的编写 380B.3 Web应用程序的导出和执行 383B.4 Eclipse工程的关闭、删除和导入 386附录C MySQL入门 389C.1 MySQL的安装和设置 390C.2 MySQL的数据类型 391C.3 数据库和数据表的创建 393C.4 CRUD操作 394', '2013-03-13 23:32:19');
INSERT INTO `t_studynote` VALUES ('4', 'Oracle学习', 'admin', '通过阅读《Oracle学习笔记:日常应用、深入管理、性能优化》，读者可以了解Oracle 11g的体系结构、数据库管理和配置、数据库安全、数据库日常维护、PL/SQL语言等数据库管理员的必备常识，还可以掌握Oracle 11g的多种高级应用，包括数据库网络配置、作业调度、事务管理、内存和进程配置以及对Oracle数据库进行性能监测、分析和优化等。 　　《Oracle学习笔记:日常应用、深入管理、性能优化》内容丰富、注重实用，理论讲解与大量实验相结合，特别适用于Oracle数据库管理员和应用程序开发人员以及对相关技术感兴趣的读者阅读，也可以作为大中专院校或培训机构的相关课程教材。', '2013-03-13 23:29:57');
INSERT INTO `t_studynote` VALUES ('5', 'JSP与JDBC学习', 'admin', '《关键技术:JSP与JDBC应用详解》主要内容简介：JSP和JDBC是学习Java技术必须掌握的两项关键技术。JSP（Java Server Pages）是一种基于Java的Web开发语言，在目前的Web开发领域占有重要地位；JDBC（Java Database Connecdvity，Java数据库连接）是基于Java语言的数据库开发技术，它在保持简单性的同时，拥有很高的可靠性、可用性和可测性，相对传统的数据库开发，它可以显著地提高开发效率，并且有利于系统的维护和升级。 　　《关键技术:JSP与JDBC应用详解》循序渐进，从JSP基本概念入手，到应用框架的使用，讲述了如何使用JSP开发应用系统，包括：JSP基础知识、JSP的相关技术和JSP的实际开发应用；同时包括JDBC概述，JDBC开发环境及配置，JDBC3.0 API数据库开发基本操作，JDBC 3.0 API数据库开发高级操作，连接池与事务，JDBC在.Java Servlet中的应用，C／S架构数据库应用程序的开发，B／S架构数据库应用程序的开发，以及3个综合开发实例。 　　《关键技术:JSP与JDBC应用详解》语言上力求通俗易懂，通过大量的实例代码讲解对理论性知识进行说明，希望读者能够理论联系实际，在手工调试实例代码的同时，开发出自己的应用程序。 　　《关键技术:JSP与JDBC应用详解》定位于专业Java程序员的关键技术学习、提升图书；适合广大初、中级程序员，网页设计人员及高校学生阅读，还可作为专业程序员的培训教材。', '2013-03-13 23:31:06');
INSERT INTO `t_studynote` VALUES ('7', 'mySQL', 'admin', 'MySQL是一个小型关系型数据库管理系统，开发者为瑞典MySQL AB公司。在2008年1月16号被Sun公司收购。而2009年,SUN又被Oracle收购.对于Mysql的前途,没有任何人抱乐观的态度.目前MySQL被广泛地应用在Internet上的中小型网站中。由于其体积小、速度快、总体拥有成本低，尤其是开放源码这一特点，许多中小型网站为了降低网站总体拥有成本而选择了MySQL作为网站数据库。\r\n', '2013-03-13 23:33:00');
INSERT INTO `t_studynote` VALUES ('8', 'Hibernate', 'admin', 'Hibernate是一个开放源代码的对象关系映射框架，它对JDBC进行了非常轻量级的对象封装，使得Java程序员可以随心所欲的使用对象编程思维来操纵数据库。 Hibernate可以应用在任何使用JDBC的场合，既可以在Java的客户端程序使用，也可以在Servlet/JSP的Web应用中使用，最具革命意义的是，Hibernate可以在应用EJB的J2EE架构中取代CMP，完成数据持久化的重任。\r\n', '2013-03-13 23:33:51');
INSERT INTO `t_worknote` VALUES ('23', '0', '党员学习笔记', 'admin', '是指党员干部在进行党章、党纪、党规、党的业务知识及党员干部工作技能等的学习、教育、培训和工作时，方便随时记录重点内容所使用的书写载体。一般是指在党政机关和企、事业单位，由单位统一采购并配发给党员干部用于某项学习和工作的专用笔记本。 　　近几年来，在市面上也有专门适用于党员干部的《党员学习笔记》本出售，该笔记本不同于普通的书写笔记本，它最初由中国廉政建设网提出这一概念，并组织有关专家、学者经过精心设计策划和编排，将党员干部必学的知识和最新的党政法规政策进行认真筛选成小段，并编排在普通的书写笔记本每页的边角处所制作的专用笔记本，使普通的笔记本同时拥有了学习的功能，既是书写载体，又是学习资料，还可作为宣教工具，实现了一本多用的效果。 　　但是由于时事政策的不断变化，这种《党员学习笔记》本一般都具有一定的时效性，为保证所编内容能紧跟党政工作需要，通常每年都重新编排出版一次。例如“2010年《党员学习笔记》本”，就是在党员干部必学的新党章党纪、党的基本理论、党的历史、党员名句、形势教育等知识的基础上，增加深入贯彻科学发展观、《2009-2013年全国党员教育培训工作规划》、《关于实行党政领导干部问责的暂行规定》、《中国共产党巡视工作条例》等以及十七届四中全会内容进行编排出版的《党员学习笔记》本。科学发展观《党员学习笔记》本指专门用于深入学习实践科学发展观活动而给党员干部量身定做的笔记本，它是根据中央部署的科学发展观学习实践活动安排，由中国廉政建设网组织出版的学习实践科学发展观活动专用笔记本。该笔记本将科学发展观的各项学习要点筛选编辑成段，并编排在笔记本的边角处，以方便活动单位的党员干部宣传、学习和工作记录。为使其更实用，科学发展观《党员学习笔记》本还针对学习实践活动单位的层次不同，出版不同版本的笔记本，如“第三批科学发展观《党员学习笔记》本”，就是专门针对第三批学习实践活动单位的特点，在总结前两批学习经验的基础上而编排出版的，相对于参加第三批学习实践科学发展观活动的单位更为实用。', '2013-03-13 23:35:29');
INSERT INTO `t_worknote` VALUES ('20', '1', '星期四', 'admin', '今天是实习的第四天了，实习并没我想象的难。或许是我刚去吧，这几天一直都没有做什么很重要的事情，只是帮着林姐粘贴票据等原始凭证、整理些原始凭证之类。这与在学校里练习时粘贴凭证的方法和情况不太一样。在学校里练习时，都是将所得到的原始凭证直接粘贴到自己所作的会计凭证的背面；而在这里，都是先将原始凭证按日期摆放在一起，将它们按顺序用固体胶棒粘贴到一张大概有A4大小的原始凭证汇总表上，林姐还告诉我怎样贴才能使这些原始凭证粘的整齐又好看，而且使得汇总表的整张纸都被均匀贴满。\r\n在此之前，我一直都以为会计的实际操作会与学校里老师所教的、我们所见到的一模一样，我们所学的知识只是其中的一部分，许多东西并不是所想得那样一成不变，实际上，书本上的知识只是其中的一种，现实中所需要的会随着实际情况的变化而变化。\r\n', '2013-03-13 23:05:21');
INSERT INTO `t_worknote` VALUES ('21', '0', '星期五', 'admin', '按照上班时间来说这是这个星期的最后一天了，虽然一直在按时上班实习，但是会计工作本身就很轻松，加之又是实习还是一个循序渐进的了解、熟悉和学习的阶段，这些天也就很快过去了。感觉学习了好多东西，是从书本上学不到的，理论和实践还真是有些不同，还是很高兴很有成就感的。\r\n快下班时和林姐聊了一会儿有关实习的事情，不少人都在会计师事务所实习过一段时间，有些人自认为学到很多东西，也有些人觉得浪费时间的，其实不光是实习，学习、上班等许多方面的事情都有两面性，每个人都有自己的理解，其实关键还是在于自己如何把握！\r\n今天有些累了，要养精蓄锐，下个星期再接再厉。\r\n', '2013-03-13 23:05:45');
INSERT INTO `t_worknote` VALUES ('22', '1', '星期一', 'admin', '这星期的新的一天，新的开始。跟着林姐实习已经有一个星期了，上周作的都是些最简单的事情，主要是看、观察。今天，林姐告诉我说这个星期要教我电算化，就是在电脑上进行记帐，虽然公司的经营规模不大，但毕竟是****公司的下属单位，它的账务处理都是通过网络进行的。她先打开****公司的用于会计记账的专用网页，先让我在电脑上输入一些公司的相关文件。输完之后，就拿来了一些原始单据凭证，根据原始凭证记录登记记帐凭证。虽然不是自己登记，但是林姐每作一次都向我讲清楚，慢慢的看得多了，我也就觉得不是那么糊涂不清了。\r\n', '2013-03-13 23:06:07');
INSERT INTO `t_worknote` VALUES ('24', '0', '党建工作', 'admin', '党员学习笔记》《党建工作日历》征订通知 　　为深入学习实践科学发展观，学习贯彻十七届四中全会精神，落实《2009-2013年全国党员教育培训工作规划》，切实加强党内民主建设及党员教育培训的针对性和实效性，使广大党员的理想信念进一步坚定、党性观念进一步增强、优良作风进一步养成、工作能力进一步提高、先锋模范作用进一步发挥，中国廉政建设网特组织有关专家学者精心策划编排了《党员学习笔记》和《党建工作日历》。 　　《党员学习笔记》和《党建工作日历》紧紧围绕深入学习实践科学发展观、“加强党的执政能力建设、打造学习型政党”的主题，以工作笔记本和日历作为载体，以十七届四中全会精神、学习实践科学发展观、党章和党的基本理论、党的基本知识、党的历史、党的路线方针政策和形势任务教育，法律法规和党风党纪教育，业务知识和技术技能等为内容进行创作编排，是贯彻十七届四中全会精神和党员教育培训的创新形式和有效工具，其具有以下特点： 　　宣传广泛深入——以广泛使用的工作笔记本和日历为载体，将所要学习内容贯穿其中，达到宣传教育“广泛深入”的目的。 　　学习具有计划性和条理性——把“科学发展观学习、十七届四中全会精神和党员教育培训任务内容”等有序地划分为小单元，精心编排，既美观大方，又方便实用，在学习讨论和平时的工作生活中即可记下学习心得和体会。《党建工作日历》以十七届四中全会精神、学习实践科学发展观、党章和党的基本理论、党的基本知识、党的历史、党的路线方针政策和形势任务教育，法律法规和党风党纪教育，业务知识和技术技能等为内容进行创作编排，内容丰富，实用。 　　一举三得 经济实用——《党员学习笔记》和《党建工作日历》均赋予了传统工作笔记本和日历新的内涵和意义，既是科学发展观学习和党员教育培训的宣传品，又是学习材料和学习工具，一举三得，与普通的宣传教育用品相比更实用，更有价值。 ', '2013-03-13 23:35:59');
INSERT INTO `t_worknote` VALUES ('25', '0', '2011年工作笔记', 'admin', '党员学习笔记》《党建工作日历》征订通知 　　为深入学习实践科学发展观，学习贯彻十七届四中全会精神，落实《2009-2013年全国党员教育培训工作规划》，切实加强党内民主建设及党员教育培训的针对性和实效性，使广大党员的理想信念进一步坚定、党性观念进一步增强、优良作风进一步养成、工作能力进一步提高、先锋模范作用进一步发挥，中国廉政建设网特组织有关专家学者精心策划编排了《党员学习笔记》和《党建工作日历》。 　　《党员学习笔记》和《党建工作日历》紧紧围绕深入学习实践科学发展观、“加强党的执政能力建设、打造学习型政党”的主题，以工作笔记本和日历作为载体，以十七届四中全会精神、学习实践科学发展观、党章和党的基本理论、党的基本知识、党的历史、党的路线方针政策和形势任务教育，法律法规和党风党纪教育，业务知识和技术技能等为内容进行创作编排，是贯彻十七届四中全会精神和党员教育培训的创新形式和有效工具，其具有以下特点： 　　宣传广泛深入——以广泛使用的工作笔记本和日历为载体，将所要学习内容贯穿其中，达到宣传教育“广泛深入”的目的。 　　学习具有计划性和条理性——把“科学发展观学习、十七届四中全会精神和党员教育培训任务内容”等有序地划分为小单元，精心编排，既美观大方，又方便实用，在学习讨论和平时的工作生活中即可记下学习心得和体会。《党建工作日历》以十七届四中全会精神、学习实践科学发展观、党章和党的基本理论、党的基本知识、党的历史、党的路线方针政策和形势任务教育，法律法规和党风党纪教育，业务知识和技术技能等为内容进行创作编排，内容丰富，实用。 　　一举三得 经济实用——《党员学习笔记》和《党建工作日历》均赋予了传统工作笔记本和日历新的内涵和意义，既是科学发展观学习和党员教育培训的宣传品，又是学习材料和学习工具，一举三得，与普通的宣传教育用品相比更实用，更有价值。 ', '2013-03-13 23:39:06');
INSERT INTO `t_worknote` VALUES ('26', '0', '记好自己的工作笔记', 'admin', '原湖北省宣恩县椿木营乡民政助理周国知，从聘为国家干部到去世前的近20年时间里，共留下了23本、几十万字的工作笔记，在他的那些大小不一的笔记本里，详细记录了作者生前包括业务学习、乡情调查、财务账目、工作出勤等方面的具体情况。他的笔记，记录工整，字迹清晰，一丝不苟，令人感动。 \r\n　　周国知的工作笔记，映射出的是一名党的基层干部细致入微、不怕艰苦的工作作风，心系群众、甘于奉献的公仆情怀以及廉洁奉公、严于律己的崇高品德。他的笔记，可以说是当前教育和引导党员干部，特别是广大基层干部不断加强自身修养、提高执政能力的生动教材。 \r\n\r\n　　应该看到，当前许多干部，包括一些直接和人民群众打交道的基层干部，他们已经不愿意或者说已不屑于像周国知那样记工作笔记，除了开会、听领导指示象征性地记一下笔记外，已经很少真正能够深入工厂，深入田间地头，深入基层，深入到人民群众中间，用他们手中的笔记本认真听取记录群众的意见和建议，记录工作中存在的缺陷和问题；也很少能抽出时间踏下身来，静下心来一个人认真学习，反思工作，自查思想，记下即时产生的经验和教训。从根本上说，这是他们缺乏公仆意识，缺乏工作责任心，缺乏对群众真情的体现。他们关注点已经转移，关注的是官场、名利场中的利害关系，关心的是领导的态度和动向，热衷的是各种名目繁多的应酬。难怪有的基层群众说，“干部就是开会，工作就是收费。”群众还说，过去的干部是早上一身露水、中午一身汗水、晚上一身泥水，现在的干部是早上一肚子茶水、中午一肚子油水、晚上一肚子酒水。虽然群众讽刺的这些行为可能不是主流，但它动摇了党的执政基础，破坏了群众对党的信任，其危害是严重的。同时，如果身为干部者疏于学习，放松自我，追逐名利，贪图享受，缺乏自省，最终导致的，可能是身心懈怠、身败名裂，身陷囹圄。 \r\n\r\n　　个人笔记，包括工作笔记，具有很强的个性，透过一个干部的笔记，可以看出他的作风、思想、道德、情趣，可以看出他的关注点在哪里。虽然现在社会和人们的观念已经发生了深刻变化，但那些心系工作和百姓，常常带着笔记本到基层和群众中间，作风朴实，愿与人民群众打成一片的好干部，人民群众是永远拥护和怀念的。愿我们的党员干部应多记工作笔记，用它多记人民群众的呼声，多总结自己工作上的经验教训，多记录自己为官为人的反思，多记致富发展之良方。以此不断提醒和勉励自己常怀爱民之心，常思富民之策，常修为政之德。愿记好工作笔记重新成为每一个干部的好习惯，促进干部工作作风的转变。\r\n', '2013-03-13 23:39:55');
INSERT INTO `t_worknote` VALUES ('19', '0', '星期三', 'admin', '公司的财务部门只有一名专职会计，是一位姓林的年轻女会计，因为她也是从*****大学毕业的，出来工作也才几年，因此我们很快便聊得很熟了。我就是跟着她进行实习的。因为产假不是很长，便挺着大肚子一直工作到现在。虽然我对于公司的情况已经不陌生了，但是他还是很负责任的利用了整个上午的宝贵时间，向我详尽讲述了公司的发展历程、业务范围、部门分工等情况，可能是公司经营规模小，财务部的出纳和其他人员都是其他部门人员兼任的，只有在有工作需要的时候才会出现，因此办公室里固定人员很少。\r\n', '2013-03-13 23:04:48');
INSERT INTO `t_xinqing` VALUES ('1', '最近心态有点不好，似乎总觉得自己进入了一张网中，挣不脱又撕不开。 \r\n\r\n每天晚上睡觉总是梦境连连 ，似乎有种急于挣脱开某些事一样，早上醒来却又记不住。 \r\n\r\n    每个人每时每刻总处于选择中，但却不知道你的选择是对还是错？ \r\n\r\n彷徨，此刻的心情是彷徨的.。\r\n', '2013-03-13 12:55:19');
INSERT INTO `tb_class` VALUES ('10', 'QQ号', '好友QQ号');
INSERT INTO `tb_class` VALUES ('8', '手机号码', '查看手机号码');
INSERT INTO `tb_class` VALUES ('9', '电话号码', '查看电话号码');
INSERT INTO `user` VALUES ('2', 'admin', 'admin', '0');
INSERT INTO `wenzhang` VALUES ('20', '0', '失落', 'admin', '心情还是很失落，现在不爱呆在办公室里，不喜欢吵吵嚷嚷的，现在喜欢上了呆在家里写日记，只有这个日记本才是我心灵的港湾。 \r\n    工作还是提不起来一点儿劲儿来，只想快点下班回家。独自一个人，听听音乐！他几天都没理我了，他是否真的决定放手了，就不想挽回吗？唉！！！他如此对我了，我心里还是放不下来，现在我真的还放不下来，我期待他能看到我写的日记，我期待他给我发个短信，我期待他给我打个电话，我期待我们能有将来。小廉姐说，你如果真还想和他一起，放不下，你就给他打电话吧！可是我，，我不知道他心里还有没有我，我不知道到底爱不爱我了？钱生说，你不先和他说话，他也不先和你说话，万一就这样错过了一辈子自己喜欢的人，那多可惜啊！可是我，，我真的不知道，我现在也没有勇气找他了，因为我真的没有把握他心里还有没有我，所以，我选择沉默与等待。。。。。我期待有一天，他给我说，叔叔阿姨同意我结婚了，我很盼望会有这样的奇迹发生。不知道上天会不会怜惜我。找到一个自己能托付终生的，愿意嫁给他的，真的不容易，真的不愿意就这样因为周易而把我们的缘份尽了。而且，也有好几个先生都算了我们并没有什么，并没有我想象的那么严重，我真的不知道叔叔找人算的那个到底是多严重的后果。我真的不知道。。。我想即使那样，肯定有解决的办法，选个好日子，什么房子方位什么的，用喜神去冲掉，只有愿意让我们在一起，总会有办法的。我不知道为什么长辈们就那么恨心的让我们那么伤心，让我们这么痛苦。或者，他们想着，与其我们现在痛苦好比将来痛苦轻得多吧。可是，将来的事，谁也无法预料，难道先生说的，就一定一定会发生吗？可是，如果，明天就地震了，我们再合，还不是一样难逃？？ \r\n    为什么叔叔阿姨那么恨心？之前不是挺喜欢我的吗？就这么恨心的，全家都一致，就把我一个丢下？让我一个人伤心伤痛？你们的儿子就是孩子，别人的就不是人是吗？可以随便要就要，不要就不要？可以随便去伤害别人的心的吗？为什么人会变得那么快？？为什么可以这么冷血？？我的这些伤痛，你们都可以全然不顾，霓儿，你也是，你也全然不顾。。一句安慰都没有。。我也可以让你想要就要不要就算了吗？看来你真的是得到得太容易了，你真的一点都不会珍惜，真的真的真的。。。写到这里我的心又开始隐隐作痛，喉咙又硬了，视线也变得模糊了。。。。 \r\n', '2013-03-13 20:48:43');
INSERT INTO `wenzhang` VALUES ('19', '2', '留一份感动在心间', 'admin', '在我们每一个人的生命历程中，都会有那么一刻，因某事、某情、某景，某人而感动落泪，而刻骨铭心。\r\n\r\n　　在时空的长河里，也许只是一刹那，也许有那么一瞬间，我们心中最脆弱的部分为之震颤，最柔情的部分为之濡湿，最悲悯的部分为之牵系，最坚强的部分为之振奋。\r\n\r\n　　一瞬间难挡岁月风尘，一刹那难留岁月容颜。然而，就在那一瞬间、一刹那，一次触动心灵的感动，却可以成为人生的永恒。\r\n\r\n　　感动啊，感动其实就是你生活中那一丝最质朴、最平凡的触动。\r\n\r\n　　当你被生活的繁琐和工作的劳累，疲惫了自己的心灵，一杯飘洒着芳香的氤氲清茶，轻轻放在你的面前，一句关心体贴的温暖话语，轻轻回荡在你的耳畔。你心中的感动是她。\r\n\r\n　　当你行尘满身，沧桑疲惫时，一栋燃着温暖的炉火，酒香四溢的客栈出现在你的眼帘，你心中的感动也是她。\r\n\r\n　　当你正失意地泊船瓜州“江枫渔火对愁眠”的时候，收到快马加鞭的信使递与你的一枝梅花，感受到“江南无所有，聊寄一枝春”的暖流涌动，是她。\r\n\r\n　　当你认定远游的生活是自由的，母亲将你唤到身边，将她的白发与皱纹缝进你的行囊，密密匝匝，你心中的感动还是她。\r\n\r\n　　感动太美丽了，它是心在旅途中的一次加油，是心在浑浊而麻木的表皮下的一阵深深地战栗。\r\n\r\n　　感动，在你的生活中无处不在。\r\n\r\n　　感动也许只是人类复杂多变的情感活动中最短暂的一个章节，然而却短暂的不同凡响。就像一片叶子从萌芽到伸展出生命的脉络，尽管叶子是生命中微不足道的一部分，但触动的却是整整一个季节。\r\n\r\n　　常常感动的人，是生活的智者。他们的心脉与大地山川、江河湖海，鱼虫鸟兽，人类众生，都息息相连。他们在这些触动心灵的感动中，生发出对天地、人生的感悟，汲取到人生的营养及生存的动力。\r\n\r\n　　懂得感动个人，实际上就是那些懂得在生活的缝隙里，在命运的跌宕处寻找阳光、温暖和力量的人。\r\n\r\n　　容易被生活感动的人，心底是善良的人。人类的爱，就是从善良的心底升起一片片彩云，如果没有感动，这篇彩云就不会最终化作甘霖，滋润出心灵的春天。\r\n\r\n　　感动是人生最美好的情感，他是一杯用自我情感浸泡出来的智慧茶，清淡却蕴含着生活最淳朴的哲理。\r\n\r\n　　或许，若干年之后，你会因为彼时此刻的感动，而留下一段刻骨铭心的回忆，你会因为生活中一刹那的感动，而辉煌了你的人生。\r\n\r\n　　在生命的长河中，也许我们是无谓的；但不论你在何时何地，能留一份感动在你心间，生命的记忆里，我们就可以创造永恒。\r\n', '2013-03-13 23:36:56');
INSERT INTO `wenzhang` VALUES ('21', '10', '坚持，努力，去创造奇迹！', 'admin', '坚持，努力，去创造奇迹！ \r\n     \r\n     \r\n     \r\n    1.今天最有趣的事是什么？ \r\n     \r\n     答：我坐在电热毯床上，暖暖的，嘴里嚼着甜干馍片。 \r\n     \r\n     早上还没吃饭呢。 \r\n     \r\n     咪咪卧在毛毯上，眼睛盯着我，且含情脉脉，暗送秋波。 \r\n     \r\n    2、今天最开心的事是什么？ \r\n     \r\n     答：春天卖了478元，数一，还是数二？ \r\n     \r\n     \r\n     \r\n     法院一朋友，会带来好消息吗？ \r\n     \r\n    3、今天的教训是什么？ \r\n     \r\n     答：坚持，努力，去创造奇迹！ \r\n     \r\n     春天要好好点货，每次星期一。 \r\n     \r\n     坚持要养成好习惯！ \r\n', '2013-03-13 20:50:19');
INSERT INTO `wenzhang` VALUES ('22', '0', '坚持努力，和奋斗！\\', 'admin', ' 坚持努力，和奋斗！ \r\n     \r\n     \r\n     \r\n    1.今天最有趣的事是什么？ \r\n     \r\n     答：咪咪跑到门口，她“喵喵”轻叫着，我把门打开，她很快飘出去了。 \r\n     \r\n     瞧，她都会说话了，清楚表达她真切的意思了。 \r\n     \r\n    2、今天最开心的事是什么？ \r\n     \r\n     答：卖了780元，春天卖了360元。 \r\n     \r\n     坚持努力，和奋斗！ \r\n     \r\n    3、今天的教训是什么？ \r\n     \r\n     答：汪峰应该授权【旭日阳刚】再唱春天里，可以收版费。否则，再好听的歌，没人敢唱，没人传诵，如何把音乐发扬光大呢？太可惜了，本来也应去美国唱春天里，对国家的形象也好呀！ \r\n     \r\n     \r\n     \r\n     说句难听的，王旭唱春天里，比汪峰还要好听，更沧桑，更震撼，更美丽！ \r\n     \r\n     \r\n     \r\n     2011、2、18 农历正月十六 五 晚23：22 “如花美眷，似水流年” \r\n', '2013-03-13 20:50:48');
INSERT INTO `wenzhang` VALUES ('23', '0', '最近心情', 'admin', '最近心情已经平复很多想明白了很多事情只是仍感疲惫偶尔会有力不从心的感觉不知道是不是最近桃花泛滥接二连三的遇人表白习惯了清幽的日子一时之间还有些惊愕。。也许有时的我的确是个不甘寂寞的人可我了解自己现在需要的是什么，该做的是什么。。所以，或委婉或干脆的做了了断``每个人对我其实都很好可我清楚的知道我于他们每个人都不合适若真伤了他们，也实非我所愿想到他们可能从此之后就消失在我的生活中成为一闪而过的路人甲心底也会闪过一丝落寞。。可我没权利要求他们继续陪在我身边，继续做我的朋友扮演那个在我不开心的时候会被我拿来当沙包、出气筒的角色即使他们愿意，我也不愿！唉！能做朋友的，就做朋友吧；不能的，也祝你们快乐！突然有些想念那个曾陪伴我一年，给我无数温暖的人不知他现在可好？也不知他是否会想起我这个曾陪伴他一年偶尔乖巧、偶尔娇蛮的女子曾经的伤痛怨恨，已随时间流逝留下的，只是美好的记忆。。也许终究是没有走出那场美丽每每疲惫不堪的时候，都会默默想念想曾经的一切……虽然，一切，都只是曾经。。可若这曾经的一起能给我些坚持的力量想来，也不算是坏事吧？他也许永远都不会知道我们照过的唯一的一版大头贴至今，都仍带在我的钱包里每每累到不行，累到想哭的时候它，是安抚我情绪的良药虽然考研的日子单调而且枯燥也许，我仍可以安然走过现在的我很知足身边有好朋友陪着我曾经以为就那样疏远了的朋友也都在默默关心着我的一切呵呵。。这样，其实也是一种幸福~恩，是的，我其实很幸福！', '2013-03-13 21:04:51');
INSERT INTO `wenzhang` VALUES ('24', '1', '最近心情随笔', 'admin', '突然变得很敏感，在意别人也许无心的一个态度或者一句话！\r\n哎......北京，承载着我的梦想，确实让我也体会到了什么叫做压力！\r\n我有想过逃避，虽然有很多人或多或少的奉承着我，说我多么有能力~\r\n有人说过：当一个人变得睿智了她会失去单纯\r\n          当一个人...\r\n我知道，我非常清楚很多时候很多事情必须一个人面对、一个人承受\r\n但是我总是想找个寄托，我用自己还年轻还很幼稚来颓唐！\r\n我爱一个人，她永远当我是孩子，包容我任何的错误，她从来没有\r\n向我发过脾气，没有责骂过我......她为我奉献，不计得失。那时\r\n我还小，我不知道我爱她。\r\n当我知道我爱她的时候，她离开我了......\r\n我以为自己很精明，做什么事都爱为自己留条后路\r\n但是有时候，当我真的想回头了才发现那是一条死路\r\n写到这里，休息了.....\r\n', '2013-03-13 21:05:40');
