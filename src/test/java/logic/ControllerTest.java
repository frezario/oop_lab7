package logic;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class ControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void getHello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("Name: CactusFlower, Price: 800.0 Name: Romashka, Price: 130.0 ")));
	}

	@Test
	public void testPayment() throws Exception {
		List<Item> assortment = new ArrayList<Item>();
		assortment.add(new CactusFlower());
		assortment.add(new Romashka());
		assortment.add(new RibbonDecorator());
		assortment.add(new BasketDecorator());
		assortment.add(new PaperDecorator());
		Order order = new Order();
		order.setDeliveryStrategy(new PostDeliveryStrategy());
		order.setPaymentStrategy(new PayPalPayment());
		assert order.calculateTotalPrice() == 800 + 70 + 40 + 4 + 13;
	}
}
