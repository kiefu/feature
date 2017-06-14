package jp.co.employee.form;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

	public class SearchForm {
		private final int idMAX=8;
		private final int naMAX=40;

		@NotNull(message="IDを入力してください")
		@Size( max=idMAX, message = "IDは{max}文字以下を入力してください")
		@Pattern(regexp="[0-9]*",message="IDは数字である必要があります。")
		private Integer id;

		@NotNull(message="名前を入力してください")
		@Size( max=naMAX, message = "IDは{max}文字以下を入力してください")
		private String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

}
