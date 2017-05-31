package jp.co.employee.dto;

public class DeleteDto {

		private Integer id;

		private String name;

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


