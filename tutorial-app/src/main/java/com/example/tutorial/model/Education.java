package com.example.tutorial.model;

public class Education {
	private String educationLevel;
	private String specification;
	private float percentage;
	private String isCgpa;
	private String university;
	private String institution;

	public Education() {
	}

	public Education(String educationLevel, String specification, float percentage, String isCgpa, String university,
			String institution) {
		super();
		this.educationLevel = educationLevel;
		this.specification = specification;
		this.percentage = percentage;
		this.isCgpa = isCgpa;
		this.university = university;
		this.institution = institution;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String getIsCgpa() {
		return isCgpa;
	}

	public void setIsCgpa(String isCgpa) {
		this.isCgpa = isCgpa;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	@Override
	public String toString() {
		return "Education [educationLevel=" + educationLevel + ", specification=" + specification + ", percentage="
				+ percentage + ", isCgpa=" + isCgpa + ", university=" + university + ", institution=" + institution
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((educationLevel == null) ? 0 : educationLevel.hashCode());
		result = prime * result + ((institution == null) ? 0 : institution.hashCode());
		result = prime * result + ((isCgpa == null) ? 0 : isCgpa.hashCode());
		result = prime * result + Float.floatToIntBits(percentage);
		result = prime * result + ((specification == null) ? 0 : specification.hashCode());
		result = prime * result + ((university == null) ? 0 : university.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Education other = (Education) obj;
		if (educationLevel == null) {
			if (other.educationLevel != null)
				return false;
		} else if (!educationLevel.equals(other.educationLevel))
			return false;
		if (institution == null) {
			if (other.institution != null)
				return false;
		} else if (!institution.equals(other.institution))
			return false;
		if (isCgpa == null) {
			if (other.isCgpa != null)
				return false;
		} else if (!isCgpa.equals(other.isCgpa))
			return false;
		if (Float.floatToIntBits(percentage) != Float.floatToIntBits(other.percentage))
			return false;
		if (specification == null) {
			if (other.specification != null)
				return false;
		} else if (!specification.equals(other.specification))
			return false;
		if (university == null) {
			if (other.university != null)
				return false;
		} else if (!university.equals(other.university))
			return false;
		return true;
	}
	
}
