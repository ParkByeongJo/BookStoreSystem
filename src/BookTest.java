
public class BookTest {

	public static void main(String[] args) {
		// 3���� Book ��ü ���� - book1�� "Java", 20000, book2�� "Database", 30000���� �ʱ�ȭ
		Book book1 =  new Book("�����ͺ��̽� ����",20000);
		Book book2 =  new Book("����� ���α׷���",30000);
		Book book3 =  new Book("C++ ���α׷���",40000);

		// book1, book2�� ���� ���� �۾��� �����ϴ� midExam() �޼ҵ� ȣ��
		midExam(book1);
		midExam(book2);
		midExam(book3);
	}

	private static void midExam(Book book) {

		// �Ű������� ���� book�� ������ ���, ���� ���
		System.out.println("å ����:"+book.getTitle());
		System.out.println("����:"+book.getPrice()+"��");

		// book ������ 1000�� �λ�
        book.raise(1000);

		// book�� ���� ���
		System.out.println("1000�� �λ� ����:"+book.getPrice()+"��");

		// book ������ ������ 50%�� �λ�
        book.raise((book.getPrice()-1000)/2);

		// book�� ���� ���
		System.out.println("������ 50% �λ� ����:"+(book.getPrice()-1000)+"��");
		System.out.println(" ");
	}

}
