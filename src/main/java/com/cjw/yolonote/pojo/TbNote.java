package com.cjw.yolonote.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbNote implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_note.noteId
     *
     * @mbggenerated
     */
    private Integer noteid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_note.noteBookId
     *
     * @mbggenerated
     */
    private Integer notebookid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_note.noteTitle
     *
     * @mbggenerated
     */
    private String notetitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_note.createTime
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_note.noteContent
     *
     * @mbggenerated
     */
    private String notecontent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_note
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_note.noteId
     *
     * @return the value of tb_note.noteId
     *
     * @mbggenerated
     */
    public Integer getNoteid() {
        return noteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_note.noteId
     *
     * @param noteid the value for tb_note.noteId
     *
     * @mbggenerated
     */
    public void setNoteid(Integer noteid) {
        this.noteid = noteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_note.noteBookId
     *
     * @return the value of tb_note.noteBookId
     *
     * @mbggenerated
     */
    public Integer getNotebookid() {
        return notebookid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_note.noteBookId
     *
     * @param notebookid the value for tb_note.noteBookId
     *
     * @mbggenerated
     */
    public void setNotebookid(Integer notebookid) {
        this.notebookid = notebookid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_note.noteTitle
     *
     * @return the value of tb_note.noteTitle
     *
     * @mbggenerated
     */
    public String getNotetitle() {
        return notetitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_note.noteTitle
     *
     * @param notetitle the value for tb_note.noteTitle
     *
     * @mbggenerated
     */
    public void setNotetitle(String notetitle) {
        this.notetitle = notetitle == null ? null : notetitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_note.createTime
     *
     * @return the value of tb_note.createTime
     *
     * @mbggenerated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_note.createTime
     *
     * @param createtime the value for tb_note.createTime
     *
     * @mbggenerated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_note.noteContent
     *
     * @return the value of tb_note.noteContent
     *
     * @mbggenerated
     */
    public String getNotecontent() {
        return notecontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_note.noteContent
     *
     * @param notecontent the value for tb_note.noteContent
     *
     * @mbggenerated
     */
    public void setNotecontent(String notecontent) {
        this.notecontent = notecontent == null ? null : notecontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", noteid=").append(noteid);
        sb.append(", notebookid=").append(notebookid);
        sb.append(", notetitle=").append(notetitle);
        sb.append(", createtime=").append(createtime);
        sb.append(", notecontent=").append(notecontent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}