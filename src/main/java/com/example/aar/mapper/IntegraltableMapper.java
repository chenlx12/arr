package com.example.aar.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.aar.pojo.Integraltable;
import com.example.aar.pojo.Personalinformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author huyelin
 * @since 2023-02-27
 */
@Mapper
public interface IntegraltableMapper extends BaseMapper<Integraltable> {

    public Integraltable selectone(@Param("id")String id);
}
