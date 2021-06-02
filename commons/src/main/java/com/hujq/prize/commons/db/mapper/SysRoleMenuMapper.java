package com.hujq.prize.commons.db.mapper;


import com.hujq.prize.commons.db.entity.SysRoleMenu;
import com.hujq.prize.commons.db.entity.SysRoleMenuExample;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SysRoleMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    long countByExample(SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    int deleteByExample(SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    @Delete({
        "delete from sys_role_menu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    @Insert({
        "insert into sys_role_menu (role_id, menu_id, ",
        "create_time)",
        "values (#{roleId,jdbcType=INTEGER}, #{menuId,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(SysRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    int insertSelective(SysRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    List<SysRoleMenu> selectByExample(SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, role_id, menu_id, create_time",
        "from sys_role_menu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.hujq.prize.commons.db.mapper.SysRoleMenuMapper.BaseResultMap")
    SysRoleMenu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SysRoleMenu record, @Param("example") SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SysRoleMenu record, @Param("example") SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated
     */
    @Update({
        "update sys_role_menu",
        "set role_id = #{roleId,jdbcType=INTEGER},",
          "menu_id = #{menuId,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SysRoleMenu record);
}