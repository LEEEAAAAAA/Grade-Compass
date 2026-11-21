package ch.bbzw.m324.grade_compass.api;

import ch.bbzw.m324.grade_compass.data.Subject;

public record SubjectResponse(Long id, String name) {

    public static SubjectResponse from(Subject subject) {
        return new SubjectResponse(subject.getId(), subject.getName());
    }
}
