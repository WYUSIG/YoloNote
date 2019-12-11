/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.27-0ubuntu0.16.04.1 : Database - yolonote_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`yolonote_db` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `yolonote_db`;

/*Table structure for table `tb_friend` */

DROP TABLE IF EXISTS `tb_friend`;

CREATE TABLE `tb_friend` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `userId` int(11) DEFAULT NULL COMMENT '用户id',
  `friendId` int(11) DEFAULT NULL COMMENT '好友id',
  `friendRemark` varchar(20) DEFAULT NULL COMMENT '好友昵称备注',
  `addTime` datetime DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_friend` */

/*Table structure for table `tb_friend_request` */

DROP TABLE IF EXISTS `tb_friend_request`;

CREATE TABLE `tb_friend_request` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `userId` int(11) DEFAULT NULL COMMENT '用户id',
  `friendId` int(11) DEFAULT NULL COMMENT '好友id',
  `friendRemark` varchar(20) DEFAULT NULL COMMENT '好友备注',
  `addRemark` text COMMENT '添加备注',
  `passFlag` int(11) DEFAULT '0' COMMENT '通过标志：0未审核,1通过,2不通过',
  `requestTime` datetime DEFAULT NULL COMMENT '请求时间',
  `auditTime` datetime DEFAULT NULL COMMENT '审核时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_friend_request` */

/*Table structure for table `tb_manager` */

DROP TABLE IF EXISTS `tb_manager`;

CREATE TABLE `tb_manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员自增id',
  `phone` varchar(15) DEFAULT NULL COMMENT '管理员电话',
  `password` varchar(70) DEFAULT NULL COMMENT '管理员密码',
  `managerName` varchar(100) DEFAULT NULL COMMENT '管理员姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_manager` */

/*Table structure for table `tb_note` */

DROP TABLE IF EXISTS `tb_note`;

CREATE TABLE `tb_note` (
  `noteId` int(11) NOT NULL AUTO_INCREMENT COMMENT '笔记自增id',
  `noteBookId` int(11) DEFAULT NULL COMMENT '笔记本id',
  `noteTitle` varchar(100) DEFAULT NULL COMMENT '笔记标题',
  `noteContent` text COMMENT '笔记内容',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`noteId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_note` */

/*Table structure for table `tb_note_book` */

DROP TABLE IF EXISTS `tb_note_book`;

CREATE TABLE `tb_note_book` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `userId` int(11) DEFAULT NULL COMMENT '用户id',
  `noteBookCover` varchar(200) DEFAULT NULL COMMENT '笔记本封面',
  `noteBookTitle` varchar(100) DEFAULT NULL COMMENT '笔记本标题',
  `noteBookFlag` int(11) DEFAULT '0' COMMENT '笔记本状态：0公开,1私有',
  `noteStar` int(11) DEFAULT NULL COMMENT '笔记获得星星数',
  `availableFlag` int(11) DEFAULT '0' COMMENT '笔记本可用标志(用于管理员审核撤下，用户删除时拉取了的用户能获得一些必要信息)：0可用,1不可以',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_note_book` */

/*Table structure for table `tb_note_book_audit` */

DROP TABLE IF EXISTS `tb_note_book_audit`;

CREATE TABLE `tb_note_book_audit` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `noteBookId` int(11) DEFAULT NULL COMMENT '笔记本id',
  `managerId` int(11) DEFAULT NULL COMMENT '管理员id',
  `status` int(11) DEFAULT '0' COMMENT '状态：0未审核,1审核通过，2审核不通过',
  `auditInfo` text COMMENT '审核反馈内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_note_book_audit` */

/*Table structure for table `tb_note_book_audit_history` */

DROP TABLE IF EXISTS `tb_note_book_audit_history`;

CREATE TABLE `tb_note_book_audit_history` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `managerId` int(11) DEFAULT NULL COMMENT '管理员id',
  `noteBookId` int(11) DEFAULT NULL COMMENT '笔记本id',
  `auditTime` datetime DEFAULT NULL COMMENT '审核撤下笔记本时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_note_book_audit_history` */

/*Table structure for table `tb_note_book_pull` */

DROP TABLE IF EXISTS `tb_note_book_pull`;

CREATE TABLE `tb_note_book_pull` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `noteBookId` int(11) DEFAULT NULL COMMENT '新的笔记本id',
  `formerBookId` int(11) DEFAULT NULL COMMENT '原本的笔记本id',
  `userId` int(11) DEFAULT NULL COMMENT '拉取人的id',
  `formerUserId` int(11) DEFAULT NULL COMMENT '原笔记作者id',
  `pullTime` datetime DEFAULT NULL COMMENT '拉取时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_note_book_pull` */

/*Table structure for table `tb_note_file` */

DROP TABLE IF EXISTS `tb_note_file`;

CREATE TABLE `tb_note_file` (
  `fileId` int(11) NOT NULL AUTO_INCREMENT COMMENT '笔记文件自增id',
  `noteId` int(11) DEFAULT NULL COMMENT '笔记id',
  `fileName` varchar(200) DEFAULT NULL COMMENT '文件名称',
  `addTime` datetime DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`fileId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_note_file` */

/*Table structure for table `tb_note_label` */

DROP TABLE IF EXISTS `tb_note_label`;

CREATE TABLE `tb_note_label` (
  `labelId` int(11) NOT NULL AUTO_INCREMENT COMMENT '笔记标签自增id',
  `noteId` int(11) DEFAULT NULL COMMENT '笔记id',
  `noteLabel` varchar(50) DEFAULT NULL COMMENT '标签名称',
  `addTime` datetime DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`labelId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_note_label` */

/*Table structure for table `tb_note_label_data` */

DROP TABLE IF EXISTS `tb_note_label_data`;

CREATE TABLE `tb_note_label_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `labelName` varchar(50) DEFAULT NULL COMMENT '标签名称',
  `managerId` int(11) DEFAULT NULL COMMENT '管理员id',
  `updateTime` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_note_label_data` */

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户自增id',
  `phone` varchar(15) DEFAULT NULL COMMENT '用户电话',
  `name` varchar(20) DEFAULT NULL COMMENT '用户昵称',
  `age` int(4) DEFAULT NULL COMMENT '用户年龄',
  `gender` int(11) DEFAULT '0' COMMENT '用户性别,0为男,1为女',
  `signature` text COMMENT '个性签名',
  `headImage` varchar(200) DEFAULT NULL COMMENT '头像图片名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_user` */

/*Table structure for table `tb_user_password` */

DROP TABLE IF EXISTS `tb_user_password`;

CREATE TABLE `tb_user_password` (
  `id` int(11) NOT NULL COMMENT '用户id',
  `password` varchar(100) DEFAULT NULL COMMENT '用户密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_user_password` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
