package com.cjw.yolonote.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbNoteFile implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_note_file.fileId
     *
     * @mbggenerated
     */
    private Integer fileid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_note_file.noteId
     *
     * @mbggenerated
     */
    private Integer noteid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_note_file.fileName
     *
     * @mbggenerated
     */
    private String filename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_note_file.addTime
     *
     * @mbggenerated
     */
    private Date addtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_note_file
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_note_file.fileId
     *
     * @return the value of tb_note_file.fileId
     *
     * @mbggenerated
     */
    public Integer getFileid() {
        return fileid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_note_file.fileId
     *
     * @param fileid the value for tb_note_file.fileId
     *
     * @mbggenerated
     */
    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_note_file.noteId
     *
     * @return the value of tb_note_file.noteId
     *
     * @mbggenerated
     */
    public Integer getNoteid() {
        return noteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_note_file.noteId
     *
     * @param noteid the value for tb_note_file.noteId
     *
     * @mbggenerated
     */
    public void setNoteid(Integer noteid) {
        this.noteid = noteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_note_file.fileName
     *
     * @return the value of tb_note_file.fileName
     *
     * @mbggenerated
     */
    public String getFilename() {
        return filename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_note_file.fileName
     *
     * @param filename the value for tb_note_file.fileName
     *
     * @mbggenerated
     */
    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_note_file.addTime
     *
     * @return the value of tb_note_file.addTime
     *
     * @mbggenerated
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_note_file.addTime
     *
     * @param addtime the value for tb_note_file.addTime
     *
     * @mbggenerated
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_file
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fileid=").append(fileid);
        sb.append(", noteid=").append(noteid);
        sb.append(", filename=").append(filename);
        sb.append(", addtime=").append(addtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}