package com.ggr.domain;

import java.util.Date;

/**
 * Created by GuiRunning on 2017/5/23.
 */
public class ElecText {

   /*
    CREATE TABLE Elec_Text(
    textID VARCHAR(50) NOT NULL PRIMARY KEY,
    textName VARCHAR(50),
    textDate DATETIME,
    textRemark VARCHAR(500))

    */

   private String textID;      //测试ID
   private String textName;    //测试名称
   private Date textDate;      //测试日期
   private String textRemark;  //测试备注

    public ElecText() {
    }

    public ElecText(String textID, String textName, Date textDate, String textRemark) {

        this.textID = textID;
        this.textName = textName;
        this.textDate = textDate;
        this.textRemark = textRemark;
    }

    public ElecText( String textName, Date textDate, String textRemark) {
        this.textName = textName;
        this.textDate = textDate;
        this.textRemark = textRemark;
    }

    public String getTextID() {

        return textID;
    }

    public void setTextID(String textID) {
        this.textID = textID;
    }

    public String getTextName() {
        return textName;
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }

    public Date getTextDate() {
        return textDate;
    }

    public void setTextDate(Date textDate) {
        this.textDate = textDate;
    }

    public String getTextRemark() {
        return textRemark;
    }

    public void setTextRemark(String textRemark) {
        this.textRemark = textRemark;
    }
}
