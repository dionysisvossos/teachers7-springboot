package gr.aueb.cf.teacherapp.dto;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class TeacherInsertDTO {

    @NotNull(message = "Το όνομα δεν μπορεί να είναι κενό")
    @Size(min = 2, message = "Το όνομα πρέπει να περιέχει τουλάχιστον 2 χαρακτήρες.")
    private String firstName;

    @NotNull(message = "Το επώνυμο δεν μπορεί να είναι κενό")
    @Size(min = 2, message = "Το επώνυμο πρέπει να περιέχει τουλάχιστον 2 χαρακτήρες.")
    private String lastName;

    @Pattern(regexp = "\\d{9,}", message = "Το ΑΦΜ δεν μπορεί να είναι μικρότερο από 9 ψηφία.")
    private String vat;

    @NotNull (message = "Η περιοχή δεν μπορεί να είναι κενή")
    private Long regionId;
}
