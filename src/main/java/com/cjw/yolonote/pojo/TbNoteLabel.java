package com.cjw.yolonote.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbNoteLabel implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_note_label.labelId
     *
     * @mbggenerated
     */
    private Integer labelid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_note_label.noteId
     *
     * @mbggenerated
     */
    private Integer noteid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_note_label.noteLabel
     *
     * @mbggenerated
     */
    private String notelabel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_note_label.addTime
     *
     * @mbggenerated
     */
    private Date addtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_note_label
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_note_label.labelId
     *
     * @return the value of tb_note_label.labelId
     *
     * @mbggenerated
     */
    public Integer getLabelid() {
        return labelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_note_label.labelId
     *
     * @param labelid the value for tb_note_label.labelId
     *
     * @mbggenerated
     */
    public void setLabelid(Integer labelid) {
        this.labelid = labelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_note_label.noteId
     *
     * @return the value of tb_note_label.noteId
     *
     * @mbggenerated
     */
    public Integer getNoteid() {
        return noteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_note_label.noteId
     *
     * @param noteid the value for tb_note_label.noteId
     *
     * @mbggenerated
     */
    public void setNoteid(Integer noteid) {
        this.noteid = noteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_note_label.noteLabel
     *
     * @return the value of tb_note_label.noteLabel
     *
     * @mbggenerated
     */
    public String getNotelabel() {
        return notelabel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_note_label.noteLabel
     *
     * @param notelabel the value for tb_note_label.noteLabel
     *
     * @mbggenerated
     */
    public void setNotelabel(String notelabel) {
        this.notelabel = notelabel == null ? null : notelabel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_note_label.addTime
     *
     * @return the value of tb_note_label.addTime
     *
     * @mbggenerated
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_note_label.addTime
     *
     * @param addtime the value for tb_note_label.addTime
     *
     * @mbggenerated
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_note_label
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", labelid=").append(labelid);
        sb.append(", noteid=").append(noteid);
        sb.append(", notelabel=").append(notelabel);
        sb.append(", addtime=").append(addtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}