package com.cjw.yolonote.dao;

import com.cjw.yolonote.pojo.TbNoteBookPull;
import com.cjw.yolonote.pojo.TbNoteBookPullExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbNoteBookPullMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_pull
     *
     * @mbggenerated
     */
    int countByExample(TbNoteBookPullExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_pull
     *
     * @mbggenerated
     */
    int deleteByExample(TbNoteBookPullExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_pull
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_pull
     *
     * @mbggenerated
     */
    int insert(TbNoteBookPull record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_pull
     *
     * @mbggenerated
     */
    int insertSelective(TbNoteBookPull record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_pull
     *
     * @mbggenerated
     */
    List<TbNoteBookPull> selectByExample(TbNoteBookPullExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_pull
     *
     * @mbggenerated
     */
    TbNoteBookPull selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_pull
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TbNoteBookPull record, @Param("example") TbNoteBookPullExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_pull
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TbNoteBookPull record, @Param("example") TbNoteBookPullExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_pull
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbNoteBookPull record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_pull
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbNoteBookPull record);
}