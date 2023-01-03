package app;

import logic.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class Controller {
	@GetMapping("/")
	public String index() {
		List<Item> assortment = new ArrayList<Item>();
		assortment.add(new CactusFlower());
		assortment.add(new Romashka());
		assortment.add(new RibbonDecorator());
		assortment.add(new BasketDecorator());
		assortment.add(new PaperDecorator());
		StringBuilder content = new StringBuilder(new String("<p><center>The assortment:</center></p>"));
		content.append("<p><center>");
		for (Item elem: assortment) {
			content.append(elem.getDescription()).append(" ");
		}
		content.append("</center></p>");
		return content.toString();
	}

}
