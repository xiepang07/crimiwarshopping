# 项目内容
crimiwar基本物资交易平台主要应用于大型存储设施，针对于大型商
户的基本原材料的供应，进行相关的交易，所进行的以协议性的长期交
易合作为基础，短期内的基本合作为辅，依靠大体量的存储能力，将剩
余的存储能力进行租借服务，收取存储管理，空间占用的租金，所有新
产生的大量交易（大型公司）都会经过相关管理人员的审核，而部分物
资的少量交易将接受直接通过（散户）。我们提供一个服务中心，
采用集群策略，以支持设施 的数据共享，保障系统健壮性，信息的安全
性，准确性，并大程度上保证速度，并对突发性的较高并发量有一定的
处理策略。具体实现上，项目分为两部分，一是后台进销存储管理系统，二是交易平台（贸易，租
借存储)。

---

# 项目组成

* ## 后台进销存储管理系统
  
    * ### 管理员登录界面
      
      * #### 用户名，密码,密钥(只能登录，不可注册)
    * ### 员工个人信息首页  
      * #### 作为跳转后的首页
      * #### 展示员工的权限等级，工作职务，头像，以及近期工作情况v
      * #### 收取通知(紧急任务，消息等)v
      * #### 记录自己所有任务详情，记录进度v
      * #### 图像化展示工作绩效v
      * #### 记录工作组相关情况
      * #### 记录签到v
      * #### 记录本日，周，月完成任务数v
    * ### 仓库存储物资情况界面
      
      * #### 由总物资->各子物资相关信息
      * #### 每一层级展示下一层级的相关信息，最后一层展示该种类详情
      * #### 提供分类选项，可选择不同仓别具体详情
        
        > 一级信息->二级信息->三级信息->四级信息
        ```
                     金属    小麦     
        总物资页面->  食品  ->稻米 ......
                     木材    玉米
                    ......
        ```
      
    * ### 商品物资近期进销状况
      
      * #### 上月与今月进货量，出货量比较(分层次，地区)
      * #### 一定时期内的进货，出货折线图
      * #### 图形化界面，动态变化展示
      * #### 接口地图，展示进货出货地区情况
      * #### 展示利润成本折线图
      * #### 获利百分比，分正负
      
    * ### 后台服务器异常检查界面
      
      * #### 相关服务监控系统
      （基于监控服务实现）
      
    * ### 物资信息手动编辑界面
      
      * #### 展示物资简讯
      * #### 选择性修改信息
      * #### 可修改数量，价格等相关信息
      * #### 可设置修改信息生效时间（即时，定时）
      * #### 可手动添加，删除种类
      * #### 物资信息异常通知，爆红
      
    * ### 进货情况确认
      
      * #### 定期性物资进货自动确认，管理员可手动取消确认
      * #### 突发性物资申请进货手动创建，时间，数量，类型，必须进行手动确认
      * #### 可添加暂时性的持续自动进货
      * #### 可对相关信息进行修改
      * #### 记录进货日志
      
    * ### 交易信息（申请）确认
      
      * #### 前台申请人提交相关交易申请（租用存储，购买物资）交由后端人员审核
      * ####  审核通过->交易生成||审核未通过->返回未通过原因
      
    * ### 用户管理系统
      
      * #### 用户信誉积分策略
      * #### 针对部分用户的黑名单设置
      * #### 手动添加，删除（高权限）用户策略
      * #### 异常对象监控
      
    * ### 仓库存储租赁情况
      
      * #### 显示可使用仓库数量，闲置仓库（灰），使用中仓库（绿）
      * #### 租赁者相关信息，存储物资简略信息
      * #### 显示租赁日期，及截止时间的信息
    
* ## 前台用户交易系统
  
    * ### 用户登录界面
      
      * #### 账号，密码登录
      * #### 跳转注册页
    * ### 用户注册界面
      
      * #### （必填）账号，密码，密码二次确认
      * #### （选填）邮箱，单位，账号性质（组织，个人）
    * ### 主界面
      
      * #### 平台介绍
      * #### 导航
      * #### 活动通知
    * ### 物资购买界面
      
      * #### 分类型导航，显示剩余量及价格
      * #### 对于缺货商品进行灰化处理，并显示大概补货时间
      * #### 在具体页上进行购买，预购等操作
      * #### 具体交易根据个人/组织购买量及购买种类的不同配置，显示通知确认，若超量/购买限制需提交审核
      * #### 选择量，种类，购买类型（单次？长期购买？），购买后操作（存储库中（根据购买者相关信息确定时限）？自己存储（自己取货？平台运输））
    * ### 存储租赁界面
      
      * #### 分不同地区，可由用户选择
      * #### 显示价格
      * #### 显示可用存储位
      * #### 支持存储空间所有者与意向租用者练习，转移所有权（需经由审核）
    * ### 个人中心界面（内含已交易协议，你的关注，信誉分，通知）
      
      * #### 显示自己相关信息
      * #### 支持编辑，补全信息
      * #### 查看以进行的交易协议的相关信息
      * #### 通知，私信查看  
---

# 全局配置基本要求

* 接口方面:
    * server:自12000开始
      * alpha: 12000
      * beta:12001
      * gamma:12002
    * service:自12100开始
* 数据库方面:
    * 类型：mysql
    * 数据库名：
        * 仓库存储相关(后台)：CrimiwarShoppingStorage
        * 交易显示界面(前台)：CrimiwarShopping