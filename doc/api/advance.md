## 预交

#### 一、插入预交信息

     POST  /institution/advance/advance
     
参数：

     courseId  [int]:预交课程id    【必填】
     userId   [int]:预交的学生id   【必填】
     money   [int]:预交金额    【必填】
     number  [String]：预交发票编号  【必填】
     
返回：
    
       {
           "code": 0,
           "msg": "请求成功",
           "data": null
       }

   
#### 二、根据用户id获他所有的预交记录

       GET  /institution/advance/userid

参数：
   
     userId  [int]： 预交学生的Id   【必填】

返回：

     {
         "code": 0,
         "msg": "请求成功",
         "data": [
             {
                 "id": 520,
                 "gmtCreate": "2019-05-26T09:05:59.000+0000",
                 "gmtModified": "2019-05-26T09:05:59.000+0000",
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
                 "userId": 522,
                 "user": {
                     "id": 522,
                     "gmtCreate": "2019-05-26T09:01:17.000+0000",
                     "gmtModified": "2019-05-26T09:01:17.000+0000",
                     "name": "贾成连",
                     "password": "123456",
                     "typeId": 522,
                     "userType": {
                         "id": 522,
                         "gmtCreate": "2019-05-22T14:26:09.000+0000",
                         "gmtModified": "2019-05-22T14:26:09.000+0000",
                         "name": "非星标学生"
                     }
                 },
                 "money": 3200,
                 "number": "20190001"
             }
         ]
     }