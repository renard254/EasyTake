package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.Category;

public class CategoryFinder {

	public List<Category> getCategories(Connection connection) throws Exception {
		Statement statement = null;
		ResultSet resultSet = null;
		List<Category> categories = null;

		String query = "SELECT name	FROM mie.categorie;";

		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			categories = new ArrayList<Category>();
			while (resultSet.next()) {
				Category category = new Category();
				category.setId(resultSet.getInt("id"));
				category.setName(resultSet.getString("name"));
				categories.add(category);
			}
		} catch (Exception e) {
			throw new Exception(e);
		}
		return categories;
	}

	public List<Category> getCategoryById(int id, Connection connection) throws Exception {
		Statement statement = null;
		ResultSet resultSet = null;
		List<Category> categories = null;

		String query = "SELECT id, name	FROM mie.categorie WHERE categorie.id = " + id + ";";

		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			categories = new ArrayList<Category>();
			while (resultSet.next()) {
				Category category = new Category();
				category.setId(resultSet.getInt("id"));
				category.setName(resultSet.getString("name"));
				categories.add(category);
			}
		} catch (Exception e) {
			throw new Exception(e);
		}
		return categories;
	}

	
}
