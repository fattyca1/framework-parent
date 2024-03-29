package com.fattyca1.common.base;

/**
 * <br>获取基础枚举前缀</br>
 *
 * @author fattyca1
 * @version 1.0
 * @date 2020/1/20 18:44
 * @since 1.0
 */
public interface BaseCodePrefix<T> {

    /**
     * 获取前缀
     * @return
     */
    T getPrefix();
}
