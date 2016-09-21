# sme
spring mvc example

#项目 java后端目录简介
	├── common           //公共的 action,util
	├── controller       //业务 action
	├── dao              //数据库访问层，建议单表增、删、改、查，服务层进行业务耦合
	├── pojo             //数据表持久层对象
	├── service          //业务服务层，获取数据、处理业务逻辑、组装数据，由 action 调用这里的服务
	├── util             //工具类

#项目前端目录简介
    ├── smeui            //前段界面需要的资源
    ├── view             //视图
    ├── WEB-INF

#项目UI目录简介
    ├── images           //图片
	├── js               //js 脚本
	├── layout           //布局
	├── less
	├── plugins          //插件
	├── themes           //主题