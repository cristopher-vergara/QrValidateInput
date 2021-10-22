package com.copitovalidator.model;



import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;



public class QRStaticRequest {


	@NotNull
	@NotEmpty(message = "Not null")
	@Pattern(regexp = "^[a-zA-Z0-9_@./#ñÑ'!?¡¿*:;,=%~&()+-- .:]{1,7}$")
	private String pos_type;


	@NotNull
	@NotEmpty(message = "Not null")
	@Pattern(regexp = "^[0-9-/]{11,13}$")
	private String cuit;


	@NotNull
	@NotEmpty(message = "Not null")
	@Pattern(regexp = "^[0-9]{4}$")
	private String mcc;


	@NotNull
	@NotEmpty(message = "Not null")
	@Pattern(regexp = "^[ A-Za-z0-9_.,-:;áÁéÉíÍóÓúÚ&üÜñÑ_']{1,25}$")
	private String merchant_name;


	@NotNull
	@NotEmpty(message = "Not null")
	@Pattern(regexp = "^[ A-Za-z0-9_.,-:;áÁéÉíÍóÓúÚ&üÜñÑ_']{1,15}$")
	private String merchant_city;


	@NotNull
	@NotEmpty(message = "Not null")
	@Pattern(regexp = "^[ A-Za-z0-9_.,-:;áÁéÉíÍóÓúÚ&üÜñÑ']{1,25}$")
	private String branch;


	@NotNull
	@NotEmpty(message = "Not null")
	@Pattern(regexp = "^[0-9]{8}$")
	private String terminal_number;



	@NotNull
	@NotEmpty(message = "Not null")
	@Pattern(regexp = "^[ A-Za-z0-9_@./#ñÑ'!?¡¿*:;,=%~&()+-]{1,7}$")
	private String guid;


	@NotNull
	@NotEmpty(message = "Not null")
	@Pattern(regexp = "^[A-Za-z0-9]{1,25}$")
	private String checkout;


	//TODO: no agregar annotation not null y not empty en estos campos y en esta clase validar por metodo`

	//@T3Constraint
	@Pattern(regexp = "^[ A-Za-z0-9_./:-]{1,99}$")
	private String url_adq_t3;


	@Pattern(regexp = "^[ A-Za-z0-9_./:-]{1,99}$")
	//@T3Constraint
	private String info_adq_t3;


	@Pattern(regexp = "^[ A-Za-z0-9_@./#ñÑ'!?¡¿*:;,=%~&()+-]{1,65}$")
	private String static_qr_id ;

	@NotNull
	@NotEmpty
	@Pattern(regexp="^(|string|image|base64)$")


	private String output_format;


	public String getPos_type() {
		return pos_type;
	}


	public void setPos_type(String pos_type) {
		this.pos_type = pos_type;
	}


	public String getCuit() {
		return cuit;
	}


	public void setCuit(String cuit) {
		this.cuit = cuit;
	}


	public String getMcc() {
		return mcc;
	}


	public void setMcc(String mcc) {
		this.mcc = mcc;
	}


	public String getMerchant_name() {
		return merchant_name;
	}


	public void setMerchant_name(String merchant_name) {
		this.merchant_name = merchant_name;
	}


	public String getMerchant_city() {
		return merchant_city;
	}


	public void setMerchant_city(String merchant_city) {
		this.merchant_city = merchant_city;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public String getTerminal_number() {
		return terminal_number;
	}


	public void setTerminal_number(String terminal_number) {
		this.terminal_number = terminal_number;
	}


	public String getGuid() {
		return guid;
	}


	public void setGuid(String guid) {
		this.guid = guid;
	}


	public String getCheckout() {
		return checkout;
	}


	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}


	public String getOutput_format() {
		return output_format;
	}


	public void setOutput_format(String output_format) {
		this.output_format = output_format;
	}


	public String getUrl_adq_t3() {
		return url_adq_t3;
	}


	public void setUrl_adq_t3(String url_adq_t3) {
		this.url_adq_t3 = url_adq_t3;
	}


	public String getInfo_adq_t3() {
		return info_adq_t3;
	}


	public void setInfo_adq_t3(String info_adq_t3) {
		this.info_adq_t3 = info_adq_t3;
	}

	public String getStatic_qr_id() {return static_qr_id;}

	public void setStatic_qr_id(String static_qr_id) {
		this.static_qr_id = static_qr_id;
	}

}
