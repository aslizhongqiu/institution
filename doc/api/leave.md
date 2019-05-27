## 請假

#### 一、插入請假記錄

     POST  /institution/leave/leave
     
参数：

     courseId  [int]:预交课程id    【必填】
     userId   [int]:预交的学生id   【必填】
     reason  [String]：请假原因  【非必填】
     
返回：
    
       {
           "code": 0,
           "msg": "请求成功",
           "data": null
       }
