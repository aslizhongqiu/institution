

-- 创建数据库实例
create database institution;

-- 使用数据库
use institution;

-- 创建测试表
create table if not exists `test`(
    `id` int not null auto_increment comment 'ID',
    `gmt_create`   timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
    `gmt_modified` timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '最近修改时间戳',
    `deleted`      varchar(1)         default '0'  COMMENT '是否删除：0未删除，1删除',
    `name` varchar(32) not null comment '名称',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 520 DEFAULT CHARSET = utf8mb4 COMMENT = '测试表';

-- 创建用户类型表
create table if not exists `user_type`(
    `id` int not null auto_increment comment 'ID',
    `gmt_create`   timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
    `gmt_modified` timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '最近修改时间戳',
    `deleted`      varchar(1)         default '0'  COMMENT '是否删除：0未删除，1删除',
    `name` varchar(32) not null comment '用户类型名称',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 520 DEFAULT CHARSET = utf8mb4 COMMENT = '用户类型表';

-- 创建用户表
create table if not exists `user`(
    `id` int not null auto_increment comment 'ID',
    `gmt_create`   timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
    `gmt_modified` timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '最近修改时间戳',
    `deleted`      varchar(1)         default '0'  COMMENT '是否删除：0未删除，1删除',
    `name` varchar(32) not null comment '用户姓名',
    `password` varchar(40) not null comment '用户密码',
    `type_id` int not null comment '用户类型id',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 520 DEFAULT CHARSET = utf8mb4 COMMENT = '用户表';

-- 创建课程类型表
create table if not exists `course_type`(
    `id` int not null auto_increment comment 'ID',
    `gmt_create`   timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
    `gmt_modified` timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '最近修改时间戳',
    `deleted`      varchar(1)         default '0'  COMMENT '是否删除：0未删除，1删除',
    `name` varchar(32) not null comment '课程类型名',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 520 DEFAULT CHARSET = utf8mb4 COMMENT = '课程类型表';

-- 创建班级类型表
create table if not exists `class_type`(
    `id` int not null auto_increment comment 'ID',
    `gmt_create`   timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
    `gmt_modified` timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '最近修改时间戳',
    `deleted`      varchar(1)         default '0'  COMMENT '是否删除：0未删除，1删除',
    `name` varchar(32) not null comment '班级类型名',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 520 DEFAULT CHARSET = utf8mb4 COMMENT = '班级类型表';

-- 创建课程表
create table if not exists `course`(
    `id` int not null auto_increment comment 'ID',
    `gmt_create`   timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
    `gmt_modified` timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '最近修改时间戳',
    `deleted`      varchar(1)         default '0'  COMMENT '是否删除：0未删除，1删除',
    `course_type` int not null comment '课程类型',
    `class_type` int not null comment '班级类型',
    `user_id` int not null comment '老师ID',
    `time` varchar(32) comment '上课时间',
    `address` varchar(70) not null comment '上课地址',
    `price` int not null comment '价格',
    `number` int not null comment '课程容量',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 520 DEFAULT CHARSET = utf8mb4 COMMENT = '课程表';

-- 创建预交表
create table if not exists `advance`(
    `id` int not null auto_increment comment 'ID',
    `gmt_create`   timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
    `gmt_modified` timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '最近修改时间戳',
    `deleted`      varchar(1)         default '0'  COMMENT '是否删除：0未删除，1删除',
    `course_id` int not null comment '课程ID',
    `user_id` int not null comment '用户ID',
    `money` int not null comment '预交金额',
    `number` varchar(32) comment '预交发票号',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 520 DEFAULT CHARSET = utf8mb4 COMMENT = '预交表';

-- 创建考勤表
create table if not exists `present`(
    `id` int not null auto_increment comment 'ID',
    `gmt_create`   timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
    `gmt_modified` timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '最近修改时间戳',
    `deleted`      varchar(1)         default '0'  COMMENT '是否删除：0未删除，1删除',
    `course_id` int not null comment '课程ID',
    `user_id` int not null comment '用户ID',
    `attend` int not null default 1 comment '是否到勤：0未到，1已到',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 520 DEFAULT CHARSET = utf8mb4 COMMENT = '考勤表';

-- 创建请假表
create table if not exists `leave`(
    `id` int not null auto_increment comment 'ID',
    `gmt_create`   timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
    `gmt_modified` timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '最近修改时间戳',
    `deleted`      varchar(1)         default '0'  COMMENT '是否删除：0未删除，1删除',
    `course_id` int not null comment '课程ID',
    `user_id` int not null comment '用户ID',
    `reason` varchar(32) comment '请假原因',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 520 DEFAULT CHARSET = utf8mb4 COMMENT = '请假表';

-- 创建结算表
create table if not exists `settlement`(
    `id` int not null auto_increment comment 'ID',
    `gmt_create`   timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
    `gmt_modified` timestamp NULL     DEFAULT CURRENT_TIMESTAMP  COMMENT '最近修改时间戳',
    `deleted`      varchar(1)         default '0'  COMMENT '是否删除：0未删除，1删除',
    `course_id` int not null comment '课程ID',
    `user_id` int not null comment '用户ID',
    `money` int not null comment '结算金额',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 520 DEFAULT CHARSET = utf8mb4 COMMENT = '结算表';

--为表添加外键
alter table `user` add constraint FK_USER foreign key(type_id) REFERENCES user_type(id);
alter table course add constraint FK_COUSER_COURSE foreign key(course_type) REFERENCES course_type(id);
alter table course add constraint FK_COUSER_CLASS foreign key(class_type) REFERENCES class_type(id);
alter table course add constraint FK_COUSER_USER foreign key(user_id) REFERENCES user(id);
alter table advance add constraint FK_ADVANCE_COURSE foreign key(course_id) REFERENCES course(id);
alter table advance add constraint FK_ADVANCE_USER foreign key(user_id) REFERENCES user(id);
alter table present add constraint FK_PRESENT_COURSE foreign key(course_id) REFERENCES course(id);
alter table present add constraint FK_PRESENT_USER foreign key(user_id) REFERENCES user(id);
alter table `leave` add constraint FK_LEAVE_COURSE foreign key(course_id) REFERENCES course(id);
alter table `leave` add constraint FK_LEAVE_USER foreign key(user_id) REFERENCES user(id);
alter table settlement add constraint FK_SETTLEMENT_COURSE foreign key(course_id) REFERENCES course(id);
alter table settlement add constraint FK_SETTLEMENT_USER foreign key(user_id) REFERENCES user(id);

