/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.47 : Database - picc
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`picc` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `picc`;

/*Table structure for table `authority` */

DROP TABLE IF EXISTS `authority`;

CREATE TABLE `authority` (
  `aid` int(11) NOT NULL,
  `aname` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `aurl` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `adesc` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `mid` int(11) DEFAULT NULL,
  PRIMARY KEY (`aid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

/*Data for the table `authority` */

insert  into `authority`(`aid`,`aname`,`aurl`,`adesc`,`mid`) values (1,'酒后代价工单新增','drink/add.html','新增工单页面',5),(2,'酒后代价工单删除','drink/delOneById','根据id删除工单',5),(3,'酒后代价工单修改','drink/updateById','根据id修改工单',5),(4,'酒后代价工单审批','drink/approveById','根据id审批工单',5),(5,'酒后代价工单驳回','drink/refuseById','根据id拒绝工单',5),(6,'酒后代价工单领取','drink/getById','根据id领取',5),(7,'酒后代价工单处理','drink/dealById','根据id处理',5),(8,'车主秘书工单新增','car_secretary/add.html','新增工单页面',4),(9,'车主秘书工单审批','car_secretary/approveByID',' 根据id审批工单',4);

/*Table structure for table `check_car` */

DROP TABLE IF EXISTS `check_car`;

CREATE TABLE `check_car` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `custourId` int(11) NOT NULL,
  `carCode` varchar(20) NOT NULL,
  `userid` int(11) NOT NULL,
  `submitType` int(11) NOT NULL,
  `proveType` int(11) NOT NULL,
  `doType` int(11) NOT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `check_car` */

insert  into `check_car`(`cid`,`custourId`,`carCode`,`userid`,`submitType`,`proveType`,`doType`) values (1,9,'冀A88888',3,0,0,0),(2,10,'冀A48921',3,1,0,0),(3,11,'冀A48922',3,1,1,0),(4,12,'冀A48923',3,1,1,1),(5,13,'冀A48924',3,1,1,2),(6,14,'冀A48925',3,0,2,0),(7,15,'冀A88888',6,0,0,0),(8,16,'冀A48921',6,1,0,0),(9,17,'冀A48922',6,1,1,0),(10,18,'冀A48923',6,1,1,1),(11,19,'冀A48924',6,1,1,2),(12,20,'冀A48925',6,0,2,0),(13,21,'冀A88888',7,0,0,0),(14,22,'冀A48921',7,1,0,0),(15,23,'冀A48922',7,1,1,0),(16,24,'冀A48923',7,1,1,1),(17,25,'冀A48924',7,1,1,2),(18,26,'冀A48925',7,0,2,0);

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `dName` varchar(20) DEFAULT NULL,
  `dlevel` int(11) DEFAULT NULL,
  `superid` int(11) DEFAULT NULL,
  PRIMARY KEY (`did`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `department` */

insert  into `department`(`did`,`dName`,`dlevel`,`superid`) values (1,'省分公司',1,NULL),(2,'石家庄分公司',2,1),(3,'邯郸分公司',2,1),(4,'长安区包组',3,2),(5,'桥西区包组',3,2),(6,'三个石头组',4,5),(7,'飞龙组',4,5);

/*Table structure for table `designated` */

DROP TABLE IF EXISTS `designated`;

CREATE TABLE `designated` (
  `dgId` int(11) NOT NULL AUTO_INCREMENT COMMENT '酒后代驾ID',
  `userId` int(11) NOT NULL COMMENT '录入人ID',
  `company` varchar(20) DEFAULT NULL COMMENT '所属公司',
  `customerName` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `telephone` varchar(20) DEFAULT NULL COMMENT '电话号码',
  `licensePlate` varchar(20) NOT NULL COMMENT '车牌号',
  `location` varchar(20) DEFAULT NULL COMMENT '所在地',
  `destination` varchar(20) DEFAULT NULL COMMENT '目的地',
  `appointmentTime` datetime DEFAULT NULL COMMENT '预约代价时间',
  `threeInOne` int(1) NOT NULL DEFAULT '0' COMMENT '三合一，(0否,1是)',
  `clickType` int(1) NOT NULL DEFAULT '0' COMMENT '点选卡消费类型(0 单次,1 服务权益)',
  `submission` int(1) NOT NULL DEFAULT '0' COMMENT '是否提交,(0 未提交,1 提交)',
  `handle` int(1) NOT NULL DEFAULT '0' COMMENT '是否处理(0 未处理, 1已处理)',
  `state` int(1) NOT NULL DEFAULT '1' COMMENT '状态（0 注销,1 启用）',
  `reject` int(1) NOT NULL DEFAULT '0' COMMENT '是否驳回(0 驳回,1 未驳回)',
  `rejectInformation` varchar(100) DEFAULT NULL COMMENT '驳回信息',
  `approval` int(1) NOT NULL DEFAULT '0' COMMENT '0未审批，1已审批',
  `lingqu` int(1) NOT NULL DEFAULT '0' COMMENT '0未领取，1领取',
  PRIMARY KEY (`dgId`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `designated` */

insert  into `designated`(`dgId`,`userId`,`company`,`customerName`,`telephone`,`licensePlate`,`location`,`destination`,`appointmentTime`,`threeInOne`,`clickType`,`submission`,`handle`,`state`,`reject`,`rejectInformation`,`approval`,`lingqu`) values (1,3,'河北','王玉','13930042704','冀A2232','石家庄桥西区','石家庄裕华区','2019-04-12 00:00:00',1,1,1,1,2,0,'输入的信息有误',1,1),(2,3,'山东','李四','13283121063','冀A3323','石家庄桥西区','石家庄裕华区','2019-04-11 18:40:39',1,0,1,0,1,1,'输入的信息有误',1,0),(3,9,'石家庄','阿三','13283121065','冀A5858','石家庄','天津','2019-04-13 00:00:00',0,0,0,0,1,0,NULL,1,1),(4,9,'石家庄','赵飞','13730006588','石家庄','石家庄','石家庄','2019-04-13 00:00:00',1,0,1,1,2,0,NULL,1,1),(5,9,'石家庄','啊是大','阿三','啊是大','啊是大',' 啊是大','2019-04-12 00:00:00',0,0,0,0,1,1,'1',1,0),(6,9,'石家庄','李紫迎','17831125352','冀ABCDE','石家庄裕华区','石家庄桥西区','2019-04-22 15:41:40',0,1,0,0,0,0,NULL,0,0),(11,9,'石家庄','1','1','1','1','1','2019-04-22 16:14:13',0,0,1,0,0,0,NULL,0,0);

/*Table structure for table `menu` */

DROP TABLE IF EXISTS `menu`;

CREATE TABLE `menu` (
  `mid` int(11) NOT NULL,
  `mname` varchar(255) DEFAULT NULL,
  `mdesc` varchar(255) DEFAULT NULL,
  `murl` varchar(255) DEFAULT NULL,
  `mlevel` int(11) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  PRIMARY KEY (`mid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `menu` */

insert  into `menu`(`mid`,`mname`,`mdesc`,`murl`,`mlevel`,`pid`) values (1,'系统信息','管理用户及权限等信息','system/main.html',1,NULL),(2,'用户管理','管理用户信息','SystemInformation/System.html',2,1),(4,'车主秘书','管理车主秘书信息','car_secretary/main.html',1,NULL),(5,'酒后代价','管理酒后代价信息','afterdrink_drivecar/main.html',1,NULL),(6,'待检车','管理待检车信息','check_car/main.html',1,NULL),(7,'数据报表','查看各个业务的数据信息','report/main.html',1,NULL),(8,'车主秘书业务管理','展示车主秘书的数据','OwnerSecretary/Secretary.html',2,4),(9,'新车拍照批改','展示拍照批改的数据','report/update_car.html',1,NULL),(10,'新车牌照批改业务管理',NULL,'NewCarPhotoCorrection/licenceHandle.html',2,9),(11,'新车牌照批改业务处理',NULL,'NewCarPhotoCorrection/licence.html',2,9),(12,'代检车业务管理',NULL,'SubstituteVehicle/management.html',2,6),(13,'酒后代驾业务管理',NULL,'Designated/Driving.html',2,5),(14,'酒后代驾业务处理',NULL,'Designated/DrivingHandle.html',2,5),(15,'代检车业务处理',NULL,'SubstituteVehicle/Substitute.html',2,6),(16,'数据清单',NULL,'DataReport/Listofdata .html',2,7),(17,'数据汇总',NULL,'DataReport/DataAggregation.html',2,7),(18,'数据分析',NULL,'DataReport/DataAnalysis.html',2,7),(19,'车主秘书审批',NULL,'OwnerSecretary/OwnerSecretaryApproval.html',2,4),(20,'新车拍照批改审批',NULL,'NewCarPhotoCorrection/licenceApproval.html',2,9),(21,'酒后代驾审批',NULL,'Designated/DesignateApproval.html',2,5),(22,'代检车业务审批',NULL,'SubstituteVehicle/SubstituteApproval.html',2,6);

/*Table structure for table `mishu` */

DROP TABLE IF EXISTS `mishu`;

CREATE TABLE `mishu` (
  `msId` int(11) NOT NULL AUTO_INCREMENT COMMENT '车主秘书id',
  `userId` int(11) NOT NULL COMMENT '录入人id',
  `company` varchar(20) NOT NULL COMMENT '所属公司',
  `customerName` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `telephone` varchar(20) DEFAULT NULL COMMENT '电话号码',
  `licensePlate` varchar(20) NOT NULL COMMENT '车牌号',
  `plateColor` int(11) DEFAULT NULL COMMENT '车牌颜色，1蓝2绿3黄',
  `threeInOne` int(11) NOT NULL COMMENT '是否三合一',
  `state` int(11) NOT NULL COMMENT '状态，1启用0注销2完成',
  `submission` int(11) NOT NULL DEFAULT '0' COMMENT '是否提交',
  `reject` int(1) NOT NULL DEFAULT '0' COMMENT '是否驳回',
  `rejectInformation` varchar(100) DEFAULT NULL COMMENT '驳回信息',
  `approval` int(1) NOT NULL DEFAULT '0' COMMENT '0未审批，1已审批',
  PRIMARY KEY (`msId`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `mishu` */

insert  into `mishu`(`msId`,`userId`,`company`,`customerName`,`telephone`,`licensePlate`,`plateColor`,`threeInOne`,`state`,`submission`,`reject`,`rejectInformation`,`approval`) values (1,6,'石家庄','张三定期维权','17831125352','冀A2232',3,0,0,1,0,NULL,0),(2,3,'石家庄','李四','17831125353','冀A3323',2,0,1,1,0,NULL,0),(3,6,'石家庄','王五','17831125354','冀H3332',3,0,1,0,1,NULL,0),(4,3,'石家庄','李四','17831125353','冀A3323',2,0,1,0,1,NULL,0),(5,6,'石家庄','王五六','17831125354','冀H3332',1,1,1,1,0,NULL,0),(6,3,'石家庄','李四','17831125353','冀A3323',2,0,1,1,0,NULL,0),(7,6,'石家庄','王五','17831125354','冀H3332',1,1,1,1,0,NULL,0),(8,3,'石家庄','李四','17831125353','冀A3323',2,0,2,1,0,NULL,1),(9,6,'石家庄','王五','17831125354','冀H3332',1,1,1,0,1,'不合格',0),(10,3,'石家庄','李四','17831125353','冀A3323',2,0,1,0,0,NULL,0),(11,6,'石家庄','王五','17831125354','冀H3332',1,1,2,1,0,NULL,1),(12,1,'石家庄','李佳威','18232074461','冀A8888',3,1,0,0,0,NULL,0),(13,9,'石家庄','李佳威','17831125325','冀A7777',2,0,1,0,0,NULL,0),(14,9,'石家庄','oh克己奉公i','12345678909','冀A3344',2,0,1,0,0,NULL,0);

/*Table structure for table `newcar` */

DROP TABLE IF EXISTS `newcar`;

CREATE TABLE `newcar` (
  `ncId` int(11) NOT NULL AUTO_INCREMENT COMMENT '新车牌照批改主键',
  `userId` int(11) NOT NULL COMMENT '录入人id',
  `company` varchar(20) DEFAULT NULL COMMENT '公司地区',
  `customerName` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `telephone` varchar(20) DEFAULT NULL COMMENT '电话号码',
  `licensePlate` varchar(20) NOT NULL COMMENT '车牌号',
  `crossStrength` varchar(20) DEFAULT NULL COMMENT '交强保单号',
  `business` varchar(20) DEFAULT NULL COMMENT '商业险包单号',
  `insuredType` int(1) NOT NULL COMMENT '被保险人类型,0个人1公司',
  `submission` int(1) NOT NULL COMMENT '是否提交，1已提交0未提交',
  `approval` int(1) NOT NULL DEFAULT '0' COMMENT '是否批改,0未批改1已批改',
  `reject` int(1) NOT NULL DEFAULT '0' COMMENT '是否驳回(0未驳回，1已驳回)',
  `rejectInformation` varchar(100) DEFAULT NULL COMMENT '驳回信息',
  `receive` int(1) NOT NULL DEFAULT '0' COMMENT '是否领取(0未领取，1已领取)',
  `handle` int(1) NOT NULL DEFAULT '0' COMMENT '是否处理（0未处理，1已处理）',
  `state` int(1) NOT NULL COMMENT '状态（0注销1启用2完成3异常）',
  `abnormal` int(1) NOT NULL DEFAULT '0' COMMENT '异常（0未异常，1异常）',
  PRIMARY KEY (`ncId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `newcar` */

insert  into `newcar`(`ncId`,`userId`,`company`,`customerName`,`telephone`,`licensePlate`,`crossStrength`,`business`,`insuredType`,`submission`,`approval`,`reject`,`rejectInformation`,`receive`,`handle`,`state`,`abnormal`) values (1,9,'秦皇岛','李华','18765524382','冀A6666','sqx34343434','syx32343243',0,1,1,0,'微风',1,0,3,1),(2,9,'唐山','张三丰','19876543218','冀A8888','sqx12121212','syx34567898',0,1,1,0,NULL,0,0,1,0),(3,9,'石家庄','李佳威','18765789235','冀A8848','sqx22334455','syx66778899',0,1,1,0,'不收',1,1,2,0),(4,9,'石家庄','王小五','18888888888','冀A6666','syw19999999','syx18888888',0,0,0,0,NULL,0,0,1,0),(5,9,'石家庄','么么哒','12222222222','冀A1111','syw88888888','syx00000000',0,0,0,0,NULL,0,0,1,0),(6,9,'石家庄','王大大','11111111111','冀D6666','syw12333234','syx00000000',0,0,0,0,NULL,0,0,1,0),(7,9,'石家庄','王大大','11111111111','冀A1111','syw12333234','syx00000000',0,0,0,0,NULL,0,0,1,0),(8,9,'石家庄','李小雅','12345678900','冀A1234','syw12341234','syx12344321',0,0,0,0,NULL,0,0,1,0),(9,9,'石家庄','李小雅','12345678900','冀B1234','syw12341234','syx12344321',0,0,0,0,NULL,0,0,1,0),(10,9,'石家庄','李小雅','12345678900','冀C1234','syw12341234','syx12344321',0,1,1,0,NULL,0,0,1,0);

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `rname` varchar(20) NOT NULL,
  `rdec` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`rid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `role` */

insert  into `role`(`rid`,`rname`,`rdec`) values (1,'超级管理员','负责整个系统的管理与维护'),(2,'组织管理员','查看所在部门的信息'),(3,'组长','管理整个小组'),(4,'报案员','负责提报信息'),(5,'调度员','负责处理业务');

/*Table structure for table `roleauthority` */

DROP TABLE IF EXISTS `roleauthority`;

CREATE TABLE `roleauthority` (
  `raid` int(11) NOT NULL,
  `roleid` int(11) DEFAULT NULL,
  `aid` int(11) DEFAULT NULL,
  PRIMARY KEY (`raid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

/*Data for the table `roleauthority` */

insert  into `roleauthority`(`raid`,`roleid`,`aid`) values (1,1,1),(2,1,2),(3,1,3),(4,1,4),(5,1,5),(6,1,6),(7,1,7),(8,3,4),(9,3,5),(10,4,1),(11,4,2),(12,4,3),(13,5,6),(14,5,7),(15,4,8),(16,3,9);

/*Table structure for table `rolemenu` */

DROP TABLE IF EXISTS `rolemenu`;

CREATE TABLE `rolemenu` (
  `rmid` int(20) NOT NULL,
  `roleid` int(20) DEFAULT NULL,
  `mid` int(20) DEFAULT NULL,
  PRIMARY KEY (`rmid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

/*Data for the table `rolemenu` */

insert  into `rolemenu`(`rmid`,`roleid`,`mid`) values (1,1,1),(2,1,4),(3,1,5),(4,1,6),(5,1,9),(8,2,4),(9,2,5),(10,2,6),(12,2,9),(13,3,4),(15,3,5),(16,3,6),(18,3,9),(19,4,4),(20,4,5),(21,4,6),(23,4,9),(24,5,5),(25,5,6),(26,5,9),(27,4,8),(28,4,10),(29,4,12),(30,4,13),(31,5,11),(32,5,14),(33,5,15),(34,3,19),(35,3,20),(36,3,21),(37,3,22),(38,1,7);

/*Table structure for table `substitutevehicle` */

DROP TABLE IF EXISTS `substitutevehicle`;

CREATE TABLE `substitutevehicle` (
  `msId` int(11) NOT NULL AUTO_INCREMENT COMMENT '代检车id',
  `userId` int(11) NOT NULL COMMENT '录入人id',
  `company` varchar(20) DEFAULT NULL COMMENT '所属公司',
  `customerName` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `telephone` varchar(20) DEFAULT NULL COMMENT '电话号码',
  `vehicleType` varchar(20) DEFAULT NULL COMMENT '车型',
  `licensePlate` varchar(20) NOT NULL COMMENT '车牌号',
  `strengthPolicy` varchar(20) DEFAULT NULL COMMENT '交强保单号',
  `testingName` varchar(20) DEFAULT NULL COMMENT '检测站名称',
  `scheduledTime` datetime DEFAULT NULL COMMENT '预定时间',
  `submission` int(1) NOT NULL DEFAULT '0' COMMENT '是否提交 0未提交，1已提交',
  `reject` int(1) NOT NULL DEFAULT '0' COMMENT '是否驳回 0未驳回，1已驳回',
  `rejectInformation` varchar(100) DEFAULT NULL COMMENT '驳回信息',
  `approval` int(1) NOT NULL DEFAULT '0' COMMENT '0未审批，1已审批',
  `handle` int(1) NOT NULL DEFAULT '0' COMMENT '是否处理0未处理，1已处理',
  `state` int(1) NOT NULL COMMENT '0是注销 1是启用 2是完成 3是异常',
  PRIMARY KEY (`msId`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

/*Data for the table `substitutevehicle` */

insert  into `substitutevehicle`(`msId`,`userId`,`company`,`customerName`,`telephone`,`vehicleType`,`licensePlate`,`strengthPolicy`,`testingName`,`scheduledTime`,`submission`,`reject`,`rejectInformation`,`approval`,`handle`,`state`) values (2,2,'石家庄','海峰','17858536611','奥迪A6','京B8888','qwe123453','邯郸复兴区','2019-04-04 09:15:20',1,0,NULL,1,1,2),(3,3,'石家庄','王虎','13363016038','X7','翼A3242','jqx233432','邯郸邯山区','2019-04-03 09:23:02',0,1,'不合格',1,0,1),(4,4,'邯郸','王超','17531190902','宝马','翼A1234','jqx234533','石家庄桥东区','2019-05-01 09:24:52',1,0,'不行',0,0,0),(5,5,'北京','马汉','18932110234','奥拓','翼A3245','jqx948345','北京朝阳区','2019-04-01 09:27:15',1,1,'嗯嗯',1,1,2),(6,6,'北京','明通','13737563629','奔腾','翼A8553','jqx294928','邯郸邯山区','2018-06-06 09:29:57',1,0,NULL,0,0,1),(7,7,'石家庄','紫音','15836624356','奔驰','翼66666','jqx232242','邯郸邯山区','2019-04-05 09:12:16',1,0,NULL,0,0,0),(8,9,'石家庄','老驴','18233020230','大众','翼A0292','jqx1232','邯郸邯山区','2019-04-02 18:24:52',0,0,NULL,0,0,0),(9,4,'北京','程程','15343322451','奥特','翼A1234','jqx1233','北京朝阳区','2019-04-05 09:51:45',1,1,NULL,1,1,2),(10,9,'石家庄','李寒暄','17531190902','本田','翼A3232','jqx1233','邯郸邯山区','2019-04-17 10:08:29',0,1,NULL,0,0,1),(21,9,'石家庄','啊拉雷','18933062986','Q6','翼9890','jqx1222','石家庄','2019-04-02 15:51:35',0,1,'老驴',0,0,1),(22,9,'石家庄','哈','11111111111','111','111','111','111','2019-04-21 17:08:31',1,0,NULL,1,0,1),(23,9,'石家庄','李紫迎','1111111111','11','11','11','11','2019-04-21 17:59:01',1,0,NULL,1,1,3);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `userCode` varchar(20) NOT NULL,
  `userName` varchar(20) NOT NULL,
  `userPwd` varchar(20) NOT NULL,
  `userGender` int(1) DEFAULT NULL COMMENT '0女1男性别',
  `userAge` int(3) DEFAULT NULL COMMENT '年龄',
  `userPhone` varchar(20) DEFAULT NULL COMMENT '电话',
  `mailbox` varchar(20) DEFAULT NULL COMMENT '邮箱',
  `userCompany` varchar(20) DEFAULT NULL COMMENT '所属公司',
  `state` int(1) NOT NULL DEFAULT '1' COMMENT '状态0冻结1启用',
  PRIMARY KEY (`userid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `user` */

insert  into `user`(`userid`,`userCode`,`userName`,`userPwd`,`userGender`,`userAge`,`userPhone`,`mailbox`,`userCompany`,`state`) values (1,'001','赵','321',1,18,'12222222222','001@qq.com','石家庄',0),(2,'002','钱去','123',0,19,'13333333333','002@qq.com','石家庄',1),(3,'003','孙','123',1,20,'14444444444','003@qq.com','石家庄',1),(4,'004','李','123',0,21,'15555555555','004@qq.com','石家庄',1),(5,'005','周','123',1,22,'16666666666','005@qq.com','石家庄',1),(6,'006','吴','123',0,23,'17777777777','006@qq.com','石家庄',1),(7,'007','郑','123',1,24,'18888888888','007@qq.com','石家庄',1),(8,'008','王','123',0,25,'19999999999','008@qq.com','石家庄',1),(9,'admin','管理员','123',1,26,'10000000000','admin@qq.com','石家庄',1),(22,'lijiawei','李佳威','123',1,19,'17831125352','3144207329','石家庄',1);

/*Table structure for table `userdeparment` */

DROP TABLE IF EXISTS `userdeparment`;

CREATE TABLE `userdeparment` (
  `udid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `did` int(11) NOT NULL,
  PRIMARY KEY (`udid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

/*Data for the table `userdeparment` */

insert  into `userdeparment`(`udid`,`uid`,`did`) values (1,1,5),(2,2,4),(3,3,7),(4,4,6),(5,5,7),(6,6,7),(7,7,7),(8,8,7),(9,9,1),(10,22,6);

/*Table structure for table `userrole` */

DROP TABLE IF EXISTS `userrole`;

CREATE TABLE `userrole` (
  `urid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `rid` int(11) NOT NULL,
  PRIMARY KEY (`urid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

/*Data for the table `userrole` */

insert  into `userrole`(`urid`,`uid`,`rid`) values (1,1,2),(2,2,3),(3,3,4),(4,4,5),(5,5,3),(6,6,4),(7,7,4),(8,8,4),(9,9,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
