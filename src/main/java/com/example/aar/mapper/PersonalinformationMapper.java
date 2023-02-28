package com.example.aar.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.aar.pojo.Personalinformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author huyelin
 * @since 2023-02-27
 */
@Mapper
public interface PersonalinformationMapper extends BaseMapper<Personalinformation> {
    public Personalinformation selectone(@Param("id") String id);

    public List<Personalinformation> selectAll();
}
