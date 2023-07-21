//영화 Movie 클래스는 제목, 발표연도의 필드를 갖는다. 
//영화의 모든 정보를 출력하는 print()메소드 구현(Movie.java, MovieTest.java)

package day0721;

public class Movie {	

	private String title;
	private int year;
	
	//생성자
	public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }
	
	@Override
	public String toString() {
		return year + " : " + title;
	}
	
//	public void print() {
//		
//        System.out.println("발표 연도: " + year + "\t영화 제목: " + title );
//        
//	}
}

