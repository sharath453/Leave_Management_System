package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bookDriver {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("choose your option :");
		System.out.println("1.Insert details of book\n" + "2.update the book price \n" + "3.get book details from id\n"
				+ "4.get book details\n" + "5.delete the book ");

		System.out.println("enter your choice :");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("enter the book id :");
			int id = sc.nextInt();
			System.out.println("enter the name :");
			String name = reader.readLine();
//			System.out.println("hi");
			System.out.println("enter the book author :");
			String author = reader.readLine();
			System.out.println("enter the book publication :");
			String publication = reader.readLine();
			System.out.println("enter the book count :");
			int count = sc.nextInt();
			System.out.println("enter the book price :");
			Double price = sc.nextDouble();

			book book = new book(id, name, author, publication, count, price);
			bookcrud.insertbook(book);

//			System.out.println(id);
//			System.out.println(name);
//			System.out.println(author);
//			System.out.println(publication);
//			System.out.println(count);
//			System.out.println(price);

			break;

		case 2:

			System.out.println("you are updating the book price :");

			System.out.println("enter the book id of the book :");
			id = sc.nextInt();
			System.out.println("enter the price to be updated :");
			price = sc.nextDouble();
			bookcrud.updateprice(id, price);

			break;

		case 3:

			System.out.println("enter the book id ");
			id = sc.nextInt();
			bookcrud.getbookDetailsByid(id);

			break;

		case 4:

			System.out.println("get the book details here :");
			bookcrud.getbookdetails();

			break;

		case 5:
			System.out.println(" u are deleting the book here :");
			System.out.println("enter the book id u want t delete :");
			id = sc.nextInt();
			bookcrud.deletebook(id);
			break;

		default:
			System.out.println("enter the valid choice :");
			break;
		}

	}
}
