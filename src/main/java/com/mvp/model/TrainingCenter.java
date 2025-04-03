package com.mvp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import java.time.Instant;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "training_center")
public class TrainingCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Center Name is required")
	@Size(max = 40, message = "Center Name must be less than 40 characters")
	private String centerName;

	@NotBlank(message = "Center Code is required")
	@Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center Code must be exactly 12 alphanumeric characters")
	private String centerCode;

	@Embedded
	private Address address;

	@Min(value = 1, message = "Student Capacity must be at least 1")
	private Integer studentCapacity;

	@ElementCollection
	@Size(min = 1, message = "At least one course should be offered")
	private List<String> coursesOffered;

	@Column(nullable = false, updatable = false)
	private Instant createdOn;

	@Email(message = "Invalid email format")
	private String contactEmail;

	@Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
	@NotBlank(message = "Contact Phone is required")
	private String contactPhone;

	@PrePersist
	protected void onCreate() {
		this.createdOn = Instant.now();
	}
}
