package Process;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class khmer24 {
	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("http://www.khmer24.com/").get();
			System.out.println(doc.body());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
