package sampleJavaClass;



public class Student {
	int stuId;
	String stuName;
	int stuGrade;
	double stuCnScore;
	double stuMaScore;
	double stuEnScore;
	public Student(int id,String name,int Grade,double cnScore,double maScore,double enScore) {
		setStuId(id);
		setStuName(name);
		setStuGrade(Grade);
		setStuMaScore(maScore);
		setStuCnScore(cnScore);
		setStuEnScore(enScore);
		
		
	}
	public String getStudentIm() {
		String s;
		
		s = 	"姓名:"+getStuName()+"\n"+
				"学号:"+getStuId()+"\n"+
				"语文成绩:"+getStuCnScore()+"\n"+
				"数学成绩:"+getStuMaScore()+"\n"+
				"英语成绩:"+getStuEnScore()+"\n";
		return s;
				
	}
	
	public int getStuId() {
		return stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public int getStuGrade() {
		return stuGrade;
	}
	public double getStuCnScore() {
		return stuCnScore;
	}
	public double getStuMaScore() {
		return stuMaScore;
	}
	public double getStuEnScore() {
		return stuEnScore;
	}

	public void setStuId(int id) {
		stuId = id;
	}
	public void setStuName(String name) {
		stuName = name;
	}
	public void setStuGrade(int grade) {
		stuGrade = grade;
	}
	public void setStuCnScore(double score) {
		stuCnScore = score;
	}
	public void setStuMaScore(double score) {
		stuMaScore = score;
	}
	public void setStuEnScore(double score) {
		stuEnScore = score;
	}
	
	
	
	
	
}
