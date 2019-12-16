package com.cjw.yolonote.dao;

import com.cjw.yolonote.pojo.TbNote;
import com.cjw.yolonote.pojo.TbNoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbNoteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note
     *
     * @mbggenerated
     */
    int countByExample(TbNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note
     *
     * @mbggenerated
     */
    int deleteByExample(TbNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer noteid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note
     *
     * @mbggenerated
     */
    int insert(TbNote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note
     *
     * @mbggenerated
     */
    int insertSelective(TbNote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note
     *
     * @mbggenerated
     */
    List<TbNote> selectByExampleWithBLOBs(TbNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note
     *
     * @mbggenerated
     */
    List<TbNote> selectByExample(TbNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note
     *
     * @mbggenerated
     */
    TbNote selectByPrimaryKey(Integer noteid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TbNote record, @Param("example") TbNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") TbNote record, @Param("example") TbNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TbNote record, @Param("example") TbNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbNote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(TbNote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbNote record);
}