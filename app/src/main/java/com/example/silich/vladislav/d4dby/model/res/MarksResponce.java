package com.example.silich.vladislav.d4dby.model.res;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Lenovo on 15.11.2017.
 */
public class MarksResponce {
	@SerializedName("id")
	@Expose
	private Integer id;
	@SerializedName("admin")
	@Expose
	private Integer admin;
	@SerializedName("date")
	@Expose
	private Integer date;
	@SerializedName("modif")
	@Expose
	private Integer modif;
	@SerializedName("MFA_PC_MFC")
	@Expose
	private Object mFAPCMFC;
	@SerializedName("MFA_CV_MFC")
	@Expose
	private Object mFACVMFC;
	@SerializedName("MFA_AXL_MFC")
	@Expose
	private Object mFAAXLMFC;
	@SerializedName("MFA_ENG_MFC")
	@Expose
	private Object mFAENGMFC;
	@SerializedName("MFA_ENG_TYP")
	@Expose
	private Object mFAENGTYP;
	@SerializedName("MFA_MFC_CODE")
	@Expose
	private Object mFAMFCCODE;
	@SerializedName("name")
	@Expose
	private Object name;
	@SerializedName("name_en")
	@Expose
	private String nameEn;
	@SerializedName("name_ru")
	@Expose
	private String nameRu;
	@SerializedName("name_text")
	@Expose
	private String nameText;
	@SerializedName("mt")
	@Expose
	private Integer mt;
	@SerializedName("url")
	@Expose
	private String url;
	@SerializedName("text")
	@Expose
	private String text;
	@SerializedName("text2")
	@Expose
	private String text2;
	@SerializedName("MFA_MF_NR")
	@Expose
	private Object mFAMFNR;
	@SerializedName("MFA_PC_CTM")
	@Expose
	private Object mFAPCCTM;
	@SerializedName("MFA_CV_CTM")
	@Expose
	private Object mFACVCTM;
	@SerializedName("logo")
	@Expose
	private String logo;
	@SerializedName("logo_alt")
	@Expose
	private String logoAlt;
	@SerializedName("logo_title")
	@Expose
	private String logoTitle;
	@SerializedName("level")
	@Expose
	private Integer level;
	@SerializedName("title")
	@Expose
	private String title;
	@SerializedName("description")
	@Expose
	private String description;
	@SerializedName("keywords")
	@Expose
	private String keywords;
	@SerializedName("ip2")
	@Expose
	private String ip2;
	@SerializedName("agent2")
	@Expose
	private String agent2;
	@SerializedName("ENMODELS")
	@Expose
	private String eNMODELS;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAdmin() {
		return admin;
	}

	public void setAdmin(Integer admin) {
		this.admin = admin;
	}

	public Integer getDate() {
		return date;
	}

	public void setDate(Integer date) {
		this.date = date;
	}

	public Integer getModif() {
		return modif;
	}

	public void setModif(Integer modif) {
		this.modif = modif;
	}

	public Object getMFAPCMFC() {
		return mFAPCMFC;
	}

	public void setMFAPCMFC(Object mFAPCMFC) {
		this.mFAPCMFC = mFAPCMFC;
	}

	public Object getMFACVMFC() {
		return mFACVMFC;
	}

	public void setMFACVMFC(Object mFACVMFC) {
		this.mFACVMFC = mFACVMFC;
	}

	public Object getMFAAXLMFC() {
		return mFAAXLMFC;
	}

	public void setMFAAXLMFC(Object mFAAXLMFC) {
		this.mFAAXLMFC = mFAAXLMFC;
	}

	public Object getMFAENGMFC() {
		return mFAENGMFC;
	}

	public void setMFAENGMFC(Object mFAENGMFC) {
		this.mFAENGMFC = mFAENGMFC;
	}

	public Object getMFAENGTYP() {
		return mFAENGTYP;
	}

	public void setMFAENGTYP(Object mFAENGTYP) {
		this.mFAENGTYP = mFAENGTYP;
	}

	public Object getMFAMFCCODE() {
		return mFAMFCCODE;
	}

	public void setMFAMFCCODE(Object mFAMFCCODE) {
		this.mFAMFCCODE = mFAMFCCODE;
	}

	public Object getName() {
		return name;
	}

	public void setName(Object name) {
		this.name = name;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getNameRu() {
		return nameRu;
	}

	public void setNameRu(String nameRu) {
		this.nameRu = nameRu;
	}

	public String getNameText() {
		return nameText;
	}

	public void setNameText(String nameText) {
		this.nameText = nameText;
	}

	public Integer getMt() {
		return mt;
	}

	public void setMt(Integer mt) {
		this.mt = mt;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText2() {
		return text2;
	}

	public void setText2(String text2) {
		this.text2 = text2;
	}

	public Object getMFAMFNR() {
		return mFAMFNR;
	}

	public void setMFAMFNR(Object mFAMFNR) {
		this.mFAMFNR = mFAMFNR;
	}

	public Object getMFAPCCTM() {
		return mFAPCCTM;
	}

	public void setMFAPCCTM(Object mFAPCCTM) {
		this.mFAPCCTM = mFAPCCTM;
	}

	public Object getMFACVCTM() {
		return mFACVCTM;
	}

	public void setMFACVCTM(Object mFACVCTM) {
		this.mFACVCTM = mFACVCTM;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getLogoAlt() {
		return logoAlt;
	}

	public void setLogoAlt(String logoAlt) {
		this.logoAlt = logoAlt;
	}

	public String getLogoTitle() {
		return logoTitle;
	}

	public void setLogoTitle(String logoTitle) {
		this.logoTitle = logoTitle;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getIp2() {
		return ip2;
	}

	public void setIp2(String ip2) {
		this.ip2 = ip2;
	}

	public String getAgent2() {
		return agent2;
	}

	public void setAgent2(String agent2) {
		this.agent2 = agent2;
	}

	public String getENMODELS() {
		return eNMODELS;
	}

	public void setENMODELS(String eNMODELS) {
		this.eNMODELS = eNMODELS;
	}


}
