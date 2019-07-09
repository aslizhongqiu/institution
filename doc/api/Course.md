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
    
#### 三、根据老师Id获取老师在上的所有课程信息

     GET /institution/course/course/{id}

参数：

     userId   [int]:老师id   【必填】
     
返回：

    {
        "code": 0,
        "msg": "请求成功",
        "data": {
            "data": [
                {
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
            ],
            "pageNo": 1,
            "pageSize": 10,
            "totalCount": 1
        }
    }
    
    
#### 四、分页获取所有课程信息

     GET /institution/course/all

参数：

     pageNo（int）：页数 【非必填】 默认1
     pageSoize(int):页面大小 【非必填】 默认10
     
返回： 
 
    {
        "code": 0,
        "msg": "请求成功",
        "data": {
            "data": [
                {
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
                }
            ],
            "pageNo": 1,
            "pageSize": 1,
            "totalCount": 2
        }
    }
     