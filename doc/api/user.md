## 用户

  
#### 一、取所有用户类型信息
  
       GET /institution/user/type/all
  
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
                    "id": 522,
                    "gmtCreate": "2019-05-22T14:26:09.000+0000",
                    "gmtModified": "2019-05-22T14:26:09.000+0000",
                    "name": "管理员"
                }
            ],
            "pageNo": 1,
            "pageSize": 1,
            "totalCount": 3
        }
    }
    

#### 二、分页获取所有学生信息
  
       GET /institution/user/all
  
参数：
  
       pageNo（int）：页数 【非必填】 默认1
       pageSoize(int):页面大小 【非必填】 默认10
       
返回： 


#### 三、分页获取所有教师信息
  
       GET /institution/user/teacher
  
参数：
  
       pageNo（int）：页数 【非必填】 默认1
       pageSoize(int):页面大小 【非必填】 默认10
       
返回： 

#### 四、设置星标学生(修改学生类型)

     POST /institution/user/type
     
参数：

    id(int) :用户id 【必填】，
    typeId(int):类型id 【必填】
