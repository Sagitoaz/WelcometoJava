package BTVNBuoi1;

public class Student {
    private String name;
    private String add;
    private int age;
    private final float math;
    private final float literature;
    private final float english;
    private float averageScore;
    private String eduPerformance;

    public Student(String name, String add, int age, float math, float literature, float english) {
        this.name = name;
        this.add = add;
        this.age = age;
        this.math = math;
        this.literature = literature;
        this.english = english;
        this.averageScore = (math + literature + english) / 3;
        setEduPerformance();
    }

    public String getEduPerformance() {
        return eduPerformance;
    }

    public void setEduPerformance() {
        if (averageScore >= 8) {
            this.eduPerformance = "Xuat Sac";
        } else if (averageScore >= 7) {
            this.eduPerformance = "Gioi";
        } else if (averageScore >= 6) {
            this.eduPerformance = "Kha";
        } else if (averageScore >= 5) {
            this.eduPerformance = "Trung Binh";
        } else {
            this.eduPerformance = "Yeu";
        }
    }

    @Override
    public String toString() {
        return name + " " + age + " " + add + " "
                + math + " " + literature + " "
                + english + " " + String.format("%.2f",averageScore)+ " "
                + eduPerformance;
    }
}
