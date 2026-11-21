package ch.bbzw.m324.grade_compass.api;

import jakarta.validation.constraints.NotNull;

public record CreateGradeRequest(
        @NotNull Long subjectId,
        @NotNull Double value
) {
}
