package com.cjw.yolonote.config;

public interface BaseObjectService<T> {

    /**
     * 通过整型主键id获取实体
     * @param id
     * @return
     */
    T getObjectById(int id);

    /**
     * 添加实体，属性值为空的取数据库默认值
     * @param t
     * @return
     */
    int addObjectSelective(T t);

    /**
     * 通过整型主键id更新实体，只更新属性值不为空的
     * @param t
     * @return
     */
    int updateObjectSelectiveById(T t);

    /**
     * 通过整型主键id删除实体
     * @param id
     * @return
     */
    int delObjectById(int id);
}
