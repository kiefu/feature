package jp.co.employee.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class RegisterDto {
	private final int idMAX=8;
	private final int naMAX=40;
	private final int deMAX=250;

	@NotNull(message="IDを入力してください")
	@Size( max=idMAX, message = "IDは{max}文字以下を入力してください")
	@Pattern(regexp="[0-9]*",message="IDは数字である必要があります。")
	private Integer id;

	@NotNull(message="名前を入力してください")
	@Size( max=naMAX, message = "IDは{max}文字以下を入力してください")
	private String name;
	@Size( max=deMAX, message = "IDは{max}文字以下を入力してください")
	private String description;

	private Byte file;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Byte getFile() {
		return file;
	}
	public void setFile(Byte file) {
		this.file = file;
	}
}

