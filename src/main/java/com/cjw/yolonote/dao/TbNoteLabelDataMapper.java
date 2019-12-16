package com.cjw.yolonote.dao;

import com.cjw.yolonote.pojo.TbNoteLabelData;
import com.cjw.yolonote.pojo.TbNoteLabelDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbNoteLabelDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_label_data
     *
     * @mbggenerated
     */
    int countByExample(TbNoteLabelDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_label_data
     *
     * @mbggenerated
     */
    int deleteByExample(TbNoteLabelDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_label_data
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_label_data
     *
     * @mbggenerated
     */
    int insert(TbNoteLabelData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_label_data
     *
     * @mbggenerated
     */
    int insertSelective(TbNoteLabelData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_label_data
     *
     * @mbggenerated
     */
    List<TbNoteLabelData> selectByExample(TbNoteLabelDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_label_data
     *
     * @mbggenerated
     */
    TbNoteLabelData selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_label_data
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TbNoteLabelData record, @Param("example") TbNoteLabelDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_label_data
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TbNoteLabelData record, @Param("example") TbNoteLabelDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_label_data
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbNoteLabelData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_label_data
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbNoteLabelData record);
}