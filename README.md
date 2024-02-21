# balance-manager
## 需求
> 独立完成基于java spring boot的项目，开发工具可以用IntelliJ，包含文档说明、源码、测试用例。
> 功能： 实现一个额度管理功能，模拟多用户进行不同类型额度申请、扣减的功能。具体包括初始化额度、新增额度、扣减额度、查询额度，用例和代码需要包含额度管理模块、模拟多用户操作的定时任务代码、测试用例。
> (db可以用sqlite或者mysql)
### 一、额度管理模块
1. 支持多个额度账户管理
2. 支持额度初始化
3. 支持额度增加
4. 支持额度扣减
5. 支持额度查询
6. 额度为double类型即可
### 二、定时任务功能
1. 定时进行对额度操作
2. 模拟多用户发起
### 三、测试用例
1. 覆盖管理额度管理功能