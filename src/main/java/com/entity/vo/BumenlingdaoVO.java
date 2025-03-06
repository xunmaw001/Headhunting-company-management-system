package com.entity.vo;

import com.entity.BumenlingdaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 部门领导
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("bumenlingdao")
public class BumenlingdaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 部门领导姓名
     */

    @TableField(value = "bumenlingdao_name")
    private String bumenlingdaoName;


    /**
     * 部门领导手机号
     */

    @TableField(value = "bumenlingdao_phone")
    private String bumenlingdaoPhone;


    /**
     * 部门领导身份证号
     */

    @TableField(value = "bumenlingdao_id_number")
    private String bumenlingdaoIdNumber;


    /**
     * 部门领导头像
     */

    @TableField(value = "bumenlingdao_photo")
    private String bumenlingdaoPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 部门
     */

    @TableField(value = "bumen_types")
    private Integer bumenTypes;


    /**
     * 电子邮箱
     */

    @TableField(value = "bumenlingdao_email")
    private String bumenlingdaoEmail;


    /**
     * 籍贯
     */

    @TableField(value = "jiguan")
    private String jiguan;


    /**
     * 家庭住址
     */

    @TableField(value = "bumenlingdao_zhuzhi")
    private String bumenlingdaoZhuzhi;


    /**
     * 入职时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "ruzhi_time")
    private Date ruzhiTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：部门领导姓名
	 */
    public String getBumenlingdaoName() {
        return bumenlingdaoName;
    }


    /**
	 * 获取：部门领导姓名
	 */

    public void setBumenlingdaoName(String bumenlingdaoName) {
        this.bumenlingdaoName = bumenlingdaoName;
    }
    /**
	 * 设置：部门领导手机号
	 */
    public String getBumenlingdaoPhone() {
        return bumenlingdaoPhone;
    }


    /**
	 * 获取：部门领导手机号
	 */

    public void setBumenlingdaoPhone(String bumenlingdaoPhone) {
        this.bumenlingdaoPhone = bumenlingdaoPhone;
    }
    /**
	 * 设置：部门领导身份证号
	 */
    public String getBumenlingdaoIdNumber() {
        return bumenlingdaoIdNumber;
    }


    /**
	 * 获取：部门领导身份证号
	 */

    public void setBumenlingdaoIdNumber(String bumenlingdaoIdNumber) {
        this.bumenlingdaoIdNumber = bumenlingdaoIdNumber;
    }
    /**
	 * 设置：部门领导头像
	 */
    public String getBumenlingdaoPhoto() {
        return bumenlingdaoPhoto;
    }


    /**
	 * 获取：部门领导头像
	 */

    public void setBumenlingdaoPhoto(String bumenlingdaoPhoto) {
        this.bumenlingdaoPhoto = bumenlingdaoPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：部门
	 */
    public Integer getBumenTypes() {
        return bumenTypes;
    }


    /**
	 * 获取：部门
	 */

    public void setBumenTypes(Integer bumenTypes) {
        this.bumenTypes = bumenTypes;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getBumenlingdaoEmail() {
        return bumenlingdaoEmail;
    }


    /**
	 * 获取：电子邮箱
	 */

    public void setBumenlingdaoEmail(String bumenlingdaoEmail) {
        this.bumenlingdaoEmail = bumenlingdaoEmail;
    }
    /**
	 * 设置：籍贯
	 */
    public String getJiguan() {
        return jiguan;
    }


    /**
	 * 获取：籍贯
	 */

    public void setJiguan(String jiguan) {
        this.jiguan = jiguan;
    }
    /**
	 * 设置：家庭住址
	 */
    public String getBumenlingdaoZhuzhi() {
        return bumenlingdaoZhuzhi;
    }


    /**
	 * 获取：家庭住址
	 */

    public void setBumenlingdaoZhuzhi(String bumenlingdaoZhuzhi) {
        this.bumenlingdaoZhuzhi = bumenlingdaoZhuzhi;
    }
    /**
	 * 设置：入职时间
	 */
    public Date getRuzhiTime() {
        return ruzhiTime;
    }


    /**
	 * 获取：入职时间
	 */

    public void setRuzhiTime(Date ruzhiTime) {
        this.ruzhiTime = ruzhiTime;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
