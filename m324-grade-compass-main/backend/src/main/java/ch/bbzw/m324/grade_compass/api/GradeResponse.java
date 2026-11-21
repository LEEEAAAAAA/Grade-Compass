package ch.bbzw.m324.grade_compass.api;

import ch.bbzw.m324.grade_compass.data.Grade;

public record GradeResponse(Long id, Long subjectId, Double value) {

    public static GradeResponse from(Grade grade) {
        return new GradeResponse(grade.getId(), grade.getSubjectId(), grade.getValue());
    }
}
