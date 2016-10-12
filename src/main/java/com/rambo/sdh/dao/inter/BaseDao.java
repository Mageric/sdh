package com.rambo.sdh.dao.inter;

import java.io.Serializable;

public interface BaseDao<T, PK extends Serializable> {
    /**
     * 根据ID获取实体对象.
     *
     * @param id 记录ID
     * @return 实体对象
     */
    T getByKey(PK id);

    /**
     * 保存实体对象.
     *
     * @param entity 对象
     * @return ID
     */
    T add(T entity);


    /**
     * 更新实体对象
     * @param entity 对象
     * @return 更新的对象
     */
    T edit(T entity);


    /**
     * 根据 ID 删除实体
     * @param id 主键
     * @return 更新的对象
     */
    T deleteByKey(PK id);
}
