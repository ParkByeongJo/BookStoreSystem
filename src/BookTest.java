
public class BookTest {

	public static void main(String[] args) {
		// 3개의 Book 객체 생성 - book1은 "Java", 20000, book2는 "Database", 30000으로 초기화
		Book book1 =  new Book("데이터베이스 개론",20000);
		Book book2 =  new Book("모바일 프로그래밍",30000);
		Book book3 =  new Book("C++ 프로그래밍",40000);

		// book1, book2에 대해 여러 작업을 수행하는 midExam() 메소드 호출
		midExam(book1);
		midExam(book2);
		midExam(book3);
	}

	private static void midExam(Book book) {

		// 매개변수로 받은 book의 도서명 출력, 가격 출력
		System.out.println("책 제목:"+book.getTitle());
		System.out.println("원가:"+book.getPrice()+"원");

		// book 가격을 1000원 인상
                book.raise(1000);

		// book의 가격 출력
		System.out.println("1000원 인상 가격:"+book.getPrice()+"원");

		// book 가격을 원가의 50%로 인상
                book.raise((book.getPrice()-1000)/2);

		// book의 가격 출력
		System.out.println("원가의 50% 인상 가격:"+(book.getPrice()-1000)+"원");
		System.out.println(" ");
	}

}
