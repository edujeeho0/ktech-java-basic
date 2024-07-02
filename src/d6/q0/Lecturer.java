package d6.q0;

/*
강사(Lecturer) 클래스를 만든다.
1. 이름, 나이 정보를 가지고 있으며, 자유롭게 설정이 가능하다.
2. 전공, 작성논문 갯수 정보를 가지고 있으며, 자유롭게 설정이 가능하다.
3. printInfo() 메서드를 가지고 있으며, 이름, 전공을
<이름>(강사) - <전공>
의 형식으로 출력한다.
 */
// 강사도 사람입니다
public class Lecturer extends CollegeMember {
//    private String major;
    private int papers;

//    public String getMajor() {
//        return major;
//    }
//
//    public void setMajor(String major) {
//        this.major = major;
//    }

    public int getPapers() {
        return papers;
    }

    public void setPapers(int papers) {
        this.papers = papers;
    }

    public void printInfo() {
        System.out.println(String.format(
                "%s(강사) - %s",
                getName(),
//                major
                getMajor()
        ));
    }
}
