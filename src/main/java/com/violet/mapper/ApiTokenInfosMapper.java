package com.violet.mapper;

import com.violet.entity.ApiTokenInfos;
import org.apache.ibatis.annotations.Mapper;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019-03-15 16:41
 * <p>
 *
 * @author wangchao
 * @version 1.0.0
 */
@Mapper
public interface ApiTokenInfosMapper {
    int deleteByPrimaryKey(Integer atiId);

    int insert(ApiTokenInfos record);

    int insertSelective(ApiTokenInfos record);

    ApiTokenInfos selectByPrimaryKey(Integer atiId);

    int updateByPrimaryKeySelective(ApiTokenInfos record);

    int updateByPrimaryKeyWithBLOBs(ApiTokenInfos record);

    int updateByPrimaryKey(ApiTokenInfos record);
}