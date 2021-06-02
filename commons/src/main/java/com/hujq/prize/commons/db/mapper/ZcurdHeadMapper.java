package com.hujq.prize.commons.db.mapper;


import com.hujq.prize.commons.db.entity.ZcurdHead;
import com.hujq.prize.commons.db.entity.ZcurdHeadExample;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ZcurdHeadMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    long countByExample(ZcurdHeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    int deleteByExample(ZcurdHeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    @Delete({
        "delete from zcurd_head",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    @Insert({
        "insert into zcurd_head (table_name, form_name, ",
        "id_field, is_auto, ",
        "form_type, dialog_size, ",
        "db_source, handle_class, ",
        "delete_flag_field, create_time)",
        "values (#{tableName,jdbcType=VARCHAR}, #{formName,jdbcType=VARCHAR}, ",
        "#{idField,jdbcType=VARCHAR}, #{isAuto,jdbcType=INTEGER}, ",
        "#{formType,jdbcType=INTEGER}, #{dialogSize,jdbcType=VARCHAR}, ",
        "#{dbSource,jdbcType=VARCHAR}, #{handleClass,jdbcType=VARCHAR}, ",
        "#{deleteFlagField,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(ZcurdHead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    int insertSelective(ZcurdHead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    List<ZcurdHead> selectByExample(ZcurdHeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, table_name, form_name, id_field, is_auto, form_type, dialog_size, db_source, ",
        "handle_class, delete_flag_field, create_time",
        "from zcurd_head",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.hujq.prize.commons.db.mapper.ZcurdHeadMapper.BaseResultMap")
    ZcurdHead selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ZcurdHead record, @Param("example") ZcurdHeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ZcurdHead record, @Param("example") ZcurdHeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ZcurdHead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zcurd_head
     *
     * @mbg.generated
     */
    @Update({
        "update zcurd_head",
        "set table_name = #{tableName,jdbcType=VARCHAR},",
          "form_name = #{formName,jdbcType=VARCHAR},",
          "id_field = #{idField,jdbcType=VARCHAR},",
          "is_auto = #{isAuto,jdbcType=INTEGER},",
          "form_type = #{formType,jdbcType=INTEGER},",
          "dialog_size = #{dialogSize,jdbcType=VARCHAR},",
          "db_source = #{dbSource,jdbcType=VARCHAR},",
          "handle_class = #{handleClass,jdbcType=VARCHAR},",
          "delete_flag_field = #{deleteFlagField,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ZcurdHead record);
}