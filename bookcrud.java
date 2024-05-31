package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class bookcrud {

	public static Connection connection() {
		Connection con = null;

		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/libraryDataManagementSystem";
			String username = "postgres";
			String password = "sOny@2003";
			con = DriverManager.getConnection(url, username, password);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public static void insertbook(book b) {

		Connection con = connection();
		String query = "insert into book values(?,?,?,?,?,?)";
		try {
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, b.id);
			st.setString(2, b.name);
			st.setString(3, b.author);
			st.setInt(4, b.count);
			st.setString(5, b.publication);
			st.setDouble(6, b.price);

			int i = st.executeUpdate();
			if (i == 1) {
				System.out.println("Data is inserted successfullly !");
			} else {
				System.out.println("not inserted yet");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void deletebook(int book_id) {

		Connection con = connection();
		String Query = "delete from book where book_id=?";
		try {
			PreparedStatement stmt = con.prepareStatement(Query);
			stmt.setInt(1, book_id);
			int i = stmt.executeUpdate();
			if (i == 1) {
				System.out.println("the book is deleted successfully !");
			} else {
				System.out.println("the book not deleted yet! ");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void getbookdetails() {
		Connection con = connection();
		try {
			Statement stmt = con.createStatement();
			String Query = "select * from book";
			ResultSet i = stmt.executeQuery(Query);
			while (i.next()) {
				int id = i.getInt(1);
				String name = i.getString(2);
				String author = i.getString(3);
				int count = i.getInt(4);
				String publication = i.getString(5);
				Double price = i.getDouble(6);

				System.out.println(id);
				System.out.println(name);
				System.out.println(author);
				System.out.println(count);
				System.out.println(publication);
				System.out.println(price);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void getbookDetailsByid(int id) {
		Connection con = connection();

		String Query = "select * from book where book_id=?";
		try {
			PreparedStatement stmt = con.prepareStatement(Query);
			stmt.setInt(1, id);
			ResultSet i = stmt.executeQuery();
			if (i.next()) {
				int id1 = i.getInt(1);
				String name = i.getString(2);
				String author = i.getString(3);
				int count = i.getInt(4);
				String publication = i.getString(5);
				Double price = i.getDouble(6);

				System.out.println("-----------------------------");
				System.out.println("id : " + id1);
				System.out.println("name : " + name);
				System.out.println("Author : " + author);
				System.out.println("count : " + count);
				System.out.println("publication : " + publication);
				System.out.println("price :" + price);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void updateprice(int id, double price) {
		Connection con = connection();

		String Query = "update book set price=? where book_id=?";
		try {
			PreparedStatement stmt = con.prepareStatement(Query);
			stmt.setDouble(1, price);
			stmt.setInt(2, id);

			int j = stmt.executeUpdate();
			if (j == 1) {
				System.out.println("the value id updated successfully !");
			} else {
				System.out.println("noy updated yet or book is not avilable !");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
