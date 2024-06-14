package by.it_academy.jd2.classifier.service.api.dto.currency;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyDTO {
    private UUID uuid;
    private Long dt_create;
    private Long dt_update;
    @NotBlank(message = "Запрос содержит некорректные данные. Измените запрос и отправьте его ещё раз")
    private String title;
    @NotBlank(message = "Запрос содержит некорректные данные. Измените запрос и отправьте его ещё раз")
    private String description;
}
