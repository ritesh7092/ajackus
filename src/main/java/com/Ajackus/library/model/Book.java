package com.Ajackus.library.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    @Id
    @NotBlank(message = "BookID can not be blank!")
    private String bookId;

    @NotBlank(message = "Title can not be blank!")
    private String title;

    @NotBlank(message = "Author can not be blank!")
    private String author;
    private String genre;

    @NotBlank(message = "Availability status is required!")
    @Pattern(regexp = "Available|Checked Out", message = "Availability status must be either 'Available' or 'Checked Out'")
    private String availabilityStatus;
}
