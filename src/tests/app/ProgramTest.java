package tests.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

class ProgramTest {

	@Test
	public void createObjectCorrectData() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}

	@Test
	public void validadeIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		Financing f = new Financing(100000.0, 2000.0, 20);
		});
	}
	
	@Test
	public void setTotalAmountShouldUpdatetDataWhenValidData() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		f.setTotalAmount(80000.0);
		Assertions.assertEquals(80000.0, f.getTotalAmount());
	}

	@Test
	public void setTotalAmountShouldIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setTotalAmount(110000.0);
		});
	}
	
	@Test
	public void setIncomeShouldUpdatetDataWhenValidData() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		f.setIncome(2100.0);
		Assertions.assertEquals(2100.0, f.getIncome());
	}

	@Test
	public void setIncomeShouldIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setIncome(1800.0);
		});
	}
	
	@Test
	public void setMonthsShouldUpdatetDataWhenValidData() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		f.setMonths(90);
		Assertions.assertEquals(90, f.getMonths());
	}

	@Test
	public void setMonthsShouldIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setMonths(75);
		});
	}
	
	@Test
	public void entrySholdCalculateEntryCorrectly() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		Assertions.assertEquals(20000.0, f.entry());
	}
}
