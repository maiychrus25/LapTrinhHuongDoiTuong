package Bai10;

public class SpecializedClassroom extends Classroom {
    public SpecializedClassroom() {}

    public SpecializedClassroom(String classCode, String className, int studentCount) {
        super(classCode, className, studentCount);
    }

    @Override
    public void validateStudentCount() throws InvalidStudentCountException {
        if (this.studentCount < 20) {
            throw new InvalidStudentCountException("Lop hoc chuyen sau can co tu 20 hoc sinh tro len.");
        }
    }
}
