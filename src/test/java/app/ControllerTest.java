package app;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import logic.*;
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
				.andExpect(status().isOk());
	}

	@Test
	public void testPayment() throws Exception {
		Order order = new Order();
		order.addItem(new CactusFlower());
		order.addItem(new Romashka());
		order.addItem(new RibbonDecorator());
		order.addItem(new BasketDecorator());
		order.addItem(new PaperDecorator());
		order.setDeliveryStrategy(new PostDeliveryStrategy());
		order.setPaymentStrategy(new PayPalPayment());

		assert order.calculateTotalPrice() == 800 + 70 + 40 + 4 + 13;
	}
}
