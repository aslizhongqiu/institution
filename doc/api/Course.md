## 课程

#### 一、根据课程id获取课程详情

      GET /institution/course/course/{id}
      
参数：
  
     id  [int]:根据课程id获取课程详情  (id直接填入url)
     
返回：

     {
         "code": 0,
         "msg": "请求成功",
         "data": {
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
         }
     }

#### 二、添加课程

     POST /institution/course/course
     
参数：

     courseTypeId  [int]： 课程类型id 【必填】
     classTypeId [int]： 班级类型id 【必填】
     userId [int]:   授课老师id 【必填】
     time [String]: 上课时间
     address [String]: 地址
     price [int]: 价格 【必填】
     number [int]: 容量 【必填】
     
返回：
    
    {
        "code": 0,
        "msg": "请求成功",
        "data": null
    }
    
    
     
 
     