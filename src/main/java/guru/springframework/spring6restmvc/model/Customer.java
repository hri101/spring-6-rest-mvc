package guru.springframework.spring6restmvc.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Customer {
	private long id;
	private int version;
	private String customerName;
	private LocalDateTime createdDate;
	private LocalDateTime lastModifiedDate;
}
