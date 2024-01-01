package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 疫苗信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-30 15:08:53
 */
@TableName("yimiaoxinxi")
public class YimiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YimiaoxinxiEntity() {
		
	}
	
	public YimiaoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 疫苗名称
	 */
					
	private String yimiaomingcheng;
	
	/**
	 * 批次号
	 */
					
	private String picihao;
	
	/**
	 * 接种区域
	 */
					
	private String jiezhongquyu;
	
	/**
	 * 接种时间
	 */
					
	private String jiezhongshijian;
	
	/**
	 * 疫苗数量
	 */
					
	private Integer yimiaoshuliang;
	
	/**
	 * 适合人群
	 */
					
	private String shiherenqun;
	
	/**
	 * 注意事项
	 */
					
	private String zhuyishixiang;
	
	/**
	 * 疫苗图片
	 */
					
	private String yimiaotupian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：疫苗名称
	 */
	public void setYimiaomingcheng(String yimiaomingcheng) {
		this.yimiaomingcheng = yimiaomingcheng;
	}
	/**
	 * 获取：疫苗名称
	 */
	public String getYimiaomingcheng() {
		return yimiaomingcheng;
	}
	/**
	 * 设置：批次号
	 */
	public void setPicihao(String picihao) {
		this.picihao = picihao;
	}
	/**
	 * 获取：批次号
	 */
	public String getPicihao() {
		return picihao;
	}
	/**
	 * 设置：接种区域
	 */
	public void setJiezhongquyu(String jiezhongquyu) {
		this.jiezhongquyu = jiezhongquyu;
	}
	/**
	 * 获取：接种区域
	 */
	public String getJiezhongquyu() {
		return jiezhongquyu;
	}
	/**
	 * 设置：接种时间
	 */
	public void setJiezhongshijian(String jiezhongshijian) {
		this.jiezhongshijian = jiezhongshijian;
	}
	/**
	 * 获取：接种时间
	 */
	public String getJiezhongshijian() {
		return jiezhongshijian;
	}
	/**
	 * 设置：疫苗数量
	 */
	public void setYimiaoshuliang(Integer yimiaoshuliang) {
		this.yimiaoshuliang = yimiaoshuliang;
	}
	/**
	 * 获取：疫苗数量
	 */
	public Integer getYimiaoshuliang() {
		return yimiaoshuliang;
	}
	/**
	 * 设置：适合人群
	 */
	public void setShiherenqun(String shiherenqun) {
		this.shiherenqun = shiherenqun;
	}
	/**
	 * 获取：适合人群
	 */
	public String getShiherenqun() {
		return shiherenqun;
	}
	/**
	 * 设置：注意事项
	 */
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
	/**
	 * 设置：疫苗图片
	 */
	public void setYimiaotupian(String yimiaotupian) {
		this.yimiaotupian = yimiaotupian;
	}
	/**
	 * 获取：疫苗图片
	 */
	public String getYimiaotupian() {
		return yimiaotupian;
	}

}
