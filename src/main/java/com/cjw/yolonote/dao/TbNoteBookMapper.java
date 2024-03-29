package com.cjw.yolonote.dao;

import com.cjw.yolonote.pojo.TbNoteBook;
import com.cjw.yolonote.pojo.TbNoteBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbNoteBookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book
     *
     * @mbggenerated
     */
    int countByExample(TbNoteBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book
     *
     * @mbggenerated
     */
    int deleteByExample(TbNoteBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book
     *
     * @mbggenerated
     */
    int insert(TbNoteBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book
     *
     * @mbggenerated
     */
    int insertSelective(TbNoteBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book
     *
     * @mbggenerated
     */
    List<TbNoteBook> selectByExample(TbNoteBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book
     *
     * @mbggenerated
     */
    TbNoteBook selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TbNoteBook record, @Param("example") TbNoteBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TbNoteBook record, @Param("example") TbNoteBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbNoteBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbNoteBook record);
}