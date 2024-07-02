package d6.q0;

/*
학생(Student) 클래스를 만든다.
1. 이름, 나이 정보를 가지고 있으며, 자유롭게 설정이 가능하다.
2. 전공, 학점 정보를 가지고 있으며, 자유롭게 설정이 가능하다.
3. printInfo() 메서드를 가지고 있으며, 이름, 전공, 학점을
<이름> - <전공> (<학점>)
의 형식으로 출력한다.
 */
// 학생은 일종의 사람이다.
public class Student extends CollegeMember {
//    private String major;
    private double credit;

//    public String getMajor() {
//        return major;
//    }
//
//    public void setMajor(String major) {
//        this.major = major;
//    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void printInfo() {
        System.out.println(String.format(
                "%s - %s (%.2f)",
                getName(),
//                major,
                getMajor(),
                credit
        ));
    }
}
