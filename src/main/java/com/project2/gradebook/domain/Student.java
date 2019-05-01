package com.project2.gradebook.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

	@JacksonXmlRootElement(localName="student")
	public class Student {
		private int dgbId;
		private String name; 
		private String grade;
		
		public Student() {
			
		}
		
		public Student(int dgbId, String name, String grade) {
			this.dgbId = dgbId;
			this.name = name;
			this.grade = grade;
			
		}
		
		public int getDgbId() {
			return dgbId;
		}
		
		public void setDgbId(int dgbId) {
			this.dgbId = dgbId;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getGrade() {
			return grade;
		}
		
		public void setGrade(String grade) {
			this.grade = grade;
		} 
}