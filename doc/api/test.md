## 测试

#### 一、获取所有测试数据

    GET /institution/test/all
    
参数

    pageNo [int] : 第几页，默认为1
    pageSize [int] : 每页条数，默认为10
    
返回

    {
        "code": 0,
        "msg": "请求成功",
        "data": {
            "data": [
                {
                    "id": 521,
                    "gmtCreate": "2019-05-21T12:45:37.000+0000",
                    "gmtModified": "2019-05-21T12:45:37.000+0000",
                    "name": "test"
                },
                {
                    "id": 520,
                    "gmtCreate": "2019-05-21T12:44:49.000+0000",
                    "gmtModified": "2019-05-21T12:44:49.000+0000",
                    "name": "test"
                }
            ],
            "pageNo": 1,
            "pageSize": 10,
            "totalCount": 2
        }
    }
