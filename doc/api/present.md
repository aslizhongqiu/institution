## 考勤

#### 一、插入考勤信息

      POST  /institution/present/present
  
参数：

     courseId  [int]:课程id    【必填】
     userId   [int]:学生id   【必填】
     attend   [int]:到勤情况   是否到勤：0未到，1已到 【必填】
     
返回：

       {
           "code": 0,
           "msg": "请求成功",
           "data": null
       }


#### 二、获取课程签到信息

     GET  /institution/present/course/{courseId}
  
参数：

     courseId  [int]: 课程id    【必填,URL中填写】
     
返回：

    {
        "code": 0,
        "msg": "请求成功",
        "data": {
            "data": [
                {
                    "userId": 520,
                    "user": {
                        "id": 520,
                        "gmtCreate": "2019-05-22T12:19:02.000+0000",
                        "gmtModified": "2019-05-22T12:19:02.000+0000",
                        "name": "test",
                        "password": "123456",
                        "typeId": 520,
                        "userType": {
                            "id": 520,
                            "gmtCreate": "2019-05-22T12:15:59.000+0000",
                            "gmtModified": "2019-05-22T12:15:59.000+0000",
                            "name": "test"
                        }
                    }
                },
                {
                    "userId": 521,
                    "user": null
                }
            ],
            "pageNo": 1,
            "pageSize": 2,
            "totalCount": 2
        }
    }

#### 三、根据用户id获取课程及其考勤次数

      GET  /institution/present/list
  
参数：

     userId   [int]:学生id   【必填】
          
返回：

       {
           "code": 0,
           "msg": "请求成功",
           "data": [
               {
                   "courseId": 520,
                   "course": {
                       "id": 520,
                       "gmtCreate": "2019-05-23T07:49:00.000+0000",
                       "gmtModified": "2019-05-23T07:49:00.000+0000",
                       "courseTypeId": 520,
                       "courseType": {
                           "id": 520,
                           "gmtCreate": "2019-05-22T14:32:10.000+0000",
                           "gmtModified": "2019-05-22T14:32:10.000+0000",
                           "name": "语文"
                       },
                       "classTypeId": 520,
                       "classType": {
                           "id": 520,
                           "gmtCreate": "2019-05-22T14:38:12.000+0000",
                           "gmtModified": "2019-05-22T14:38:12.000+0000",
                           "name": "实验班"
                       },
                       "userId": 520,
                       "user": {
                           "id": 520,
                           "gmtCreate": "2019-05-23T07:48:24.000+0000",
                           "gmtModified": "2019-05-23T07:48:24.000+0000",
                           "name": "李中秋",
                           "password": "123456",
                           "typeId": 520,
                           "userType": {
                               "id": 520,
                               "gmtCreate": "2019-05-22T14:25:13.000+0000",
                               "gmtModified": "2019-05-22T14:25:13.000+0000",
                               "name": "老师"
                           }
                       },
                       "time": "周六10:00",
                       "address": "保利新天地",
                       "price": 120,
                       "number": 50
                   },
                   "count": 3
               },
               {
                   "courseId": 524,
                   "course": {
                       "id": 524,
                       "gmtCreate": "2019-05-26T15:23:22.000+0000",
                       "gmtModified": "2019-05-26T15:23:22.000+0000",
                       "courseTypeId": 521,
                       "courseType": {
                           "id": 521,
                           "gmtCreate": "2019-05-22T14:32:32.000+0000",
                           "gmtModified": "2019-05-22T14:32:32.000+0000",
                           "name": "数学"
                       },
                       "classTypeId": 520,
                       "classType": {
                           "id": 520,
                           "gmtCreate": "2019-05-22T14:38:12.000+0000",
                           "gmtModified": "2019-05-22T14:38:12.000+0000",
                           "name": "实验班"
                       },
                       "userId": 520,
                       "user": {
                           "id": 520,
                           "gmtCreate": "2019-05-23T07:48:24.000+0000",
                           "gmtModified": "2019-05-23T07:48:24.000+0000",
                           "name": "李中秋",
                           "password": "123456",
                           "typeId": 520,
                           "userType": {
                               "id": 520,
                               "gmtCreate": "2019-05-22T14:25:13.000+0000",
                               "gmtModified": "2019-05-22T14:25:13.000+0000",
                               "name": "老师"
                           }
                       },
                       "time": "周天10:00",
                       "address": "德馨9栋",
                       "price": 120,
                       "number": 50
                   },
                   "count": 1
               }
           ]
       }

