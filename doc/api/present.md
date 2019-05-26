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
