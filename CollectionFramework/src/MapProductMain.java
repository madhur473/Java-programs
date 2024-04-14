import java.util.List;
import java.util.Map;
public class MapProductMain {

	public static void main(String[] args) {
		productInfoMap pinfo=new productInfoMap();
		Map<String,List<Product>> hashMap=pinfo.accept();
		pinfo.display(hashMap);
	}
}
