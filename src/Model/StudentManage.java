package Model;
import java.util.ArrayList;
import java.util.List;

public class StudentManage {
    private List<Student> students = new ArrayList<>();

    // Thêm học sinh mới
    public void addStudent(Student student) {
        students.add(student);
    }

    // Sửa thông tin học sinh
    public void updateStudent(String studentId, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(studentId)) {
                students.set(i, updatedStudent);
                return;
            }
        }
    }

    // Xóa học sinh
    public void removeStudent(String studentId) {
        students.removeIf(student -> student.getId().equals(studentId));
    }

    // Tìm kiếm học sinh
    public List<Student> searchStudentByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().contains(name)) {
                result.add(student);
            }
        }
        return result;
    }

    // Hiển thị danh sách học sinh
    public List<Student> getAllStudents() {
        return students;
    }
}
