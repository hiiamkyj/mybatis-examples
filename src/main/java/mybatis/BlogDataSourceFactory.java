package mybatis;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.pooled.PooledDataSource;

public class BlogDataSourceFactory {

	public static DataSource getBlogDataSource() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3210/javatest";
		String username = "root";
		String password = "Tyn@2014";
		DataSource ds = new PooledDataSource(driver, url, username, password);
		return ds;
	}
}
