## 结算

#### 一、根据学生id获取所有课程的结算情况

      GET  /institution/settlement/{userId}
  
参数：

     userId   [int]:学生id   【必填】 直接在url中填写
          
返回：

#### 二、根据老师id获取所有课程的结算情况

      GET  /institution/settlement/teacher/{userId}
  
参数：

     userId   [int]:老师id   【必填】 直接在url中填写
          
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
                "count": 4
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


