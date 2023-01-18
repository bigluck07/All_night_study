package book;

public class TestBook {

	public static void main(String[] args) {
		
		Book bk01 = new Book("SQL Plus", 50000, 5.0);
		Book bk02 = new Book("Java 2.0", 40000, 3.0);
		Book bk03 = new Book("JSP Servlet", 60000, 6.0);
		
		System.out.println("책이름\t\t가격\t할인울 \t 할인후금액");
		System.out.println("----------------------------------------");
		System.out.println(bk01.getBookName()+"\t"+bk01.getBookPrice()+"원\t"+bk01.getBookDiscountRate()+"%\t"+bk01.getDiscountBookPrice()+"원");
		System.out.println(bk02.getBookName()+"\t"+bk02.getBookPrice()+"원\t"+bk02.getBookDiscountRate()+"%\t"+bk02.getDiscountBookPrice()+"원");
		System.out.println(bk03.getBookName()+"\t"+bk03.getBookPrice()+"원\t"+bk03.getBookDiscountRate()+"%\t"+bk03.getDiscountBookPrice()+"원");

	}

}
