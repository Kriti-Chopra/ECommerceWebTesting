package PageObjects;

public class PageObjects {

	private static <T> T getPage(Class<T> c){
		try {
			return c.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	static LoginPage loginPage = getPage(LoginPage.class);
	static ProductsDashboard productsDashboard = getPage(ProductsDashboard.class);
}
