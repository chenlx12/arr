package com.example.aar.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.aar.pojo.Applicationorm;
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
public interface ApplicationormMapper extends BaseMapper<Applicationorm> {

    int insertone(@Param("applicationorm")Applicationorm applicationorm);
}
