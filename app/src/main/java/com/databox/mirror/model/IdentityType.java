/**
 * Title: IdentityType.java
 * Description:
 * Copyright: Copyright (c) 2016
 * Company:中移（苏州）软件技术有限公司
 * Author 黄典 (huangdian@cmss.chinamobile.com)
 * Date 2016年11月29日 下午2:40:18
 * Version 1.0
 */
package com.databox.mirror.model;

/**
 * @Author steven
 * @Description  type类型
 * @Date  2021/5/12 22:29
 * @Param
 * @return
 *
 *  * 其中type:
 *  * 0: 登录验证
 *  * 1: 注册验证
 *  * 2: 修改密码验证
 *  * 其他：身份验证
 **/
public enum IdentityType {
    login(0),
    register(1),
    modify(2);
      
    int value = 0;
    
    private IdentityType(int value)
    {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
