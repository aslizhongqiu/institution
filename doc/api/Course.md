## 课程

#### 一、根据课程id获取课程详情

      GET /institution/course/course/{id}
      
参数：
  
     id  [int]:根据课程id获取课程详情  (id直接填入url)
     
返回：

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
    
    
     
 
     