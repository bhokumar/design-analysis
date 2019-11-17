package com.example.tutorial.model;

import java.util.ArrayList;
import java.util.List;

public class EducationDetails {
	private List<Education> educationDetails = new ArrayList<>();

	public List<Education> getEducationDetails() {
		return educationDetails;
	}

	public void setEducationDetails(List<Education> educationDetails) {
		this.educationDetails = educationDetails;
	}
	
	public boolean addEducation(Education education) {
		return educationDetails.add(education);
	}
	
	public boolean removeEducation(Education education) {
		return educationDetails.remove(education);
	}

	@Override
	public String toString() {
		return "EducationDetails [educationDetails=" + educationDetails + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((educationDetails == null) ? 0 : educationDetails.hashCode());
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
		EducationDetails other = (EducationDetails) obj;
		if (educationDetails == null) {
			if (other.educationDetails != null)
				return false;
		} else if (!educationDetails.equals(other.educationDetails))
			return false;
		return true;
	}
	
}
