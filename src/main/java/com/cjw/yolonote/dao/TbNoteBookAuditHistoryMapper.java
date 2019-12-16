package com.cjw.yolonote.dao;

import com.cjw.yolonote.pojo.TbNoteBookAuditHistory;
import com.cjw.yolonote.pojo.TbNoteBookAuditHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbNoteBookAuditHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_audit_history
     *
     * @mbggenerated
     */
    int countByExample(TbNoteBookAuditHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_audit_history
     *
     * @mbggenerated
     */
    int deleteByExample(TbNoteBookAuditHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_audit_history
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_audit_history
     *
     * @mbggenerated
     */
    int insert(TbNoteBookAuditHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_audit_history
     *
     * @mbggenerated
     */
    int insertSelective(TbNoteBookAuditHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_audit_history
     *
     * @mbggenerated
     */
    List<TbNoteBookAuditHistory> selectByExample(TbNoteBookAuditHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_audit_history
     *
     * @mbggenerated
     */
    TbNoteBookAuditHistory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_audit_history
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TbNoteBookAuditHistory record, @Param("example") TbNoteBookAuditHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_audit_history
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TbNoteBookAuditHistory record, @Param("example") TbNoteBookAuditHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_audit_history
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbNoteBookAuditHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_book_audit_history
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbNoteBookAuditHistory record);
}