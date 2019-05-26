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